package com.company;

import java.util.Scanner;

public class Main {
    public static int[] calculate(int times){
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++)
            result[i] = times * (i + 1);
        return result;
    }
    public static int[] calculate2(int first, int second){
        int[] result = new int[second];
        for (int i = 0; i < second; i++)
            result[i] = first * (i + 1);
        return result;
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        // write your code her
        //for문으로 구구단
        System.out.println("출력할 구구단은?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        if(number<2 && number>9)
//            System.out.println("2이상 9이하의 값만 입력할 수 있습니다.");
//        for(int i=1; i<10; i++){
//            System.out.println(number + " * " + i + " = " + number*i);

        //배열로 구구단
//        int[] result = new int[9];
//        for (int i = 0; i < result.length; i++)
//            result[i] = 2 * (i + 1);
        int[] result=calculate(number);
        print(result);
    }
}
