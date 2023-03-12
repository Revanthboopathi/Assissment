package Assiss;

public class DuplicateElement {
	public static void main(String[] args) {
			
			//Declare an integer 
			int arr1[]= {7,2,4,5,6,7,8,4,6,6};
			
			//declare integer variables 
			int count=0,flag=0;
		
			//Iterate the values 
			for(int i=0;i<arr1.length;i++)
			{			count=1;
				for (int j=i+1;j<arr1.length;j++)
				{	
					//use if class to compare
					if(arr1[i]==arr1[j])
					{
						count++;
						arr1[j]=flag;
					}	
				}
				
				if(count>1&&arr1[i]!=flag)
				{
					System.out.println(arr1[i]);
				}
	}
	}
}
