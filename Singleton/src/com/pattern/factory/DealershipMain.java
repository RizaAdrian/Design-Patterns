package com.pattern.factory;

public class DealershipMain {

    public static void main(String[] args){
        DealershipWebsite dealershipWebsite = DealershipFactory.getDelearshipWebsite(DealershipOption.SERVICE);

        System.out.println(dealershipWebsite.getDealerships());

        DealershipWebsite shopDealershipWebsite = DealershipFactory.getDelearshipWebsite(DealershipOption.SHOP);

        System.out.println(shopDealershipWebsite.getDealerships());
    }
}
