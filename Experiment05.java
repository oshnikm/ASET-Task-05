package FP_Experiments;

/**
 * @author Oshni M
 */

import java.util.Arrays;
import java.util.List;

public class Experiment05 {
	
	public static void main(String[] args) {
	  String[] n1 = {"Rose", "Lilly", "Tulip","Orchid","Daffodil"};
		
		/*
		 * for (String name:n1){
		 * System.out.println(name);
		 * }
		 */
		List<String> n2 = Arrays.asList(n1);
		n2.forEach(String -> System.out.println(String));
	}
	

}
