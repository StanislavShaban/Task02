package services;

import java.util.ArrayList;

import entities.Ball;
import entities.Basket;

public class BasketService {
	
	private static Basket basketInstance;
	
	public static void createBasket(int capacity) {
		basketInstance = new Basket(capacity);
	}
	
	public static void addBall(Ball newBall) {
		basketInstance.getBallList().add(newBall);
	}
	
	public static void removeBall(int index) {
		basketInstance.getBallList().remove(index);
	}
	
	public static void clearBasket(Basket basket) {
		basketInstance.getBallList().clear();
	}
	
	public static void showBasketItems() {
		basketInstance.getBallList().clear();
	}
	
	public static int getBallsCountByColor(String color) {
		int count = 0;
		if(basketInstance.getBallList().size() > 0) {
			for(Ball item : basketInstance.getBallList()) {
				if(item.getColor() == color) {
					++count;
				}
			}
		} else {
			System.out.println("Ball list is empty");
		}
		return count;
	}
	
	public static double getBallsInBasketWeight() {
		double weight = 0.0;
		if(basketInstance.getBallList().size() > 0) {
			for(Ball item : basketInstance.getBallList()) {
				weight += item.getWeight();
			}
		} else {
			System.out.println("Ball list is empty");
		}
		return weight;
	}
}
