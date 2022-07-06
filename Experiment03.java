package FP_Experiments;

/**
 * @author Oshni M
 */

import java.util.Arrays;
import java.util.List;

public class Experiment03 {
	public static void main(String[] args) {
	  String[] n1 = {"Rose", "Lilly", "Tulip","Orchid","Daffodil"};
		
		List<String> n2 = Arrays.asList(n1);
		
		System.out.println(n2.getClass());
		for(String String:n2) {
			System.out.println(String);
		}
		
		
		
	}

}

/*In this code the array is converted to a List so that advantages
 * of the Collection API may used later
 */
