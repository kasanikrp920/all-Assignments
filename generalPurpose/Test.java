package com.trimindtech.training.generalPurpose;

public class Test {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        {
            Singleton s= Singleton.getInstance();
            System.out.println(s);
        }
    }
}
