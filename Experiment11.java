package FP_Experiments;

/**
 * @author Oshni M
 */

import java.util.Arrays;
import java.util.List;

public class Experiment11 {
	public void run() {
	  String[] n1 = {"Rose", "Lilly", "Tulip","Orchid","Daffodil"};
		
		List<String> n2 = Arrays.asList(n1);
		n2.stream().map(String -> String.replaceAll("r", "")).forEach(String -> System.out.println(String));
		
	}
	public static void main(String[] args) {
		new Experiment11().run();
	}

}
