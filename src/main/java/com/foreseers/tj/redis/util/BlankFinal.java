package com.foreseers.tj.redis.util;

public class BlankFinal {

	
    private final int i = 9;
    private final int j;
    private final useDemo ud;
    public BlankFinal(){
        j = 1;
        ud = new useDemo(10);
    }
    public BlankFinal(int x){
        j = 2;
        ud = new useDemo(x);
    }
    public static void main(String[] args){
        new BlankFinal();
        new BlankFinal(55);
            }

}
