package question3;

public class Main {

	public static void main(String[] args) {
		
		long users = 1000000000, target = 1500000000;
		int c = 0;
		while (users < target) {
			users = up(users);
			c += 1;
		}
		System.out.println(String.format("%s months to %d - Users: %d", c, target, users));
		
		users = 1000000000;
		target = 2000000000;
		c = 0;
		while (users < target) {
			users = up(users);
			c += 1;
		}
		System.out.println(String.format("%s months to %d - Users: %d", c, target, users));
		
		users = 1000000000;
		for (int i = 0; i < 5; i++) {
			users = up(users);
		}
		System.out.println(String.format("%d users in December", users));
	}
	
	private static long up(long users) {
		return (long) (users * 1.04);
	}
}
