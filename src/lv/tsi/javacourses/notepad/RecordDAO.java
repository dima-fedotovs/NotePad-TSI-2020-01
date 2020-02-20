package lv.tsi.javacourses.notepad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecordDAO {
    private List<Record> records = new ArrayList<>();

    public void add(Record rec) {
        records.add(rec);
    }

    public List<Record> getAllRecords() {
        return Collections.unmodifiableList(records);
    }

    public void remove(int id) {
        
    }
}
