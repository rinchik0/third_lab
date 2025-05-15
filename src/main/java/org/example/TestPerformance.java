package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.time.Instant;
import java.time.Duration;

public class TestPerformance <T> {
    LinkedList<T> linked;
    ArrayList<T> array;
    int n;
    T[] elements;
    public TestPerformance() {
        linked = new LinkedList<>();
        array = new ArrayList<>();
    }
    public void setData(int n, T[] elements) {
        this.n = n;
        if (n >= 0) {
            this.elements = (T[]) new Object[n];
            System.arraycopy(elements, 0, this.elements, 0, n);
        }
    }
    public Duration addToHeadDurationLinked() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            linked.add(0, elements[i]);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration addToHeadDurationArray() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            array.add(0, elements[i]);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration addToMiddleDurationLinked() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            linked.add(linked.size() / 2, elements[i]);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration addToMiddleDurationArray() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            array.add(array.size() / 2, elements[i]);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration addToBackDurationLinked() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            linked.add(elements[i]);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration addToBackDurationArray() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            array.add(elements[i]);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration getDurationLinked() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            linked.get(i);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration getDurationArray() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            array.get(i);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration removeFromHeadDurationLinked() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            linked.remove(0);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration removeFromHeadArray() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            array.remove(0);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration removeFromMiddleDurationLinked() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            linked.remove(linked.size() - 1);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration removeFromMiddleDurationArray() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            array.remove(array.size() - 1);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration removeFromBackDurationLinked() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            linked.remove(linked.size() - 1);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public Duration removeFromBackDurationArray() {
        Instant startTime = Instant.now();

        for (int i = 0; i < n; i++)
            array.remove(array.size() - 1);

        Instant endTime = Instant.now();

        return Duration.between(startTime, endTime);
    }
    public void clear() {
        linked.clear();
        array.clear();
    }
    public T[] getData() {
        return elements;
    }
}
