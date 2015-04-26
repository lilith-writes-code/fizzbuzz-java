package com.venison;

public class MainExecutor {

    private WriteStuff writer;

    public MainExecutor(WriteStuff writer){
        this.writer = writer;
    }
    public void execute() {
        writer.Write("");
    }
}

