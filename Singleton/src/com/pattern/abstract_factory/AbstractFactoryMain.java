package com.pattern.abstract_factory;

import com.pattern.abstract_factory.contract.AbstractFactory;
import com.pattern.abstract_factory.model.SeniorProgrammer;

public class AbstractFactoryMain {
    private static final String STATUS = "Senior";
    public static void main(String[] args){
        AbstractFactory abstractFactory = getProgrammers();

        abstractFactory.getSeniorProgrammer().programmingSkills();
        abstractFactory.getMediorProgrammer().programmingSkills();

    }

    private static AbstractFactory getProgrammers(){
        if("Senior".equals(STATUS)){
            return new ProgrammerFactory();
        } else if("Medior".equals(STATUS)){
            return new ProgrammerFactory();
        }else{
            return new ProgrammerFactory();
        }
    }
}
