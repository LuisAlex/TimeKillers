import java.util.*;
public class checlos 
{
	
	static Map<Character,Character> getValid = Collections.unmodifiableMap(new HashMap<Character, Character>(){
		{
			put('{','}');
			put('[',']');
			put('(',')');
		}
	});
	
	public static void main(String[] arg)
	{

		//System.out.println("Balanced:   ---> " +check(null));
		System.out.println("not Balanced: -> " + check("{}[]"));
		
		
	}
	
	
	
	public static boolean check(String pal)
	{
		if(pal == null )
		{
			return false;
		}
		if(pal.isEmpty())
		{
			return false;
		}
		if(pal.length()%2 != 0)
		{
			return false;
		}
		Stack<Character> stack= new Stack<Character>();
		for (int i = 0; i < pal.length(); i++) 
		{
			Character actual = pal.charAt(i);
			Character valid = getValid.get(actual);
			if(valid != null)
			{
			stack.push(actual);	
			}else
			{
				if(stack.isEmpty())
				{
					return false;
				}
				Character isValid = stack.pop();
				Character checkValid1 = getValid.get(isValid);
				if(!actual.equals(getValid.get(isValid)))
				{
					return false;
				}
				
			}
		}
		if(stack.isEmpty())
		{
			return true;
		}else		
		return false;
	}

}
