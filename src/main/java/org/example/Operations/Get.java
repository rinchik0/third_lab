package org.example.Operations;

import java.util.List;

/**
 * Класс операции получения элемента по индексу. Наследуется от абстрактного класса операции.
 * @param <T> тип данных
 */
public class Get<T> extends Operation<T> {
    public Get(List<T> list, T[] elements, int n) {
        this.list = list;
        this.elements = elements;
        this.n = n;
    }

    @Override
    protected void action() {
        size += list.get(i).hashCode();
    }
}
