package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
/* I love to write comments for what I am doing in the code so when I look back its super easy to follow what I was doing.
The Bag class is a generic class that implements the Container interface. It stores a collection of items in an ArrayList and provides methods to manage and iterate through these items.
 */
public class Bag<T> implements Iterable<T>, Container<T> {
    private final ArrayList<T> items = new ArrayList<>();
    // ArrayList to store items of generic type T.
    @Override  // Check if the Bag is empty.
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override // Get the size (number of items) in the Bag.
    public int size() {
        return items.size();
    }

    @Override // Add an item of generic type T to the Bag.
    public void add(T item) {
        items.add(item);
    }

    // Implement the iterator method to make Bag iterable.
    // It returns an Iterator for the items in the Bag.
    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
}
