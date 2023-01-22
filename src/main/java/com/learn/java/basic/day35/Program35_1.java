package com.learn.java.basic.day35;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

public class Program35_1 {

    public static void main(String[] args) throws JsonProcessingException {

        String jsonInput = "[{\"empId\":123,\"empName\":\"Ravi\",\"empManagerId\":345,\"empSalary\":34567.45,\"empAge\":34,\"addressList\":[{\"apartmentName\":\"Apartment name ABC\",\"roadName\":\"High tension road\",\"locality\":\"kondapur\",\"district\":\"hyderabad\",\"state\":\"Telengana\",\"pincode\":500032},{\"apartmentName\":\"Apartment name XYZ\",\"roadName\":\"Low tension road\",\"locality\":\"kondapur\",\"district\":\"hyderabad\",\"state\":\"Telengana\",\"pincode\":500032},{\"apartmentName\":\"Apartment name Alpha\",\"roadName\":\"Med tension road\",\"locality\":\"kondapur\",\"district\":\"hyderabad\",\"state\":\"Telengana\",\"pincode\":500032}],\"manager\":false}]";

        ObjectMapper objectMapper = new ObjectMapper();

        List<Employee> emp =  objectMapper.readValue(jsonInput, new TypeReference<List<Employee>>(){});

        System.out.println(emp.get(0).getAddressList());

        String json2ndInput = "{\"empId\":123,\"empName\":\"Ravi\",\"empManagerId\":345,\"empSalary\":34567.45,\"empAge\":34,\"manager\":false}";

        Map<String, String> myCustomMap = objectMapper.readValue(json2ndInput, new TypeReference<Map<String, String>>() {});

        System.out.println(myCustomMap);

    }
}
