package com.mumz.learn.design.patterns.memento.excercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
  private final Deque<DocumentMemento> history = new ArrayDeque<>();

  public void push(DocumentMemento memento) {
    history.push(memento);
  }

  public DocumentMemento pop() {
    if (!history.isEmpty()) return history.pop();
    return null;
  }
}
