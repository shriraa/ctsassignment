package Exceptionhandling;

public class ExceptionDemo {
	public static void main(String[] args) {
		int x;
		int y;
		try {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			System.out.println(x / y);
		} catch (NumberFormatException e) {
			System.out.println("Please Provide Integers");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Second Parameter Should not be Zero");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please Provide two Integers");
			e.printStackTrace();
		} 

	}
}
