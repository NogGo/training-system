package ru.my.test.helpers;

@FunctionalInterface
public interface FunInter3 {

    Double Diskr(Double a, Double b, Double c);

    default public void sout(String s){
        System.out.println("OUT: " + s);
    }
}
