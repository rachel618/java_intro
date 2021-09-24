package com.company.calender;

import java.util.Locale;
import java.util.Scanner;

public class Prompt {

    private final static String YEAR="year>";
    private final static String MONTH="month>";

    public void printMenu(){
        System.out.println("+----------------+");
        System.out.println("| 1. 일정 등록 ");
        System.out.println("| 2. 일정 검색 ");
        System.out.println("| 3. 달력 보기 ");
        System.out.println("| h.도움말  q.종료 ");
        System.out.println("+----------------+");
    }
    public int parseDay(String weekday){
        if(weekday.equals("SU")) return 0;
        else if(weekday.equals("MO")) return 1;
        else if(weekday.equals("TU")) return 2;
        else if(weekday.equals("WE")) return 3;
        else if(weekday.equals("TH")) return 4;
        else if(weekday.equals("FR")) return 5;
        else return 6;
    }

    public void runPrompt() {
        Calender cal = new Calender();
        Scanner scanner = new Scanner(System.in);

        while(true){
            printMenu();
            String cmd= scanner.next();
            if(cmd.equals("1"))
                cmdRegister();
            else if(cmd.equals("2"))
                cmdSearch();
            else if(cmd.equals("3"))
                cmdCal(scanner, cal);
            else if(cmd.equals("h"))
                printMenu();
            else
                break;
        }

        System.out.println("bye~");
    }

    private void cmdCal(Scanner scanner, Calender c) {
        int month, year, day;
        System.out.println(YEAR);
        year = scanner.nextInt();
        System.out.println(MONTH+"(exit: -1)");
        month = scanner.nextInt();
        if (month == -1 || month >= 12) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        c.printSimpleCalender(year,month);
    }

    private void cmdSearch() {
    }

    private void cmdRegister() {
    }

    public static void main(String[] args){
        Prompt p=new Prompt();
        p.runPrompt();
    }
}
