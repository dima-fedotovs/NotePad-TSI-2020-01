package lv.tsi.javacourses.notepad;

import java.util.*;

public class RecordDAO {
    private List<Record> records = new ArrayList<>();

    public void add(Record rec) {
        records.add(rec);
    }

    public List<Record> getAllRecords() {
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
