public class Lesson1 {
    // Задание 1.
    public static void main(String[] args) {

    }

    // Задание 2.
    public static void Main(String[] args) {

        byte b = 4;
        short s = 14;
        int i = 322;
        long l = 832L;
        float f = 3.2f;
        double d = 7.8;
        char c = 123;
        boolean bool = true;



    }

    //Задание 3
    public static float calculate(float a, float b, float c, float d) {

        float val = a * (b + (c / d));
        return val;

    }

    //Задание 4
    public static boolean task10and20( int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }
    //Задание 5
    public static void bar(int j) {
        if (j >= 0) {
            System.out.println(j + "Число положительное" );
        }else {
         System.out.println(j + "Отрицательное число" );
        }

    }


    //Задание 6
    public static boolean six(int c) {
        if (c > 0) {
        return false;
        } else if (c < 0) {

        }
        return true;
    }

    //Задание 7
    public static void seven(String Name) {
        System.out.println("Привет, Меня зовут Дима");
    }


}
