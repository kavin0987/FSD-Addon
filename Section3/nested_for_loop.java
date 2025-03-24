package Section3;

import java.util.Scanner;

public class nested_for_loop
{
	public static void main(String[] args) 
	{
		/*for(int m =1; m<=2; m++)
		{
			for(int d =1; d<=2; d++) 
			{
				for(int h =1; h<=2; h++)
				
			{
				System.out.println(m+"\t"+d +"\t" +h);
			}
			System.out.println("\t");
			}
		}
		for(int v = 1; v<=5; v++)
		{
			for(int n =1; n<v+1; n++)
			{
				System.out.print(n);
				System.out.print("\t");
			}
			System.out.println();
		}*/
		
		/*
		int num = 7;
		for(int d =1; d<=num; d++)
		{
			for(int g =1; g<=num-d; g++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		//DIAMOUND PATTERN
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of rows siuuuu: ");
		
		int rows = sc.nextInt();
		
		//Top half of diamond
		for(int i =1; i<=rows; i++)
		{
			//leading spaces
			for(int j =i; j<rows; j++)
			{
				System.out.print(" ");
				
			}
			//print *
			for(int p =1; p <=(2*i-1); p++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Bottom half of diamond
				for(int i = rows; i>=1; i--)
				{
					//leading spaces
					for(int j =rows; j>i; j--)
					{
						System.out.print(" ");
						
					}
					//print *
					for(int k =1; k<=(2*i-1); k++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
		
			
				
		
		
	}

}
