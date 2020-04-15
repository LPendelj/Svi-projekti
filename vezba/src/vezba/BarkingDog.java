package vezba;

public class BarkingDog {
	public static boolean shouldWakeUp(boolean bark, int hourOfDay) {
		if (hourOfDay >=0 &&  hourOfDay<=23) {
			if (hourOfDay <8 || hourOfDay >22 ) {
				if (bark == false) {
					return false;
				}
				else return true;
			}
			else return false;
		}
		else return false;
	}
	


}
