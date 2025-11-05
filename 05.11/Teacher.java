public class Teacher {
    private String fullName;
    private String id;
    private String email;
    private String title;

    public Teacher(String fullName, String id, String email, String title) {
        this.fullName = fullName;
        this.id = id;
        this.email = email;
        this.title = title;
    }

    public String getFullName() { return fullName; }
    public String getId() { return id; }
    public String getEmail() { return email; }
    public String getTitle() { return title; }

    @Override
    public String toString() {
        return String.format("Teacher[name=%s, id=%s, email=%s, title=%s]",
                fullName, id, email, title);
    }
}