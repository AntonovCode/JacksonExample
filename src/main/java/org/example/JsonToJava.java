package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class JsonToJava {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Person> persons = mapper.readValue(new FileReader("output.json"), new TypeReference<>() {});

        persons.stream().forEach(person -> {
            System.out.println(person.getLastname() + " " + person.getFirstname());

            String phones = person.getPhones().stream()
                    .map(phoneInfo -> phoneInfo.toString())
                    .collect(Collectors.joining(", "));

            System.out.println("Телефоны: " + phones);
            System.out.println("Адреса:");
            person.getAddresses().stream().forEach(System.out::println);
            System.out.println();
        });
    }
}
