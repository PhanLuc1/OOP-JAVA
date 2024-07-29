import DTO.DoB;
import DTO.GoodStudent;
import DTO.NormalStudent;
import DTO.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        try {
            Student goodStudent1 = new GoodStudent(1, "Luc", new DoB(14, 7, 2003), "male", "0964494595", "VKU", "GOOD", 3.64, "ThirdPlace");
            Student goodStudent2 = new GoodStudent(2, "Anh", new DoB(19, 12, 2003), "female", "0988232222", "SPH", "GOOD", 4.0, "FirstPlace");
            Student normalStudent1 = new NormalStudent(3, "Hieu", new DoB(20, 12, 2004), "male", "0988999999", "VKU", "NORMAL", 8, 8);

            students.add(goodStudent1);
            students.add(goodStudent2);
            students.add(normalStudent1);
        } catch (IllegalArgumentException IAE) {
            System.out.println(IAE.getMessage());
        }
        for (Student student : students) {
            student.showMyInfor();
            System.out.println(); // Dòng trắng giữa các sinh viên
        }
    }
}