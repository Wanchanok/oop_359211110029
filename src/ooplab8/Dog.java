package ooplab8;

public class Dog extends Pet {
    // Dog is sub-class
    // Pet is super class
    public Dog(String name, String hairColor, String gender, int age) {
        super(name, hairColor, gender, age);
    }//contra..

// A+insert > Ovrride
    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");

    }//m

}//dog
