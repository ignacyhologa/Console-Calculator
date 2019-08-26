import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to NUMBER CRASHER! \n");
		
		do {
			System.out.println("Choose operation:\n 0. Quit \n 1. Addition \n "
					+ "2. Subtraction \n 3. Multiplication \n 4. Division");
			int operation = sc.nextInt();
			if (operation == 0) {break;}
			System.out.println("Please enter the first value: ");
			double value1 = sc.nextDouble();
			System.out.println("Please enter the second value: ");
			double value2 = sc.nextDouble();
			
			ControlFlow con = new ControlFlow();
			double result = con.logic(operation, value1, value2);
			System.out.println("The result is: " + result + "\n");
			
		} while (true);
		sc.close();		
	}
}