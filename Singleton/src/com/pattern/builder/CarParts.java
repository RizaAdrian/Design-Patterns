package com.pattern.builder;

public class CarParts {

    public static class Builder{
        private String brakes;
        private String engine;
        private String transmission;
        private String gearbox;

        public Builder(){

        }
        public CarParts build(){
            return new CarParts(this);
        }
        public Builder brakes(String brakes){
            this.brakes = brakes;
            return this;
        }
        public Builder engine(String engine){
            this.engine = engine;
            return this;
        }
        public Builder transmission(String transmission){
            this.transmission = transmission;
            return this;
        }
        public Builder gearbox(String gearbox){
            this.gearbox = gearbox;
            return this;
        }
    }

    private final String brakes;
    private final String engine;
    private final String transmission;
    private final String gearbox;

    private CarParts(Builder builder){
        this.brakes = builder.brakes;
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.gearbox = builder.gearbox;
    }

    public String getBrakes() {
        return brakes;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getGearbox() {
        return gearbox;
    }
}
