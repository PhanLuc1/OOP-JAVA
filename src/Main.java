import DTO.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<GoodStudent> goodStudents = new ArrayList<>();
        List<NormalStudent> normalStudents = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("=== Student Management System ===");
            System.out.println("1. Add Normal Student");
            System.out.println("2. Add Good Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Sort Students");
            System.out.println("5. Recruit Students");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    try {
                        sc.nextLine();
                        System.out.print("Full Name: ");
                        String fullName = sc.nextLine();
                        System.out.print("Date of Birth (dd/MM/yyyy): ");
                        String dob = sc.nextLine();
                        System.out.print("Gender: ");
                        String gender = sc.nextLine();
                        System.out.print("Phone Number: ");
                        String phoneNumber = sc.nextLine();
                        System.out.print("University Name: ");
                        String gradeLevel = sc.nextLine();
                        System.out.print("English Score: ");
                        double englishScore = sc.nextDouble();
                        System.out.print("Entry Test Score: ");
                        double entryTestScore = sc.nextDouble();
                        sc.nextLine();
                        NormalStudent newNormalStudent = new NormalStudent(fullName,new DoB(dob),gender,phoneNumber,"NORMAL",gradeLevel,englishScore,entryTestScore);
                        students.add(newNormalStudent);
                        normalStudents.add(newNormalStudent);
                        break;
                    } catch (InvalidDOBException e) {
                        throw new RuntimeException(e);
                    }
                case 2:
                    try {
                        sc.nextLine();
                        System.out.print("Full Name: ");
                        String fullName = sc.nextLine();
                        System.out.print("Date of Birth (dd/MM/yyyy): ");
                        String dob = sc.nextLine();
                        System.out.print("Gender: ");
                        String gender = sc.nextLine();
                        System.out.print("Phone Number: ");
                        String phoneNumber = sc.nextLine();
                        System.out.print("University Name: ");
                        String universityName = sc.nextLine();
                        System.out.print("Average GPA: ");
                        double averageGPA = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Best Reward Name: ");
                        String bestRewardName = sc.nextLine();
                        GoodStudent newGoodStudent = new GoodStudent(fullName,new DoB(dob),gender,phoneNumber,universityName,"GOOD",averageGPA,bestRewardName);
                        students.add(newGoodStudent);
                        goodStudents.add(newGoodStudent);
                        break;
                    } catch (InvalidDOBException e) {
                        throw new RuntimeException(e);
                    }
                case 3:
                    for (Student student : students) {
                       student.showMyInfor();
                    }
                    break;
                case 6:
                    isRunning = false;
                    break;
            }
        }
    }
}