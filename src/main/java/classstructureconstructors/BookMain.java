package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Tolstoj", "AnnaKarenina");
        book.register("1234");

        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getRegNumber());
    }
}
