import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static final String FILEPATH = "E:\\Abhishek\\DSA_assignment\\data.txt";

    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        try {
            File myObj = new File(FILEPATH);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);

                String[] bookDetails = data.split(",");

                double price = Double.parseDouble(bookDetails[4].substring(2));

                books.add(new Book(bookDetails[0], bookDetails[1], bookDetails[2], bookDetails[3], price));

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


//        addNewBook(new Book("ASA", "ASASA", "ASASA", "WWW", 121));  // add file method calling
//        removeBook(2);  // remove book method calling
//        updateBook(new Book("ASA", "ASASA", "ASASA", "WWW", 121), 2);  // update book method calling
//        viewAllBooks();  // view all book method calling

//        sortBookList();

//        searchBookBuIsbnNo("978-0672317842");
        sortBookListACSC();
        sortBookListDesce();
    }


    // insert book
    public static void addNewBook(Book b) {
        try {

            books.add(b);

            FileWriter fw = new FileWriter(FILEPATH);

            String fileString = "";


            for (Book book : books) {
                String bookText = book.getIsbnNo() + ", " + book.getTitle() + ", " + book.getEdition() + ", " + book.getAuthor() + ", $" + book.price;
                fileString += (bookText + "\n");
            }

            System.out.println(fileString.replace("  ", " "));
            fw.write(fileString);

            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // delete book
    public static void removeBook(int index) {
        try {

            books.remove(index);

            FileWriter fw = new FileWriter(FILEPATH);

            String fileString = "";


            for (Book book : books) {
                String bookText = book.getIsbnNo() + ", " + book.getTitle() + ", " + book.getEdition() + ", " + book.getAuthor() + ", $" + book.price;
                fileString += (bookText + "\n");
            }

            System.out.println(fileString.replace("  ", " "));
            fw.write(fileString);

            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // update book
    public static void updateBook(Book b, int element) {
        try {

            books.set(element, b);

            FileWriter fw = new FileWriter(FILEPATH);

            String fileString = "";


            for (Book book : books) {
                String bookText = book.getIsbnNo() + ", " + book.getTitle() + ", " + book.getEdition() + ", " + book.getAuthor() + ", $" + book.price;
                fileString += (bookText + "\n");
            }

            System.out.println(fileString.replace("  ", " "));
            fw.write(fileString);

            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // view all books
    public static void viewAllBooks() {
        for (Book b : books) {
            System.out.println(b.toString());
        }
    }


    // bubble sort ascending
    public static void sortBookListACSC() {
        try {

            double arr[] = new double[books.size()];

            for (int count = 0; count < books.size(); count++) {
                arr[count] = books.get(count).getPrice();
            }

            System.out.println("-------- Books Price list before sort ----- ");
            for (double price : arr) {
                System.out.print(price + " ");
            }
            System.out.println("");

            int n = arr.length;
            double temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j - 1] > arr[j]) {
                        //swap elements
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }

                }
            }

            System.out.println(" --------Books Price list after sort ascending ----- ");
            for (double price : arr) {
                System.out.print(price + " ");
            }

            System.out.println("");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // bubble sort descending
    public static void sortBookListDesce() {
        try {

            double arr[] = new double[books.size()];

            for (int count = 0; count < books.size(); count++) {
                arr[count] = books.get(count).getPrice();
            }

            System.out.println("-------  Books Price list before sort ----- ");
            for (double price : arr) {
                System.out.print(price + " ");
            }
            System.out.println("");

            int n = arr.length;
            double temp = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j] > arr[j-1]) {
                        //swap elements
                        temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j - 1] = temp;
                    }

                }
            }


            System.out.println("-------  Books Price list after sort descending ----- ");
            for (double price : arr) {
                System.out.print(price + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void searchBookBuIsbnNo(String isbn) {  // linerar search
        try {
            File myObj = new File(FILEPATH);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);

                String[] bookDetails = data.split(",");

                if (bookDetails[0].equals(isbn)) {
                    System.out.println(data);
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
