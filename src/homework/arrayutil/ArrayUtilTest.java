package homework.arrayutil;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtil au = new ArrayUtil();
        int array[] = {2, 6, 8, 9, 11, 30, -5, 1, 66};

        int sum = au.sum(array);
        int avg = au.avg(array);
        System.out.println(sum);
        System.out.println(avg);
    }


}
