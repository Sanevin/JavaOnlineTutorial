package JavaLessonOne;

public class HelloWorld1
{
	static String randomString = "String 2 print";
	
	static final double PINUM = 3.141529;
	
	@SuppressWarnings("unused")
	public static void main (String[] args)
	{
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 2100000000;
		long bigLong = 9220000000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.14823;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 65; // 65 = A
		char anotherChar = 'A';
		
		String randomString = "random String";
		String anotherString = "Stuff";
		
		String andAnotherString = randomString + ' ' + anotherString;
		
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigByte);
		String intString = Integer.toString(bigInt);
		String longString = Long.toString(bigByte);
		String floatString = Float.toString(bigByte);
		String doubleString = Double.toString(bigByte);
		String booleanString = Boolean.toString(trueOrFalse);
		
		double aDoubleValue = 3.14546466464;
		int DoubleToInt = (int) aDoubleValue;
		
		int stringToInt = Integer.parseInt(intString);
		
		System.out.println(randomChar);
		
		
	}

}
