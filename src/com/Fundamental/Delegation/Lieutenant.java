package com.Fundamental.Delegation;

public class Lieutenant implements DoWork{
    private DoWork worker = new Sergeant();

    @Override
    public String diggingAPit() {
        String work = worker.diggingAPit();

        return "Lieutenant worked on this.\n"+work;
    }
}
