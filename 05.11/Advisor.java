public class Advisor {
    private String fullName;
    private String email;

    public Advisor(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return String.format("Advisor[name=%s, email=%s]", fullName, email);
    }
}