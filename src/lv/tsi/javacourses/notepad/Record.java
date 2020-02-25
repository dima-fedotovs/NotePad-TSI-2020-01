package lv.tsi.javacourses.notepad;

public abstract class Record {
    private static int counter;
    private int id;

    public Record() {
        counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    public abstract void askInfo();

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                '}';
    }
}
