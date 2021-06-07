package MPE13.example;

import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex13 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is the principal amount? ");
        String strprin = in.nextLine();
        System.out.print("What is the rate? ");
        String strrate = in.nextLine();
        System.out.print("What is the number of years? ");
        String stryears = in.nextLine();
        System.out.print("What is the number of times the interest is compounded per year? ");
        String strcom = in.nextLine();

        //string convert
        int prin = Integer.parseInt(strprin);
        double rate = Double.parseDouble(strrate);
        int years = Integer.parseInt(stryears);
        int com = Integer.parseInt(strcom);

        //math
        double finrate = rate / 100;
        double subtot = prin * (1 + (finrate / com));
        double powtot = com * years;
        double total = Math.pow(subtot, powtot);

        //output
        System.out.println("$"+prin+" invested at "+rate+"% for "+years+ " years compounded "+com+" times per year is $"+String.format("%.2f", total)+".");
    }
    //main method end
}
//class end
