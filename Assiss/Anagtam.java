package Assiss;

import java.util.Arrays;

public class Anagtam {
	public static void main(String[] args) {
		      // Declare two string variables
				String str1="race";  
				String str2="care";
			
				//convert the string into characters and store it in char array
				char[] charArr1=str1.toCharArray();
				char[] charArr2=str2.toCharArray();
				
				//sort the character array
				Arrays.sort(charArr1);
				Arrays.sort(charArr2);
				
				boolean equals=Arrays.equals(charArr1,charArr2); // checks whether both the arrays are equal using .equals method
				System.out.println(equals);
				//use if class to compare whether it is anagram or not
				if(Arrays.equals(charArr1,charArr2))
				{
					System.out.println("The given string is Anagram");  //it is anagram if it is equal
				}
				else
				{
					System.out.println("The given string is not Anagram");
				}
	}

}
