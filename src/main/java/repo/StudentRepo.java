package repo;

import model.Student;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentRepo {

    private List<Student> students;

    public StudentRepo() {  this.students = new ArrayList<Student>();  }

    public void MakeTestData()  {
        students.add(new Student(1,"Kis Pista", new Date(2002,1,15),false));
        students.add(new Student(2,"Nagy Éva",new Date(2003,5,13),true));
        students.add(new Student(3,"Nagy János",new Date(2002,9,13),false));
        students.add(new Student(4,"Kis Cecil",new Date(2002,4,8),true));
    }
}
