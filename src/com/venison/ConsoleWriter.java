package com.venison;

public class ConsoleWriter implements WriteStuff {

    @Override
    public void Write(String someString) {
        System.out.println(someString);
    }
}
