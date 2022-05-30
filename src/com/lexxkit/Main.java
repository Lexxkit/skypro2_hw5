package com.lexxkit;

public class Main {

    public static void main(String[] args) {
        //Print true without exception
        System.out.print("1: ");
        System.out.println(PasswordUtils.checkLoginAndPassword(
                "java_skypro",
                "D_1hWiKjjP_9",
                "D_1hWiKjjP_9"
        ));

        //Login contains wrong character ('.') -> return false
        System.out.print("2: ");
        System.out.println(PasswordUtils.checkLoginAndPassword(
                "java_skypro.go",
                "D_1hWiKjjP_9",
                "D_1hWiKjjP_9"
        ));

        //Login > 20 characters -> return WrongLoginException and false
        System.out.print("3: ");
        System.out.println(PasswordUtils.checkLoginAndPassword(
                "java_skypro.goooooooooooooooooooooooooooo",
                "D_1hWiKjjP_9",
                "D_1hWiKjjP_9"
        ));

        //Passwords are not equal -> return WrongPasswordException and false
        System.out.print("4: ");
        System.out.println(PasswordUtils.checkLoginAndPassword(
                "java_skypro",
                "D_1hWiKjjP_9",
                "XXX"
        ));

        //Password = 20 characters -> return false
        System.out.print("5: ");
        System.out.println(PasswordUtils.checkLoginAndPassword(
                "java_skypro",
                "01234567890123456789",
                "01234567890123456789"
        ));

        //Password contains wrong character ('.') -> return false
        System.out.print("6: ");
        System.out.println(PasswordUtils.checkLoginAndPassword(
                "java_skypro_go",
                "D_1hWiKjjP.9",
                "D_1hWiKjjP.9"
        ));
    }
}
