package com.company.calender;

import java.util.Scanner;

public class Prompt {

    private final static String YEAR="year>";
    private final static String MONTH="month>";


    public void runPrompt() {
        Calender cal = new Calender();
        Scanner scanner = new Scanner(System.in);
        int month, year;
        while (true) {
            System.out.println(YEAR);
            year = scanner.nextInt();
            System.out.println(MONTH);
            month = scanner.nextInt();
            if (month == -1) break;
            if (month > 12) continue;
            cal.printSimpleCalender(year,month);
        }
    }
    public static void main(String[] args){
        Prompt p=new Prompt();
        p.runPrompt();
    }
}
