package homework;

public class ArrayExamples {

//        Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է գրենք կոդ, որը մեզ կտպի true եթե նշված թիվը կա վերևի մասիվի մեջ, եթե չկա false:
    void isExists(int[] array, int x) {
        boolean isExists = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                isExists = true;
            }
        }
        System.out.println(isExists);
    }

    public static void main(String[] args) {

        int[] array = {1, 44, 8, 20, 11, 6, 6, 44};


        int x = 44;
//        Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է գրենք կոդ, որը մեզ կտպի 44 թվի ինդեքսը մասիվի մեջ եթե կա, եթե չկա -1 կտպի։
//        int x = 44;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
            }
        }
        System.out.println(index);

//        Ունենք թիվ, օրինակ՝ int index = 4; ներքևում պետք է գրենք կոդ, որը կտպի տրված index - ինդեքսի մեջի արժեքը։

        index = 8;
        if (index >= 0 && index < array.length) {
            System.out.println(array[index]);
        } else {
            System.out.println("Please input another index");
        }

//        Գրեք կոդ, որը կգտնի մասիվի մեջի կրկնվող էլեմենտները, ու կտպի որ օրինակ 3-ը կրկնվում է։

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + " թիվը կրկնվում է");
                }
            }
        }


//        Սորտավորենք մեր ունեցած մասիվը մեծից փոքր։
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }


//        Սորտավորենք մեր ունեցած մասիվը փոքրից մեծ։
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

//        Գրեք կոդ, որը կտպի մասիվի մեջի երկրորդ ամենամեծ թիվը։
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        System.out.println(array[array.length - 2]);

        int max = array[0];
        int secMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                secMax = max;
                max = array[i];
            } else {
                if (array[i] != max && array[i] > secMax) {
                    secMax = array[i];
                }
            }
        }
        System.out.println(secMax);

    }
}
