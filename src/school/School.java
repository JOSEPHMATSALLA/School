package school;
public class School { 
    public static void main(String[] args) { 
        Student joe =  Student.addStudent("Joe",Person.Gender.Male,120,10);
        Student jill =  Student.addStudent("Jill",Person.Gender.Female,105,9);
        Student billyJoe =  Student.addStudent("BillyJoe",Person.Gender.Male,210,12);
        Student bobby =  Student.addStudent("Bobby",Person.Gender.Male,168,11);        
        Student ann =  Student.addStudent("Annie",Person.Gender.Female,98,9);        
        Student sean =  Student.addStudent("Sean",Person.Gender.Male,138,11);        
                
        Teacher price = Teacher.addTeacher("Price", Person.Gender.Male, 206,4.7);
        Teacher hudson = Teacher.addTeacher("Hudson", Person.Gender.Female, 106,7.2);
        Teacher anderson = Teacher.addTeacher("Anderson", Person.Gender.Female, 112,3.2);
        Teacher smith = Teacher.addTeacher("Smith", Person.Gender.Male, 152,8.2);
        Teacher jones = Teacher.addTeacher("Jones", Person.Gender.Female, 102,1.2);
        
        Course geom =  Course.addCourse("Geometry", Course.Type.Math, 1);
        Course photo =  Course.addCourse("Photography", Course.Type.Elective, 3);       
        Course biology =  Course.addCourse("Biology", Course.Type.Science, 2);       
        Course worldHistory =  Course.addCourse("WorldHistory", Course.Type.History, 2);       

        geom.addStudent(bobby);
        photo.addStudent(jill);
        biology.addStudent(ann);
        worldHistory.addStudent(sean);
        worldHistory.addStudent(ann);
        worldHistory.addStudent(joe);
         
        geom.addTeacher(price);
        photo.addTeacher(anderson);
        biology.addTeacher(smith);
        worldHistory.addTeacher(hudson);
        
        
        
        Course.printNames();
        Person.printNames();
        Student.printNames();
        Teacher.printNames();
        
        hudson.printStudentsNames();
    }
}
