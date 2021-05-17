package com.company;

import com.company.Excepction.EmptySourceFileException;
import com.company.Excepction.NullFieldException;
import com.company.IOUtil.PersonIOUtil;
import com.company.constant.IOConstants;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Создайте новый проект, залинкуйте его с удаленным репозиторием на GitHub, добавьте файл .gitignore и сделайте коммит (без .gitignore домашка не принимается)
        //Создайте класс Address с тремя полями: город, улица и номер дома (числом). Все поля должны быть с модификатором private. Конструктор со всеми полями класса. Создайте геттеры и сеттеры для каждого поля
        //Создайте класс Person с тремя полями: имя, фамилия и адрес. Поле адрес должно быть типа Address, которое создали в пункте 2. Конструктор со всеми полями класса. Создайте геттеры и сеттеры для каждого поля. Переопределите метод toString()
        //Создайте свое непроверяемое исключение NullFieldException с конструктором, который принимает сообщение об ошибке
        //При попытке любому из полей класса Person задать значение null выбрасывайте исключение NullFieldException
        //Создайте свое проверяемое исключение EmptySourceFileException с конструктором, который принимает сообщение об ошибке
        //Создайте 3 экземпляра класса Person и выведите их на консоль
        //Создайте класс PersonIOUtil
        //Создайте в классе PersonIOUtil статический метод writePersons, который принимает 2 аргумента: название файла и коллекцию объектов класса Person. Реализуйте логику записи объектов Person в файл в этом методе
        //С помощью PersonIOUtil запишите в файл созданные экземпляры класса Person
        //Создайте в классе PersonIOUtil статический метод readPersons, который принимает 1 аргумент - название файла и возвращает коллекцию объектов Person. Реализуйте логику чтения из файла и построения объектов Person в этом методе. Если файл не существует или пустой, генерируйте исключение EmptySourceFileException
        //С помощью PersonIOUtil прочитайте файл и сгенерируйте коллекцию объектов Person. Выведите ее в консоль
        //Залить код в репозиторий и отправить ссылку на репозиторий преподавателю

//        Address address = null;
//        Address address2 = new Address("Minsk", "Gaya", 14);
//        Address address3 = new Address("Minsk", "Gaya", 10);
//        Address address4 = new Address("Minsk", "Pushkina", 139);
//        Person person = new Person("Vsav", "Dfav", address4);
//        Person person2 = new Person("Vanhalsing", "Sveta", address2);
//        Person person3 = new Person("Ford", "Suslik", address3);
//        List<Person>persons = new ArrayList<>();
//        persons.add(person);
//        persons.add(person2);
//        persons.add(person3);
//        for (Person personss:persons
//             ) {
//            System.out.println(personss);
//
//        }
//        PersonIOUtil.writePersons(IOConstants.FILENAME,persons);

        PersonIOUtil personReader = new PersonIOUtil(IOConstants.FILENAME);
        try {

            List<Person> persons = personReader.readPersons(IOConstants.FILENAME);


            System.out.print(persons);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (EmptySourceFileException ex){
            ex.printStackTrace();
        }
//
//




    }

}
