public class Course {
    private String courseCode;
    private String title;
    private int capacity;
    private int enrolledCount;

    public Course(String courseCode, String title, int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be positive");
        this.courseCode = courseCode;
        this.title = title;
        this.capacity = capacity;
    }

    public boolean enroll() {
        if (isFull()) return false;
        enrolledCount++;
        return true;
    }

    public boolean withdraw() {
        if (enrolledCount == 0) return false;
        enrolledCount--;
        return true;
    }

    public boolean isFull() { return enrolledCount == capacity; }
    public int getAvailableSeats() { return capacity - enrolledCount; }

    public String toString() {
        return "Course{code='" + courseCode + "', title='" + title + "', enrolled=" + enrolledCount + ", capacity=" + capacity + "}";
    }
}
