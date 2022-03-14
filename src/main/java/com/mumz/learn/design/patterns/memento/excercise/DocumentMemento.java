package com.mumz.learn.design.patterns.memento.excercise;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DocumentMemento {
  private final CharSequence content;
  private final CharSequence fontName;
  private final int fontSize;
}
