package week1.assignments;

import java.util.Arrays;

public class SecondSmallestnumber {
	public static void main(String[] args) {
		int num[]= {23,45,67,32,89,22};
		Arrays.sort(num);
		int len=num.length;
		System.out.println("Length of the array"+" "+len);
		for(int i=0;i<len;i++)
		{
		System.out.println(num[i]);
		}
		System.out.println("Second Smallest Number"+" "+num[len-5]);
	}

}
