package FP_Experiments;

/**
 * @author Oshni M
 */

import java.util.Arrays;
import java.util.List;

public class Experiment09 {
	public void run() {
	  String[] n1 = {"Rose", "Lilly", "Tulip","Orchid","Daffodil"};
		
		List<String> n2 = Arrays.asList(n1);
		
		/*
		 * use a Lambda to implement a predicate that filters
		 * out names that do not include an 'e' character
		 */
		
		n2.stream().filter(String -> String.contains("r"))
		.forEach(String -> System.out.println(String));
	}
	
	public static void main(String[] args) {
		new Experiment09().run();
	}

}
