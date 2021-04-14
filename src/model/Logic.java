package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	
	private Interactuable[] interactions;
	private PImage egg;
	
	public Logic(PApplet app) {
		interactions = new Interactuable[7];
		egg = app.loadImage("data/egg.png");
	
		
		interactions[0] = new Egg(0,600,170,egg, app);
	}

	public Interactuable[] getInteractions() {
		return interactions;
	}

	public void setInteractions(Interactuable[] interactions) {
		this.interactions = interactions;
	}

	public void updateElementPosX(int mouseMove) {
		
		for (int i = 0; i < interactions.length && interactions[i]!=null; i++) {
			interactions[i].setPosX(interactions[i].getPosX()+mouseMove);
		}
		
	}
	
	
}
