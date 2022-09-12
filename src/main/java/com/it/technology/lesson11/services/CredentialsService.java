package com.it.technology.lesson11.services;

import com.it.technology.lesson11.classes.Credentials;
import com.it.technology.lesson11.exceptions.WrongLoginException;
import com.it.technology.lesson11.exceptions.WrongPasswordException;

public final class CredentialsService {

    public static boolean checkLogin(Credentials credentials, final String regex) throws WrongLoginException {
        final String login = credentials.getLogin();
        if (!login.matches(regex)) {
            throw new WrongLoginException("Incorrect login");
        }
        return true;
    }

    public static boolean checkPassword(Credentials credentials, final String regex) throws WrongPasswordException {
        final String password = credentials.getPassword();
        final String confirmPassword = credentials.getConfirmPassword();
        if ((!password.matches(regex)) || (!confirmPassword.matches(regex)) || (!password.equals(confirmPassword))) {
           throw new WrongPasswordException("Incorrect password or confirm password");
        }
        return true;
    }

    public static void isCredentialsValid(Credentials credentials,final String regex) {
        try {
            checkLogin(credentials, regex);
            checkPassword(credentials, regex);
            System.out.println("Login and password are correct");
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}
