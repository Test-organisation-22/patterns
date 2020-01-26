package codeexamples.lambdas;


import java.io.IOException;
import java.util.Comparator;


public class Lambdas {

    public static void main(String[] args){

//        traditional way
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        };

        int compResult = stringComparator.compare("hello", "World");
        System.out.println(compResult);

//        lambda way
        Comparator<String> stringComparator2 = ((s1, s2) -> s1.compareToIgnoreCase(s2));

        int compResult2 = stringComparator2.compare("hello", "World");
        System.out.println(compResult2);

//       IDEA suggestions (method reference)
        Comparator<String> stringComparator3 = String::compareToIgnoreCase;
        int compResult3 = stringComparator3.compare("hello", "World");
        System.out.println(compResult3);

//      lambda for my interface
        MyFunction myFunction1 = () -> System.out.println("This is implementation of method apply()");
        myFunction1.apply();

//      now with parameter
        MyFunction2 myFunction2 = s -> System.out.println(s);
        myFunction2.apply("This is a parameter");

//      now with parameter and method reference
        MyFunction2 myFunction21 = System.out::println;
        myFunction21.apply("This is a parameter too");

//      now with parameter
        MyFunction3 myFunction3 = (s, i) -> {
            for (int j = 1; j <= i; j++) System.out.println(s + " " + j + " of " + i);
        };

        myFunction3.apply("Repetition", 4);




    }

}
