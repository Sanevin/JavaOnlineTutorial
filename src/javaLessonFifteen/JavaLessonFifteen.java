package javaLessonFifteen;

// Interfaces and Abstract
public class JavaLessonFifteen {
	
	public static void main(String[] args){
		Vehicle car = new Vehicle(4, 100.00);
	
		System.out.println("Cars Max Speed " + car.getSpeed());
		System.out.println("Num of Wheels " + car.getWheel());
		
		car.setCarStrength(10);
		
		System.out.println("Strength: " + car.getCarStrength());
	}
	
	
}
