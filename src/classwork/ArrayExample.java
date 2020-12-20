package classwork;

public class ArrayExample {

    public static void main(String[] args) {
        int numbers[] = {10, 20, 33, 4, 2, 14, 66, 102};
//        int numbers[] = new int[8];

        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

}
