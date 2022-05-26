import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    System.out.println("Please give me a number: ");
    num1 = kb.nextDouble();

    System.out.println("Please give me another number: ");
    num2 = kb.nextDouble();
		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
            case 1:
                System.out.println(findSum(num1,num2));
                break;
            case 2:
                System.out.println(findAverage(num1,num2));
                break;
            case 3:
                System.out.println(calcTax(num1,num2));
                break;
            case 4:
                System.out.println("You've chosen to quit");
                keepGoing = false;
                break;
            default:
                System.out.println("Invaild Entry. Please try again.");
            break;
		}

	}
  kb.close();
}
	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}
	public static double findAverage(double z, double w) {
	    double average = (z + w)/2;
	    return average;
	}
	public static double calcTax(double q, double h) {
	    double tax = (q + h) * .0831;
	    return tax;
	}


}
