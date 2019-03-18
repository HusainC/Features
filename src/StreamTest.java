import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StreamTest {

    @Test
    public void testStream() {
        Person a =new Person("Novak","Djokovic");
        Person b =new Person("Roger","Federer");
        Person c =new Person("Rafael","Nadal");
        List<Person> person =new ArrayList<>();
        person.add(a);
        person.add(b);
        person.add(c);
       assertEquals(73,person.stream().peek(person1 -> person1.getTitles()));
    }
}