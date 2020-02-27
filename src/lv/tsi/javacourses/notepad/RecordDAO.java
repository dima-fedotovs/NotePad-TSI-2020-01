package lv.tsi.javacourses.notepad;

import lv.tsi.javacourses.notepad.records.AbstractRecord;

import java.util.*;

public class RecordDAO {
    private List<AbstractRecord> records = new ArrayList<>();

    public void add(AbstractRecord rec) {
        records.add(rec);
    }

    public List<AbstractRecord> getAllRecords() {
        return Collections.unmodifiableList(records);
    }

    public void remove(int id) {
//        option 1
//        int size = records.size();
//        for (int i = 0; i < size; i++) {
//            var r = records.get(i);
//            if (r.getId() == id) {
//                records.remove(i);
//                break;
//            }
//        }
//
//        option 2
        records.removeIf(r -> r.getId() == id);

//        option 3
//        Iterator<Record> i = records.iterator();
//        while (i.hasNext()) {
//            Record r = i.next();
//            if (r.getId() == id) {
//                i.remove();
//                break;
//            }
//        }
    }
}
