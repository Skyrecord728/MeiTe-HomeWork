package Com.Day20;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String user = sc.nextLine();
        System.out.println("Enter your password: ");
        String pass = sc.nextLine();
        System.out.println(Login(user,pass)?"Login Successful":"Login Failed");

    }

    public static Boolean Login(String user, String pass) {
        String username = "admin";
        String password = "123456";
        return username.equals(user) && password.equals(pass);

    }
}