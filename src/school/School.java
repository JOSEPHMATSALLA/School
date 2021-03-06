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
        
        Course geom =  Course.addCourse("Geometry", Course.Type.Math, 1,true);
        Course photo =  Course.addCourse("Photography", Course.Type.Elective, 3,true);       
        Course biology =  Course.addCourse("Biology", Course.Type.Science, 2,false);       
        Course worldHistory =  Course.addCourse("WorldHistory", Course.Type.History, 2,false);   
        geom.addStudent(ann,3);

        geom.addStudent(bobby,3.0);
        photo.addStudent(jill,4.7);
        biology.addStudent(ann,2.2);
        worldHistory.addStudent(sean,3.3);
        worldHistory.addStudent(ann,1.1);
        //worldHistory.addStudent(joe);
         joe.addCourse(worldHistory,3.6);
        geom.addTeacher(price);
        photo.addTeacher(anderson);
        photo.addTeacher(smith);
        biology.addTeacher(smith);
        worldHistory.addTeacher(hudson);
        System.out.println(ann.getGPA());
        
        
        
        Course.printNames();
        Person.printNames();
        Student.printNames();
        Teacher.printNames();
        
        hudson.printStudentsNames();
        bobby.printTeachersNames();
        
        Student.printNamesGPAGreaterThan(2.0);
        Student highGpa =Student.getHighestGPA();
        System.out.println("Higest gpa is-"+highGpa.getName());
        
        Teacher mostElectives= Teacher.getMostElectives();
        System.out.println("Most electives-"+mostElectives.getName());
        anderson.printStudentsNamesInGrade(9);
        
        Student.printNamesInHonors();
        
        Teacher lessMean =joe.leastMean();
        System.out.println("least mean teacher is-"+lessMean.getName());
        
        Teacher.printTeachersNamesThatTeach(9);
    }
}
