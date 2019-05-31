
public class Logic {
	
	public static String reverseFactorial(long n) {
		/** This function takes a number and returns the factorial that would produce that number.
			In the case that the number is not a factorial number, -1 is returned.
			@author Ross & Alex
			@version 2.0
			@since 22-05-2019
		*/
		
		if(n<0) {
			return "-" + reverseFactorial(-n);
		}
		if(n==1) {
			return "1!";
		}
		int c=1;
		while(n%c==0&&n!=0) {
			n/=c;
			c++;
		}
		c--;
		if(n==1) {
			return ""+c + "!";
		}else {
			return "NONE";
		}
	}
}
