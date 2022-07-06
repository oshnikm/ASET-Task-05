package FP_Experiments;

/**
 * @author Oshni M
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Experiment12 {
  class ERemover implements Function<String, String> {
    public String apply(String String) {
      return String.replaceAll("r", "");
    }
  }
  
  public void run() {
    String[] n1 = {"Rose", "Lilly", "Tulip","Orchid","Daffodil"};

    List<String> n2 = Arrays.asList(n1);

    n2.stream().map(new ERemover()).forEach(String -> System.out.println(String));

  }

  public static void main(String[] args) {
    new Experiment12().run();
  }

}
