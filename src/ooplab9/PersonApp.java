package ooplab9;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("GB","029",
        new Address("123","Nakhon", "80000"),
        new Job("studeet",10000));

        System.out.println(person.toString());

        person.getJob().setPosition("ขอทาน");
        System.out.println(person.getJob());

    }
}//class
