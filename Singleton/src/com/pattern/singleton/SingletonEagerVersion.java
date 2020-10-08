package com.pattern.singleton;

public class SingletonEagerVersion {
    //**
    // This is the eager version

    private static SingletonEagerVersion instance = new SingletonEagerVersion();

    private SingletonEagerVersion(){}

    public static SingletonEagerVersion getInstance(){
        return instance;
    }
}
