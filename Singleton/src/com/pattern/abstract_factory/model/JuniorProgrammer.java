package com.pattern.abstract_factory.model;

import com.pattern.abstract_factory.contract.JuniorProgrammerService;

public class JuniorProgrammer implements JuniorProgrammerService {
    @Override
    public void programmingSkills() {
        System.out.println("I'm here absorb information so that i can grow.");
    }
}
