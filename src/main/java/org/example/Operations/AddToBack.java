package org.example.Operations;

import java.util.List;

public class AddToBack<T> extends Operation<T> {
    public AddToBack(List<T> list, T[] elements, int n) {
        this.list = list;
        this.elements = elements;
        this.n = n;
    }

    @Override
    protected void action() {
        list.add(list.size() - 1, elements[i]);
        size += list.size();
    }
}
