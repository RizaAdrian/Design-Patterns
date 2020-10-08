package com.pattern;

import com.pattern.singleton.SingletonEagerVersion;
import com.pattern.singleton.SingletonLazyVersion;

public class Main {

    public static void main(String[] args) {

        // Singleton Eager version
        SingletonEagerVersion singletonEagerVersion = SingletonEagerVersion.getInstance();

        System.out.println(singletonEagerVersion);

       SingletonEagerVersion anotherInstance = SingletonEagerVersion.getInstance();

       System.out.println(anotherInstance);

       if(singletonEagerVersion ==  anotherInstance){
           System.out.println("They should have the same instance");
       }

       //Singleton Lazy version
        SingletonLazyVersion singletonLazyVersion = SingletonLazyVersion.getInstance();

       System.out.println(singletonLazyVersion);

       SingletonLazyVersion anotherLazyInstance =  SingletonLazyVersion.getInstance();

       System.out.println(anotherLazyInstance);

       if(singletonLazyVersion == anotherLazyInstance){
           System.out.println("Is good to be Lazy sometimes -- same instance");
       }

       // Builder factory
    }
}
