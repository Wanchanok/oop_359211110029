package ooplab5;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        //add metthod
        myList.add("GBO");
        System.out.println(myList);
        myList.add("TAN");
        myList.add("NOOK");
        System.out.println(myList);
        System.out.println(myList.size()); //มีทั้งหมดกี่ชื่อ?
        myList.add(2,"Hello");
        System.out.println(myList); //แซก
        myList.add(1,100);
        System.out.println(myList); //แซก2
        myList.set(0,"Wanchanok");
        System.out.println(myList); //เปลี่ยนแปลงข้อมูลนั้นๆ จาก GBO เป็น Wanchanok
        myList.remove("Hello");
        System.out.println(myList); //ลบ
        System.out.println(myList.indexOf(100)); //หา 100 อยู่ตำแหน่งเลขใด




    }//main
}//class
