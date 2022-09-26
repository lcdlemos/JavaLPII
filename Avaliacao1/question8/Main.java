package question8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 boolean stop = false;
		 int sum = 0, count = 1;
		 while (stop != true) {
			 System.out.print("Do you want to register another consumption (y/n)? ");
			 String response = sc.nextLine().toLowerCase();
			 System.out.println("");
			 if (response.equals("y")) {
				 System.out.println(String.format("================= Case %d =================", count));
				 System.out.print("Enter the Kilometers: ");
				 int km = sc.nextInt();
				 sc.nextLine();
				 System.out.print("Enter the liters: ");
				 int l = sc.nextInt();
				 sum += km/((float) l);
				 sc.nextLine();
				 System.out.println(String.format("Consumption: %.2fKm/l",  km/((float) l)));
				 System.out.println(String.format("Average Consumption: %.2fkm/l", sum/((float) count)));
				 count += 1;
			 } else {
				 stop = true;
			 }
			 System.out.println("");
		 }
		 System.out.println("================ BYE! ================");
	}

}
