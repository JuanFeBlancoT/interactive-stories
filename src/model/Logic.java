package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	
	private Interactuable[] interactions;
	private PImage egg, egg2, egg3, sword, enemy, soul, hollow;
	
	
	public Logic(PApplet app) {
		
		
		
		interactions = new Interactuable[7];
		
		egg = app.loadImage("data/h1.png");
		egg2 = app.loadImage("data/h2.png");
		egg3 = app.loadImage("data/h3.png");
		sword = app.loadImage("data/sword.png");
		enemy = app.loadImage("data/enemy.png");	
		soul = app.loadImage("data/soul.png");
		hollow = app.loadImage("data/Hollow.png");
		
		interactions[0] = new Egg(0,600,170,egg, app, 3, egg2, egg3);
		interactions[1] = new Sword(1000,500,150, sword, app, 1);
		interactions[2] = new Enemy(800,200,150, enemy, app, 1);
		interactions[3] = new Soul(300,450,140, soul, app, 1);
		interactions[4] = new HollowKnight(0,600,140, hollow, app, 1);
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
			interactions[3].setPosX(interactions[3].getPosX()+mouseMove);
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
