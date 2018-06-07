package com.app;
public class NaturalNumbers {
	public static void main(String[] args) {
		primeFactors(1500);
	}

	static void primeFactors(int num)
	{		int number = 0;


		for (int index = 2; index <= num; index = index + 1)
		{
			
			
			number = index;
			if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0)
			{
					if(index==21 || index==22 || index==26) {
						continue;
					}
				System.out.print(number+":");
				

				while (number % 2 == 0)
				{
					System.out.print(" "+2);
					number = number / 2;
					
					
				}

				
				for (int i = 3; i <= Math.sqrt(number); i = i + 2)
				{
					while (number % i == 0)
					{
						System.out.print(" "+i);
						number = number / i;
					}
				}

				if (number >2)
					System.out.print(" "+number);
				System.out.println();
			}
			
		}
		
	}

}


