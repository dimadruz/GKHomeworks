import java.security.spec.RSAOtherPrimeInfo;

public class Lesson2 {
    // Задание 1
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
    // Задание 2
    public static void foo(){
        int [] arr = new int[8];
        for (int i = 0;i<arr.length;i++){
            arr[i] = i * 3;
            System.out.println(arr[i]);

        }
    }
    //Задание 3
    public static void bar(){
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for ( int i = 0; i<arr.length;i++){
            if(arr[i]<6){
                System.out.print(arr[i] * 2 + " ");
            }
        }
    }
    // задание 4
    public static void fillDiagonal() {
        int [][] arr = new int[4][4];
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[i].length;j ++){
                if ( i== j || j == arr[i].length - 1 - i){
                    arr [i][j]= 1;
                }
                System.out.println(arr[i][j] + "");
            }
            System.out.println();
        }
    }
    // Задание 5
    public static void MaxMinValue(){
        int[] arr = {2, 6, 7, 15, 35, 12, 16, 22};
        int minValue = arr[0];
        int maxValue = arr [0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];


            }

        }
        System.out.print(minValue + " ");
        for ( int i = 0; i < arr.length; i++){
            if (arr [i]> maxValue){
                maxValue = arr [i];
            }
        }
        System.out.println(maxValue);
    }
}













