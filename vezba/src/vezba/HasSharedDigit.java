package vezba;

public class HasSharedDigit {
	public static boolean hasSharedDigit(int number, int number2) {
		 int firstDigitN1 = number/10;
		 int secondDigitN1 = number%10;
		 int firstDigitN2 = number2/10;
		 int secondDigitN2 = number2%10;
		
		if (number>99||number<10||number2>99||number2<10) {
			return false;
		}
		
		else if (firstDigitN1==firstDigitN2||secondDigitN1==firstDigitN2||secondDigitN1==firstDigitN2||secondDigitN1==secondDigitN2)
		{
			return true;
		}
		else return false;
	}

}
