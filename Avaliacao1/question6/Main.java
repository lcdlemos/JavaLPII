package question6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		while (stop != true) {
			System.out.println("========== Options ==========");
			System.out.println("1.Calculate cylinder volume.");
			System.out.println("2.Calculate cone volume.");
			System.out.println("3.Calculate prism volume.");
			System.out.println("4.Calculate sphere volume.");
			System.out.println("5.End.");
			System.out.print("---> Select an option: ");
			int o = sc.nextInt();
			sc.nextLine();
			System.out.println("");
			switch (o) {
				case 1:
					calculateCylinder(sc);
					break;
				case 2:
					calculateCone(sc);
					break;
				case 3:
					calculatePrism(sc);
					break;
				case 4:
					calculateSphere(sc);
					break;
				case 5:
					stop = true;
					break;
			}
			System.out.println("");
		}
		System.out.println("================ BYE! ================");
	}

	private static void calculateSphere(Scanner sc) {
		System.out.println("=========== Sphere Volume ===========");
		System.out.print("Enter the sphere radius: ");
		float r = sc.nextFloat();
		sc.nextLine();
		System.out.println(String.format("Sphere Volume: %.2f", (4/3.0) * Math.PI * r * r * r));
	}

	private static void calculatePrism(Scanner sc) {
		System.out.println("=========== Prism Volume ===========");
		float v = 1;
		for (int i = 1; i < 4; i++) {
			System.out.print(String.format("Side %d: ", i));
			float s = sc.nextFloat();
			sc.nextLine();
			v *= s;
		}
		System.out.println(String.format("Prism Volume: %.2f", v));
	}

	private static void calculateCone(Scanner sc) {
		System.out.println("=========== Cone Volume ===========");
		System.out.print("Enter the cone radius: ");
		float r = sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter the cone height: ");
		float h = sc.nextFloat();
		sc.nextLine();
		System.out.println(String.format("Cone Volume: %.2f", (Math.PI * r * r * h)/3));
	}

	private static void calculateCylinder(Scanner sc) {
		System.out.println("=========== Cylinder Volume ===========");
		System.out.print("Enter the cylinder radius: ");
		float r = sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter the cylinder height:");
		float h = sc.nextFloat();
		sc.nextLine();
		System.out.println(String.format("Cylinder Volume: %.2f", Math.PI * r * r * h));
	}
}
