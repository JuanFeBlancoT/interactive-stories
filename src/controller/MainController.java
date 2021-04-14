package controller;

import model.Logic;
import processing.core.PApplet;
import processing.core.PImage;

public class MainController {

	private Logic logic;
	private int screen;
	private PImage bg, bhf, bhc, nm, frontal;
	
	public MainController(PApplet app) {
		logic = new Logic();
		screen = 3;
		loadImages(app);
	}

	private void loadImages(PApplet app) {
		bg = app.loadImage("data/bgf.png");
		bhf = app.loadImage("data/atrascf.png");
		bhc = app.loadImage("data/atraslejosf.png");
		nm = app.loadImage("data/medf.png");
		frontal = app.loadImage("data/frontalf.png");
		
	}

	public void draw(PApplet app) {
		
		switch(screen) {
		case 1:
			// main menu
			break;
		case 2:
			//display story
			break;
		case 3:
			//bg
			app.image(bg, 0, 0);
			//behind far
			app.image(bhf, 0, 0);
			//behind close
			app.image(bhc, -500, 0);
			//normal
			app.image(nm, -500, 0);
			//front
			app.image(frontal, -500, 0);
			
			break;
		case 4:
			//load end
			break;
		}
		
	}
}
