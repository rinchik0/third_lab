package org.example.Operations;

import java.util.List;

public class AddToHead<T> extends Operation<T> {
    public AddToHead(List<T> list, T[] elements, int n) {
        this.list = list;
        this.elements = elements;
        this.n = n;
    }

    @Override
    protected void action() {
        list.add(0, elements[i]);
        size += list.size();
    }
}
