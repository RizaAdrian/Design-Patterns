package com.pattern.abstract_factory;

import com.pattern.abstract_factory.contract.AbstractFactory;
import com.pattern.abstract_factory.contract.JuniorProgrammerService;
import com.pattern.abstract_factory.contract.MediorProgrammerService;
import com.pattern.abstract_factory.contract.SeniorProgrammerService;
import com.pattern.abstract_factory.model.JuniorProgrammer;
import com.pattern.abstract_factory.model.MediorProgrammer;
import com.pattern.abstract_factory.model.SeniorProgrammer;

public class ProgrammerFactory implements AbstractFactory {
    @Override
    public SeniorProgrammerService getSeniorProgrammer() {
        return new SeniorProgrammer();
    }

    @Override
    public MediorProgrammerService getMediorProgrammer() {
        return new MediorProgrammer();
    }

    @Override
    public JuniorProgrammerService getJuniorProgrammer() {
        return new JuniorProgrammer();
    }
}
