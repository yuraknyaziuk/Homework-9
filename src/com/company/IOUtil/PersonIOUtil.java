package com.company.IOUtil;

import com.company.Address;
import com.company.Excepction.EmptySourceFileException;

import com.company.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonIOUtil {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public PersonIOUtil(String fileName) {
        this.fileName = fileName;
    }
    //Создайте в классе PersonIOUtil статический метод writePersons, который принимает 2 аргумента: название файла и коллекцию обsъектов класса Person. Реализуйте логику записи объектов Person в файл в этом методе
    //Создайте в классе PersonIOUtil статический метод readPersons, который принимает 1 аргумент - название файла и возвращает коллекцию объектов Person. Реализуйте логику чтения из файла и построения объектов Person в этом методе. Если файл не существует или пустой, генерируйте исключение EmptySourceFileException

    public static void writePersons(String fileName, List<Person> list) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Person persons : list
            ) {
                writer.write(persons.toString());

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> readPersons(String fileName) throws IOException, EmptySourceFileException {
        List<Person> persons = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String txtString;


            while ((txtString = br.readLine()) != null) {

                Person person = PersonIOUtil.toObject(txtString);

                persons.add(person);

            }
        } catch (EmptySourceFileException ex) {
            ex.printStackTrace();
        }catch(FileNotFoundException e){
            String errorMassage = "File not found!";
            throw new EmptySourceFileException(errorMassage);        }


        return persons;

    }

    public static Person toObject(String txtString) throws EmptySourceFileException {

        String[] dataArray = txtString.split(";");
        if (dataArray.length != 5) {
            String errorMessage = "File is empty!";
            throw new EmptySourceFileException(errorMessage);
        }

        String firstName = dataArray[0];
        String lastName = dataArray[1];
        Address address = new Address(dataArray[2], dataArray[3], Integer.parseInt(dataArray[4]));


        return new Person(firstName, lastName, address);
    }


}

