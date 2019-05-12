package Math.exeption;

public class ZeroOrBelowZeroException extends RuntimeException {

  public ZeroOrBelowZeroException() {
    super("result is zero or below zero");
  }
}
