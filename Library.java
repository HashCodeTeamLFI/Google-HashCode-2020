public class Library {
    private List<Book> bookList;
    private int signUpTime;
    private int scannedBooks;

    public Library(List<Book> bookList, int signUpTime, int scannedBooks) {
        this.bookList = bookList;
        this.signUpTime = signUpTime;
        this.scannedBooks = scannedBooks;
    }
}
