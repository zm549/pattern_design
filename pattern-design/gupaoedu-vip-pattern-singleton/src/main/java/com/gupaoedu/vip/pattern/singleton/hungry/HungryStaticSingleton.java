package com.gupaoedu.vip.pattern.singleton.hungry;

/**
 * Created by Tom.
 */

//饿汉式静态块单例
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){
       System.out.println("11");
    }
    public static HungryStaticSingleton getInstance(){
        return  hungrySingleton;
    }
}
