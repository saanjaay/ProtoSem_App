package com.example.divya.business;

public class User {
    public String name,email,password;
    public User()
    {

    }
    public User(String name,String email,String password)
    {
        this.name=name;
        this.email=email;
        this.password=password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
}
