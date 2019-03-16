import java.util.ArrayList;
import java.util.stream.Collectors;

public class Display {

    public static void TestVar()
    {
        var k=9;
        var j=9;
        var s=k+j;
        System.out.println(s);
    }
    public static void TestLambda()
    {
        Person a =new Person("Husain");
        Person b =new Person("Cusain");
        Person s =new Person("Rusain");
        var c =new ArrayList<Person>();
        c.add(a);
        c.add(b);
        c.add(s);
        c.stream().filter(p -> p.getName().startsWith("C")).forEach(p -> System.out.println(p.getName()));

    }
    public static void main(String args[])
    {
        //TestVar();
        TestLambda();
    }
}
