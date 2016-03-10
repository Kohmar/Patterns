package com.Fundamental.Delegation;

public class Client {
    public static void main(String[] args) {
        DoWork prisident = new Army();
        String rezult = prisident.diggingAPit();
        System.out.println(rezult);
    }
}
