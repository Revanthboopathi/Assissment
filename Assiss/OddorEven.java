package Assiss;

import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
		//Declare  integer 
				@SuppressWarnings("resource")
				Scanner a =new Scanner(System.in);
				int b=a.nextInt();
				
				//checks if a%2 is equal to 0
				if(b%2==0)
				{
					System.out.println(b+" is even");
				}
				else
				{
					System.out.println(b+" is odd");
				}
	}

}
