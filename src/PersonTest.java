import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testLambda()
    {
        Person a =new Person("Novak","Djokovic");
        Person b =new Person("Roger","Federer");
        Person s =new Person("Rafael","Nadal");
        var c =new ArrayList<Person>();
        c.add(a);
        c.add(b);
        c.add(s);
       var numberOfPlayers= c.stream().filter(p -> p.getTitles()>75).count();
       assertEquals(2,numberOfPlayers);

    }

    @Test
    public void getLastName() {
    }

    @Test
    public void getTitles() {
    }
}