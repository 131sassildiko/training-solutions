package attributes;

public class Books {

    private String Title;

    public Books(String title) {
        Title = title;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public static void main(String[] args) {
        Books books = new Books("Akármi");
        System.out.println(books.getTitle());
    }
}
