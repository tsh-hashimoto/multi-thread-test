package tests;

import lib.MTBase;

public class AccessToProtected extends SubMTBase {
    public static void main(String[] args) {
        System.out.println(MTBase.pro.get());
    }
}
