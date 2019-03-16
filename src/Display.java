/**
 *  author:Husain Chopdawala
 *  Des: Testing new features of java 8 and 10
 */


import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Display {

    /**
     * para:an integer that represents the number of titles
     * Desc: this method takes in a number and lists the players who have won  titles greater than the number
     * entered by the user
     */
    public static void TestLambda(int  numberOfTitles)
    {
        Person a =new Person("Novak","Djokovic");
        Person b =new Person("Roger","Federer");
        Person s =new Person("Rafael","Nadal");
        var c =new ArrayList<Person>();
        c.add(a);
        c.add(b);
        c.add(s);
        c.stream().filter(p -> p.getTitles()>numberOfTitles).forEach(p -> System.out.println(p.getFirstName() + " " +p.getLastName()));

    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int titles=sc.nextInt();
        //TestVar();
        TestLambda(titles);
    }
}
