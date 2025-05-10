package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestPerformance <T> {
    LinkedList<T> linked;
    ArrayList<T> array;
    int n;
    public TestPerformance(LinkedList<T> linked, ArrayList<T> array) {
        this.linked = linked;
        this.array = array;
        n = Math.min(linked.size(), array.size());
    }

}
