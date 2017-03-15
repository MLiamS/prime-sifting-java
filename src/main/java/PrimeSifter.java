import java.util.ArrayList;
import java.util.List;

public class PrimeSifter {


  public static List<Integer> runPrimeSifter(int countTo){
    ArrayList<Integer> result = new ArrayList<Integer>();
    // result.add(2);
    for (Integer i =2; i <= countTo; i++){
      result.add(i);
    }
    for (Integer i=0; i<= result.size(); i++){
      // for ( Integer thisInt : result ) {
        if (result.get(i) % i == 0 && result.get(i) != i){
          result.remove(result.get(i));
        }
        // System.out.println(thisInt);
      // }
    }
    return result;
  }



}
