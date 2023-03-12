package Assiss;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		//Declare a string 
				String str1="TestLeaf";
				
				//convert the string into character 
				char[] characters=str1.toCharArray();
				
				//iterate it 
				for(int i=0;i<characters.length;i++)
				{
					
					// use if class to compare
					if(i%2==1)
					{
						
						//use toUpperCase to change into uppercase
						System.out.print(Character.toUpperCase(characters[i]));
						
					}
					else
					{
						System.out.print(characters[i]);
					}
	}
	}
}
