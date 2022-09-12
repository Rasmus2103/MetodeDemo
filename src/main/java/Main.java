public class Main {

    public static void main(String[] args) {
      Person p1 = new Person(14, 1.72);
      System.out.println(p1.getHeight());

      p1.setHeight(1.79);
      System.out.println("New height: " + p1.getHeight() + " meter");

      p1.hasBirthday();
      System.out.println("Your age is: " + p1.getAge()+ " years old");
    }
}
