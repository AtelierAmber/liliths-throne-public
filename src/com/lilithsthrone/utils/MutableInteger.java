package com.lilithsthrone.utils;

public class MutableInteger {
    private int value;

    public MutableInteger(int i){
        value = i;
    }

    public void inc(){
        ++value;
    }
    public void add(int i){
        value += i;
    }
    public int value(){
        return value;
    }
}
