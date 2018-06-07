package com.app;


public class SumOfTwoIntArray {




	public static int sumOfTwoLargestElemnets(int []a) {
		
		//Initializing local variable and assign runtime value
		//Initializing local variable to find second large integer value in given array 
		int largNum1= a[0];
		int largNum2 = -1;

		// took for loop retrieve the values from Array
		for(int i=0;i<a.length-1;i++){
			//comparing all values with other value like pair   
			if(a[i] > largNum1){
				largNum2 = largNum1;
				largNum1 = a[i];
			}
			//checking condition if the given array possession  > largNum1 and not equal to largNum1
			//then assign index value to largeNum2 
			else if (a[i] > largNum2 && a[i] != largNum1) {
				largNum2 = a[i];
			}
		}
		// after getting the value return it 
		return largNum1+largNum2;

	}
	
}



