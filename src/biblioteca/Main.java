package biblioteca;

import entitis.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User user = new User();

        System.out.println("Enter users login");
        System.out.println("-----------------------------");

        System.out.println();
        System.out.print("Enter user name: ");
        user.login = scan.nextLine();

        System.out.println();
        System.out.print("Enter your key: ");
        user.key = scan.nextLine();

        System.out.println();
        System.out.println(user.login);
        System.out.println(user.key);

        scan.close();
    }
}
