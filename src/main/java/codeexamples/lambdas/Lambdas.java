package codeexamples.lambdas;


import java.util.Comparator;
import java.util.function.Consumer;


public class Lambdas {

    static String globalVar = "old";

    public static void main(String[] args){


//      "traditional" way anonymous implementation
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

//       IDEA suggestion (method reference)
        Comparator<String> stringComparator3 = String::compareToIgnoreCase;
        int compResult3 = stringComparator3.compare("hello", "World");
        System.out.println(compResult3);

//      lambda for my interface
        MyInterface myInterface1 = () -> System.out.println("This is implementation of method apply()");
        myInterface1.apply();

//      now with parameter
        MyInterface2 myInterface2 = s -> System.out.println(s);
        myInterface2.apply("This is a parameter");

//      now with parameter and method reference
        MyInterface2 myInterface21 = System.out::println;
        myInterface21.apply("This is a parameter too");

//      now with 2 parameters
        MyInterface3 myInterface3 = (s, i) -> {
            for (int j = 1; j <= i; j++) System.out.println(s + " " + j + " of " + i);
        };

        myInterface3.apply("Repetition", 4);

//      when interface has several methods
        MyInterface4 myInterface4 = text -> System.out.println(text);
        MyInterface4 myInterface41 = (s -> {
            s = s.strip();
            s = s + " 41";
            System.out.println(s);
        });

        myInterface4.printIt("my interface 4");
        myInterface41.printIt("this is call for my interface        ");

//      usage of a global variable
        MyInterface4 myInterface42 = text -> {
            text = text.strip() + " " + globalVar;
            System.out.println(text);
        };

        myInterface42.printIt("this value is ");
        globalVar = "new";
        myInterface42.printIt("this value is ");

//      local variables and scopes
        final LambdaTest outerClass = new LambdaTest();
        final LambdaTest.FirstLevel firstLevelClass = outerClass.new FirstLevel();
        firstLevelClass.methodInFirstLevel("passed parameter");
    }
}



class LambdaTest {
    public String s = "LambdaTest";

    class FirstLevel {
        public String s = "FirstLevel";
        void methodInFirstLevel(String s) {
            Consumer<String> myConsumer = (str) -> {   // Lambda Expression
                System.out.println();
                System.out.println("s = " + s);
                System.out.println("str = " + str);
                System.out.println("this.s defined in " + this.s);
                System.out.println("LambdaTest.this.s defined in " + LambdaTest.this.s);
            };
            myConsumer.accept(s);
        }
    }
}

