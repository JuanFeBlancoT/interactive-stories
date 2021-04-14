package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Interactuable {

	protected boolean interacted;
	protected int posX, posY, speed, size;
	protected PImage image;
	
	public Interactuable(int px, int py, int sz, PImage img, PApplet app) {
		
		interacted = false;
		posX = px;
		posY = py;
		speed = 1;
		size = sz;
		image = img;
	}
	
	public void draw(PApplet app) {
		app.image(image, posX, posY, size, size);
	}

	public boolean isInteracted() {
		return interacted;
	}

	public void setInteracted(boolean interacted) {
		this.interacted = interacted;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
