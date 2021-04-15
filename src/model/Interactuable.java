package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Interactuable {

	protected boolean interacted, done;
	protected int posX, posY, speed, size;
	protected PImage image;
	protected int hp;
	
	public Interactuable(int px, int py, int sz, PImage img, PApplet app, int h) {
		
		interacted = false;
		done = false;
		posX = px;
		posY = py;
		speed = 1;
		size = sz;
		image = img;
		hp = h;
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
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	
}
