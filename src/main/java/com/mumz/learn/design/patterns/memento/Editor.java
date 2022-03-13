package com.mumz.learn.design.patterns.memento;

import lombok.Data;

import static java.util.Objects.isNull;

@Data
public class Editor {

    private CharSequence content;

    public EditorState createState() {
        return EditorState.builder().content(content).build();
    }

    public void restore(final EditorState editorState) {
        this.content = isNull(editorState) ? "" : editorState.getContent();
    }
}
