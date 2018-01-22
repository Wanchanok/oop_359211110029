package ooplab7;
import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        SuperCar c1 = new SuperCar();
        c1.setCarbrand("TOYOTA");
        c1.setCarcolor("RED");
        c1.setCarenginesize("2100");
        c1.setMaxspeed("180");
        c1.setCountryoforigin("U.S.A");

        getSuperCarInfo (c1);

        SuperCar c = new SuperCar();
        c = inputData(c1);

    }//m

    private static void getSuperCarInfo(SuperCar c) {
        System.out.println("SuperCae Info: ");
        System.out.println("Car Brand : " + c.getCarbrand());
        System.out.println("Car Color : " + c.getCarcolor());
        System.out.println("Car Engine Size : " + c.getCarenginesize());
        System.out.println("Max Speed : " + c.getMaxspeed());
        System.out.println("Country Of Origin : " + c.getCountryoforigin());
    }//getSuperCarInfo

    private static SuperCar inputData(SuperCar c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Supercar info: ");
        System.out.print("Enter Car Brand: ");
        c.setCarbrand(scanner.nextLine());                     //อ่า่านค่า id เข้ามา
        System.out.print("Enter Car Color: ");
        c.setCarcolor(scanner.nextLine());
        System.out.print("Enter Car Engine Size: ");
        c.setCarenginesize(scanner.nextLine());
        System.out.print("Enter Max Speed: ");
        c.setMaxspeed(scanner.nextLine());
        System.out.print("Enter Country Of Origin: ");
        c.setCountryoforigin(scanner.nextLine());
        return c;
    }//Input

}//c
