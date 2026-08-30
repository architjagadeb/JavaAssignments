public class Student {
    private String name;
    private String studentId;
    private int mark;

    public Student(String name, String studentId, int mark) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be blank");
        }
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100");
        }
        this.name = name;
        this.studentId = studentId;
        this.mark = mark;
    }

    public String getName() { return name; }
    public String getStudentId() { return studentId; }
    public int getMark() { return mark; }

    public boolean setMark(int newMark) {
        if (newMark < 0 || newMark > 100) return false;
        mark = newMark;
        return true;
    }

    public boolean hasPassed() { return mark >= 50; }

    public String getClassification() {
        if (mark >= 80) return "Distinction";
        if (mark >= 50) return "Pass";
        return "Fail";
    }

    public String toString() {
        return "Student{name='" + name + "', studentId='" + studentId + "', mark=" + mark + ", classification='" + getClassification() + "'}";
    }
}
