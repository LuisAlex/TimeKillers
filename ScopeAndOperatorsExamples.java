
public class ScopeAndOperatorsExamples 
{
	// Static variables live the longest, they are 'alive' as long as the Class is 'alive'
		// This is during the entire life the application is running
		private static int counter = 10;
		/*
		 * Instance variables live while the object they belong is alive as well (from the creation
		 * time until it's destroyed by the garbage collection process
		 * Instance variable are declared within the class, outside all methods and are reachable by
		 * all methods in the same class
		 */  
		private String name = "Scott";
		
		public ScopeAndOperatorsExamples(){
			System.out.println(counter);
		}
		
		public static void main(String[] args) {
			/*
			 * Local variables are variables declared within methods, they are alive until the method finishes its execution
			 * If it's a reference variable and we make a variable with a greater scope reference to the same object, that
			 * object will stay alive after the method has finished
			 */
			int timeInSeconds = 60;
			
			// A static method has access to only static members
			System.out.println(counter);
			
			// Assignation operators
			int num = 10; // Assign  value directly
			String myString = "Hello";
			num = num + 2;
			num += 2; // Equivalent to the previous line
			num -= 5;
			System.out.println(num);
			
			//Relational Operators
			boolean res = 3==5; // check if values are the same
			boolean res2 = 4==4;
			//System.out.println(res!=res2);
			
			
			String s1 = new String("Name 1");
			String s2 = new String("Name 1");
			String s3 = "Name 1";
			String s4 = s3;
 			
			System.out.println("Strings s1equals2: "+s1.equals(s2));
			System.out.println("Strings s1 == s2: "+s1 == s2);
			System.out.println("Strings s1 == s3: "+s1 == s3);
			System.out.println("Strings s4 == s3: "+s3 == s4);
			
			int n1 = 10;
			int n2 = 20;
			
			double n3 = 5.7;
			double n4 = 8.3;
			
			// Arithmetic operators
			System.out.println(n1+n2);
			System.out.println(n1-n2);
			System.out.println(n1*n2);
			System.out.println(n1/n2);
			System.out.println(n1%n2);
			
			// Dividing double values we get a double result, otherwise we get an int result
			System.out.println(n3/n4);
			
			// Logical operators, using to compare boolean expressions (&&, ||, &, |, ==, !=)
			System.out.println(1==1 && res);
			
			int i = 10;
			System.out.println(i++); // 11
			System.out.println(++i); // 10
		}
		
		public void print(){
			final String name = "Charles";
			System.out.println(counter+", "+name);
			for(int i=1; i<=10; i++){
				System.out.println(i);
			}
			{
				
			}
			
		}
		
		public void sayHi(){
			System.out.println(counter+", "+name);
		}

}
