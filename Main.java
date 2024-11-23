import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) {
        
        LocalDate curentDate = LocalDate.now();
        LocalDate myDob = LocalDate.of(1989, 8, 02);
        Period myPeriod = Period.between(myDob, curentDate);

        System.out.println("Age : "+ myPeriod.getDays() + " days, "+ myPeriod.getMonths() + " months and "+ myPeriod.getYears()+ " years.");
        System.out.println("You are " + myPeriod.getYears()+ " years old.");

        // LocalDate customAge = LocalDate.parse("", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        // Period customPeriod = Period.between(myDob, customAge);
        // System.out.println("Age : "+ customPeriod.getDays() + " days, "+ customPeriod.getMonths() + " months and "+ customPeriod.getYears()+ " years.");
        // System.out.println("You are : " + customPeriod.getYears()+ " years old.");

    }
} 
 