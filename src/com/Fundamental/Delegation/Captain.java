package com.Fundamental.Delegation;

public class Captain implements DoWork{
    private DoWork worker = new Lieutenant();

    @Override
    public String diggingAPit() {
        String work = worker.diggingAPit();

        return "Captain worked on this.\n"+work;
    }
}
