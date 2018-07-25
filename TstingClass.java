import java.util.*;

public class TstingClass {

	static Map<Character,Character> getValid = Collections.unmodifiableMap(new HashMap<Character,Character>(){
		{
			put('{','}');
			put('[',']');
			put('(',')');
		}
	});
	
	
	public static void main(String[] args) 
	{
	String toCheck = "{}{8";
	System.out.println(chekedString(toCheck));
	}
	
	
	public static boolean chekedString(String string)
	{
	Stack<Character> stack =  new Stack<Character>();
	if(string == null || string.isEmpty() || string.length() %2 != 0)
	{
		return false;
	}
	for(int i=0 ; i < string.length(); i++)
	{
		Character actual = string.charAt(i);
		Character validated = getValid.get(actual);
		if(validated != null)
		{
			stack.push(actual);
		}else
		{
			if(stack.isEmpty())
				return false;
			Character pop = stack.pop();
			Character si= getValid.get(pop);
			if(!actual.equals(getValid.get(pop)))
				return false;
		}
	}
	if(stack.isEmpty())
		return true;
	else
		return false;
	}

}
