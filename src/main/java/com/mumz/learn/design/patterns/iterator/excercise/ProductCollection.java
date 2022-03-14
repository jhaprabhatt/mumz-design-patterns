package com.mumz.learn.design.patterns.iterator.excercise;

import com.mumz.learn.design.patterns.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator iterator() {
        return new ListIterator(products);
    }

    public class ListIterator implements Iterator<Product> {

        private final List<Product> products;
        private int index = 0;

        public ListIterator(final List<Product> products) {
            this.products = products;
        }

        @Override
        public boolean hasNext() {
            return index < products.size();
        }

        @Override
        public Product current() {
            return products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
