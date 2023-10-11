package week1.assignments;

import java.util.Arrays;

public class SecondSmallestNumber {
	public static void main(String[] args) {
		int num[]= {23,45,67,32,89,22};
		Arrays.sort(num);
		int len=num.length;
		for(int i=1;i<len;i++)
		{
			//to find second smallest number even with duplicates in the array//
			if(num[0]!=num[i]) {				
		System.out.println("Second Smallest Number"+" "+num[i]);
		break;
			}
		}
		
	}

}
