public class Lesson1 {
    // Задание 1.
    public static void main(String[] args) {
        // Задание 3
        float a = 5;
        float b = 4;
        float c = 6;
        float d = 7;
        float val = bar(a = 5, b = 4, c = 6, d = 7);
        bar(a, b, c, d);
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
        String str = "Курс Java";


    }

    //Задание 3
    public static float bar(float a, float b, float c, float d) {

        float val = a * (b + (c / d));
        return val;

    }

    //Задание 4
    public static boolean task10and20( int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {


        }
        return true;
    }

    //Задание 5
    public static void bar(int j) {
        int k = j / 2;
        int l = j % 2;
        System.out.println(l);
        if (l != 0) {

        }
    }

    //Задание 6
    public static boolean six(int a, int b) {
        int c = a - b;
        System.out.println(c);
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

    //Задание 8

}
