package DTO;
public class NormalStudent extends Student{
    private double englishScore;
    private double entryTestScore;
    public NormalStudent() {}
    public NormalStudent(int id, String name, DoB doB, String sex,String phoneNumber, String universityName, String gradeLevel, float englishScore, float entryTestScore) {
        super(id, name, doB, sex, phoneNumber, universityName, gradeLevel);
        if ((englishScore >= 1.0 && englishScore <= 9.0) && (entryTestScore >= 0.0 && entryTestScore <= 10.0) && super.getGradeLevel().equals("NORMAL")) {
            this.englishScore = englishScore;
            this.entryTestScore = entryTestScore;
        } else {
            throw new IllegalArgumentException("English score must be between 0.0 and 9.0 and Entry Test score must be between 0.0 and 10.0");
        }
    }
    public double getEnglishScore() {
        return englishScore;
    }
    public void setEnglishScore(double englishScore) {
        if (englishScore >= 1.0 && englishScore <= 9.0) {
            this.englishScore = englishScore;
        } else {
            throw new IllegalArgumentException("English score must be between 0.0 and 9.0");
        }
    }
    public double getEntryTestScore() {
        return entryTestScore;
    }
    public void setEntryTestScore(float entryTestScore) {
        if (entryTestScore >= 0.0 && entryTestScore <= 10.0) {
            this.entryTestScore = entryTestScore;
        } else {
            throw new IllegalArgumentException("Entry Test score must be between 0.0 and 10.0");
        }
    }
    @Override
    public void showMyInfor(){
        System.out.println(super.toString());
        System.out.println("English Score: " + englishScore);
        System.out.println("Entry Test Score: " + entryTestScore);
    }
}