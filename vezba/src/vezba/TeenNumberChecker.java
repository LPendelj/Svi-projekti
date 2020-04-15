package vezba;

public class TeenNumberChecker {
	public static boolean hasTeen(int first, int second, int third) {
		if (first <=19 && first >=13) {
			return true;
		}
		else if (second <=19 && second >=13) {
			return true;
	} else if (third <=19 && third >=13) {
			return true;
	}
	else return false;
	}
	
	public static boolean isTeen(int first) {
		if (first <=19 && first >=13) {
			return true;
		} 
		else return false;
	}
	
}
