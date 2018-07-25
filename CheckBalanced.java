import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class CheckBalanced 
{
private static final Map<Character, Character> validBrackets = new HashMap<Character, Character> ();

static Map<Character,Character> getValid = Collections.unmodifiableMap(new HashMap<Character, Character>(){
	{
		put('[',']');
	}
});

static Map <Character,Character> getValid2 = Collections.unmodifiableMap(new HashMap<Character,Character>(){
	{
		put('[',']');
	}
});

	
	static{
		validBrackets.put('(', ')');
		validBrackets.put('[', ']');
		validBrackets.put('{', '}');
	}
	
	public static void main(String[] args) {
		System.out.println("Balanced:   ---> " +checkIfBalanced("([{[]}])"));
		System.out.println("not Balanced: -> " + checkIfBalanced("({[(}]})"));
	}
	
	private static boolean checkIfBalanced(String stringToCheck)
	{
		if(stringToCheck==null || stringToCheck.isEmpty())
			throw new IllegalArgumentException("String can't be null or empty");
		if(stringToCheck.length()%2!=0)
			return false;
		Deque<Character> stack = new ArrayDeque<>();
		for(int i=0; i<stringToCheck.length(); i++)
		{
			Character current = stringToCheck.charAt(i);
			Character closure = validBrackets.get(current);
			if(closure!=null){
				stack.push(current);
			}else{
				if(stack.isEmpty())
					return false;
				Character last = stack.pop();
				Character aqui = validBrackets.get(last);
				if(!current.equals(validBrackets.get(last))){
					return false;
				}
			}
		}
		if(!stack.isEmpty())
			return false;
		return true;
	}

}

