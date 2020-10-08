package com.pattern.adapter;

import com.pattern.adapter.service.DeveloperService;

public class DeveloperAdapterOG implements DeveloperService {
    private DeveloperOG instanceDeveloperOG;
    public DeveloperAdapterOG(DeveloperOG instanceDeveloperOG) {
        this.instanceDeveloperOG = instanceDeveloperOG;
    }

    @Override
    public String getId() {
        return instanceDeveloperOG.getCnp();
    }

    @Override
    public String getFirstName() {
        return instanceDeveloperOG.getGivenName();
    }

    @Override
    public String getLastName() {
        return instanceDeveloperOG.getSurName();
    }

    @Override
    public String getEmail() {
        return instanceDeveloperOG.getMail();
    }

    @Override
    public String getTechnology() {
        return instanceDeveloperOG.getLegacy();
    }
}
