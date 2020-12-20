package homework;

public class CharExample {

    public static void main(String[] args) {
//        Ունենք հետևյալ մասիվը՝
//        char[] text = {' ', ' ',' ',' ', 'b', 'a', 'r', ' ',' ', 'e', 'v'};
//        Տվյալ օրինակում կարող ենք կամայական քանակի պռաբելներ դնել թե սկզբից թե վերջից չկենտրոնանաք որ երկու հատ է դրված։
//        Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։
//        int beginIndex = 0;
//        int endIndex = text.length - 1;
//        while (beginIndex < endIndex && text[beginIndex] == ' ') {
//            beginIndex++;
//        }
//
//        while (beginIndex < endIndex && text[endIndex] == ' ') {
//            endIndex--;
//        }
//        char[] result = new char[(endIndex - beginIndex) + 1];
//
//        int index = 0;
//        for (int i = beginIndex; i < endIndex + 1; i++) {
//            result[index++] = text[i];
//        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i]);
//        }

//        2) Ունենք հետևյալ մասիվը՝
//        char[] array = {'b', 'o', 'l', 'o', 'l', 'a'};
////        ունենք նաև մի սինվոլ՝
//        char c = 'o';
//        int count = 0;
////        Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == c) {
//                count++;
//            }
//        }
//        System.out.println("count of " + c);
//        System.out.println(count);
//        3) Ունենք հետևյալ մասիվը՝
//        char[] array = {'b', 'o', 'l', 'o', 'l', 'a'};
////        պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
//        int x = array.length;
//        System.out.print(array[(x / 2) - 1]);
//        System.out.print(array[x / 2]);
//        4) Ունենք հետևյալ մասիվը՝
//        char[] array = {'b', 'o', 'l', 'o', 'l', 'y'};
////        պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
//        if (array[array.length - 2] == 'l' && array[array.length - 1] == 'y') {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//        5) Ունենք հետևյալ մասիվը՝
//        char[] array = {'b', 'a', 'b', 'o', 'b', 'a'};
////Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
////օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false
//        boolean bobThere = false;
//        for (int i = 0; i < array.length - 2; i++) {
//            if (array[i] == 'b' && array[i + 2] == 'b') {
//                bobThere = true;
//            }
//        }
//        System.out.println(bobThere);
    }

}
