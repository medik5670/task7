package com.company;

public class Main {

    public static void main(String[] args) {
        int amount = 100;
        int checksum = 1000;
        int refill;
        int bonus;
        int itog;

        refill = 1200;

        if (refill > checksum) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        itog = amount + bonus + refill;
        System.out.println("Баланс:" + itog);
        System.out.println("Количество бонусных рублей:" + bonus);
    }

}
