package Assiss;

public class SplitExample {
	public static void main(String[] args) {
		//declare a string 
				String str1="i have 20,000 rupee ";
				
				//split the string and store it in string array
				String[] len=str1.split("\\s+");
				System.out.println(len.length);
				
				//replace
				String replaceAll=str1.replaceAll("[0-9]","");
				System.out.println(replaceAll);
				
				String replaceAll1=str1.replaceAll("[^0-9]","");
				System.out.println(replaceAll1);
				
				Boolean contains=str1.contains("have");
				System.out.println(contains);
	}

}
