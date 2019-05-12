package Math;

import java.util.Scanner;

/**
 * calculator works in the range from 1 to 1000
 */

public class Main {

  private static ScannerHelper scannerHelper;
  private static boolean bool = true;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scannerHelper = new ScannerHelper(scanner);

    System.out.println("Ave Caesar!");

    while (bool) {
      System.out.println("Panem et circenses!");
      scannerHelper.scan();

      System.out.println("In infinitum? Y/N");
      String check = scanner.next();

      if (!check.equals("Y")) {
        System.out.println("Acta est fabula!");
        bool = false;
      }
    }
  }
}


