public class Student {
    private String studNum;
    private String lastName;
    private String firstName;
    private String title;

    public Student(String studNum, String lastName, String firstName, String title) {
        this.studNum = studNum;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
    }

    public String getStudNo() {
        return studNum;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return studNum + " - " + lastName + ", " + firstName + "\n";
    }
}
