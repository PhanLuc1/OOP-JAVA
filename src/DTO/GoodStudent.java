package DTO;
public class GoodStudent extends Student{
    private float averageGPA;
    private String bestRewardName;
    public GoodStudent(){
    }
    public GoodStudent(int id, String name, DoB doB, String sex,String phoneNumber, String universityName, String gradeLevel, float averageGPA, String bestRewardName){
        super(id, name, doB, sex, phoneNumber, universityName, gradeLevel);
        if (averageGPA >= 0.0 && averageGPA <= 4.0) {
            this.averageGPA = averageGPA;
            this.bestRewardName = bestRewardName;
        } else {
            throw new IllegalArgumentException("average gpa must be between 0 and 4.0");
        }
    }
    public float getAverageGPA() {
        return averageGPA;
    }
    public void setAverageGPA(float averageGPA) {
        if (averageGPA >= 0.0 && averageGPA <= 4.0) {
            this.averageGPA = averageGPA;
        } else {
            throw new IllegalArgumentException("average gpa must be between 0 and 4.0");
        }
    }
    public String getBestRewardName() {
        return bestRewardName;
    }
    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }
}