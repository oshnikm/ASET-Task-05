package FP_Experiments;

/**
 * @author Oshni M
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Experiment10 {
	
	class EFilter implements Predicate<String>{
		public boolean test(String String) {
		  return String.contains("r");
		}
	}
	
	public void run() {
	  String[] n1 = {"Rose", "Lilly", "Tulip","Orchid","Daffodil"};
		
		List<String> n2 = Arrays.asList(n1);
		
		n2.stream().filter(new EFilter()).forEach(String -> System.out.println(String));
	}
	
	public static void main (String[] args) {
		new Experiment10().run();
	}

}
