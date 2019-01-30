package ru.my.test;

@FunctionalInterface
public interface FunInter3 {

    Double Diskr(Double a, Double b, Double c);

    default public void sout(){
        System.out.println("Hello!!!!");
    }
}
