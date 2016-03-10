package com.Fundamental.Delegation;

public class Colonel implements DoWork {
    private DoWork worker = new Major();

    @Override
    public String diggingAPit() {
        String work = worker.diggingAPit();

        return "Colonel worked on this.\n"+work;
    }
}