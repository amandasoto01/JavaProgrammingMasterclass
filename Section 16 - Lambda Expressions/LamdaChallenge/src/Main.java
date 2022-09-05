import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Challenge #1
        // Anonymous class
      Runnable runnable = new Runnable() {
          @Override
          public void run() {
              String myString = "Let's split this up into an array";
              String[] parts = myString.split(" ");
              for(String part: parts) {
                  System.out.println(part);
              }
          }
      };
      runnable.run();

      // Lambda
      Runnable runnable2 = () -> {
          String myString = "Lets split this up into an array";
          String[] parts = myString.split(" ");
          for(String part: parts) {
              System.out.println(part);
          }
      };
      runnable2.run();

      // Challenge # 2
       Function<String, String> everySecondChar2 = (String source) -> {
           StringBuilder returnVal = new StringBuilder();
           for(int i=0; i< source.length(); i++) {
               if(i%2 == 1){
                   returnVal.append(source.charAt(i));
               }
           }
           return returnVal.toString();
       };

       // Challenge # 3
        System.out.println(everySecondChar2.apply("1234567890"));

        // Challenge # 4 && 5
        System.out.println(executeFunction(everySecondChar2, "1234567890"));

        // Challenge # 6
        Supplier<String> iLoveJava = () -> { return "I love Java!";};
        System.out.println(iLoveJava.get());

        // Challenge # 7
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        // Challenge # 8
        // Questions

        // Challenge # 9 & 10 & 11
        List<String> topNames2015 = Arrays.asList(
            "Amelia",
            "Olivia",
            "emily",
            "Isla",
            "Ava",
            "oliver",
            "Jack",
            "Charlie",
            "harry",
            "Jacob"
        );

        topNames2015.stream()
                .map((String name) -> {
                   return name.substring(0,1).toUpperCase() + name.substring(1);
                })
                .sorted(String::compareTo)
                .forEach(System.out::println);

        // Challenge # 12
        long namesBeginWithA = topNames2015.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .filter( name -> name.startsWith("A"))
                .count();
        System.out.println(namesBeginWithA);

        // Challenge # 13 & 14
        List names = topNames2015.stream()
                .map((String name) -> {
                    return name.substring(0,1).toUpperCase() + name.substring(1);
                })
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

    public static String executeFunction(Function<String, String> everySecondChar, String source){
        return everySecondChar.apply(source);
    }

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for(int i=0; i< source.length(); i++) {
            if(i%2 == 1){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }
}

