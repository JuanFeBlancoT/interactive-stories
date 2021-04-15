package model;

import processing.core.PApplet;
import processing.core.PImage;

public class HollowKnight extends Interactuable{

	public HollowKnight(int px, int py, int sz, PImage img, PApplet app, int h) {
		super(px, py, sz, img, app, h);
		
	}

	public void draw(PApplet app) {
		app.image(image, posX, posY, size+25, size+20);
	}
	
}
