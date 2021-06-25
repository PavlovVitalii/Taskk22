package com.company;

public class Fibonachi extends Thread{

    @Override
    public void run() {
        int n0 = 1;
        int n1 = 1;
        int n2;
        int n = 6;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= n; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }
}
