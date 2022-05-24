package model;


public class SchoolClass {
    private int id;
    private int schoolClass;
    private char gradeType;
    private int teacherId;

    public SchoolClass(int id, int schoolClass, char gradeType, int teacherId) {
        this.id = id;
        this.schoolClass = schoolClass;
        this.gradeType = gradeType;
        this.teacherId = teacherId;
    }

    public int getId() {
        return id;
    }

    public int getSchoolClass() {
        return schoolClass;
    }

    public char getGradeType() {
        return gradeType;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSchoolClass(int schoolClass) {
        this.schoolClass = schoolClass;
    }

    public void setGradeType(char gradeType) {
        this.gradeType = gradeType;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}


