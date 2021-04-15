package model;

import processing.core.PApplet;
import processing.core.PImage;

public class ImageB {

	private int posX, posY;
	private double speed;
	private PImage img;
	
	public ImageB(PApplet app,int px, double sp, PImage img) {
		
		posX = px;
		posY = 0;
		speed = sp;
		this.img = img;
	}
	
	public void draw(PApplet app) {
		app.image(img, posX, posY);
	}
	
	public void move(float x) {
		int num = (int) x;
		posX+=speed*num;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	
}
