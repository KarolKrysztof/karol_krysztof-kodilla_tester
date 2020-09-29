public class BookApplication {

    public static void main(String[] args) {

        Book book = Book.of("Isaac Asimoc", "The Galaxy");
        if (book != null) {
            System.out.println(book.getAuthor() + "" + book.getTitle());
        }
    }
}
