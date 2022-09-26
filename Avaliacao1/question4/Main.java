package question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < size; i++) {
			if (i == 0 || i == size -1) {
				System.out.print(generateSide(size));
			} else {
				for (int j = 0; j < size; j++) {
					if (j == 0 || j == size -1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}
	
	private static String generateSide(int size) {
		String out = "";
		for (int i = 0; i < size; i++) {
			out += "*";
		}
		return out;
	}
}
