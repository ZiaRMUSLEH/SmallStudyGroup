package day21maps;

import java.util.HashMap;
import java.util.Map;

public class Books {
    public Books () {
    }



        // crete a class to store details of the books such as id,
        // name author of a book , publisher, quantity etc, and use HashMap to get each entry

        int id;
        String name, author, publisher;
        int quantity;

    public Books (int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString () {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public static void main (String[] args) {

        Books b1 = new Books(101, "Let us", "Yashwant", "BPB", 8);
        Books b2 = new Books(102, "Data communication", "Frouzan", "Graw", 8);
        Books b3 = new Books(103, "Operating", "Galvin", "Wily", 6);

        Map<Integer, Books> bookList = new HashMap<>();
        bookList.put(1, b1);
        bookList.put(2, b2);
        bookList.put(3, b3);

        System.out.println(bookList);

        // to get each element from the app

        for(Map.Entry<Integer, Books> w: bookList.entrySet()){
            System.out.println(w.getValue());

            Books book = w.getValue();

            System.out.println(book.id);
            System.out.println(book.name);
            System.out.println(book.author);
        }



    }
}
