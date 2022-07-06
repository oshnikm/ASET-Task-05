package FP_Experiments;

/**
 * @author Oshni M
 */

import java.io.BufferedReader;
import java.io.FileReader;

public class File6 {

	public static void main(String[] args)throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("C:/Users/Oshni M/eclipse-workspace/oshni/repository6/repository6/Task 05/data/Flowers.txt"));
		//r.lines().forEach(l->System.out.println(l));
		
		System.out.println(r.lines().reduce("", String::concat));
		
		r.close();
	}
}
