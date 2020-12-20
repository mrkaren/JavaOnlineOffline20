package homework;


import java.io.IOException;

public class BTest {

    public static void main(String[] args) {
        String number = "12345weret";
        int a;
        try {
            a = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("սխալ թիվ");
            a = 0;
        }
        System.out.println(a);
        System.out.println("Շարունակություն");
    }

}
