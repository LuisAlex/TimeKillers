
public class Espejo {

	public static void main(String[] args) 
	{
		String palabra = "gajtza";
		char[] order = palabra.toCharArray();
		for (int i = 0; i < palabra.length()-1; i++) 
		{
			
			char temp=' ';
			for (int j = i+1; j < palabra.length()-1; j++) 
			{
				char algo = order[i];
				char algo2 = order[j];
				boolean algo3 = order[i]>order[j];
				if(order[i]>order[j])
				{
					
					
					temp=order[j];
					order[j] = order[i];
					order[i] = temp;
					
				}
				
			}
			
		}
		for (int i = 0; i < order.length; i++) 
		{
			System.out.println(order[i]);
			
		}
		
		
	}

}
