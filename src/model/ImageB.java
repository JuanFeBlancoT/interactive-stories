package model;

import processing.core.PApplet;
import processing.core.PImage;

public class ImageB {

	private int posX, posY, speed;
	private PImage img;
	
	public ImageB(PApplet app,int px, int sp, PImage img) {
		
		posX = px;
		posY = 0;
		speed = sp;
		this.img = img;
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
