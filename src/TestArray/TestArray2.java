package TestArray;

public class TestArray2 
{
	public static void main(String[] args)
	{
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		
		//average
		float tot = 0;
		for(int i = 0; i < 17; i++)
			tot = tot + array[i];
		float moy = 0;
		moy = tot / 17;
		System.out.println("moyenne : " + moy);
		//---------------------------------
		
		//Index
		int index = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == 15)
				index = i;
		}
		System.out.println("index : " + index);
		//---------------------------------
		
		//Doublon
		int doublon = 0;
		for(int i = 0; i < array.length; i++)
		{
			for(int y = 0; y < array.length; y++)
			{
				if(array[y] == array[i])
				{
					doublon++;
					//System.out.print(doublon + "ERREUR");
				}
			}
		}
		System.out.print("Doublon : " + doublon + "ERREUR");
		
	}
}
