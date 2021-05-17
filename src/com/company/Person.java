package com.company;

import com.company.Excepction.NullFieldException;

public class Person {
    //Создайте класс Person с тремя полями: имя, фамилия и адрес. Поле адрес должно быть типа Address, которое создали в пункте 2. Конструктор со всеми полями класса. Создайте геттеры и сеттеры для каждого поля. Переопределите метод toString()
    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) throws NullFieldException {

        if (firstName != null && lastName != null && address != null) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
        } else {
            throw new NullFieldException("Person have Null Field ");
        }
    }




            public String getFirstName () {
                return firstName;
            }

            public void setFirstName (String firstName){
                this.firstName = firstName;
            }

            public String getLastName () {
                return lastName;
            }

            public void setLastName (String lastName){
                this.lastName = lastName;
            }

            public Address getAddress () {
                return address;
            }

            public void setAddress (Address address){
                this.address = address;
            }

            @Override
            public String toString () {
                return  firstName + ';'  + lastName + ';'  + address
                         + "\n";
            }

        }
