package com.Fundamental.Delegation;


public class General implements DoWork {
    private DoWork worker = new Colonel();

    @Override
    public String diggingAPit() {
        String work = worker.diggingAPit();

        return "General worked on this.\n"+work;
    }
}