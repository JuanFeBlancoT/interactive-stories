package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Soul extends Interactuable{

	public Soul(int px, int py, int sz, PImage img, PApplet app, int h) {
		super(px, py, sz, img, app, h);
		
	}

	public void draw(PApplet app) {
		
		if(!interacted) {
			app.image(image, posX, posY, size, size+30);
		}
	}
	
}
