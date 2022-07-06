package FP_Experiments;

/**
 * @author Oshni M
 */


import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Flower03 {
  public static void main(String[] args) {
	    List<Flower> table = Arrays.asList(
	            new Flower(1,"Red","Rose", 100),
	            new Flower(2,"White", "Lilly", 150),
	            new Flower(3,"Purple", "Tulip", 240),
	            new Flower(4,"Green", "Orchid", 50),
	            new Flower(5,"Hot Pink", "Carnation", 180),
	            new Flower(6,"Indigo", "Iris",100),
	            new Flower(7,"Yellow", "Daffodil",140),
	            new Flower(8,"Blue", "Daisy", 180),
	            new Flower(9,"Orange", "Marigold", 20),
	            new Flower(10,"Pink", "Araliya",60));


    OptionalInt min = table.stream().mapToInt(Flower::getNumberofFlowers).min();
    if (min.isPresent()) {
      System.out.printf("Lowest number of Flowers is %d\n", min.getAsInt());
    } else {
      System.out.println("min failed");
    }
  }

}
