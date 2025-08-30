package com.tp2.password;

public class PasswordValidator {
    
    public boolean isValid(String password) {
        return passwordLengthValid(password)
                && passwordUppercase(password)
                && passwordLowercase(password)
                && passwordNumber(password)
                && passwordSpecial(password);
    }

    public boolean passwordLengthValid(String password1) {
        boolean longitudMinima = (password1.length() >= 8);
        return longitudMinima;
    }

    public boolean passwordUppercase(String password2) {
        for (int i = 0; i < password2.length(); i++) {
            if (Character.isUpperCase(password2.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean passwordLowercase(String password3) {
        for (int i = 0; i < password3.length(); i++) {
            if (Character.isLowerCase(password3.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean passwordNumber(String password4) {
        for (int i = 0; i < password4.length(); i++) {
            if (Character.isDigit(password4.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean passwordSpecial(String password5) {
        String especiales = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        for (int i = 0; i < password5.length(); i++) {
            if (especiales.contains(String.valueOf(password5.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
}
