import java.util.Scanner;
public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;
    boolean start = true;
    while (start) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();
      if(selection == 1) {
          System.out.println("Hello Human");
          start = true;
      } else if(selection == 2) {
          System.out.println("Apples, Bananas, Coconuts");
          start = true;
      } else {
         start = false;
     	    System.out.println("Goodbye");
      }

    }

    scanner.close();
  }
}
