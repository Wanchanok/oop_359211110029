package ooplab8;
//App for Pet,Dog and Cat
public class PetApp {
    public static void main(String[] args) {
       Dog dog =  new Dog("Bam","whigth","Female",2);
        System.out.println(dog.toString());

        Cat cat = new Cat("GG","gray","Female",3);
        System.out.println(cat.getClass()+" "+cat.toString());
        dog.makeNoise();
        cat.makeNoise();

    }//m

}//c
