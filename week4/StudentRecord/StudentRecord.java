public class StudentRecord {
    public static void main(String[] args) {
        Student first = new Student("Asha", "S101", 49);
        Student second = new Student("Ravi", "S102", 50);
        Student third = new Student("Maya", "S103", 79);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        third.setMark(80);
        System.out.println(third);
        System.out.println("Invalid update accepted: " + first.setMark(120));
        System.out.println(first);
    }
}
