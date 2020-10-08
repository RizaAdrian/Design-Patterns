package com.pattern.factory;

public class DealershipShop extends DealershipWebsite{

    @Override
    public void createDealership() {
        dealerships.add(new DealershipPage());
        dealerships.add(new DealershipAboutPage());
        dealerships.add(new DealershipRatingPage());
        dealerships.add(new DealershipAboutPage());
    }
}
