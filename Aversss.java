import java.util.Arrays;

public class Aversss 
{
	public static void main(String []arg)
	{
		int[] a1 = {3,6,4,7,8,1};
		int[] a2 = {8,3,5,1,2,4};
		char[] s1 = {'c','a','z','b','a'};
		arrayOrderBub(a1);
		arrayOrderBub(a2);
		stringOrder(s1);
		int[] a3 = merged(a1,a2);
		
		
		System.out.println(Arrays.toString(a3));
		//System.out.println(Arrays.toString(s1));
		//fiboPrint(0, 1, 200);
		//System.out.println("\n"+reverse("Hello"));		
	}
	
	public static int[] merged(int[]a2,int[] a1)
	{
		int[] a3 = new int[a1.length + a2.length];
		int k=0;
		int j=0;		
		for (int i = 0; i < a3.length; i++) 
		{
			if(j<a1.length && k<a2.length)
			{
				if(a2[k]<a1[j])
				{
					a3[i] = a2[k];
					k++;
				}else
				{
					a3[i] = a1[j];
					j++;
				}				
			}else if(k<a2.length)
			{
				a3[i] = a2[k];
				k++;
			}else if(j<a1.length)
			{
				a3[i] = a1[j];
				j++;
			}
		}
		
		
		return a3;
	}
	
	public static int[] arrayOrderBub(int []arr)
	{
		
		int temp=0;
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
	
	
	public static char[] stringOrder(char[] pal)
	{
		char temp=' ';
		for (int i = 0; i < pal.length; i++) 
		{
			for (int j = i+1; j < pal.length; j++) 
			{
				if(pal[i]>pal[j])
				{
					temp = pal[j];
					pal[j]= pal[i];
					pal[i] = temp;
				}
			}
			
		}
		
		return pal;
	}
	
	public static void fiboPrint(int o1, int o2, int limit)
	{
		System.out.print(o1);
		for (int i = 0; o2 < limit; i++) 
		{
			System.out.print(", "+o2);
			o2 = o2 + o1;
			o1 = o2 - o1;
		}
	}
	
	public static String reverse(String str)
	{
		if(str == null || str.length() <= 1)
		{
			return str;
		}
		String rev = reverse(str.substring(1))+str.charAt(0);
		return rev;
	}
}
