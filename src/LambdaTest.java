import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LambdaTest {

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
    public void methodReferenceTest()
    {
        Person a =new Person("Novak","Djokovic");
        Person b =new Person("Roger","Federer");
        Person s =new Person("Rafael","Nadal");
        var c =new ArrayList<Person>();
        c.add(a);
        c.add(b);
        c.add(s);
        List allAges = Person.listAllAges(c, Person::getTitles);
        assertEquals(73,allAges.get(0));

    }


}