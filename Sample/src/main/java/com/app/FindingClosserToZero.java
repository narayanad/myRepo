package com.app;

import java.util.Arrays;

public class FindingClosserToZero {

	public static int getClosestToZero(int[] a) {

		//Assigning runtime values into local variable
		int[] b = a;
		//sorting the coming array using Arrays class in util package 
		Arrays.sort(b);
		//Initialing the local variables  to hold the negative and positive values 
		int negativeval = 0;
		int positiveVal = 0;
		int closeToZero;

		//using for loop to retrieve the values from araay
		for( int i = 0; i < b.length; i++) {
			/*checking the given array value to zero using if condition. if value < then zero the 
        	incrementing negaiveval and positiveval*/
			if (b[i] < 0) {
				negativeval++;
				positiveVal++;
			}
			if (b[i] == 0) 
				positiveVal++;
		}
		--negativeval;

		if (b[0] >= 0) closeToZero = b[positiveVal];
		else {
			if ((b[negativeval]*-1) < b[positiveVal]) {
				closeToZero = (b[negativeval]*-1);
			}   else    closeToZero = b[positiveVal]; }
		return closeToZero;


	}
}
