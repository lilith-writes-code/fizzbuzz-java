package com.venison;

public class MainExecutor {

    private WriteStuff writer;
    private FizzBuzz fizz;

    public MainExecutor(WriteStuff writer, FizzBuzz fizzBuzz){
        this.writer = writer;
        this.fizz = fizzBuzz;
    }
    public void execute() {
        writer.Write(fizz.buzz());
    }
}

