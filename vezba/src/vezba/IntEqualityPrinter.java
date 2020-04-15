package vezba;

public class IntEqualityPrinter {
	public static void printEqual(int f, int s, int t) {
		if (f<0 || s<0 || t<0) {
			System.out.println("Invalid value");
		}
		else if (f==s && s==t) {
			System.out.println("All numbers are equal");
		}
		else if (f!=s && s!=t && t!=f) {
				System.out.println("All numbres are different");
		}
		else System.out.println("Neither all are equal or different");
	}
}
