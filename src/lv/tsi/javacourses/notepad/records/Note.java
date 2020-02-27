package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;

public class Note extends AbstractRecord {
    private String text;

    @Override
    public void askInfo() {
        text = Asker.askString("text");
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                ", text='" + text + '\'';
    }

    @Override
    protected String type() {
        return "Note";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
