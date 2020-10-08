package com.pattern.factory;

public class DealershipFactory {

    public static DealershipWebsite getDelearshipWebsite(DealershipOption service){
        switch (service){
            case SHOP:{
                return new DealershipShop();
            }
            case SERVICE:{
                return new DealershipService();
            }
            default:{
                return null;
            }
        }
    }
}
