package lv.tsi.javacourses.notepad;

import java.util.List;

public class Main {
    private static RecordDAO records = new RecordDAO();

    public static void main(String[] args) {
	    for (;;) {
            String cmd = Asker.askString("command");
            switch (cmd) {
                case "exit":
                    System.out.println("good bye");
                    return;
                case "info":
                case "help":
                    showHelp();
                    break;
                case "create":
                    createRecord();
                    break;
                case "list":
                    listRecords();
                    break;
                case "delete":
                case "del":
                case "remove":
                case "rm":
                    removeRecord();
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void removeRecord() {
        var id = Asker.askInt("Enter ID to remove");
        records.remove(id);
    }

    private static void listRecords() {
        var all = records.getAllRecords();
        for (var r : all) {
            System.out.println(r);
        }
    }

    private static void createRecord() {
        var type = Asker.askString("Record type");
        switch (type) {
            case "person":
                var r = new Person();
                r.askInfo();
                records.add(r);
                break;
            case "book":
                var b = new Book();
                b.askInfo();
                records.add(b);
                break;
            default:
                System.out.println("Wrong record type");
        }
    }

    private static void showHelp() {
        System.out.println("This is very helpful information. Trust me.");
    }
}
