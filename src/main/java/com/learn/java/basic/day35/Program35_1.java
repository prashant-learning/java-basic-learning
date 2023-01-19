package com.learn.java.basic.day35;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Program35_1 {

    public static void main(String[] args) throws JsonProcessingException {

        String jsonInput = "{\"empId\":32534653,\"empName\":\"Ravi\",\"empManagerId\":345,\"empSalary\":34567.45,\"empAge\":34,\"manager\":false}";

        ObjectMapper objectMapper = new ObjectMapper();

        EmployeeDup emp =  objectMapper.readValue(jsonInput, EmployeeDup.class);

        System.out.println(emp.getEmpId());
    }
}
