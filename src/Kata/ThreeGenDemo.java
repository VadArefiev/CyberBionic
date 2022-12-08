package Kata;

import java.io.Serializable;

public class ThreeGenDemo<T extends String, K extends Number, V extends Animal&Serializable> {
    private T obt;
    private K obk;
    private V obv;

    public ThreeGenDemo(T obt, K obk, V obv) {
        this.obt = obt;
        this.obk = obk;
        this.obv = obv;
    }

    public T getObt() {
        return obt;
    }

    public K getObk() {
        return obk;
    }

    public V getObv() {
        return obv;
    }

    public void print() {
        System.out.println("T=" + obt.getClass().getName() + "K=" + obk.getClass().getName() + "V=" + obv.getClass().getName());
    }
}


