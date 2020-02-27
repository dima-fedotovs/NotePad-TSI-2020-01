package lv.tsi.javacourses.notepad.records;

public abstract class AbstractRecord {
    private static int counter;
    private int id;

    public AbstractRecord() {
        counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    public abstract void askInfo();

    protected String stringContent() {
        return "id=" + id;
    }

    protected abstract String type();

    @Override
    public final String toString() {
        return type() + "{" + stringContent() + '}';
    }
}
