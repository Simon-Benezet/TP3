package TestArray;

import java.util.Arrays;

public class TestArrayTri 
{
	public static void main(String[] args) 
	{
		int[] tab = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		Arrays.sort(tab);

		for (int i = 0; i < tab.length; i++)
			System.out.print(tab[i] + ", ");
	}
}
