public class Person {

    //Attributer
    private double height;
    private int age;

    //Konstruktør
    public Person (int age, double height) {
        this.age = age;
        this.height = height;
    }

    //Get metode
    public double getHeight() {
        return height;
    }

    // Set metode
    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void hasBirthday() {
        age++;
        //alder = alder + 1; Alternativet til at lægge en til på en værdi
    }

}
