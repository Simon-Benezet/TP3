package TestArray;
import java.util.Scanner;

/**
 * @author Simon Benezet
 * Calcul du nombre dans la suite de Fibonacci au rang N
 */
public class Fibonacci 
{
	public static void main(String[] args)
	{
		int val1 = 0, val2 = 1, val3 = 0;
		// Choisir le rang 
		System.out.println("Entrez N");
		Scanner a = new Scanner(System.in);
		int N = a.nextInt();
		for(int i = 0; i < N; i++)
		{
			val3 = val1 + val2;
			val1 = val2;
			val2 = val3;
		}
		System.out.println("\nLe nombre au rang "+ N + " est " + val3);
	}
	

}
