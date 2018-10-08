package TestArray;

public class TestArray1 
{
	public static void main(String[] args)
	{
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		//Display from the begin
		System.out.print("Du premier au dernier : ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i]+",");
		System.out.println("\n");
		//---------------------------------
		//Display from the end
		System.out.print("Du dernier au premier : ");
		for (int i = 16; i >= 0; i--)
			System.out.print(array[i]+",");
		System.out.println("\n");
		//---------------------------------
		//Display all number higher than 3
		System.out.print("Tous les nombres supérieurs à 3 : ");
		for (int i = 0; i < array.length; i++)
		{
			if(array[i]>3)
				System.out.print(array[i]+",");
		}
		System.out.println("\n");
		//---------------------------------
		//Display even integer
		System.out.print("Tous les nombres entiers : ");
		for (int i = 0; i < array.length; i++)
		{
			int res = array[i] % 2;
			if(res == 0)
				System.out.print(array[i]+",");
		}
		System.out.println("\n");
		//---------------------------------
		//Display higher number
		System.out.print("Le plus grand nombre : ");
		for (int i = 0; i < array.length; i++)
		{
			int G = 0;
			while(i < 17)
			{
				if(array[i]> G)
				{
					G = array[i];
					i++;
				}
				else
					i++;
			}
			System.out.print(G);
		}
		System.out.println("\n");
		/*
		int resultat = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++)
		{
			int test = array[i];
			if(test < resultat)
				resultat = test;
		}
		System.out.println(resultat);
		
		*/
		
		
		//---------------------------------
		//Display higher number
		System.out.print("Le plus petit nombre : ");
		for (int i = 0; i < 17; i++)
		{
			int P = 28;
			while(i < 17)
			{
				if(array[i]< P)
				{
					P = array[i];
					i++;
				}
				else
					i++;
			}
			System.out.print(P);
			

		}
	}
}
