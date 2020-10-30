package Main;

public class ImplPerson {

    public static void main(String[] args) {
        Person person1 = new Person(); //Person() - конструктор

        person1.setLogin("aaaa");
        person1.setPassword("Qwerty123");


        Person person2 = new Person("jjj", "123", 25, "888888");

        System.out.println(person1.getLogin());
        System.out.println(person2.getLogin());

    }

}
