package com.pattern.singleton;

public class SingletonLazyVersion {
    //** Added volatile to make it thread safe
    private static volatile SingletonLazyVersion instance = null;

    private SingletonLazyVersion(){
        // added the check to ensure that u can't use reflection
        if(instance != null){
            throw new RuntimeException("use getInstance");
        }
    }

    public static SingletonLazyVersion getInstance(){
        if(instance == null){
            // to not have multiple thread accessing our singleton
            synchronized (SingletonLazyVersion.class) {
              if(instance == null){
                instance = new SingletonLazyVersion();
              }
            }
        }
        return instance;
    }
}
