package com.venison;

public class FizzBuzz {
    private int upper;
    private int lower;
    private final String ModThreeToken = "Fizz";
    private final String ModFiveToken = "Buzz";
    private final String SequenceDelimiter = ",";

    public FizzBuzz(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public String buzz(){
        StringBuilder builder = new StringBuilder();
        for(int i=lower; i<=upper;i++){
            if(i>lower){
                builder.append(SequenceDelimiter);
            }
            if((i % 3) == 0 && (i % 5 )== 0){
                builder.append(ModThreeToken);
                builder.append(ModFiveToken);
            }else if((i % 3) == 0){
                builder.append(ModThreeToken);
            }else if((i % 5) == 0){
                builder.append(ModFiveToken);
            }else{
                builder.append(i);
            }
        }
        return builder.toString();
    }
}
