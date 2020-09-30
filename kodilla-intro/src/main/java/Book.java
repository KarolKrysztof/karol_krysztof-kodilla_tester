public class Book {

    public static final Book book = new Book();

    private String author;
    private String title;

    private Book() {

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    static Book of(String author, String title) {
        return book;
    }

}
