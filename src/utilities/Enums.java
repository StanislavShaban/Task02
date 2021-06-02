package utilities;

public class Enums {
	public enum Color{
		RED("red"), GREEN("green"), BLUE("blue");
		
		String color;
		
		Color(String color) {
			this.color = color;
		}
		
		public String getColor() {
			return color;
		}
	}
	
	public static void printColorList() {
		for(int i = 0; i < Color.values().length; i++) {
			System.out.println(i + ". " + Color.values()[i]);
		}
	}
	
	public enum Weight{
		LITE(1.5), MEDIUM(3), HEAVY(6);
		
		double weight;
		
		Weight(double weight){
			this.weight = weight;
		}
		
		public double getWeight() {
			return weight;
		}
	}
}
