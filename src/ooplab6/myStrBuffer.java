package ooplab6;

public class myStrBuffer {
    public static void main(String[] args) {
// StringBuffer
        StringBuffer buffer =new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("to");
        buffer.append(" ");
        buffer.append("RMUTSV");
        buffer.append(" ");
        buffer.append(2017);
        System.out.println(buffer);
        buffer.replace(0,5,"University of");
        System.out.println(buffer);
        System.out.println(buffer.reverse()); //สลับหน้ามาหลัง
        buffer.setCharAt(0,'T');
        System.out.println(buffer); //เปลี่ยนค่า ตำแหน่ง0 เป็น T

    }//main
}//class
