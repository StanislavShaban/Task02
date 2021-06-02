package entities;

import java.io.Serializable;

public class Ball implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String color;
	private double weight;

	public Ball(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String value) {
		this.color = value;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double value) {
		this.weight = value;
	}
	
	@Override
	public String toString() {
		return "Ball{ color: " + this.color + ", weight: " + this.weight + "}";
	}
}
