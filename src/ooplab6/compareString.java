package ooplab6;

public class compareString {
    public static void main(String[] args) {
        // compare String
        String m = "Hello ";
        String n = "HellOO ";

        // type 1 (==)
        if (m==n) System.out.println("yes.");
        else System.out.println("no.");    // ตัวอักษรเหมือนกันหรือไม่?

        // type 2 (equal())
        if (m.equals(n)) System.out.println("yes.");
        else System.out.println("no.");    // ตัวอักษรเหมือนกันหรือไม่?

       // type 3 (compareTo())
       if (m.compareTo(n)==0) System.out.println("yes.");
       else if (m.compareTo(n)>=1)
           System.out.println("no. +"); //ค่ามากกว่า 0 หรือมากกว่า ซ้าย
       else System.out.println("no. -");  // ค่าซ้าย มากกว่า ขวา



    }//main
}//class
