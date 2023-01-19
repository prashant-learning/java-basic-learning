package com.learn.java.basic.day35;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Program35 {

    public static void main(String[] args) throws JsonProcessingException {


        Address address1 = new Address("Apartment name ABC", "High tension road", "kondapur", "hyderabad", "Telengana", 500032);
        Address address2 = new Address("Apartment name XYZ", "Low tension road", "kondapur", "hyderabad", "Telengana", 500032);
        Address address3 = new Address("Apartment name Alpha", "Med tension road", "kondapur", "hyderabad", "Telengana", 500032);


        Employee employee = new Employee(123,
                "Ravi",
                345,
                34567.45d,
                34,
                false,
                List.of(address1, address2, address3)
        );


        ObjectMapper objectMapper = new ObjectMapper();

        String employeeJsonString = objectMapper.writeValueAsString(employee);

        System.out.println(employeeJsonString);

    }
}
