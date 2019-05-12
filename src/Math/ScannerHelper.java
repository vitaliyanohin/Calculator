package Math;

import java.util.Scanner;

public class ScannerHelper {

  private final Scanner scanner;
  private final ArithmeticalOperations arithmeticalOperations;
  private String operation;

  public ScannerHelper(Scanner scanner){
    this.scanner = scanner;
    arithmeticalOperations = new ArithmeticalOperations();
  }


  public void scan() {

    if (scanner.hasNextInt()) {
      int first = scanner.nextInt();
      operation = scanner.next();

      if (scanner.hasNextInt()) {
        int second = scanner.nextInt();
        System.out.println( arithmeticalOperations.arithmeticOperationsToArabicNumbers(first, operation, second));
      }else {
        System.out.println("VETO!");
        scanner.nextLine();

      } } else {
      String first = scanner.next();
      operation = scanner.next();

      if (scanner.hasNextInt()) {
        System.out.println("VETO!");
        scanner.nextLine();
      } else {
        String second = scanner.next();
        System.out.println( arithmeticalOperations.arithmeticOperationsToRomanNumbers(first, operation, second) + "  Dictum factum!");
      }
    }
  }
}
