package com.company;
import java.util.Scanner;

public class Utils {

    public static String input(){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        return str;
    }
}
