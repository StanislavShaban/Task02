package runner;

import entities.Basket;
import services.BallService;
import services.BasketService;
import utilities.Enums;
import utilities.Enums.Color;
import utilities.InputUtils;

public class Main {

	public static void main(String[] args) {
		BasketService.createBasket(10);
		BallService.createBalls();
		BallService.showBalls();
		InputUtils inputUtils = new InputUtils();
		int ballIndex = inputUtils.getInteger("Input ball index to proceed: ");
		BasketService.addBall(BallService.getBallByIndex(ballIndex));
		Enums.printColorList();
		int colorIndex = inputUtils.getInteger("Input color index to proceed: ");
		int ballsCount = BasketService.getBallsCountByColor(Color.values()[colorIndex].getColor());
		double ballsWeight = BasketService.getBallsInBasketWeight();
		System.out.println("There are " + ballsCount + " in a basket");
		System.out.println("All balls in a basket have " + ballsWeight + " points of weight");
	}

}
