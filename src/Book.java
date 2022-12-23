public class Book {
    private String bookName;
    private Author author;
    private int yearOfPublishing;

    public Book(String bookName, Author author, int yearOfPublishing) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return bookName + " , " + author + " , " + yearOfPublishing;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return this.bookName.equals(book.bookName)&&this.author.equals(author)&&this.yearOfPublishing==yearOfPublishing;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(bookName,author,yearOfPublishing);
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
