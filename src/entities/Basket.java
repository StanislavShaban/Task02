package entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Basket implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int maxCapacity;
	private ArrayList<Ball> ballList = new ArrayList<Ball>();
	
	public Basket(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
	public int getMaxCapacity() {
		return this.maxCapacity;
	}
	
	public void setMaxCapacity(int value) {
		this.maxCapacity = value;
	}
	
	public ArrayList<Ball> getBallList() {
		return this.ballList;
	}
	
	public void setBallList(ArrayList list) {
		this.ballList = list;
	}
}
