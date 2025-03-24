package Section3;

import java.util.Arrays;

public class Array_method 
{
	public static void main(String[] args) 
	{
		//Length of an array
		int[] num = {10,20,30,40,50};
		System.out.println("Length of sum: "+num.length);
		
		//Copying an array
		int[] source = {1,2,3,4,5};
		int[] destination = new int[5];
		
		//copy array
		System.arraycopy(source, 0, destination, 0, source.length);
		
		for(int i : destination)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Array sort
		int[] b = {12,8,6,45,2};
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(b));
		
		//Array fill
		int[] d = new int[5];
		Arrays.fill(d, 1);
		Arrays.fill(d, 1,4,2);
		System.out.println(Arrays.toString(d));
		
		
		
	}

}
