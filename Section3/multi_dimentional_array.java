package Section3;

public class multi_dimentional_array 
{
	public static void main(String[] args) 
	{
		int[][] a = {{1,2}, {3,4}, {5,6}, {7,8}};
		/*
		for(int i =0; i<a.length; i++)
		{
			for(int j =0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]);	
			}
			System.out.println();
		}*/
		
		for(int[] i : a)
		{
			for(int j: i)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
