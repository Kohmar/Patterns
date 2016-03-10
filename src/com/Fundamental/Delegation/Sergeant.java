package com.Fundamental.Delegation;

public class Sergeant implements DoWork{
    private DoWork worker = new Soldier();

    @Override
    public String diggingAPit() {
        String work = worker.diggingAPit();

        return "Sergeant worked on this.\n"+work;
    }
}

