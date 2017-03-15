import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a number:");
    String inputString = myConsole.readLine();
    Integer parseInputNumber = Integer.parseInt(inputString);

    PrimeSifter.runPrimeSifter(parseInputNumber);
  }
}
