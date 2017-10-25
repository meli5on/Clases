import java.util.ArrayList;
import java.util.Scanner;

public class Main extends User {
    public static void main(String[] args) {
        System.out.println("Инструкция:\n1- создать пользывателя\n2- узнать количество юзеров\n3- просмотреть всех узеров\n4- выход");
        Boolean f = true;
        User start = new User();
        while (f){
            System.out.println("Ведите число:");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    start.name();
                break;
                case 2:
                    System.out.println(start.users.size());
                break;
                case 3:
                    start.usersAll();
                break;
                case 4:
                    f = false;
            }
        }

    }
}
