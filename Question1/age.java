package Question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class age {
    
    public int ageChecker(String date)throws invalid{


        try {
            LocalDate d1 = LocalDate.parse(date,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate c1 = LocalDate.now();
            Period p = Period.between(d1, c1);
            return p.getYears();
        } catch (Exception e) {
            //TODO: handle exception
            throw new invalid("Invalid date format");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date in dd-MM-yyyy format");
        String dob = sc.next();

        age a = new age();

        try {
            int age = a.ageChecker(dob);
            if(age<0){
                System.out.println("date should not be in future");
            }
            else {
                System.out.println("your age is "+age);
            }
        } 
        catch (invalid i) {
            //TODO: handle exception

            System.out.println(i.getMessage());
        }
        sc.close();
    }
}
