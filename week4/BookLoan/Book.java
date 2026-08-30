public class Book {
    private String title;
    private String author;
    private String bookCode;
    private boolean loaned;

    public Book(String title, String author, String bookCode) {
        if (title == null || title.trim().isEmpty() || author == null || author.trim().isEmpty() || bookCode == null || bookCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Book details cannot be blank");
        }
        this.title = title;
        this.author = author;
        this.bookCode = bookCode;
    }

    public boolean borrowBook() {
        if (loaned) return false;
        loaned = true;
        return true;
    }

    public boolean returnBook() {
        if (!loaned) return false;
        loaned = false;
        return true;
    }

    public boolean isAvailable() { return !loaned; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getBookCode() { return bookCode; }

    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', code='" + bookCode + "', available=" + isAvailable() + "}";
    }
}
