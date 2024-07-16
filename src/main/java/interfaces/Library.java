package interfaces;

public class Library {
    public static void main(String[] args) {
        Product book = new Book();

        book.setName("You don't know JS");
        System.out.println(book.getName());
    }
}
