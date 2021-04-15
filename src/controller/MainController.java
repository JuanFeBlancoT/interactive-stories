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
	private PImage txt; 
	private int interactionsCompleted;
	private String[] text;
	
	public MainController(PApplet app, String[] txt) {
		logic = new Logic(app);
		text = txt;
		screen = 1;
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
		txt = app.loadImage("data/txts.png");
		
	}

	public void draw(PApplet app) {
		
		switch(screen) {
		case 1:
			// main menu
			nmo.draw(app);
			app.textSize(50);
			app.fill(170,130,200);
			app.text("START READING", 100, 100);
			
			app.fill(230,150,220,140);
			app.rect(690, 600, 200, 70);
			
			app.textSize(40);
			app.fill(250);
			app.text("START", 730, 650);
			
			break;
		case 2:
			/*int tempX, tempY;
			tempX = 20;
			tempY = 30;
			app.textSize(20);
			for (int i = 0; i < text.length; i++) {
				if(text[i].length()<5) {
					tempX+= 125;
				}else if(text[i].length()<10){
					tempX+= 80;
				}else {
					tempX+= 50;
				}
			
				app.text(text[i], tempX, tempY);
				
				if(tempX> 800) {
					tempY+=25;
					tempX = 20;
				}
			}	*/
			app.image(txt, 50, 50);
			
			app.fill(230,150,220,140);
			app.rect(690, 700, 200, 70);
			
			app.textSize(40);
			app.fill(250);
			app.text("START", 730, 750);
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

				
				if(logic.getInteractions()[1].isSelected()) {
					
					logic.getInteractions()[1].setPosX(app.mouseX-70);
					logic.getInteractions()[1].setPosY(app.mouseY-80);
				}
				logic.getInteractions()[1].draw(app);
				logic.getInteractions()[2].draw(app);
				logic.getInteractions()[3].draw(app);
				logic.getInteractions()[4].draw(app);
				logic.getInteractions()[0].draw(app);
				
				
			//}
			

			//front
			frontalo.draw(app);
			
			//interactions
			interactionsCompleted += logic.verifyInteractions();
			break;
		case 4:
			app.textSize(50);
			app.fill(170,130,200);
			app.text("NICE JOB!", 100, 100);
			
			app.fill(230,150,220,140);
			app.rect(690, 700, 200, 70);
			
			app.textSize(40);
			app.fill(250);
			app.text("SAVE", 730, 750);
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

	public int getInteractionsCompleted() {
		return interactionsCompleted;
	}

	public void setInteractionsCompleted(int interactionsCompleted) {
		this.interactionsCompleted = interactionsCompleted;
	}
	
	
	
}
