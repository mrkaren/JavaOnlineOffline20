package homework;

import classwork.ArrayExample;

public class ArrayExampleTest {

    public static void main(String[] args) {
        ArrayExamples ae = new ArrayExamples();
        int[] array = {1, 44, 8, 20, 11, 6, 6, 44};
        ae.isExists(array, 44);
        ae.isExists(array, 8);
        ae.isExists(array, 20);
        ae.isExists(array, 98);
        ae.isExists(array, 4);

    }

}
