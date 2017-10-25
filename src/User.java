import java.util.ArrayList;
import java.util.Scanner;

public class User {
    ArrayList users = new ArrayList();
    String userName;
    String userMail;

    public String name(){
        System.out.println("Ведите имя:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        if(n.length() < 5){
            System.out.println("Имя должно быть длинее 5 букв");
        }else{
            userName = n;
            mail();
        }
        return userName;
    }
    public void mail(){
        Boolean flag = true;
        while (flag){
            System.out.println("Ведите почту:");
            Scanner scanner = new Scanner(System.in);
            String m = scanner.next();
            if(m.indexOf("@")>0 & m.indexOf(".")>m.indexOf("@")+1){
            userMail = m;
            String newUser = "Имя юзера: " + userName + " Почта: " + userMail;
            users.add(newUser);
            flag = false;
            }else{
                System.out.println("Неправильная почта");
            }

        }
    }
    public void usersAll(){
        for(int x = 0; x < users.size(); x++){
            System.out.println("Номер юзера: " + x + " " +users.get(x));
        }
    }
}
