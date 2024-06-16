package entities;

import entities.enums.Color;

public abstract class Shape {		//shame == forma
	
	public Shape() {
		
	}
	
	
	public Shape(Color color) {
		this.color = color;
	}


	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();

}
