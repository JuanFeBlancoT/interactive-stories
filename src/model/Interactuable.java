package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Interactuable {

	private boolean interacted;
	private int posX, posY, speed, size;
	private String path;
	private PImage image;
	
	public Interactuable(int px, int py, int sz, String pat) {
		interacted = false;
		posX = px;
		posY = py;
		speed = 1;
		size = sz;
		path = pat;
	}
	
	public void loadImageX( PApplet app) {
		image = app.loadImage(path);
	}
	
	public void draw() {
		
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
