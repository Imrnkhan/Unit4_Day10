package Question2;

import java.util.Scanner;

import Question1.invalid;

public class Main {
    public static void main(String[] args) {
        Employeebonus e = new Employeebonus();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter date of format in  DD-MM-YYYY");
        String joiningDate = sc.next();

        try {
            double bonus = e.Employeebonus(joiningDate);
            if (bonus != 0.0) {
                System.out.println("Your bonus is:" + bonus);
            }
        } catch (InvalidAge i) {
            System.out.println(i.getMessage());
            // TODO: handle exception
        }
        sc.close();
    }

}
