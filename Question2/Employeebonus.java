package Question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employeebonus {

    public double Employeebonus(String date) throws InvalidAge {

        try {

            LocalDate d1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate c1 = LocalDate.now();
            Period p = Period.between(d1, c1);
            if (p.getYears() < 0) {
                System.out.println("age should not be in future");
                return 0.0;
            }

            else if (p.getYears() >= 0 && p.getYears() < 1) {
                return 5000;
            } else if (p.getYears() > 1 && p.getYears() < 2) {
                return 8000;
            } else {
                return 10000;
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw new InvalidAge("please pass the date in correct format");
        }
    }

}
