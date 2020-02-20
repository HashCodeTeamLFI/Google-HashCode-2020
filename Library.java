public class Library {
    private List<Book> bookList;
    private int signUpTime;
    private int scannedBooks;

    public Library(List<Book> bookList, int signUpTime, int scannedBooks) {
        this.bookList = bookList;
        this.signUpTime = signUpTime;
        this.scannedBooks = scannedBooks;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public int getSignUpTime() {
        return signUpTime;
    }

    public void setSignUpTime(int signUpTime) {
        this.signUpTime = signUpTime;
    }

    public int getScannedBooks() {
        return scannedBooks;
    }

    public void setScannedBooks(int scannedBooks) {
        this.scannedBooks = scannedBooks;
    }
}
