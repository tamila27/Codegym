package com.goit.gojavaonline.codegym.practice3;

import java.util.TreeMap;

/**
 * Created by tamila on 5/20/16.
 */
public class BinaryHeap {
    /*private List<Integer> heap;
    public BinaryHeap(int size) {
        heap = new ArrayList<Integer>();
    }

    public void insert(int val) {
        heap.add(val);
        int i = heap.size() -1;
        int parentIndex = (i - 1)/2;
        while(i > 0 && heap.get(parentIndex) < heap.get(i)){
            int temp = heap.get(i);
            heap.add(i, heap.get(parentIndex));
            heap.add(parentIndex, temp);

            i = parentIndex;
            parentIndex = (i - 1)/2;
        }
    }

    public int poll() {
        int max = heap.get(0);
        heap.remove(0);
        return max;
    }*/

    private TreeMap<Integer, Integer> treeMap = new TreeMap<>();

    public BinaryHeap(int size) {

    }

    public void insert(int val) {
        treeMap.put(val, val);
    }

    public int poll() {
        if (treeMap.size() > 0) {
            int max = treeMap.lastKey();
            treeMap.remove(max);
            return max;
        }
        return 0;
    }
}
