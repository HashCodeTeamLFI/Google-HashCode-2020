import java.util.Arrays;

public class Library {
    private List<Book> bookList;
    private int signUpTime;
    private int scannedBooks;
    private int possiblePoints;
    private boolean visited;
    private int booksSize;
    private PriorityQueue<Book> pq = new PriorityQueue<>();

    public Library(int signUpTime, int scannedBooks) {
        boolList = new ArrayList<>();
        this.signUpTime = signUpTime;
        this.scannedBooks = scannedBooks;
        possiblePoints = 0;
        visited = false;
    }

    public Library(int signUpTime, int scannedBooks) {
        Arrays.sort(bookList);
        this.bookList = bookList;
        this.signUpTime = signUpTime;
        this.scannedBooks = scannedBooks;
        possiblePoints = 0;
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

    public int getPossiblePoints() {
        return possiblePoints;
    }

    public void setPossiblePoints(int possiblePoints) {
        this.possiblePoints = possiblePoints;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean addBook(Book book) {
        return bookList.add(book);
    }

}
