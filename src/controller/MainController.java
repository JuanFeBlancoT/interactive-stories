package controller;

import model.ImageB;
import model.Logic;
import processing.core.PApplet;
import processing.core.PImage;

public class MainController {

	private Logic logic;
	private int screen, mouseMove;
	private PImage bg, bhf, bhc, nm, frontal;
	private ImageB bgo, bhfo, bhco, nmo, frontalo; 
	private int interactionsCompleted;
	
	public MainController(PApplet app) {
		logic = new Logic(app);
		screen = 3;
		mouseMove = 0;
		interactionsCompleted = 0;
		loadImages(app);
		bgo = new ImageB(app, 0,0, bg);
		bhfo = new ImageB(app, -400,2, bhf);
		bhco = new ImageB(app, -400,1, bhc);
		nmo = new ImageB(app, -400,4, nm);
		frontalo = new ImageB(app, -400,5, frontal);
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
			bhco.draw(app);
			//behind close
			bhfo.draw(app);
			//normal
			nmo.draw(app);
			
			//interactuable
			//for (int i = 0; i < logic.getInteractions().length && logic.getInteractions()[i] != null; i++) {

				logic.getInteractions()[0].draw(app);
				if(logic.getInteractions()[1].isSelected()) {
					
					logic.getInteractions()[1].setPosX(app.mouseX-70);
					logic.getInteractions()[1].setPosY(app.mouseY-80);
				}
				logic.getInteractions()[1].draw(app);
				System.out.println(interactionsCompleted);
			//}
			

			//front
			frontalo.draw(app);
			
			//interactions
			interactionsCompleted += logic.verifyInteractions();
			break;
		case 4:
			//load end
			break;
		}
		
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public void moveImages(float e) {
		if(mouseMove>-93 && mouseMove<93) {
			bhco.move(e);
			bhfo.move(e);
			nmo.move(e);
			frontalo.move(-e);
			
			logic.updateElementPosX((int)e);
		}
	}

	public int getMouseMove() {
		return mouseMove;
	}

	public void setMouseMove(int mouseMove) {
		this.mouseMove = mouseMove;
	}

	public Logic getLogic() {
		return logic;
	}

	public void setLogic(Logic logic) {
		this.logic = logic;
	}
	
	
}
