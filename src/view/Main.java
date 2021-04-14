package view;

import controller.MainController;
import processing.core.PApplet;

public class Main extends PApplet{
	public static void main (String[] args) {
		PApplet.main("view.Main");
	}
	
	private MainController mainController;
	
	public void settings() {
		size(1200, 800);
	}
	
	public void setup() {
		mainController = new MainController(this);
	}

	public void draw() {
		background(0);
		mainController.draw(this);
	}
} 
