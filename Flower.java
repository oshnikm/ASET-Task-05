package FP_Experiments;

/**
 * @author Oshni M
 */

public class Flower implements Comparable<Flower> {
  private int FlowerNumber;
  private String Colour;
  private String Flower;
  private int NumberofFlowers;

  public Flower(int FlowerNumber, String Colour, String Flower, int NumberofFlowers) {
    
    this.FlowerNumber = FlowerNumber;
    this.Colour = Colour;
    this.Flower = Flower;
    this.NumberofFlowers = NumberofFlowers;

  }

  public String toString() {
    return String.format("%-10d%-20s%-20s%-30s", FlowerNumber, Colour, Flower, NumberofFlowers);
  }

  public int getFlowerNumber() {
    return FlowerNumber;
  }

  public void setFlowerNumber(int FlowerNumberFlowerNumber) {
    this.FlowerNumber = FlowerNumber;
  }

  public String getColour() {
    return Colour;
  }

  public void setColour(String Colour) {
    this.Colour = Colour;
  }

  public String getFlower() {
    return Flower;
  }

  public void setFlower(String Flower) {
    this.Flower = Flower;
  }

  public int getNumberofFlowers() {
	    return NumberofFlowers;
	  }

	  public void setNumberofFlowers(int NumberofFlowers) {
	    this.NumberofFlowers = NumberofFlowers;
	  }

  public int compareTo(Flower c) {
    return ((Integer) NumberofFlowers).compareTo(c.FlowerNumber);
  }
}
