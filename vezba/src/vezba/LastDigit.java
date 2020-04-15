package vezba;

public class LastDigit {

	public static int sumFirstAndLastDigit(int number) {
		
		int first;
		int last =number%10;
		int num2=number;
		
		if (number>9)
			
			{do {first=number/10;
			number/=10;}
		while(number>=10);}
		
		else first=number;
		
		if (num2 < 0) {
			return -1;
		}
		else return first+last;
		
	}
}