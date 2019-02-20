
	package core;
	 
	import java.util.Arrays;
	 
	public class DopZadanie2
	{
	    static int co = 0;
	    static int ch = 0;
	 
	    public static void main(String[] args)
	    {
	        sort(new int[] { 9, 5, 8, 6, 1, 3, 7, 4, 2 });
	    }
	 
	    public static void sort(int[] array)
	    {
	        int i, j, newValue;
	        for (i = 1; i < array.length; i++)
	        {
	            newValue = array[i];
	            j = i;
	            while (j > 0 && array[j - 1] > newValue)
	            {
	                co++;
	                array[j] = array[j - 1];
	                j--;
	            }
	 
	            ch++;
	            array[j] = newValue;
	        }
	 
	        System.out.println(Arrays.toString(array));
	        System.out.println("Сравнений: " + co + " ; Замен: " + ch);
	    }
	
	}

