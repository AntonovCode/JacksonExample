package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class JavaToJsonManually {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        ObjectNode objectNode = mapper.createObjectNode();
        objectNode.put("lastname", "Петров");
        objectNode.put("firstname", "Игорь");

        ArrayNode phones = mapper.createArrayNode();
        ObjectNode phone1 = mapper.createObjectNode();
        phone1.put("phone", "8-900-000-00-00");
        phone1.put("isMain", true);
        ObjectNode phone2 = mapper.createObjectNode();
        phone2.put("phone", "8-900-000-00-01");
        phone2.put("isMain", false);
        phones.add(phone1);
        phones.add(phone2);

        objectNode.put("phones", phones);

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String result = mapper.writeValueAsString(objectNode);

        mapper.writeValue(new File("person.json"), objectNode);
        System.out.println(result);
    }
}
