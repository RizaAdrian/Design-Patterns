package com.pattern.adapter;

public class DeveloperOG {

    public String cnp;
    public String surName;
    public String givenName;
    public String mail;
    public String legacy;

    public DeveloperOG(String cnp, String surName, String givenName, String mail, String legacy) {
        this.cnp = cnp;
        this.surName = surName;
        this.givenName = givenName;
        this.mail = mail;
        this.legacy = legacy;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLegacy() {
        return legacy;
    }

    public void setLegacy(String legacy) {
        this.legacy = legacy;
    }
}
