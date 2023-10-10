package week1.assignments;

public class Palindrome {
	public static void main(String[] args) {
		int num = 35453;
		int a , sum ,lastDigit ;
		a= num;
		//Reverse Number
		for (sum=0;a>0;a/=10) {
			//System.out.println("Input Number" + ""+a);
			lastDigit=a%10;
			sum=(sum*10)+lastDigit;
	
		}
		if(sum==num)
			System.out.println("Its a Palindrome Number");
		else
			System.out.println("Its not a Palindrome Number");
	}
}
