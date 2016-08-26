package JavaLessonSix;
import java.io.*;

public class JavaLessonSixTwo {
	
	public static void main(String[] args){
		
		getAFile("./somestuff.txt");
		
	}
	
	@SuppressWarnings("resource")
	public static void getAFile(String fileName){
		try
		{
			@SuppressWarnings("unused")
			FileInputStream file = new FileInputStream(fileName);
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("Sorry can't find that file.");
		}
		catch(@SuppressWarnings("hiding") IOException e)
		{
			System.out.println("Unknown IO Error");
		}
		
		catch(Exception e)
		{
			System.out.println("Some error occured");
		}
		finally{
			System.out.println("The program is done!");
		}
	}

}
