import java.util.Arrays;

public class Testingfibo 
{
	
	
	public static void main(String[] arg)
	{
	String hello = "Hello";
	
	int[] arr1 = {3,6,2,2,5,8,2};
	int[] arr2 = {5,1,6,9};
	bulbleSort(arr1);
	bulbleSort(arr2);
	System.out.println(Arrays.toString(arr1));
	int[] done= merging(arr1,arr2);
	System.out.println(Arrays.toString(done));
	
		
	}
	
	
	private static int[] merging(int[] arr1, int[] arr2) 
	{
		int [] merged = new int[arr1.length + arr2.length];
		int k = 0;
		int j = 0;
		for (int i = 0; i < merged.length; i++) 
		{
			if(j<arr1.length && k<arr2.length)
			{
				if(arr2[k] < arr1[j])
				{
					merged[i] = arr2[k];
					k++;							
				}else
				{
					merged[i] = arr1[j];
					j++;
				}
				
			}else if(k<arr2.length)
			{
				merged[i] = arr2[k];
				k++;
			}else if(j<arr1.length)
			{
				merged[i] = arr1[j];
				j++;
			}
			
		}
		return merged;
				
		
	}


	public static int[] bulbleSort(int[] arr)
	{
		int temp = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}				
			}
			
		}		
		return arr;
	}

}
