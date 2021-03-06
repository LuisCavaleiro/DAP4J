package de.hampager.dap4j.models;

public class User {

    private String name;
    private String hash_pass;
    private String mail;
    private Boolean admin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getHash_pass() {
        return hash_pass;
    }

    public void setHash_pass(String hash_pass) {
        this.hash_pass = hash_pass;
    }

    public User(String name, String mail, Boolean admin, String hash_pass) {
        this.name = name;
        this.mail = mail;
        this.admin = admin;
        this.hash_pass = hash_pass;
    }

    public User(String name, String mail, Boolean admin) {
        this.name = name;
        this.mail = mail;
        this.admin = admin;
    }
}