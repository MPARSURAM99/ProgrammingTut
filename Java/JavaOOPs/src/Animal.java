// Creating Class;
public class Animal {
//    Creating reference variable.
    String color;
    int age;

//    Creating method;
    public void animalProperty(String col, int ag){
        color = col;
        age = ag;
    }

    public void displayAnimal(){
        System.out.println(color + " " + age);
    }

    public static void main(String[] args) {
//        Creating object;
        Animal dog = new Animal();
//        Initialization by method;
        dog.animalProperty("Red", 18);
        dog.displayAnimal();
    }
}
