package com.mumz.learn.design.patterns.iterator.excercise;

import com.mumz.learn.design.patterns.iterator.Iterator;

public class ProductIteratorApplication {

    public static void main(String[] args) {
        var productCollection = new ProductCollection();
        productCollection.add(Product.builder().id(1).name("1").build());
        productCollection.add(Product.builder().id(2).name("2").build());
        productCollection.add(Product.builder().id(3).name("3").build());
        productCollection.add(Product.builder().id(4).name("4").build());

        Iterator iterator = productCollection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
