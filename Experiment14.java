package FP_Experiments;

/**
 * @author Oshni M
 */

import java.util.stream.Stream;

public class Experiment14 {
  class NameStreamBuilder {
    public Stream<String> build(){
      Stream.Builder<String> builder = Stream.builder(); 
      builder.add("Rose");
      builder.add("Lilly");
      builder.add("Tulip");
      builder.add("Orchid");
      builder.add("Daffodil");
      return builder.build();
    }
  }
  
  public void run() {
    NameStreamBuilder builder = new NameStreamBuilder();
    Stream <String> nameStream = builder.build();
    nameStream.forEach(n -> System.out.println(n));
  }

  public static void main(String[] args) {
    new Experiment14().run();
  }
}
