package Assiss;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		//Declare a string 
				Scanner sc=new Scanner(System.in);
				String text=sc.nextLine();
				
				//convert the string into characters and store it in char array
				char[] characters= text.toCharArray();
				
				//
				for(int i=characters.length-1;i>=0;i--)
				{
					System.out.print(characters[i]);
				}

	}

}
