package core;

import java.util.Arrays;
import java.util.Scanner;

public class Massive {
	int [] anyMasToPrint = new int  [5];
	Massive masssive = new Massive();
	
		
	
	public static void printMassiveAsLine(int[] anyMasToPrint )
	{
		for(int i=0; i<anyMasToPrint.length; i++)
		{
			System.out.println(anyMasToPrint[i]);
		}
	}
	
	
	public static void printReverseMassiveAsLine(String[] reverseArray1)
	{
		String str = "ProgLang.su";
	      char[] reverseArray11 = str.toCharArray(); // Преобразуем строку str в массив символов (char)
	      System.out.print("1. Массив в обратном порядке: ");
	      for (int i = reverseArray11.length-1; i >= 0; i--) 
	    	  System.out.print(reverseArray11[i]);
	      
	}
	
		
	
	public static int[] getSumOfElements(int[] sumOfElements)
	
	{
		
		int [] sumOfElements1 =new int[]{11,22,33,44,55,66,77,88,99,100};
		int len=sumOfElements1.length;
		int sum = 0;
		for(int i=1;i<len;i++){
		sum=sum+sumOfElements1[i];
		
		System.out.println(sumOfElements1[i]);
		
	}
		return sumOfElements;
		
	} 

		
	
	
	
	public static int[] multiplyBy3(int[] array2)	{
		
		
	int[] array = new int[5];
		Scanner in = new Scanner (System.in);
		System.out.print("Введите количество элементов в массиве ");
		
		array = new int [5];
		for (int i = 0; i< array.length; i++) {
			System.out.print("Введите a[" + i + "] = ");
			array[i] = in.nextInt ();
			
		}
		for(int i = 0; i < array.length; i ++) {
			array[i] *= 3;
           
    		System.out.println(array[i]);}
		return array2;
		
	}
	
		
		
		
		
	
}

