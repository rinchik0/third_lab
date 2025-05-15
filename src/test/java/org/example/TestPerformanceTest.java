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
    public void setDataInteger1000() {
        TestPerformance<Integer> test = new TestPerformance<>();
        test.setData(n, elements1);
        Assertions.assertArrayEquals(elements1, test.getData());
    }
    @Test
    public void setDataCharacter1000() {
        TestPerformance<Character> test = new TestPerformance<>();
        test.setData(n, elements2);
        Assertions.assertArrayEquals(elements2, test.getData());
    }
    @Test
    public void setDataString1000() {
        TestPerformance<String> test = new TestPerformance<>();
        test.setData(n, elements3);
        Assertions.assertArrayEquals(elements3, test.getData());
    }
    @Test
    public void setDataDouble1000() {
        TestPerformance<Double> test = new TestPerformance<>();
        test.setData(n, elements4);
        Assertions.assertArrayEquals(elements4, test.getData());
    }
    @Test
    public void addToHeadInteger1000() {
        TestPerformance<Integer> test = new TestPerformance<>();
        test.setData(n, elements1);

        Duration linkedDuration = test.addToHeadDurationLinked();
        Duration arrayDuration = test.addToHeadDurationArray();

        Assertions.assertNotNull(linkedDuration);
        Assertions.assertNotNull(arrayDuration);
        Assertions.assertTrue(linkedDuration.toNanos() >= 0);
        Assertions.assertTrue(arrayDuration.toNanos() >= 0);
    }
    //и тд
}