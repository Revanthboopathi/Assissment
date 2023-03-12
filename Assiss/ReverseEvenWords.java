package Assiss;

public class ReverseEvenWords {
	public static void main(String[] args) {
		//Declare an string 
				String test="I am a boy";
				
				//split the string 
				String[] t = test.split(" ");  
				//declare an empty string
				String val = "";
				
				//iterate it
				for (int i = 0; i < t.length; i++) {
					
					//use if condition
				    if (i % 2 == 1)
				    	
				    	//reverse that particular word 
				        val = val + new StringBuilder(t[i]).reverse().toString() + " ";
				    else
				        val = val + t[i] + " ";
				}
				//print it
				System.out.println(val);

			}
	}

}
