package school;
import java.util.ArrayList; 
import java.util.Calendar;
public class Person {      
    protected static ArrayList<Person> people = 
    new ArrayList<Person>();
    enum Gender {
        Male,Female
    }
    private String name;
    private int weight;
    private Gender gender;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public static Person addPerson(String _name,
    Gender _gender, int _weight)
    {
        Person temp = new Person(_name,_gender,_weight);
        people.add(temp);
        return(temp);
    }    
    public static void addPerson(Person _person)
    {
        people.add(_person);
    }    
    Person()
    {
        name = "None";
        weight = 100;
        gender = Gender.Female;
    }
    Person(String _name,Gender _gender,int _weight)
    {
        name = _name;
        weight = _weight;
        gender = _gender;
    }  
    public void setBirthdate
    (int _day,int _month,int _year)
    {
        birthDay = _day;
        birthMonth = _month;
        birthYear = _year;
          
    }
    public int getAge()
    {
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH) + 1;
        int year = now.get(Calendar.YEAR);
        return(0);
    }    
    public void setWeight(int _weight)
    {
        weight = _weight;
    }
    public int getWeight()
    {
        return(weight);
    }       
    public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return(name);
    }    
    public void setGender(Gender _gender)
    {
        gender = _gender;
    }
    public Gender getGender()
    {
        return(gender);
    }      
    
    public static void printNames()
    {
        System.out.println("===printNames===");
        for (Person temp : people)
        {
            System.out.println(temp.getName());
        }
    }    
    public static void printNames(Gender _gender)
    {
        System.out.println("===printNames===");
        for (Person temp : people)
        {
            if (temp.gender == _gender)
                System.out.println(temp.getName());
        }
    }
    
    
    public String toString()
    {
        return(name + " " + gender + " " + weight);
    }    
}
