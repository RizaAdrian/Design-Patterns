package com.pattern.abstract_factory.model;

import com.pattern.abstract_factory.contract.MediorProgrammerService;

public class MediorProgrammer implements MediorProgrammerService {
    @Override
    public void programmingSkills() {
        System.out.println("Independent programmer that doesn't need help");
    }
}
