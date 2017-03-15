import java.util.ArrayList;
import java.util.List;

public class PrimeSifter {


  public static List<Integer> runPrimeSifter(int countTo){
    ArrayList<Integer> result = new ArrayList<Integer>();
    // result.add(2);
    for (int i =2; i <= countTo; i++){
      result.add(i);
    }
    for (int i=2; i<= result.size(); i++){
      for ( Integer thisInt : result ) {
        if (thisInt % i == 0 && thisInt != i){
          result.remove(thisInt);
        }
        System.out.println(thisInt);
      }
    }
    return result;
  }



}
