package practica3;

public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;

    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    public Book() {
        this.title = "Harry Potter";
        this.authorFirstName = "Joanne";
        this.authorLastName = "Rowling";
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }
    public String getAuthorFirstName() {
        return authorFirstName;
    }
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
    public String getAuthorLastName() {
        return authorLastName;
    }
    public String toString() {
        return "Book{title="+title+", author's first name="+authorFirstName+", author's last name="+authorLastName+"}";
    }
}
