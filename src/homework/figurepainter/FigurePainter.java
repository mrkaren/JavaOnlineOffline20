package homework.figurepainter;

public class FigurePainter {

    /**
     * Գրել կոդ, որը կպատկերի այս եռանկյունը։
     *      *
     *      * *
     *      * * *
     *      * * * *
     * */
    void figureOne(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    /**
     * Գրել կոդ, որը կպատկերի այս եռանկյունը։
     *
     *             *
     *           * *
     *         * * *
     *       * * * *
     *
     * */
    void figureTwo(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Գրել կոդ, որը կպատկերի այս եռանկյունը։
     *
     *       * * * *
     *       * * *
     *       * *
     *       *
     *
     * */
    void figureThree(int n){
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /**
     * Գրել կոդ, որը կպատկերի այս եռանկյունը։
     *
     *       * * * *
     *         * * *
     *           * *
     *             *
     *
     * */
    void figureFour(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    /**
     * Գրել կոդ, որը կպատկերի այս եռանկյունը։
     *
     *
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     * */
    void figureFive(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
