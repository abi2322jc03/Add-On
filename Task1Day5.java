package day4java;

public class Task1Day5 {

	public static void main(String[] args) {

		try {

			int a = 2;

			int b = 4;

			int c;

			c = a / b;

			System.out.println("the answer is:" + c);

		}

		catch (Exception e) {

			System.out.println("Zero is not divide by a number");

		}

		finally {

			System.out.println("the end");

		}

	}

}
