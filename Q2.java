//Define a base class Animal with a virtual function sound(). Then, create two derived classes, Dog and Cat, that override the sound() function to return "Bark" and "Meow," respectively.
class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
    }
}
