package com.venison;

public class FizzBuzz {
    private int upper;
    private int lower;
    private final String ModThreeToken = "Fizz";
    private final String ModFiveToken = "Buzz";
    private final String SequenceDelimiter = ",";
    private final int buzzValue = 5;
    private int fizzValue = 3;

    public FizzBuzz(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public String buzz(){
        StringBuilder builder = new StringBuilder();
        for(int i=lower; i<=upper;i++){
            if(!firstTimeThrough(i)){
                builder.append(SequenceDelimiter);
            }
            if(IsFizzBuzz(i)){
                builder.append(ModThreeToken);
                builder.append(ModFiveToken);
            }else if(IsFizz(i)){
                builder.append(ModThreeToken);
            }else if(IsBuzz(i)){
                builder.append(ModFiveToken);
            }else{
                builder.append(i);
            }
        }
        return builder.toString();
    }

    private boolean IsFizzBuzz(int i) {
        return IsFizz(i) && IsBuzz(i);
    }

    private boolean firstTimeThrough(int i) {
        return i<=lower;
    }

    private boolean IsBuzz(int i) {
        return IsMod(i, buzzValue);
    }

    private boolean IsFizz(int i) {
        return IsMod(i, fizzValue);
    }

    private boolean IsMod(int value, int mod){
        return (value % mod ) == 0;
    }
}
