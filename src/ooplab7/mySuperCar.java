package ooplab7;
import java.util.ArrayList;
import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        ArrayList<SuperCar> myCarList = new ArrayList<SuperCar>();

        myCarList = inputData(myCarList);
        System.out.println("==Show Super Car Info==");
        for (int i=0;i<myCarList.size();i++){
            System.out.println(myCarList.get(i).getSuperCarInfo());
        }
    }//m


    private static ArrayList inputData(ArrayList myCarlist) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert super car info: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("Super car: " + (i + 1));
            System.out.print("Brand: ");
            String a = scanner.nextLine();
            System.out.print("Color: ");
            String b = scanner.nextLine();
            System.out.print("Enginne Sizi: ");
            String c = scanner.nextLine();
            System.out.print("maxspeed: ");
            String d = scanner.nextLine();
            System.out.print("countryoforigin: ");
            String e = scanner.nextLine();
            SuperCar car = new SuperCar(a, b, c, d, e);
        }
            return myCarlist;

        }//Input

    }