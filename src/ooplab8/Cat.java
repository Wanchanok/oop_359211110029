package ooplab8;

public class Cat extends Pet {
    // Cat is sub-class
    // Pet is super class
    public Cat(String name, String hairColor, String gender, int age) {
        super(name, hairColor, gender, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meaw Meaw !!!");

    }
}//cat
