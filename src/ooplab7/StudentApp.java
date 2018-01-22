package ooplab7;

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
    }//m

    private static void showData(Student s) {
        System.out.println("Student Infoo: ");
        System.out.println("ID : " + s.getId());
        System.out.println("Name : " + s.getName());
        System.out.println("Major : " + s.getMajor());
        System.out.println("Group : " + s.getGroup());

    }//showdata
}//c
