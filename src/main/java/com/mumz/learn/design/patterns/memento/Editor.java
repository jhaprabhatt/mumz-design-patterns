package com.mumz.learn.design.patterns.memento;

import static java.util.Objects.isNull;

public class Editor {

    private CharSequence content;

    public EditorState createState() {
        return EditorState.builder().content(content).build();
    }

    public void addContent(final CharSequence content) {
        this.content = content;
    }

    public void restore(final EditorState editorState) {
        this.content = isNull(editorState) ? "" : editorState.getContent();
    }

    public void print() {
        if (isNull(content) || content.length() == 0) System.out.println("Editor is empty");
        else System.out.println("Current Editor State : " + content.toString());
    }
}
