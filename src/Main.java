public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Crime and punishment", "L.Tolstoy", 1866);
        Book book2 = new Book("Shining", "S.King", 1977);
        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("Lev", "Tolstoy");
        book2.setYearOfPublishing(2000);
    }
}
