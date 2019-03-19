import java.time.LocalDate;
import java.time.Period;
import  java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

/**
 * @author:Husain Chopdawala
 * @desc:represents
 */

public class Person {
    private String firstName;
    private String lastName;
    private int titles;
   
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (this.getLastName().equals("Federer")) {
            this.titles = 100;
        } else if (this.getLastName().equals("Nadal")) {
            this.titles = 80;
        } else if (this.getLastName().equals("Djokovic")) {
            this.titles = 73;
        } else {
            this.titles = 0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTitles() {
        return titles;
    }

    public int getAge(LocalDate birthDate) {
        if (birthDate != null) {
            return Period.between(birthDate, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }

    public static List listAllAges(List person, Function<Person, Integer> f) {
        List result = new ArrayList();
        person.forEach(x -> result.add(f.apply((Person) x)));
        return result;
    }
}
