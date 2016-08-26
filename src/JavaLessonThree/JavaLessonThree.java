package JavaLessonThree;

public class JavaLessonThree {
	
	public static void main(String[] args)
	{
		
		char theGrade = 'B';
		switch (theGrade)
		{
		case 'A':
			System.out.println("Great job");
			break;
		case 'b':	
		case 'B':
			System.out.println("Good job");
			break;
		case 'C':
			System.out.println("Ok job");
			break;
		case 'D':
			System.out.println("Bad job");
			break;
		default:
			System.out.println("You Failed");
			break;	
		}
		
	}

}
