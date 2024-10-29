public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, String author, String isbn) {
        super(name);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void performAction() {
        System.out.println("Performing action: Reading a few pages...");
        System.out.println("Action Result: You've read a few pages of '" + name + "' by " + author + ".");
    }

    @Override
    public void showDetails() {
        System.out.println("Type: Book");
        super.showDetails(); // Calls the common showDetails from Item
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
