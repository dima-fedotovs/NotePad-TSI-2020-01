package lv.tsi.javacourses.notepad;

public class Record {
    private static int count;
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public Record() {
        count++;
        id = count;
    }

    public void askInfo() {
        firstName = Asker.askString("First Name");
        lastName = Asker.askString("Last Name");
        phone = Asker.askString("Phone");
        email = Asker.askString("Email");
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
