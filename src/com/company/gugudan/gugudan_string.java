package com.company.gugudan;

import java.util.Scanner;

public class gugudan_string {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String inputValue= scanner.nextLine();

        String[] splitedValue=inputValue.split(",");

        int first=Integer.parseInt(splitedValue[0]);
        int second=Integer.parseInt(splitedValue[1]);

//        for(int i=2; i<=first; i++){
//            for(int j=1; j<=second; j++){
//                System.out.println(i + "*" + j + "=" + j * i);
//            }
//        }
        for(int j=2; j<=first; j++){
            int[] result=Main.calculate2(j,second);
            Main.print(result);
        }
    }





}
