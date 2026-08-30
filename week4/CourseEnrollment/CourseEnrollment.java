public class CourseEnrollment {
    public static void main(String[] args) {
        Course course = new Course("CS101", "Java Programming", 2);
        System.out.println(course);
        System.out.println(course.enroll());
        System.out.println("Available seats: " + course.getAvailableSeats());
        System.out.println(course.enroll());
        System.out.println(course.isFull());
        System.out.println(course.enroll());
        System.out.println(course.withdraw());
        System.out.println(course.withdraw());
        System.out.println(course.withdraw());
        System.out.println(course);
    }
}
