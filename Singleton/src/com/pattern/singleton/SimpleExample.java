package com.pattern.singleton;

public class SimpleExample {
    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();

        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();

        System.out.println(anotherInstance);

        if(singletonRuntime == anotherInstance){
            System.out.println("they are the same");
        }
    }
}
