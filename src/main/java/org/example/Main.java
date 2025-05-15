package org.example;

public class Main {
    public static void main(String[] args) {
        TestPerformance<Integer> testInt = new TestPerformance<>();
        Integer[] elements1000int = new Integer[1000];
        for (int i = 0; i < 1000; i++)
            elements1000int[i] = i;

        String header = "| Метод               | Кол-во операций | ArrayList (мс) | LinkedList (мс) |";
        String divider = "|---------------------|-----------------|----------------|-----------------|";
        String subheader = "-----------------------------------Integer----------------------------------";

        testInt.setData(1000, elements1000int);

        String row1 = String.format(
                "| %-20s | %-15d | %-14d | %-15d |",
                "add (to head)", 1000, testInt.addToHeadDurationArray().toMillis(), testInt.addToHeadDurationLinked().toMillis());
        String row2 = String.format(
                "| %-20s | %-15d | %-14d | %-15d |",
                "add (to middle)", 1000, testInt.addToMiddleDurationArray().toMillis(), testInt.addToMiddleDurationLinked().toMillis());

        System.out.println(header);
        System.out.println(divider);
        System.out.println(subheader);
        System.out.println(row1);
        System.out.println(row2);
    }
}