package com.pattern.adapter;

import com.pattern.adapter.service.DeveloperService;
import com.pattern.adapter.service.DeveloperServiceDBImpl;

import java.util.ArrayList;
import java.util.List;

public class Developer {

    public List<DeveloperService> getDevList(){

        List<DeveloperService> developerServices = new ArrayList<>();

        DeveloperService developerService = new DeveloperServiceDBImpl("1","CuPar","FaraPar","cupar_farapar@yahoo.com","C#");

        developerServices.add(developerService);

        DeveloperOG developerOG = new DeveloperOG("#1","Alber","Jojo","something@hotmail.com","C");

        developerServices.add(new DeveloperAdapterOG(developerOG));

        return developerServices;
    }
}
