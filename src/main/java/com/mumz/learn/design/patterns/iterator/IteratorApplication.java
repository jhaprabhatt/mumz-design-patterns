package com.mumz.learn.design.patterns.iterator;

public class IteratorApplication {

    public static void main(String[] args) {
        var browserHistory = new BrowseHistory<String>();
        browserHistory.push("google.com");
        browserHistory.push("amazon.com");
        browserHistory.push("flipkart.com");
        browserHistory.push("lazada.com");
        browserHistory.push("samsung.com");

        var iter = browserHistory.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.current());
            iter.next();
        }
    }
}
