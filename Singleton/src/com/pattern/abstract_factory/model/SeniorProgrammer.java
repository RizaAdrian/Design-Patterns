package com.pattern.abstract_factory.model;

import com.pattern.abstract_factory.contract.SeniorProgrammerService;

public class SeniorProgrammer implements SeniorProgrammerService {
    @Override
    public void programmingSkills() {
        System.out.println("Independent programmer that teaches others!");
    }
}
