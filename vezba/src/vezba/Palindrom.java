package vezba;

public class Palindrom {
	public static boolean isPalindrome(int broj) {
		int lastDigit;
		int reverse=0;
	    int number;
	
	 if(broj<0){
        number=broj*(-1);
    }	
    
    else  number = broj;
		
   
    while (number>0) {
			lastDigit=number%10;
			reverse*=10;
			reverse=reverse+lastDigit;
			number/=10;
		}
		
		if(reverse==broj || reverse==broj*(-1)) {
			return true;
		}
		else return false;
	}
}
