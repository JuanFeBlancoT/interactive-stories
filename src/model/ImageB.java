package model;

import processing.core.PApplet;
import processing.core.PImage;

public class ImageB {

	private int posX, posY, speed;
	private String path;
	private PImage img;
	
	public ImageB(PApplet app, int px, int py, int sp, String pat) {
		
		path = pat;
		posX = px;
		posY = py;
		speed = sp;
		img = app.loadImage(path);
	}
	
	public void draw(PApplet app) {
		app.image(img, posX, posY);
	}
	
	public void move() {
		posX+=speed;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	
}
