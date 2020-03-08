package codeexamples.arrays;

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        items.add("Red");
        items.add(0, "Yellow");

        System.out.print("Display list: ");

        for (int i = 0; i < items.size(); i++)
            System.out.printf(" %s", items.get(i));

        System.out.println();
        display(items, "Display list with method:");

        items.add("Green");
        items.add("Yellow");

        display(items, "List with new elements:");

        items.remove("Yellow");
        display(items, "List with removed element Yellow:");

        items.remove(1);
        display(items, "List with removed element with index 1:");

        System.out.printf("\"Red\" is %sin the list%n", items.contains("Red") ? "" : "not ");
        System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "" : "not ");

        System.out.printf("Size: %s%n", items.size());
    }

    public static void display(ArrayList<String> items, String header) {

        System.out.printf(header);

        for (String item : items)
            System.out.printf(" %s", item);

        System.out.println();
    }
}

