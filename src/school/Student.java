package school;
public class Student extends Person{
    private int gradeLevel;
    //private double grade;
    private Course courses[] = new Course[Course.numPeriods];
    private double grade[] = new double[Course.numPeriods];
    private int numClassesIn;
    public static Student addStudent(String _name,
    Gender _gender, int _weight, int _gradeLevel)
    {
        Student temp = new Student(_name,_gender,_weight,
        _gradeLevel);
        Person.addPerson(temp);
        return(temp);
    }
    Student (String _name,Gender _gender,int _weight,int _gradeLevel)
    {
        super(_name,_gender,_weight);
        gradeLevel = _gradeLevel;
    } 
    
    public boolean addCourse(Course _course, double _grade)
    {
        if (!setCourseOK(_course))
            return(false);
        if (!_course.setStudentOK(this))
            return(false);
        _course.setStudentDoIt(this);
        setCourseDoIt(_course,_grade);
        return(true);
    } 
    public void setCourseDoIt(Course _course, double _grade)
    {
        courses[_course.getPeriod()] = _course;
        grade[_course.getPeriod()]=_grade;
        numClassesIn++;
    }
    public boolean setCourseOK(Course _course)
    {
        if (_course == null)
            return(false);        
        if (courses[_course.getPeriod()] != null)
            return(false);
        return(true);
    }
    public double getGPA()
    {
        double gpa=0;
        double totalGrades=0;
        for(int index=0;index<Course.numPeriods;index++)
        {
            if(courses[index]!=null)
            totalGrades+=grade[index];
        }
        if(numClassesIn!=0)
        gpa=totalGrades/numClassesIn;
        return(gpa);
    }
        public void printGPA()
    {
       System.out.println(getName() + " Gpa is"+getGPA());
        
    }    
            
    public void setGradeLevel(int _gradeLevel)
    {
        gradeLevel = _gradeLevel;
    }
    public int getGradeLevel()
    {
        return(gradeLevel);
    }   
    public static Student getHighestGPA()
    {
        //double bestgpa=0;
        Student student=null;
        for (Person temp : people)
        {
            
            if (temp instanceof Student)
            {
                
                if(student==null||((Student)temp).getGPA()>student.getGPA())
                  student= ((Student)temp); 
                
                //System.out.println(temp.getName());
            }
            
        }
        return(student);
    }
    public static void printNamesGPAGreaterThan(double _gpa)
    {
        System.out.println(
        "===printNamesOfGPA=== ");
        for (Person temp : people)
        {
            if (temp instanceof Student)
            {
                if(((Student)temp).getGPA()>_gpa)
                System.out.println(temp.getName());
            }
        }
    }
    public static void printNames()
    {
        System.out.println(
        "===printNamesOf=== ");
        for (Person temp : people)
        {
            if (temp instanceof Student)
                System.out.println(temp.getName());
        }
             
    } 
    public String toString()
    {
        return(getName());
    }  
    public void printTeachersNames()
    {
       System.out.println(getName() + " has theese teachers");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                if(temp.getTeacher() !=null)
                    System.out.println(temp.getTeacher().getName());
                
            }
        }
    }
}
