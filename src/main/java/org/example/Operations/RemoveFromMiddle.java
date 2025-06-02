package org.example.Operations;

import org.example.Operations.Operation;

import java.util.List;

/**
 * Класс операции удаления из середины. Наследуется от абстрактного класса операции.
 * @param <T> тип данных
 */
public class RemoveFromMiddle<T> extends Operation<T> {
    public RemoveFromMiddle(List<T> list, T[] elements, int n) {
        this.list = list;
        this.elements = elements;
        this.n = n;
    }
    @Override
    protected void action() {
        list.remove(list.size() / 2);
        size += list.size();
    }
}
