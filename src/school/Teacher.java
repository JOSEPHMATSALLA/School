/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school; 
public class Teacher extends Person{
    private double meanLevel;
    private static int numStudents;
    private Course courses[] = new Course[Course.numPeriods];
    
    public static Teacher addTeacher(String _name,
    Gender _gender, int _weight,double _meanLevel)
    {
        Teacher temp = new Teacher(_name,_gender,_weight,
        _meanLevel);
        addPerson(temp);
        return(temp);
    }    
    Teacher (String _name,Gender _gender,int _weight,
    double _meanLevel)
    {
        super(_name,_gender,_weight);
        meanLevel = _meanLevel;
    }
    
    public boolean addCourse(Course _course)
    {
        if (!setCourseOK(_course))
            return(false);
        if (!_course.setTeacherOK(this))
            return(false);
        _course.setTeacherDoIt(this);
        setCourseDoIt(_course);
        return(true);
    } 
    public void setCourseDoIt(Course _course)
    {
        courses[_course.getPeriod()] = _course;
    }
    
    public boolean setCourseOK(Course _course)
    {
        if (_course == null)
            return(false);        
        if (courses[_course.getPeriod()] != null)
            return(false);
        return(true);
    }
    public void setMeanLevel(int _meanLevel)
    {
        meanLevel = _meanLevel;
    }
    public double getMeanLevel()
    {
        return(meanLevel);
    }        
    public static void printNames()
    {
        System.out.println(
        "===printNamesOf=== ");
        for (Person temp : people)
        {
            if (temp instanceof Teacher)
                System.out.println(temp.getName());
        }
    }   
    
    public static Teacher getMostElectives()
    {
        Teacher teacher=null;
        int currentHighNumElective=0;
        for (Person temp : people)
        {
            
            if (temp instanceof Teacher)
            {
                int numElective=0;
                for(Course course:((Teacher)temp).courses)
                {
                    if(course!=null)
                    {
                    if(course.getType()==Course.Type.Elective)
                    {
                        numElective++;
                    }
                    }
                }
                if(numElective>=currentHighNumElective)
                {
                currentHighNumElective=numElective;    
                teacher=((Teacher)temp);
                }
                
                
            }
            
        }
        return(teacher);
    }
    public void printStudentsNames()
    {
       System.out.println(getName() + " teaches");
        for (Course temp : courses)
        {
            if (temp != null)
            {
                for (int index = 0;index < temp.getNumStudents();index++)
                {
                    System.out.println(temp.getStudent(index).getName());
                }
            }
        }
    }
    public void printStudentsNamesInGrade(int grade)
    {
       System.out.println("Students in grade " +grade+":");
       for (Course temp : courses)
        {
            if (temp != null)
            {
                for (int index = 0;index < temp.getNumStudents();index++)
                {
                    if(temp.getStudent(index).getGradeLevel()==grade)
                    {
                        System.out.println(temp.getStudent(index).getName());
                    }
                }
            }
        }
       
    }
    public static void printTeachersNamesThatTeach(int grade)
    {
       System.out.println("Teachers that teach grade " +grade+":");
       for(Person temp:people)
        {
            if (temp != null)
            {
                if(temp instanceof Teacher)
                {
                    boolean printed=false;

                    for (int index = 0;index < ((Teacher)temp).courses.length;index++)
                    {
                        Course course = ((Teacher)temp).courses[index];
                        if(course!=null)
                        {
                            for(int i = 0;i < course.getNumStudents();i++)
                            {
                                if(course.getStudent(i).getGradeLevel()==grade)
                                {
                                  printed=true;  
                                }
                            }
                            
                        }
                    }
                    if(printed)
                       System.out.println(temp.getName());                    
                }
            }
        }
       
    }
}
