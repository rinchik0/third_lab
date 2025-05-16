package org.example;

public class Main {
    public static void main(String[] args) {
        TestPerformance<Integer> testInt = new TestPerformance<>();
        Integer[] elements1000int = new Integer[1000];
        for (int i = 0; i < 1000; i++)
            elements1000int[i] = i;
        Integer[] elements10000int = new Integer[10000];
        for (int i = 0; i < 10000; i++)
            elements10000int[i] = i;
        TestPerformance<Character> testChar = new TestPerformance<>();
        Character[] elements1000char = new Character[1000];
        for (int i = 0; i < 1000; i++)
            elements1000char[i] = (char)i;
        Character[] elements10000char = new Character[10000];
        for (int i = 0; i < 10000; i++)
            elements10000char[i] = (char)i;

        String header = "| Метод                | Кол-во операций | ArrayList (мс) | LinkedList (мс) |";
        String divider1 = "|----------------------|-----------------|----------------|-----------------|";
        String divider2 = "-----------------------------------------------------------------------------";
        String subheader1 = "|--------------------------------| Integer |--------------------------------|";
        String subheader2 = "|-------------------------------| Character |-------------------------------|";

        System.out.println(divider2);
        System.out.println(header);
        System.out.println(divider1);
        System.out.println(subheader1);

        testInt.setData(1000, elements1000int);

        String row1 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "add (to head)", 1000, (double) testInt.addToHeadDurationArray().toNanos() / 1000000, (double) testInt.addToHeadDurationLinked().toNanos() / 1000000);
        String row4 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "remove (from head)", 1000, (double) testInt.removeFromHeadDurationArray().toNanos() / 1000000, (double) testInt.removeFromHeadDurationLinked().toNanos() / 1000000);
        String row2 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "add (to middle)", 1000, (double) testInt.addToMiddleDurationArray().toNanos() / 1000000, (double) testInt.addToMiddleDurationLinked().toNanos() / 1000000);
        String row5 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "remove (from middle)", 1000, (double) testInt.removeFromMiddleDurationArray().toNanos() / 1000000, (double) testInt.removeFromMiddleDurationLinked().toNanos() / 1000000);
        String row3 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "add (to back)", 1000, (double) testInt.addToBackDurationArray().toNanos() / 1000000, (double) testInt.addToBackDurationLinked().toNanos() / 1000000);
        String row6 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "remove (from back)", 1000, (double) testInt.removeFromBackDurationArray().toNanos() / 1000000, (double) testInt.removeFromBackDurationLinked().toNanos() / 1000000);
        String row7 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "get", 1000, (double) testInt.getDurationArray().toNanos() / 1000000, (double) testInt.getDurationLinked().toNanos() / 1000000);

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
        System.out.println(row6);
        System.out.println(row7);
        System.out.println(divider1);

        testInt.setData(10000, elements10000int);

        String row8 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "add (to head)", 10000, (double) testInt.addToHeadDurationArray().toNanos() / 1000000, (double) testInt.addToHeadDurationLinked().toNanos() / 1000000);
        String row11 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "remove (from head)", 10000, (double) testInt.removeFromHeadDurationArray().toNanos() / 1000000, (double) testInt.removeFromHeadDurationLinked().toNanos() / 1000000);
        String row9 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "add (to middle)", 10000, (double) testInt.addToMiddleDurationArray().toNanos() / 1000000, (double) testInt.addToMiddleDurationLinked().toNanos() / 1000000);
        String row12 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "remove (from middle)", 10000, (double) testInt.removeFromMiddleDurationArray().toNanos() / 1000000, (double) testInt.removeFromMiddleDurationLinked().toNanos() / 1000000);
        String row10 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "add (to back)", 10000, (double) testInt.addToBackDurationArray().toNanos() / 1000000, (double) testInt.addToBackDurationLinked().toNanos() / 1000000);
        String row13 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "remove (from back)", 10000, (double) testInt.removeFromBackDurationArray().toNanos() / 1000000, (double) testInt.removeFromBackDurationLinked().toNanos() / 1000000);
        String row14 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "get", 10000, (double) testInt.getDurationArray().toNanos() / 1000000, (double) testInt.getDurationLinked().toNanos() / 1000000);

        System.out.println(row8);
        System.out.println(row9);
        System.out.println(row10);
        System.out.println(row11);
        System.out.println(row12);
        System.out.println(row13);
        System.out.println(row14);
        System.out.println(subheader2);

        testChar.setData(1000, elements1000char);

        String row15 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "add (to head)", 1000, (double) testChar.addToHeadDurationArray().toNanos() / 1000000, (double) testChar.addToHeadDurationLinked().toNanos() / 1000000);
        String row18 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "remove (from head)", 1000, (double) testChar.removeFromHeadDurationArray().toNanos() / 1000000, (double) testChar.removeFromHeadDurationLinked().toNanos() / 1000000);
        String row16 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "add (to middle)", 1000, (double) testChar.addToMiddleDurationArray().toNanos() / 1000000, (double) testChar.addToMiddleDurationLinked().toNanos() / 1000000);
        String row19 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "remove (from middle)", 1000, (double) testChar.removeFromMiddleDurationArray().toNanos() / 1000000, (double) testChar.removeFromMiddleDurationLinked().toNanos() / 1000000);
        String row17 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "add (to back)", 1000, (double) testChar.addToBackDurationArray().toNanos() / 1000000, (double) testChar.addToBackDurationLinked().toNanos() / 1000000);
        String row20 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "remove (from back)", 1000, (double) testChar.removeFromBackDurationArray().toNanos() / 1000000, (double) testChar.removeFromBackDurationLinked().toNanos() / 1000000);
        String row21 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "get", 1000, (double) testChar.getDurationArray().toNanos() / 1000000, (double) testChar.getDurationLinked().toNanos() / 1000000);

        System.out.println(row15);
        System.out.println(row16);
        System.out.println(row17);
        System.out.println(row18);
        System.out.println(row19);
        System.out.println(row20);
        System.out.println(row21);
        System.out.println(divider1);

        testChar.setData(10000, elements10000char);

        String row22 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "add (to head)", 10000, (double) testChar.addToHeadDurationArray().toNanos() / 1000000, (double) testChar.addToHeadDurationLinked().toNanos() / 1000000);
        String row25 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "remove (from head)", 10000, (double) testChar.removeFromHeadDurationArray().toNanos() / 1000000, (double) testChar.removeFromHeadDurationLinked().toNanos() / 1000000);
        String row23 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "add (to middle)", 10000, (double) testChar.addToMiddleDurationArray().toNanos() / 1000000, (double) testChar.addToMiddleDurationLinked().toNanos() / 1000000);
        String row26 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "remove (from middle)", 10000, (double) testChar.removeFromMiddleDurationArray().toNanos() / 1000000, (double) testChar.removeFromMiddleDurationLinked().toNanos() / 1000000);
        String row24 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "add (to back)", 10000, (double) testChar.addToBackDurationArray().toNanos() / 1000000, (double) testChar.addToBackDurationLinked().toNanos() / 1000000);
        String row27 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "remove (from back)", 10000, (double) testChar.removeFromBackDurationArray().toNanos() / 1000000, (double) testChar.removeFromBackDurationLinked().toNanos() / 1000000);
        String row28 = String.format(
                "| %-20s | %-15d | %-14.2f | %-15.2f |",
                "get", 10000, (double) testChar.getDurationArray().toNanos() / 1000000, (double) testChar.getDurationLinked().toNanos() / 1000000);

        System.out.println(row22);
        System.out.println(row23);
        System.out.println(row24);
        System.out.println(row25);
        System.out.println(row26);
        System.out.println(row27);
        System.out.println(row28);
        System.out.println(divider2);
    }
}