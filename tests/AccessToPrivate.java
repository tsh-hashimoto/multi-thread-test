package tests;

import lib.MTBase;
import java.lang.reflect.Field;

public class AccessToPrivate {
    public static void main(String[] args) throws Exception {
        Field pri_reflect = MTBase.class.getDeclaredField("pri");
        pri_reflect.setAccessible(true);  // リフレクションでアクセス

        ThreadLocal<Integer> pri = (ThreadLocal<Integer>) pri_reflect.get(null);

        System.out.println(pri.get());
    }
}
