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

        System.out.print("Enter your key: ");
        user.key = scan.nextLine();

        System.out.println();
        System.out.printf("Hello %s, nice to meet you!\n",user.login);
        System.out.println("-----------------------------");

        System.out.println("Options:");
        System.out.println("1 - Add book. \n2 - Remove book. \n3 - Search book. \n0 - End program.");


        do {
            System.out.println();
            System.out.print("Enter the desired option: ");
            user.options = scan.nextInt();
            user.setOptions(user.options);

        } while ( user.options != 0);
            System.out.println("Good-bye :D...!");



        scan.close();
    }
}
