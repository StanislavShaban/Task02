package utilities;

import java.util.Scanner;

public class InputUtils {
	private static Scanner scan;
	
	public InputUtils() {
		scan = new Scanner(System.in);
	}
	
	public int getInteger(String outputMessage) {
		System.out.println(outputMessage);
		int value = 0;
		boolean isValid = false;
		do {
			try {
				value = Integer.parseInt(scan.nextLine());
				isValid = true;
			}catch(NumberFormatException e) {
				System.out.println("Enter a valid integer");
			}
			
		}while(!isValid);
		
		return value;
	}
}
