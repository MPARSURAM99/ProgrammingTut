public class Test implements Car, Bike {
    public void srartByKey(){
        System.out.println("Car is srart by key.");
    }
    public void srartByKick(){
        System.out.println("Bike is srart by kick.");
    }
    public static void main(String[] args) {
        Test car1 = new Test();
        car1.srartByKey();
        Test bike1 = new Test();
        bike1.srartByKick();
    }
}
