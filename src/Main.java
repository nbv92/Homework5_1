public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    static int[] arrayInt = new int[]{1, 2, 3};
    static double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
    static String[] arrayString = new String[]{"FOR ", "THE ", "EMPEROR!"};

    public static void task1() {
        System.out.println("Task1");
        //int[] arrayInt = new int[] { 1, 2, 3 };
        //double[] arrayDouble = new double[] { 1.57, 7.654, 9.986};
        //String[] arrayString = new String[] {"FOR ","THE ","EMPEROR!"};

    }

    public static void task2() {
        System.out.println("Task2\n");
        //int[] arrayInt = new int[] { 1, 2, 3 };
        //double[] arrayDouble = new double[] { 1.57, 7.654, 9.986};
        //String[] arrayString = new String[] {"FOR ","THE ","EMPEROR!"};
        for (int i = 0; i <= arrayInt.length; i++) {
            if (i == arrayInt.length - 1) {
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.printf(arrayInt[i] + ", ");

        }
        System.out.println("");
        for (int i = 0; i <= arrayDouble.length; i++) {
            if (i == arrayDouble.length - 1) {
                System.out.println(arrayDouble[i]);
                break;
            }
            System.out.print(arrayDouble[i] + ", ");
        }
        System.out.println("");
        for (int i = 0; i <= arrayDouble.length; i++) {
            if (i == arrayString.length - 1) {
                System.out.println(arrayString[i]);
                break;
            }
            System.out.print(arrayString[i] + ", ");
        }
        System.out.println("");
    }

    public static void task3() {
        System.out.println("Task3\n");
        //int[] arrayInt = new int[] { 1, 2, 3 };
        //double[] arrayDouble = new double[] { 1.57, 7.654, 9.986};
        //String[] arrayString = new String[] {"FOR ","THE ","EMPEROR!"};
        for (int i = arrayInt.length; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ", ");

        }
        System.out.println("");
        for (int i = arrayDouble.length; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayDouble[i]);
                break;
            }
            System.out.print(arrayDouble[i] + ", ");
        }
        System.out.println("");

        for (int i = arrayDouble.length; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayString[i]);
                break;
            }
            System.out.print(arrayString[i] + ", ");
        }
        System.out.println("");
    }

    public static void task4() {
        System.out.println("Task4");
        //int[] arrayInt = new int[] { 1, 2, 3 };

        for (int i : arrayInt) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i] += 1;
            }
            if (i == arrayInt.length - 1) {
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i]", ");
        }
    }

}
