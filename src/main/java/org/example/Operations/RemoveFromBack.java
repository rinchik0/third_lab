package org.example.Operations;

import org.example.Operations.Operation;

import java.util.List;

public class RemoveFromBack<T> extends Operation<T> {
    public RemoveFromBack(List<T> list, T[] elements, int n) {
        this.list = list;
        this.elements = elements;
        this.n = n;
    }

    @Override
    protected void action() {
        list.remove(list.size() - 1);
        size += list.size();
    }
}
