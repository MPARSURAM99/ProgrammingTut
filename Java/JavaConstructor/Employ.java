public class Employ {

    String name;
    int empId;
    double salary;

    public Employ(String nm, int eId, double slr){
        this.name = nm;
        this.empId = eId;
        this.salary = slr;
    }

    public static void main(String[] args) {
        Employ e1 = new Employ("Parsu", 101, 25000);
        Employ e2 = new Employ("Rojalin", 102, 26000);

        System.out.println(e1.name + " " + e1.empId + " " + e1.salary);
        System.out.println(e2.name + " " + e2.empId + " " + e2.salary);
    }
}