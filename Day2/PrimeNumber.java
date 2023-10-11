package week1.assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		 int i,m=0;
		 boolean flag=false;
		  int num=13; 
		  m=num/2;      
		  if(num==0||num==1){  
		   System.out.println(num+" is not a prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(num%i==0){      
		     System.out.println(num+" is not a prime number");      
		     flag=true;      
		     break;      
		    }      
		   }      
		   if(flag==false)  { 
			   System.out.println(num+" is a prime number"); 
			   }  
		  } 
		
	}

}
