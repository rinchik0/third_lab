package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class TestPerformanceTest {
    Integer[] elements1;
    Character[] elements2;
    String[] elements3;
    Double[] elements4;
    int n;
    @BeforeEach
    public void setUp() {
        int n = 1000;
        elements1 = new Integer[n];
        for (int i = 0; i < n; i++)
            elements1[i] = i;
        elements2 = new Character[n];
        for (int i = 0; i < n; i++)
            elements2[i] = (char) i;
        elements3 = new String[n];
        for (int i = 0; i < n; i++)
            elements3[i] = Integer.toString(i);
        elements4 = new Double[n];
        for (int i = 0; i < n; i++)
            elements4[i] = (double)i / 10.0;
    }
    @Test
    public void setDataInteger() {
        TestPerformance<Integer> test = new TestPerformance<>();
        test.setData(elements1.length, elements1);
        Assertions.assertArrayEquals(elements1, test.getData());
    }
    @Test
    public void setDataCharacter() {
        TestPerformance<Character> test = new TestPerformance<>();
        test.setData(elements2.length, elements2);
        Assertions.assertArrayEquals(elements2, test.getData());
    }
    @Test
    public void setDataString() {
        TestPerformance<String> test = new TestPerformance<>();
        test.setData(elements3.length, elements3);
        Assertions.assertArrayEquals(elements3, test.getData());
    }
    @Test
    public void setDataDouble() {
        TestPerformance<Double> test = new TestPerformance<>();
        test.setData(elements4.length, elements4);
        Assertions.assertArrayEquals(elements4, test.getData());
    }
    @Test
    public void addToHeadInteger() {
        TestPerformance<Integer> test = new TestPerformance<>();
        test.setData(elements1.length, elements1);

        Duration linkedDuration = test.addToHeadDurationLinked();
        Duration arrayDuration = test.addToHeadDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void addToHeadCharacter() {
        TestPerformance<Character> test = new TestPerformance<>();
        test.setData(elements2.length, elements2);

        Duration linkedDuration = test.addToHeadDurationLinked();
        Duration arrayDuration = test.addToHeadDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void addToHeadString() {
        TestPerformance<String> test = new TestPerformance<>();
        test.setData(elements3.length, elements3);

        Duration linkedDuration = test.addToHeadDurationLinked();
        Duration arrayDuration = test.addToHeadDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void addToHeadDouble() {
        TestPerformance<Double> test = new TestPerformance<>();
        test.setData(elements4.length, elements4);

        Duration linkedDuration = test.addToHeadDurationLinked();
        Duration arrayDuration = test.addToHeadDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void addToMiddleInteger() {
        TestPerformance<Integer> test = new TestPerformance<>();
        test.setData(elements1.length, elements1);

        Duration linkedDuration = test.addToMiddleDurationLinked();
        Duration arrayDuration = test.addToMiddleDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void addToMiddleCharacter() {
        TestPerformance<Character> test = new TestPerformance<>();
        test.setData(elements2.length, elements2);

        Duration linkedDuration = test.addToMiddleDurationLinked();
        Duration arrayDuration = test.addToMiddleDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void addToMiddleString() {
        TestPerformance<String> test = new TestPerformance<>();
        test.setData(elements3.length, elements3);

        Duration linkedDuration = test.addToMiddleDurationLinked();
        Duration arrayDuration = test.addToMiddleDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void addToMiddleDouble() {
        TestPerformance<Double> test = new TestPerformance<>();
        test.setData(elements4.length, elements4);

        Duration linkedDuration = test.addToMiddleDurationLinked();
        Duration arrayDuration = test.addToMiddleDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void addToBackInteger() {
        TestPerformance<Integer> test = new TestPerformance<>();
        test.setData(elements1.length, elements1);

        Duration linkedDuration = test.addToBackDurationLinked();
        Duration arrayDuration = test.addToBackDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void addToBackCharacter() {
        TestPerformance<Character> test = new TestPerformance<>();
        test.setData(elements2.length, elements2);

        Duration linkedDuration = test.addToBackDurationLinked();
        Duration arrayDuration = test.addToBackDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void addToBackString() {
        TestPerformance<String> test = new TestPerformance<>();
        test.setData(elements3.length, elements3);

        Duration linkedDuration = test.addToBackDurationLinked();
        Duration arrayDuration = test.addToBackDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void addToBackDouble() {
        TestPerformance<Double> test = new TestPerformance<>();
        test.setData(elements4.length, elements4);

        Duration linkedDuration = test.addToBackDurationLinked();
        Duration arrayDuration = test.addToBackDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void getInteger() {
        TestPerformance<Integer> test = new TestPerformance<>();
        test.setData(elements1.length, elements1);

        Duration linkedDuration = test.getDurationLinked();
        Duration arrayDuration = test.getDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void getCharacter() {
        TestPerformance<Character> test = new TestPerformance<>();
        test.setData(elements2.length, elements2);

        Duration linkedDuration = test.getDurationLinked();
        Duration arrayDuration = test.getDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void getString() {
        TestPerformance<String> test = new TestPerformance<>();
        test.setData(elements3.length, elements3);

        Duration linkedDuration = test.getDurationLinked();
        Duration arrayDuration = test.getDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void getDouble() {
        TestPerformance<Double> test = new TestPerformance<>();
        test.setData(elements4.length, elements4);

        Duration linkedDuration = test.getDurationLinked();
        Duration arrayDuration = test.getDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void removeFromHeadInteger() {
        TestPerformance<Integer> test = new TestPerformance<>();
        test.setData(elements1.length, elements1);

        Duration linkedDuration = test.removeFromHeadDurationLinked();
        Duration arrayDuration = test.removeFromHeadDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void removeFromHeadCharacter() {
        TestPerformance<Character> test = new TestPerformance<>();
        test.setData(elements2.length, elements2);

        Duration linkedDuration = test.removeFromHeadDurationLinked();
        Duration arrayDuration = test.removeFromHeadDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void removeFromHeadString() {
        TestPerformance<String> test = new TestPerformance<>();
        test.setData(elements3.length, elements3);

        Duration linkedDuration = test.removeFromHeadDurationLinked();
        Duration arrayDuration = test.removeFromHeadDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void removeFromHeadDouble() {
        TestPerformance<Double> test = new TestPerformance<>();
        test.setData(elements4.length, elements4);

        Duration linkedDuration = test.removeFromHeadDurationLinked();
        Duration arrayDuration = test.removeFromHeadDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void removeFromMiddleInteger() {
        TestPerformance<Integer> test = new TestPerformance<>();
        test.setData(elements1.length, elements1);

        Duration linkedDuration = test.removeFromMiddleDurationLinked();
        Duration arrayDuration = test.removeFromMiddleDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void removeFromMiddleCharacter() {
        TestPerformance<Character> test = new TestPerformance<>();
        test.setData(elements2.length, elements2);

        Duration linkedDuration = test.removeFromMiddleDurationLinked();
        Duration arrayDuration = test.removeFromMiddleDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void removeFromMiddleString() {
        TestPerformance<String> test = new TestPerformance<>();
        test.setData(elements3.length, elements3);

        Duration linkedDuration = test.removeFromMiddleDurationLinked();
        Duration arrayDuration = test.removeFromMiddleDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void removeFromMiddleDouble() {
        TestPerformance<Double> test = new TestPerformance<>();
        test.setData(elements4.length, elements4);

        Duration linkedDuration = test.removeFromMiddleDurationLinked();
        Duration arrayDuration = test.removeFromMiddleDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void removeFromBackInteger() {
        TestPerformance<Integer> test = new TestPerformance<>();
        test.setData(elements1.length, elements1);

        Duration linkedDuration = test.removeFromBackDurationLinked();
        Duration arrayDuration = test.removeFromBackDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void removeFromBackCharacter() {
        TestPerformance<Character> test = new TestPerformance<>();
        test.setData(elements2.length, elements2);

        Duration linkedDuration = test.removeFromBackDurationLinked();
        Duration arrayDuration = test.removeFromBackDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void removeFromBackString() {
        TestPerformance<String> test = new TestPerformance<>();
        test.setData(elements3.length, elements3);

        Duration linkedDuration = test.removeFromBackDurationLinked();
        Duration arrayDuration = test.removeFromBackDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    @Test
    public void removeFromBackDouble() {
        TestPerformance<Double> test = new TestPerformance<>();
        test.setData(elements4.length, elements4);

        Duration linkedDuration = test.removeFromBackDurationLinked();
        Duration arrayDuration = test.removeFromBackDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
}