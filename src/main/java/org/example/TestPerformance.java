package org.example;

import org.example.Operations.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.time.Instant;
import java.time.Duration;
import java.util.List;

public class TestPerformance <T> {
    private int n;
    private T[] elements;
    private volatile Object sink;
    private final int TEST_COUNT = 10;
    private long warmingUp(List<T> list) {
        long size = 0;
        Operation<T> action = new AddToHead<>(list, elements, n / 2);
        for (int i = 0; i < 10; i++)
            size += action.play();
        return size;
    }
    private Duration timeMeasurement(Operation action, long size) {
        Instant startTime = Instant.now();
        size += action.play();
        Instant endTime = Instant.now();
        sink = size;
        return Duration.between(startTime, endTime);
    }
    public Duration testOperationOneTime(Operation action, List<T> list) {
        long size = warmingUp(list);
        Duration result = timeMeasurement(action, size);
        sink = size;
        return result;
    }
    public Duration testOperationManyTimes(Operation action, List<T> list) {
        Duration sum = Duration.ZERO;
        for (int i = 0; i < TEST_COUNT; i++) {
            sum = sum.plus(testOperationOneTime(action, list));
            list.clear();
        }
        return sum.dividedBy(TEST_COUNT);
    }
    public void setData(int n, T[] elements) {
        this.n = n;
        if (n >= 0) {
            this.elements = (T[]) new Object[n];
            System.arraycopy(elements, 0, this.elements, 0, n);
        }
    }
    public Duration addToHeadDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new AddToHead<>(list, elements, n), list);
    }
    public Duration addToHeadDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new AddToHead<>(list, elements, n), list);
    }
    public Duration addToMiddleDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new AddToMiddle<>(list, elements, n), list);
    }
    public Duration addToMiddleDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new AddToMiddle<>(list, elements, n), list);
    }
    public Duration addToBackDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new AddToBack<>(list, elements, n), list);
    }
    public Duration addToBackDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new AddToBack<>(list, elements, n), list);
    }
    public Duration getDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new Get<>(list, elements, n), list);
    }
    public Duration getDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new Get<>(list, elements, n), list);
    }
    public Duration removeFromHeadDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new RemoveFromHead<>(list, elements, n), list);
    }
    public Duration removeFromHeadDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new RemoveFromHead<>(list, elements, n), list);
    }
    public Duration removeFromMiddleDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new RemoveFromMiddle<>(list, elements, n), list);
    }
    public Duration removeFromMiddleDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new RemoveFromMiddle<>(list, elements, n), list);
    }
    public Duration removeFromBackDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new RemoveFromBack<>(list, elements, n), list);
    }
    public Duration removeFromBackDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new RemoveFromBack<>(list, elements, n), list);
    }
    public T[] getData() {
        return elements;
    }
}
