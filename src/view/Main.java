package view;

import controller.MainController;
import model.Egg;
import processing.core.PApplet;
import processing.event.MouseEvent;

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
	
	public void mouseWheel(MouseEvent event) {
		if(mainController.getScreen()==3) {
			float e = event.getCount();
			mainController.moveImages(e);
			
			if(e>0) {
				mainController.setMouseMove(mainController.getMouseMove()+1);
			}else {
				mainController.setMouseMove(mainController.getMouseMove()-1);
			}
		}
	}
	
	public void mouseClicked() {
		if(mainController.getScreen()==3) {
			if(dist(mouseX, mouseY, mainController.getLogic().getInteractions()[0].getPosX(), 
					mainController.getLogic().getInteractions()[0].getPosY())<mainController.getLogic().getInteractions()[0].getSize()) {					
				
				mainController.getLogic().getInteractions()[0].setHp(mainController.getLogic().getInteractions()[0].getHp()-1);
			}
		}
		
		if(dist(mouseX, mouseY, mainController.getLogic().getInteractions()[1].getPosX(),
				mainController.getLogic().getInteractions()[1].getPosY())<mainController.getLogic().getInteractions()[1].getSize()) {
			
			mainController.getLogic().getInteractions()[1].setSelected(!mainController.getLogic().getInteractions()[1].isSelected());
			
			mainController.getLogic().getInteractions()[1].setInteracted(true);
		}
		
		if( mainController.getLogic().getInteractions()[1].isSelected() && dist(mouseX, mouseY, mainController.getLogic().getInteractions()[2].getPosX(),
				mainController.getLogic().getInteractions()[2].getPosY())<mainController.getLogic().getInteractions()[1].getSize()*2) {
			
			mainController.getLogic().getInteractions()[2].setInteracted(true);
		}
		
		if(dist(mouseX, mouseY, mainController.getLogic().getInteractions()[3].getPosX(),
				mainController.getLogic().getInteractions()[3].getPosY())<mainController.getLogic().getInteractions()[3].getSize()) {
			
			mainController.getLogic().getInteractions()[3].setInteracted(true);
		}		

		if(dist(mouseX, mouseY, mainController.getLogic().getInteractions()[4].getPosX(),
				mainController.getLogic().getInteractions()[4].getPosY())<mainController.getLogic().getInteractions()[4].getSize()) {
			
			mainController.getLogic().getInteractions()[4].setSelected(!mainController.getLogic().getInteractions()[4].isSelected());
			
			mainController.getLogic().getInteractions()[4].setInteracted(true);
		}
	}
} 
