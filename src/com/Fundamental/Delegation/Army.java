package com.Fundamental.Delegation;


public class Army implements DoWork {
    private DoWork worker = new General();

    @Override
    public String diggingAPit() {
        String work = worker.diggingAPit();

        return "Army worked on this.\n"+work;
    }
}
