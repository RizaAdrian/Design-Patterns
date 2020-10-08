package com.pattern.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class DealershipWebsite {

    protected List<Dealership> dealerships = new ArrayList<>();

    public List<Dealership> getDealerships(){
        return dealerships;
    }

    public DealershipWebsite(){
        this.createDealership();
    }

    public abstract void createDealership();
}
