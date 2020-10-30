package Main;

public class Person {

    private String login;
    private String password;
    private int age;
    private String phone;

    protected String name;

    String lastName;

    public String getLogin() {
        return login;
    }

    public Person(String login, String password, int age, String phone) {
        this.login = login;
        this.password = password;
        this.age = age;
        this.phone = phone;
    }

    public Person(String login, String password, String age, String phone)
    {

    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person() {
        System.out.println("Hello World");
    }

    public void updatePersonData() {

    }

    public void login() {

    }

}
