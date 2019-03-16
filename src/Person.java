public class Person {
    private String name;
    public Person(String name)
    {
        this.name=name;
    }

    public boolean StartsWith(char s)
    {
       if(getName().charAt(0)== s)
           return true;
       else
           return false;
    }

    public String getName()
    {
        return name;
    }
}
