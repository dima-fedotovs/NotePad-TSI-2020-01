package lv.tsi.javacourses.notepad.records;

import lv.tsi.javacourses.notepad.Asker;

public class Alarm extends Note {
    private String time;

    @Override
    public void askInfo() {
        time = Asker.askString("time");
        super.askInfo();
    }

    @Override
    public String stringContent() {
        return super.stringContent() +
                ", time='" + time + '\'';
    }

    @Override
    protected String type() {
        return "Alarm";
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
