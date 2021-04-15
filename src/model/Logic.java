package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	
	private Interactuable[] interactions;
	private PImage egg, sword, enemy;
	
	public Logic(PApplet app) {
		interactions = new Interactuable[7];
		
		egg = app.loadImage("data/egg.png");
		sword = app.loadImage("data/sword.png");
		enemy = app.loadImage("data/enemy.png");	
		
		interactions[0] = new Egg(0,600,170,egg, app, 3);
		interactions[1] = new Sword(1000,500,150, sword, app, 1);
		interactions[2] = new Enemy(800,200,150, enemy, app, 1);
	}

	public Interactuable[] getInteractions() {
		return interactions;
	}

	public void setInteractions(Interactuable[] interactions) {
		this.interactions = interactions;
	}

	public void updateElementPosX(int mouseMove) {
		
			interactions[0].setPosX(interactions[0].getPosX()+mouseMove);	
			interactions[2].setPosX(interactions[2].getPosX()+mouseMove);		
	}

	public int verifyInteractions() {
		for (int i = 0; i < interactions.length && interactions[i]!=null; i++) {
			if(interactions[i].isInteracted() && !interactions[i].isDone()) {
				
				interactions[i].setDone(true);
				return 1;
			}
		}
		return 0;
	}
	
	
}
