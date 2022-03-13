package com.mumz.learn.design.patterns.memento;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
public class EditorState {

    private final CharSequence content;
}
