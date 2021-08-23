public class Book{
    String isbnNo;
    String title;
    String edition;
    String author;
    double price;

    public Book() {
    }

    public Book(String isbnNo, String title, String edition, String author, double price) {
        this.isbnNo = isbnNo;
        this.title = title;
        this.edition = edition;
        this.author = author;
        this.price = price;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNo='" + isbnNo + '\'' +
                ", title='" + title + '\'' +
                ", edition='" + edition + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}