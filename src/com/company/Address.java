package com.company;

public class Address {
//    Создайте класс Address с тремя полями: город, улица и номер дома (числом). Все поля должны быть с модификатором private. Конструктор со всеми полями класса. Создайте геттеры и сеттеры для каждого поля,
private String city;
private String street;
private Integer number;

    public Address(String city, String street, Integer number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return   city + ";" + street + ";" + number ;
    }
}