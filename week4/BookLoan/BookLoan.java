public class BookLoan {
    public static void main(String[] args) {
        Book first = new Book("Java Basics", "Asha Rao", "B101");
        Book second = new Book("Clean Code", "Robert Martin", "B102");
        System.out.println(first.borrowBook());
        System.out.println(first.borrowBook());
        System.out.println(first.returnBook());
        System.out.println(first.returnBook());
        System.out.println(second.borrowBook());
        System.out.println(first);
        System.out.println(second);
    }
}
