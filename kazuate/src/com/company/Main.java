package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int randomValue = random.nextInt(100);


        for (int i = 1; i < 6; i++) {
            System.out.println(i + "回目の数を入力してください");
            int inputValue = Utils.input_int();


            if (randomValue == inputValue) {
                System.out.println("当たり");
                break;
            } else if (randomValue > inputValue) {
                System.out.println("入力された値は設定された数より小さいです");
            } else {
                System.out.println("入力された値は設定された数より大きいです");
            }

            if (Math.abs(randomValue - inputValue) > 20) {
                System.out.println("20以上の差があります");
            }
        }

    }
}
