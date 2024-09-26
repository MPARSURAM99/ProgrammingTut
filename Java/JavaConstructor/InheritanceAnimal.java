// Parent class;
public class InheritanceAnimal {
    public void eating(){
        System.out.println("I am eating");
    }
}

// Child class;
class Dog extends InheritanceAnimal{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eating();
    }
}
