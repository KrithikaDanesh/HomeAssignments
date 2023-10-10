package week1.assignments;

import java.util.Arrays;

public class FindIntersection {
	public static void main(String[] args) {
		int num[] = {3,2,11,4,6,7};
		int num1[]= {1,2,8,4,9,7};
		Arrays.sort(num);
		Arrays.sort(num1);
		System.out.println("Common Numbers from both array");
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=0;j<num1.length-1;j++) {
				if(num[i]==num1[j])
					System.out.println(num[i]);
			
			}
		}
				
	}

}
