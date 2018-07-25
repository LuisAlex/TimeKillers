
import java.util.*;
public class TestingList 
{
	static int number = -1;
	public static void main(String[] arg)
	{
		
		List<Integer> rep = new ArrayList<Integer>();
		rep.add(1);
		rep.add(4);
		rep.add(2);
		rep.add(3);
		rep.add(4);
		Integer [] arr = new Integer[rep.size()];
		rep.toArray(arr);
		
	
		for (int i = 0; i < arr.length; i++) 
		{
			if(rep.contains(arr[i]))
			{
				rep.remove(rep.indexOf(arr[i]));
				if(rep.contains(arr[i]))
				{
					System.out.println("El primer repetido es: "+arr[i]);
					break;
				}
			}
			
		}
	}
	
}
