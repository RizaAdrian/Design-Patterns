package com.pattern.abstract_factory.contract;

public interface AbstractFactory {

    SeniorProgrammerService getSeniorProgrammer();

    MediorProgrammerService getMediorProgrammer();

    JuniorProgrammerService getJuniorProgrammer();

}
