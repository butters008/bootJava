package com.teksystem.SoftwareClub;

public class ClubMember {
    private String name;
    private String city;
    private String state;
    private String language;

    public ClubMember() { }

    public ClubMember(String name, String city, String state, String language) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "ClubMember{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
