import java.util.Collections;
import java.util.*;

public class Probando 
{
	static Map<Character,Character> getValid = Collections.unmodifiableMap(new HashMap<Character,Character>(){
		{
			put('{','}');
			put('[',']');
			put('(',')');
		}
	});
	
	public static void main(String[] arg)
	{
		System.out.println(checkBalance("{}[8"));
	}
	
	static boolean checkBalance(String str)
	{
		if(str == null || str.length() %2 != 0)
		{
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) 
		{
			Character actual = str.charAt(i);
			Character valid = getValid.get(actual);
			if(valid!= null)
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
		{
			return false;
		}
	}
	
	
}
