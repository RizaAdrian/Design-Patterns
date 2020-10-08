package com.pattern.adapter;

import com.pattern.adapter.service.DeveloperService;

import java.util.List;

public class AdapterPatternMain {

    public static void main(String[] args){
        Developer developer = new Developer();
        List<DeveloperService> developers = developer.getDevList();

        System.out.println(developers);
    }
}
