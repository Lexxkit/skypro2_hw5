package com.lexxkit;

import com.lexxkit.exception.WrongLoginException;
import com.lexxkit.exception.WrongPasswordException;

public class PasswordUtils {

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
        boolean decision = false;
        try {
            decision = checkLogin(login) && checkPassword(password, confirmPassword);
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        } finally {
            return decision;
        }
    }

    private static boolean isAlphaNumeric(String s) {
        return s != null && s.matches("^[a-zA-Z0-9_]*$");
    }

    private static boolean checkLogin(String login) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Login is greater than 20 symbols!");
        } else return isAlphaNumeric(login);
    }

    private static boolean checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords are different!");
        } else if (isAlphaNumeric(password) && password.length() < 20) {
            return true;
        }

        return false;
    }
}
