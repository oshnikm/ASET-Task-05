package FP_Experiments;

/**
 * @author Oshni M
 */

import java.util.Arrays;
import java.util.List;

public class Experiment08 {
	public void run() {
	  String[] n1 = {"Rose", "Lilly", "Tulip","Orchid","Daffodil"};
		
		List<String> n2 = Arrays.asList(n1);
		
		System.out.println("Serial name\n--------");
		n2.stream().forEach(String -> System.out.println(String));
		
		System.out.println("\nParallel names\n--------");
		n2.parallelStream().forEach(String -> System.out.print(String));
	}
	
	public static void main(String[] args) {
		new Experiment08().run();
	}

}
