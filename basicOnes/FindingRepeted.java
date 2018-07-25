package TEstindMonday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;

public class FindingRepeted extends Repetido
{
	static int[] mergedArr= new int [5];
	
	public static void main(String []arg) 
	{		
	ordenaArr(arrayList);
	ordenaVec(vector);
	ordenaInt(arr1);
	ordenaInt(arr2);
	ordenStr(string);
	ordenaMap(map);
	mergeInt1(arr1, arr2);
	mergeInt2(arr1, arr2);
	}
	
	private static void ordenStr(String[] string) 
	{
		System.out.println("\nString");
		String  aux;
		for (int i = 0; i < string.length; i++)
		{
			for (int j = 0; j < string.length-1; j++)
			{
				
				//System.out.println(string[j]+" compareTo "+string[j+1]+ " resultado: "+ string[j].compareTo(string[j+1]));
				if(string[j].compareTo(string[j+1]) > 0)
				{
					aux   = string[j]; 
					string[j]  = string[j+1]; 
					string[j+1]= aux; 
				}
			}

		}
		System.out.println(Arrays.toString(string));
		
	}

	private static Map<String, Integer> ordenaMap(Map<String, Integer> map) 
	{
		return map;
		
	}

	public static ArrayList ordenaArr(ArrayList arrayList) 
	{
	System.out.println("\n Lista");	
	Collections.sort(arrayList);
	arrayList.forEach(n->{
		System.out.println(n);
	});
	return arrayList;
	}
	
	public static Vector ordenaVec(Vector vector) 
	{
		Collections.sort(vector);
		System.out.println("\n Vector");
		for (int i = 0; i < vector.size(); i++) 
		{
			System.out.println(vector.get(i));			
		}
		return vector;
	}
	
	public static int[] ordenaInt(int[]arr)
	{
		System.out.println("\n Ordenado");
		int temp;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length-1; j++) 
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
				
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	public static int[] mergeInt1(int[]a, int[] b)
	{
		
		System.out.println("\n Arrays merged");
	
	    int j = 0, k = 0;

	    //output array should be 3,5,6,7,7,9,10,12,14,15

	    int c [] = new int[a.length+b.length];//10 values

	    // we're filling c with the next appropriate number
	    // we start with checking a[0] and b[0] till we add
	    // all the elements
	    for (int i = 0; i < c.length; i++) 
	    {
	        // if both "a" and "b" have elements left to check
	        if (j < a.length && k < b.length) 
	        {
	            // check if "b" has a smaller element
	            if (b[k] < a[j]) 
	            {
	                // if so add it to "c"
	                c[i] = b[k];
	                k++;
	            }
	            // if "a" has a smaller element
	            else 
	            {
	                // add it to "c"
	                c[i] = a[j];
	                j++;
	            }       
	        }
	        // if there are no more elements to check in "a"
	        // but there are still elements to check in "b"
	        else if (k < b.length) 
	        {
	            // add those elements in "b" to "c"
	            c[i] = b[k];
	            k++;
	        }
	        // if there are no more elements to check in "b"
	        // but there are still elements to check in "a"
	        else 
	        {
	            // add those elements in "a" to "c"
	            c[i] = a[j];
	            j++;
	        }
	    }
	    System.out.println(Arrays.toString(c));
		return mergedArr;
	}
	
	public static int[] mergeInt2(int[]arr1, int[]arr2)
	{
		return mergedArr;
	}

}
