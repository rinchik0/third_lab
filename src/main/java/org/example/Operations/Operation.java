package org.example.Operations;

import java.util.List;

/**
 * Абстрактный шаблонный класс операции
 * @param <T> тип данных
 */
public abstract class Operation<T> {
    protected List<T> list;
    protected T[] elements;
    protected int n;
    protected int i;
    protected long size;

    /**
     * Метод, переопределенный в наследниках в соответствии с назначением операции
     */
    protected abstract void action();

    /**
     * Метод запуска действия
     * @return переменная с информацией для того, чтобы JVM не считала операции бесполезными
     */
    public final long play() {
        size = 0;
        for (int i = 0; i < n; i++) {
            this.i = i;
            action();
        }
        return size;
    }
}
