package com.company.calender;

import java.util.Scanner;

public class Calender {
    private static final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
    private static final int[] LEAP_MAX_DAYS= {31,29,31,30,31,30,31,31,30,31,30,31};
    public boolean isLeapYear(int year)
    {
        if(year%4==0 && (year %100!=0|| year%400==0))
            return true;
        else return false;
    }
    public int getMaxDaysOfMonth(int year,int month){
        if(isLeapYear(year)==true)
            return LEAP_MAX_DAYS[month-1];
        return MAX_DAYS[month-1];
    }
    public int getDaysofMonth(int year, int month){
        int day=0;
        if(isLeapYear(year)==true){
            for(int i=0; i<month-1; i++)
                day+=LEAP_MAX_DAYS[i];
        }
        else{
            for(int i=0; i<month-1; i++)
                day+=MAX_DAYS[i];
        }
        return day;
    }
    public void printSimpleCalender(int year, int month){
        System.out.println("< "+ year + " 년 " + month+ " 월 >");
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println("----------------------");
        int maxDay=getMaxDaysOfMonth(year,month);
        int numofLeapyear, numofCommonyear,numofDay, weekday;
        year--;
        numofLeapyear=((year/400)*97 + (year%400)/4);
        numofCommonyear=year-numofLeapyear;
        numofDay=numofLeapyear*366+ numofCommonyear*365;
        numofDay+=getDaysofMonth(year,month);
        numofDay%=7;
        for(int i=0; i<numofDay; i++){
            System.out.print("   ");
        }
        //print blank space
        for(int i=1; i<=maxDay; i++){
            System.out.printf("%3d", i);
            if((numofDay+i)%7==0) System.out.println();
        }
        System.out.println();
//        System.out.println(" 1  2  3  4  5  6  7");
//        System.out.println(" 8  9 10 11 12 13 14");
//        System.out.println("15 16 17 18 19 20 21");
//        System.out.println("22 23 24 25 26 27 28");
    }

    public static void main(String[] args){
        Calender cal= new Calender();
        Prompt prompt=new Prompt();
        prompt.runPrompt();
    }
}
