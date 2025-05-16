package org.example.Operations;

import java.util.List;

public abstract class Operation<T> {
    protected List<T> list;
    protected T[] elements;
    protected int n;
    protected int i;
    protected long size;
    protected abstract void action();
    public final long play() {
        size = 0;
        for (int i = 0; i < n; i++) {
            this.i = i;
            action();
        }
        return size;
    }
}
