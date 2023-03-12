package Assiss;

public class PrintEacfCharacter {
	public static void main(String[] args) {
		//Declare a string 
				String text="testleaf";
				
				//convert the string 
				char[] characters=text.toCharArray();
				//iterate it
				for(int i=0;i<characters.length;i++)
				{
					System.out.println(characters[i]);
				}
	}

}
