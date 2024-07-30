package DTO;
public class GoodStudent extends Student{
    private double averageGPA;
    private String bestRewardName;
    public GoodStudent(){
    }
    public GoodStudent(String fullName, DoB doB, String sex,String phoneNumber, String universityName, String gradeLevel, double averageGPA, String bestRewardName){
        super( fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        if (!(averageGPA < 0.0 || averageGPA > 4.0) && super.getGradeLevel().equals("GOOD")) {
            this.averageGPA = averageGPA;
            this.bestRewardName = bestRewardName;
        } else {
            throw new IllegalArgumentException("average gpa must be between 0 and 4.0");
        }
    }
    public double getAverageGPA() {
        return averageGPA;
    }
    public void setAverageGPA(double averageGPA) {
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
    @Override
    public void showMyInfor() {
        System.out.println(super.toString());
        System.out.println("average gpa: " + averageGPA);
        System.out.println("best reward name: " + bestRewardName);
    }
}