
package school;


public class School {

    
    public static void main(String[] args) {
        Person Joe=Person.addPerson("Joe", Person.Gender.Male,120);
        Person Bob=Person.addPerson("Bob", Person.Gender.Male,120);
        System.out.println(Bob.getWeight());
        Person Jill=Person.addPerson("Jill", Person.Gender.Female,90);
        Jill.setName("julie");
        
        Person.printNames();
    }
}
