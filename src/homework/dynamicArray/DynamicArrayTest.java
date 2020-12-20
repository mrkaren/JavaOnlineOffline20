package homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(20);
        dynamicArray.add(2);
        dynamicArray.add(28);
        dynamicArray.add(30);
        dynamicArray.add(10);
        dynamicArray.add(16);
        dynamicArray.add(18);
        dynamicArray.print();
//        dynamicArray.deleteByIndex(2);
        System.out.println();
//        dynamicArray.print();

        int[] result = dynamicArray.subArray(2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }


    }
}
