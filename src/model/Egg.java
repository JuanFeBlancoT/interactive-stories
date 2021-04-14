package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Egg extends Interactuable{

	private int hp;
	public Egg(int px, int py, int sz, PImage img, PApplet app) {
		super(px, py, sz, img, app);
		hp = 3;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
