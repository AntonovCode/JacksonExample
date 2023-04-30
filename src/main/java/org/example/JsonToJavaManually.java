package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class JsonToJavaManually {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(new FileReader("person.json"), new TypeReference<>() {});

        System.out.println(person.getLastname() + " " + person.getFirstname());

        String phones = person.getPhones().stream()
                .map(phoneInfo -> phoneInfo.toString())
                .collect(Collectors.joining(", "));

        System.out.println("Телефоны: " + phones);
    }
}
