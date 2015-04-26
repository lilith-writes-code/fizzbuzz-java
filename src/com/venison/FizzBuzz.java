package com.venison;

public class FizzBuzz {
    private int upper;
    private int lower;

    public FizzBuzz(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public FizzBuzz() {

    }

    public String buzz(){
        StringBuilder builder = new StringBuilder();
        for(int i=lower; i<=upper;i++){
            if(i>lower){
                builder.append(",");
            }
            if((i % 3) == 0 && (i % 5 )== 0){
                builder.append("FizzBuzz");
            }else if((i % 3) == 0){
                builder.append("Fizz");
            }else if((i % 5) == 0){
                builder.append("Buzz");
            }else{
                builder.append(i);
            }

        }
        return builder.toString();
    }
}
