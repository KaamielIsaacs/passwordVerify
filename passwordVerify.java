// Kaamiel Isaacs
// Student Number: 4129581
// Practical11.java

import java.util.Scanner;

public class passwordVerify {

    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Please Enter Password: ");
            String userPassword = myObj.nextLine().trim();

            boolean validPass = verifyPassword(userPassword);
            if (validPass) {
                System.out.println("Valid Password!");
            } else {
                System.out.println("Invalid Password");
            }
        }
    }

    public static boolean verifyPassword(String password) {
        boolean valid = true;
        StringBuilder msg = new StringBuilder();

        if (password.length() < 8) {
            msg.append("Password needs to be at least 8 characters long.\n");
            valid = false;
        }
        if (!password.matches(".*[A-Z].*")) {
            msg.append("Needs at least 1 uppercase letter.\n");
            valid = false;
        }
        if (!password.matches(".*[a-z].*")) {
            msg.append("Needs at least 1 lowercase letter.\n");
            valid = false;
        }
        if (!password.matches(".*[0-9].*")) {
            msg.append("Needs at least 1 digit.\n");
            valid = false;
        }
        // special character = any non-alphanumeric character
        if (!password.matches(".*[^a-zA-Z0-9].*")) {
            msg.append("Needs at least 1 special character.\n");
            valid = false;
        }

        if (!valid) {
            System.out.print(msg.toString());
        }
        return valid;
    }
}
