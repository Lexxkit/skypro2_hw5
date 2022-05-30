package com.lexxkit;

public class PasswordUtils {

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
        boolean decision = false;
        try {
            decision = checkLogin(login) && checkPassword(password, confirmPassword);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return decision;
    }

    private static boolean isAlphaNumeric(String s) {
        return s != null && s.matches("^[a-zA-Z0-9_]*$");
    }

    private static boolean checkLogin(String login) {
        if (login.length() > 20){
            throw new RuntimeException("WrongLoginException");
        } else if (isAlphaNumeric(login)) {
            return true;
        }

        return false;
    }

    private static boolean checkPassword(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new RuntimeException("WrongPasswordException");
        } else if (isAlphaNumeric(password) || password.length() < 20) {
            return true;
        }

        return false;
    }
}
