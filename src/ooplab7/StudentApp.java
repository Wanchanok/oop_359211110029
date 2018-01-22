package ooplab7;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
    // create object as student
    Student s1 = new Student();
    s1.setId("111111111111");
    s1.setName("Boy SAIYAI");
    s1.setMajor("Information system");
    s1.setGroup("IS221");

    Student s2 = new Student("22222222222",
            "Girl SAIYAI",
            "Maketing",
            "ML221");
    showData (s1);
    showData(s2);

    Student s3 = new Student();
    s3 = inputData(s3);
     showData(s3);
    //test
        System.out.println(Student.faculty); //student คือ class
        System.out.println(s1.faculty);       // s1 คือ opject

    }//m


    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student info: ");
        System.out.print("Enter student ID: ");
        s.setId(scanner.nextLine());                     //อ่า่านค่า id เข้ามา
        System.out.print("Enter student name: ");
        s.setName(scanner.nextLine());
        System.out.print("Enter student major: ");
        s.setMajor(scanner.nextLine());
        System.out.print("Enter student group: ");
        s.setGroup(scanner.nextLine());
        return s;

    }//inputdata

    private static void showData(Student s) {
        System.out.println("Student Info: ");
        System.out.println("ID : " + s.getId());
        System.out.println("Name : " + s.getName());
        System.out.println("Major : " + s.getMajor());
        System.out.println("Group : " + s.getGroup());

    }//showdata
}//c
