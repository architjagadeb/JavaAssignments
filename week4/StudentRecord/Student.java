public class Student {
    private String name;
    private String studentId;
    private int mark;

    public Student(String name, String studentId, int mark) {
        if (name == null || name.trim().isEmpty() || studentId == null || studentId.trim().isEmpty() || mark < 0 || mark > 100) throw new IllegalArgumentException("Invalid student details");
        this.name = name;
        this.studentId = studentId;
        this.mark = mark;
    }
    public String getName() { return name; }
    public String getStudentId() { return studentId; }
    public int getMark() { return mark; }
    public boolean setMark(int newMark) { if (newMark < 0 || newMark > 100) return false; mark = newMark; return true; }
    public boolean hasPassed() { return mark >= 50; }
    public String getClassification() { if (mark >= 80) return "Distinction"; if (mark >= 50) return "Pass"; return "Fail"; }
    public String toString() { return "Student{name='" + name + "', id='" + studentId + "', mark=" + mark + ", classification='" + getClassification() + "'}"; }
}
