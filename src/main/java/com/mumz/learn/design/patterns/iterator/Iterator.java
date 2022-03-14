package com.mumz.learn.design.patterns.iterator;

public interface Iterator<T> {
  boolean hasNext();
  T current();
  void next();
}

