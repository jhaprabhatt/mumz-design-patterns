package com.mumz.learn.design.patterns.memento;

/**
 * Memento pattern
 *
 * 1. Helps in providing undo functionality to applications
 * 2. <code>Editor</code> doesnt need to maintain history as it breaks the SRP
 * 3. State is maintained in <code>History</code> with the help of <code>EditorState</code>
 * 4. Every change to editor is saved in the history
 */
public class MementoApplication {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        addContent("First", editor, history);
        addContent("Second", editor, history);
        addContent("Third", editor, history);

        System.out.println("Current Editor Content: " + editor.getContent());

        undo(editor, history);
        undo(editor, history);
        undo(editor, history);
    }

    private static void undo(Editor editor,
                             History history) {
        editor.restore(history.pop());
        System.out.println("Editor Content After Undo: " + editor.getContent());
    }

    private static void addContent(
            final CharSequence content,
            final Editor editor,
            final History history
    ) {
        editor.setContent(content);
        history.push(editor.createState());
    }
}
