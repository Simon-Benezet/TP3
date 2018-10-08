package TestArray;
import java.util.Scanner;

/**
 * @author Simon Benezet
 *	Calcul de Fibonacci
 */
public class Fibonacci 
{
	public static void main(String[] args)
	{
		int val1 = 0, val2 = 1, val3 = 0;
		//Entrer la valeur de rang N
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
