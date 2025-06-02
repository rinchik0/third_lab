package org.example;

import org.example.Operations.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.time.Instant;
import java.time.Duration;
import java.util.List;

/**
 * Шаблонный класс для тестирования производительности классов ArrayList и LinkedList
 * @param <T> тип данных, которые будут храниться в списках
 */
public class TestPerformance <T> {
    private int n;
    private T[] elements;
    /**
     * Слив данных, для того, чтобы JVM не удаляла бесполезные операции
     */
    private volatile Object sink;
    /**
     * Количество тестов
     */
    private final int TEST_COUNT = 10;

    /**
     * Метод прогрева JVM
     * @param list список
     * @return число для того, чтобы JVM не думала, что операции бесполезные
     */
    private long warmingUp(List<T> list) {
        long size = 0;
        Operation<T> action = new AddToHead<>(list, elements, n / 2);
        for (int i = 0; i < 10; i++)
            size += action.play();
        return size;
    }

    /**
     * Метод для замера времени работы операции
     * @param action действие
     * @param size переменная для хранения информации, чтобы JVM не считала действия бесполезными
     * @return длительность операции
     */
    private Duration timeMeasurement(Operation action, long size) {
        Instant startTime = Instant.now();
        size += action.play();
        Instant endTime = Instant.now();
        sink = size;
        return Duration.between(startTime, endTime);
    }

    /**
     * Метод проведения тестирования операции (с прогревом) один раз
     * @param action действие
     * @param list список
     * @return длительность операции
     */
    public Duration testOperationOneTime(Operation action, List<T> list) {
        long size = warmingUp(list);
        Duration result = timeMeasurement(action, size);
        sink = size;
        return result;
    }

    /**
     * Метод проведения многократного тестирования
     * @param action действие
     * @param list список
     * @return средняя длительность операции
     */
    public Duration testOperationManyTimes(Operation action, List<T> list) {
        Duration sum = Duration.ZERO;
        for (int i = 0; i < TEST_COUNT; i++) {
            sum = sum.plus(testOperationOneTime(action, list));
            list.clear();
        }
        return sum.dividedBy(TEST_COUNT);
    }

    /**
     * Метод, задающий данные для тестирования
     * @param n количество элементов для списка
     * @param Elements элементы
     */
    public void setData(int n, T[] Elements) {
        this.n = n;
        if (n >= 0) {
            elements = (T[]) java.lang.reflect.Array.newInstance(Elements.getClass().getComponentType(), n);
            elements = Arrays.copyOf(Elements, n);
        }
    }

    /**
     * Метод тестирования операции добавления в голову списка для LinkedList
     * @return длительность операции
     */
    public Duration addToHeadDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new AddToHead<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции добавления в голову списка для ArrayList
     * @return длительность операции
     */
    public Duration addToHeadDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new AddToHead<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции добавления в середину списка для LinkedList
     * @return длительность операции
     */
    public Duration addToMiddleDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new AddToMiddle<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции добавления в середину списка для ArrayList
     * @return длительность операции
     */
    public Duration addToMiddleDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new AddToMiddle<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции добавления в конец списка для LinkedList
     * @return длительность операции
     */
    public Duration addToBackDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new AddToBack<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции добавления в конец списка для ArrayList
     * @return длительность операции
     */
    public Duration addToBackDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new AddToBack<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции получения элемента по индексу для LinkedList
     * @return длительность операции
     */
    public Duration getDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new Get<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции получения элемента по индексу для ArrayList
     * @return длительность операции
     */
    public Duration getDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new Get<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции удаления из головы списка для LinkedList
     * @return длительность операции
     */
    public Duration removeFromHeadDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new RemoveFromHead<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции удаления из головы списка для ArrayList
     * @return длительность операции
     */
    public Duration removeFromHeadDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new RemoveFromHead<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции удаления из середины списка для LinkedList
     * @return длительность операции
     */
    public Duration removeFromMiddleDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new RemoveFromMiddle<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции удаления из середины списка для ArrayList
     * @return длительность операции
     */
    public Duration removeFromMiddleDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new RemoveFromMiddle<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции удаления из конца списка для LinkedList
     * @return длительность операции
     */
    public Duration removeFromBackDurationLinked() {
        LinkedList<T> list = new LinkedList<>();
        return testOperationManyTimes(new RemoveFromBack<>(list, elements, n), list);
    }

    /**
     * Метод тестирования операции удаления из конца списка для ArrayList
     * @return длительность операции
     */
    public Duration removeFromBackDurationArray() {
        ArrayList<T> list = new ArrayList<>();
        return testOperationManyTimes(new RemoveFromBack<>(list, elements, n), list);
    }

    /**
     * Метод, возвращающий массив тестовых данных
     * @return массив
     */
    public T[] getData() {
        return elements;
    }
}
