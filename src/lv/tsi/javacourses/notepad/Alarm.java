package lv.tsi.javacourses.notepad;

public class Alarm extends Note {
    private String time;

    @Override
    public void askInfo() {
        time = Asker.askString("time");
        super.askInfo();
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() +
                ", time='" + time + '\'' +
                ", text='" + getText() + '\'' +
                '}';
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
