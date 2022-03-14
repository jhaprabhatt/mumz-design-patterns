package com.mumz.learn.design.patterns.iterator;

public class BrowseHistory<T> {

    private final Object[] urls = new Object[10];
    private int count;

    public void push(T url) {
        urls[count++] = url;
    }

    public T pop() {
        return (T) urls[--count];
    }

    public Iterator iterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator<T> {
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public T current() {
            return (T) history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
