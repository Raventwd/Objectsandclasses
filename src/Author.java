public class Author {
    private String authorName;
    private String authorSurname;


    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return authorName +" "+authorSurname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return authorName.equals(author.authorName);
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(authorName,authorSurname);
    }

    public String getAuthorSurname() {
        return authorSurname;
    }
}
