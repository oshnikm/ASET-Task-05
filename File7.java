package FP_Experiments;

/**
 * @author Oshni M
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Optional;

public class File7 {
	public static void main(String[] args) throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("C:/Users/Oshni M/eclipse-workspace/oshni/repository6/repository6/Task 05/data/Flowers.txt"));
		Optional<String> result= r.lines().reduce((left,right) -> left.concat("".concat(right)));
		
		if(result.isPresent())
			System.out.println("In this World, "+ result.get());
		else
			System.out.println("result not present");
		
		r.close();
	}
	

}
