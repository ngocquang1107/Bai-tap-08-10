public class KLTN<T extends Student, V> implements Comparable<KLTN<T, V>> {
    private T student;
    private V supervisor;
    private String thesisTitle;

    public KLTN(T student, V supervisor, String thesisTitle) {
        this.student = student;
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() { return thesisTitle; }

    @Override
    public int compareTo(KLTN<T, V> other) {
        return this.thesisTitle.compareToIgnoreCase(other.thesisTitle);
    }

    @Override
    public String toString() {
        return String.format("KLTN[title=%s, %s, supervisor=%s]",
                thesisTitle, student, supervisor);
    }
}