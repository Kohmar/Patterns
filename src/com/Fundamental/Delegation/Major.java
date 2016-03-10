package com.Fundamental.Delegation;


public class Major implements DoWork {
    private DoWork worker = new Captain();

    @Override
    public String diggingAPit() {
        String work = worker.diggingAPit();

        return "Major worked on this.\n"+work;
    }
}
