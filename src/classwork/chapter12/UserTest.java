package classwork.chapter12;

public class UserTest {

    public static void main(String[] args) {
// 0 1 2 3 4
// H e l l o
// O l L e H
        String str = "Hello";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(String.valueOf(str.charAt(i)).toUpperCase());
            } else {
                System.out.print(String.valueOf(str.charAt(i)).toLowerCase());
            }
        }

    }

}
