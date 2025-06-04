package com.example.system_version_1;

public class Patient {
    private String name;
    private int age ;
    private String gender;
    private String address;

    private String diseasesType;

    public Patient(){}

    public Patient(String name, int age, String gender, String address, String diseasesType){
        this.name= name;
        this.age = age ;
        this.gender = gender;
        this.address = address;
        this.diseasesType = diseasesType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setDiseasesType(String diseasesType){
        this.diseasesType = diseasesType;
    }
    public String getDiseasesType(){
        return diseasesType;
    }
}
