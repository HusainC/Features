public class Person {
    private String firstName;
    private String lastName;
    private int titles;
    public Person(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        if(this.getLastName().equals("Federer"))
        {
            this.titles=100;
        }
        else if(this.getLastName().equals("Nadal"))
        {
            this.titles=80;
        }
        else if(this.getLastName().equals("Djokovic"))
        {
            this.titles=73;
        }
        else
        {
            this.titles=0;
        }
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getTitles()
    {
        return titles;
    }
}
