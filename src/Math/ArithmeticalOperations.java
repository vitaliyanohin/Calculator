package Math;

import Math.exeption.OperationToZeroException;
import Math.exeption.MoreLimitException;
import Math.exeption.NoFoundOperationException;

public class ArithmeticalOperations {

  private final Converter converter;

  public ArithmeticalOperations() {
    this.converter = new Converter();
  }

  public int arithmeticOperationsToArabicNumbers(int first, String operation, int second) {

    return arithmeticalOperations(first, operation, second);
  }

  public String arithmeticOperationsToRomanNumbers(String firstNumber, String operation, String secondNumber) {
    int first = converter.romanToArab(firstNumber);
    int second = converter.romanToArab(secondNumber);
    int result = arithmeticalOperations(first, operation, second);

    return converter.toRoman(result);
  }

  private static int arithmeticalOperations(int first, String operation, int second) {

    switch (operation) {
      case "+":
        if ((first + second) > 1000){
          throw new MoreLimitException();
        } return first + second;

      case "-":
        if ((first - second) <= 0){
          throw new OperationToZeroException("result zero or below zero!");
        } return first - second;

      case "*":
        if ((first * second) > 1000){
          throw new MoreLimitException();
        } return first + second;

      case "/":
        if (second == 0 || (first/second) <= 0) throw new OperationToZeroException("Division by zero or result zero or below zero");

        return first / second;
        default: throw new NoFoundOperationException();
    }
  }
}