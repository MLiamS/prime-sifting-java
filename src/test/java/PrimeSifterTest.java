import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeSifterTest  {

  @Test
  public void runPrimeSifter_enterTwo_ArrayList() {
    PrimeSifter testPrimeSifter = new PrimeSifter();
    List<Integer> expectedOutput = new ArrayList<Integer>();
    expectedOutput.add(2);
    assertEquals(expectedOutput, testPrimeSifter.runPrimeSifter(2));
  }

  @Test
  public void runPrimeSifter_enterTwoisPrime_ArrayList() {
    PrimeSifter testPrimeSifter = new PrimeSifter();
    List<Integer> expectedOutput = new ArrayList<Integer>();
    expectedOutput.add(2);
    expectedOutput.add(3);

    assertEquals(expectedOutput, testPrimeSifter.runPrimeSifter(3));
  }





}
