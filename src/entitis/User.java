package entitis;

import entitis.Books;

import java.util.Scanner;


public class User {

    public String login;
    public String key;
    public int add;
    public int remove;
    public int search;
    public int options;

    Books books = new Books();
    Scanner scan = new Scanner(System.in);

    public void setLogin(String login) {
        this.login = login;
    }

    public void addBook(int add){
        this.add = add;

        System.out.print("Enter book's title: ");
        books.title = scan.nextLine();

        System.out.println();
        System.out.print("Enter book's author: ");
        books.author = scan.nextLine();

        System.out.println();
        System.out.print("Enter book's date: ");
        books.date = scan.nextLine();
    }

    public void removeBook( int remove){
        this.remove = remove;

        System.out.println();
        System.out.println("Enter title's book you want remove: ");
        books.title = scan.nextLine();
        System.out.println();
        System.out.printf("Removed: %s\n", books.title);

    }

    public void searchBook (int search){
        this.search = search;

        System.out.println();
        System.out.println("Enter title's book you want search: ");
        books.title = scan.nextLine();
        System.out.println(books.title);
        System.out.println(books.author);
        System.out.println(books.date);

    }

    public void setOptions(int options){
        this.options = options;

        if (options == 1){
            addBook(add);
        }
        else if (options == 2) {
            removeBook(remove);
        }
        else if (options == 3) {
            searchBook(search);
        }
    }
}
