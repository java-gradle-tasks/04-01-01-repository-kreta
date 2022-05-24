package repo;

import model.Teacher;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public  class TeachersRepo {

    public List<Teacher> teachers;


    public TeachersRepo() {
        teachers = new ArrayList<Teacher>();
        MakeTestData();
    }


    public void MakeTestData() {
        teachers.add(new Teacher(1, "Számoló", "Szonja", true, new Date(1974, 10, 24)));
        teachers.add(new Teacher(2, "Buktató", "Béla", false, new Date(1974, 10, 24)));
        teachers.add(new Teacher(3, "Aritmetika", "Antal", false, new Date(1974, 10, 24)));
        teachers.add(new Teacher(4, "Arany", "András", false, new Date(1974, 10, 24)));
        teachers.add(new Teacher(5, "Sportoló", "Jenő", false, new Date(1974, 10, 24)));
        teachers.add(new Teacher(6, "Visszanéző", "Viola", true, new Date(1974, 10, 24)));
    }
}