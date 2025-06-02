package org.example.Operations;

import org.example.Operations.Operation;

import java.util.List;

/**
 * Класс операции удаления из головы. Наследуется от абстрактного класса операции.
 * @param <T> тип данных
 */
public class RemoveFromHead<T> extends Operation<T> {
    public RemoveFromHead(List<T> list, T[] elements, int n) {
        this.list = list;
        this.elements = elements;
        this.n = n;
    }

    @Override
    protected void action() {
        list.remove(0);
        size += list.size();
    }
}
