package com.company.gugudan;

public class GugudanMain {
    public static void main(String[] args){
        for( int i=2; i<10; i++){
            int []result=Main.calculate(i);
            System.out.println(result[i]);
        }
    }
}
