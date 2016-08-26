package JavaLessonSix;
import java.util.*;

public class JavaLessonSix {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.print("How old are you?");
		int age = checkValidAge();
		
		if (age != 0){
			System.out.println("You are " + age + "years old.");
		}
		
	}
	public static int checkValidAge(){
		
		try
		{
			return userInput.nextInt();
		}
		
		catch (InputMismatchException e)
		{
			userInput.next();
			System.out.println("That isn't a whole number");
			return 0;
		}
	}
	
	public static void divideByZero(int a){
		
		try
		{
			
			System.out.println(a/0);
			
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("You can't do that!");
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();
			
			System.out.println(e.toString());
		}
		
	}
	
	
	// Exception Handling
}
