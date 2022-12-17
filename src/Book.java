public class Book {
    private String bookName;
    private Author author;
    private int yearOfPublishing;

    public Book(String bookName, Author author, int yearOfPublishing) {
        this.bookName = bookName;
        this.author = new Author(author.getAuthorName(), author.getAuthorSurname());
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getBookName() {
        return bookName;
    }


    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}
