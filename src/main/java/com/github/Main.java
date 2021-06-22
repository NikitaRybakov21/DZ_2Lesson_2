package com.github;

public class Main {
    public static void main(String[] args){
        array01();
        arrayInt();
        arrayInt2();
        array2D();
        minMax();
        boolean bool = checkBalance( new int[] {5,5,1,1,8,4} );
        arrayShift( new int[] {1,2,3,4,5,6,7,8,9,10}, 1);
    }
    static void array01(){
        int[] arr = {1,0,1,0,1,1,1,0,1};

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 1) {arr[i] = 0;}
            else {arr[i] = 1;}
        }
    }
    static void arrayInt(){
        int[] arr = new int[8];

        for(int i = 0; i<arr.length; i++){
            arr[i] = i*3;
        }
    }
    static void arrayInt2(){
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < 6) {arr[i] = arr[i]*2;}
        }
    }
    static void array2D(){
        int[][] arr = new int[5][5];

        for(int i = 0; i<arr.length; i++){
            arr[i][i] = 1;
            arr[-i+4][i] = 1;
        }
        for(int j = 0; j<arr.length; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void minMax(){
        int[] arr = {52,7,6,11,44,20,84,23};
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max) {max = arr[i];}
            if(arr[i] < min) {min = arr[i];}
        }
    }
    static boolean checkBalance(int[] arr){
        int SumRight = 0;
        int SumLeft = 0;

        for(int i = 0; i<arr.length; i++){
            SumRight = SumRight + arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            if(SumLeft == SumRight){return true;}
            SumLeft = SumLeft + arr[i];
            SumRight = SumRight - arr[i];
        }
        return false;
    }
    static void arrayShift(int[] arr, int n){
        int save;
        int X;
        n = -2;

        if(n > 0) {
            for (int j = 0; j < n; j++) {
                X = arr[arr.length - 1];
                for (int i = 0; i < arr.length; i++) {
                    save = arr[i];
                    arr[i] = X;
                    X = save;
                }
            }
        }
        if(n < 0) {
            for (int j = 0; j < (-1 * n); j++) {
                X = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    save = arr[arr.length - i - 1];
                    arr[arr.length - i - 1] = X;
                    X = save;
                }
            }
        }

        for(int j = 0; j < 10; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
