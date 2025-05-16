package org.example.Operations;

import java.util.List;

public class AddToMiddle<T> extends Operation<T> {
    public AddToMiddle(List<T> list, T[] elements, int n) {
        this.list = list;
        this.elements = elements;
        this.n = n;
    }
    @Override
    protected void action() {
        list.add(list.size() / 2, elements[i]);
        size += list.size();
    }
}
