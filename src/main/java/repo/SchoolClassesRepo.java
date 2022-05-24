package repo;

import model.SchoolClass;

import java.util.ArrayList;
import java.util.List;

public class SchoolClassesRepo {
    private List<SchoolClass> schoolClasses;


    public SchoolClassesRepo() {
        schoolClasses = new ArrayList<>();
        MakeTestData();
    }

    public void MakeTestData() {
        schoolClasses.add(new SchoolClass(1, 9, 'a', 4));
        schoolClasses.add(new SchoolClass(2, 9, 'b', 1));
        schoolClasses.add(new SchoolClass(3, 10, 'a', 6));
        schoolClasses.add(new SchoolClass(4, 10, 'b', 3));
        schoolClasses.add(new SchoolClass(5, 10, 'c', 0));
    }
}

