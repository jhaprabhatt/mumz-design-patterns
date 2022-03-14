package com.mumz.learn.design.patterns.memento.excercise;

import lombok.Builder;
import lombok.Data;

import static java.util.Objects.isNull;

@Data
public class Document {
    private CharSequence content;
    private CharSequence fontName;
    private int fontSize;

    public DocumentMemento createMemento() {
        return DocumentMemento.builder().content(content).fontName(fontName).fontSize(fontSize).build();
    }

    public void restore(final DocumentMemento from) {
        if (isNull(from)) clear();
        else {
            this.content = from.getContent();
            this.fontName = from.getFontName();
            this.fontSize = from.getFontSize();
        }
    }

    private void clear() {
        content = null;
        fontName = null;
        fontSize = 0;
    }
}
