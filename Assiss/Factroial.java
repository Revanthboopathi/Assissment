package Assiss;

import java.util.Iterator;

public class Factroial {
public static void main(String[] args) {
	
	      // declare an integer 
			int fact=1;
		    int n=5;
			//iterate through the loop
			for(int i=n;i>0;i--)
			{
				// multiply i with fact
				fact=fact*i;
			}
			//print fact
			System.out.println(fact);
}
}
