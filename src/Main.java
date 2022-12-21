public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("Lev", "Tolstoy");
        Book book1 = new Book("Crime and punishment", new Author(author2.getAuthorName(), author2.getAuthorSurname()), 1866);
        Book book2 = new Book("Shining", new Author(author1.getAuthorName(), author1.getAuthorSurname()), 1977);
        book2.setYearOfPublishing(2000);
        System.out.println(author1);
        System.out.println(book1);
    }
}
