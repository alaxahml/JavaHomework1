package com.alexey.homework2;

public class Formula {
    public static void main(String[] args) {
        double g=4*Math.pow(java.lang.Math.PI,2)*Math.pow(Integer.parseInt(args[0]),3)
                /(Math.pow(Integer.parseInt(args[1]),2)*(Double.parseDouble(args[2])+Double.parseDouble(args[3])));
        System.out.println(g);
}
}
