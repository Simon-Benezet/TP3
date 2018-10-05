package TestArray;

import java.util.Arrays;

public class TestArrayTri 
{
	 public static void main(String[] args) 
	 {
         int[] list = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
         Arrays.sort(list);
         
         for(int i = 0; i < list.length; i++)
                 System.out.print(list[i] +", ");
 }
}
