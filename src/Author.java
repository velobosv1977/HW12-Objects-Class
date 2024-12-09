public class Author {
    private String firstName;
    private String middleName;
    private String secondName;

    public Author(String firstName, String middleName, String secondName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSecondName() {
        return secondName;
    }
}
