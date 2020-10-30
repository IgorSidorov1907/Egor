package Main;


public class overload{

    public static void main(String[] args) {

        System.out.println(sum(2, 3));
        System.out.println(sum(4.5, 3.2));
        System.out.println(sum("Hello", "World"));

    }
    static String sum(String x, String y){

        return x + y;
    }
    static double sum(double x, double y){

        return x * y;
    }

    //int
    //int -> double -> 2.0
    //double
}