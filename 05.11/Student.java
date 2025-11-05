public class Student {
    private String fullName;
    private String id;
    private String email;

    public Student(String fullName, String id, String email) {
        this.fullName = fullName;
        this.id = id;
        this.email = email;
    }

    public String getFullName() { return fullName; }
    public String getId() { return id; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return String.format("Student[name=%s, id=%s, email=%s]", fullName, id, email);
    }
}
