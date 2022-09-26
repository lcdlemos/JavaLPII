package question11;

public class Main {

	public static void main(String[] args) {
		int size = 7;
		for (int i = 1; i <= size; i++) {
			System.out.println(generateLine(i, size));
		}
		for (int i = size - 1; i >= 1; i--) {
			System.out.println(generateLine(i, size));
		}
	}
	
	private static String generateLine(int n, int size) {
		return generateSpace(size - n) + generateAsterisk(2 * n - 1) + generateSpace(size - n);
	}
	
	private static String generateSpace(int size) {
		String out = "";
		for (int i = 0; i < size; i++) {
			out += " ";
		}
		return out;
	}
	
	private static String generateAsterisk(int size) {
		String out = "";
		for (int i = 0; i < size; i++) {
			out += "*";
		}
		return out;
	}
}
