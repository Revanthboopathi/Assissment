package Assiss;

import java.util.Arrays;

public class MissingNumber {
public static void main(String[] args) {
		
		//Declare an integer 
		int a[]= {5,4,2,3,1,8,6};
		
		//Sort the array 
		Arrays.sort(a);
		
		//Iterate the loop 
		for(int i=0;i<a.length;i++)
		{
			//use if condition
			if(a[i]!=i+1)
			{
				//Print it
				System.out.println(i+1);
				
	//use break
				break;
			}
		}
}
}
