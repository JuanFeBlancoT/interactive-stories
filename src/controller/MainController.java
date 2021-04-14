package controller;

import model.ImageB;
import model.Logic;
import processing.core.PApplet;
import processing.core.PImage;

public class MainController {

	private Logic logic;
	private int screen;
	private PImage bg, bhf, bhc, nm, frontal;
	private ImageB bgo, bhfo, bhco, nmo, frontalo; 
	
	public MainController(PApplet app) {
		logic = new Logic();
		screen = 3;
		loadImages(app);
		bgo = new ImageB(app, 0,0, bg);
		bhfo = new ImageB(app, 0,0, bhf);
		bhco = new ImageB(app, -400,0, bhc);
		nmo = new ImageB(app, -400,0, nm);
		frontalo = new ImageB(app, -400,0, frontal);
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
			bgo.draw(app);
			//behind far
			bhfo.draw(app);
			//behind close
			bhco.draw(app);
			//normal
			nmo.draw(app);
			//front
			frontalo.draw(app);
			
			break;
		case 4:
			//load end
			break;
		}
		
	}
}
