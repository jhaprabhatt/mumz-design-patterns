package com.mumz.learn.design.patterns.memento;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

@Data
@Builder
public class History {

    private final Deque<EditorState> history = new ArrayDeque<>();

    public void push(final EditorState content) {
        history.push(content);
    }

    public EditorState pop() {
        if (!history.isEmpty()) return history.pop();
        return null;
    }
}
