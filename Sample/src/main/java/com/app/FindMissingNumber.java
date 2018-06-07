package com.app;

public class FindMissingNumber {
	public  static int findMissingnum(int num[]){
		int n=num.length;
		int ecpected=0,total=0;
		ecpected=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
			total+=num[i];
		return  ecpected-total;
	}

	public static void main(String [] args){
		int num[]={1,2,3,5,6,4,8,10};
		int x=findMissingnum(num);
		System.out.println(x);

	}
} 

