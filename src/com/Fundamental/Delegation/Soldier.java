package com.Fundamental.Delegation;

public class Soldier implements DoWork {
    @Override
    public String diggingAPit() {
        return "Soldier made it!";
    }
}
