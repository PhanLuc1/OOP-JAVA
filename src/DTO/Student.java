package DTO;
public abstract class Student {
    private int id;
    private String fullName;
    private DoB doB;
    private String sex;
    private String phoneNumber;
    private String universityName;
    private String gradeLevel;
    public Student() {}
    public Student(int id, String fullName, DoB doB, String sex, String phoneNumber, String universityName, String gradeLevel) {
        this.id = id;
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public DoB getDoB() {
        return doB;
    }
    public void setDoB(DoB doB) {
        this.doB = doB;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getUniversityName() {
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public String getGradeLevel() {
        return gradeLevel;
    }
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}