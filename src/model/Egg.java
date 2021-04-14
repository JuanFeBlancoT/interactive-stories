package model;

import processing.core.PApplet;
import processing.core.PImage;

	public class Egg extends Interactuable{
	
	public Egg(int px, int py, int sz, PImage img, PApplet app, int h) {
		super(px, py, sz, img, app, h);
	
	}
	
	@Override
	public void draw(PApplet app) {
		if(hp==3) {
			app.image(image, posX, posY,size,size);
		}else if(hp ==2) {
			System.out.println(2);
		}else if(hp==1){
			System.out.println(1);
		}else {
			System.out.println("d");
		}
	}
}
