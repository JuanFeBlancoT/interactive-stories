package model;

import processing.core.PApplet;
import processing.core.PImage;

	public class Egg extends Interactuable{
		
		private PImage img2, img3;
	
	public Egg(int px, int py, int sz, PImage img, PApplet app, int h, PImage img2, PImage img3) {
		super(px, py, sz, img, app, h);
		this.img2 = img2;
		this.img3 = img3;
	}
	
	public void draw(PApplet app) {
		if(hp==3) {
			app.image(image, posX, posY,size,size);
		}else if(hp ==2) {
			app.image(img2, posX, posY,size,size);
		}else if(hp==1){
			app.image(img3, posX, posY,size,size);
		}else {
			interacted = true;
		}
	}
}
