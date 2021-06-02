package services;

import java.util.ArrayList;

import entities.Ball;
import utilities.Enums.Color;
import utilities.Enums.Weight;

public class BallService {
	
	private static ArrayList<Ball> ballsList = new ArrayList<Ball>();
	
	public static void createBalls() {
		Color[] colorsArray = Color.values();
		Weight[] weightsArray = Weight.values();
		for(Color color : colorsArray) {
			for(Weight weight : weightsArray) {
				ballsList.add(
					new Ball(
						color.getColor(), 
						weight.getWeight()
					)
				);
			}
		}
	}
	
	public static Ball getBallByIndex(int index) {
		if(index >= 0 && index < ballsList.size()) {
			return ballsList.get(index);
		}
		return null;
	}
	
	public static void showBalls() {
		for(Ball item : ballsList) {
			System.out.println(ballsList.indexOf(item) + ". " + item.toString());
		}
	}
}
