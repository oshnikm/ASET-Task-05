package FP_Experiments;

/**
 * @author Oshni M
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class File8 {
	public static void main(String[] args) throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("C:/Users/Oshni M/eclipse-workspace/oshni/repository6/repository6/Task 05/data/Flowers.txt"));
		List <String> l =r.lines().collect(Collectors.toList());
		
		for(String line:l)
			System.out.println(line);
		
		r.close();
	}

}
