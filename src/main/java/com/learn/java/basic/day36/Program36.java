package com.learn.java.basic.day36;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program36 {

    public static void main(String[] args) throws JsonProcessingException {

        String employeeString  = "[{\"empId\":123,\"empName\":\"Ravi\",\"empManagerId\":345,\"empSalary\":34567.45,\"empAge\":34,\"addressList\":[{\"apartmentName\":\"Apartment name ABC\",\"roadName\":\"High tension road\",\"locality\":\"kondapur\",\"district\":\"hyderabad\",\"state\":\"Telengana\",\"pincode\":500032},{\"apartmentName\":\"Apartment name XYZ\",\"roadName\":\"Low tension road\",\"locality\":\"kondapur\",\"district\":\"hyderabad\",\"state\":\"Telengana\",\"pincode\":500032},{\"apartmentName\":\"Apartment name Alpha\",\"roadName\":\"Med tension road\",\"locality\":\"kondapur\",\"district\":\"hyderabad\",\"state\":\"Telengana\",\"pincode\":500032}],\"manager\":false}]";

        ObjectMapper objectMapper = new ObjectMapper();
        List<Employee> employeeList = objectMapper.readValue(employeeString, new TypeReference<List<Employee>>() {});

        System.out.println(employeeList.get(0).getAddressList().size());


        String employee  = "{\"empId\":123,\"empName\":\"Ravi\",\"empManagerId\":345,\"empSalary\":34567.45,\"empAge\":34,\"addressList\":[{\"apartmentName\":\"Apartment name ABC\",\"roadName\":\"High tension road\",\"locality\":\"kondapur\",\"district\":\"hyderabad\",\"state\":\"Telengana\",\"pincode\":500032},{\"apartmentName\":\"Apartment name XYZ\",\"roadName\":\"Low tension road\",\"locality\":\"kondapur\",\"district\":\"hyderabad\",\"state\":\"Telengana\",\"pincode\":500032},{\"apartmentName\":\"Apartment name Alpha\",\"roadName\":\"Med tension road\",\"locality\":\"kondapur\",\"district\":\"hyderabad\",\"state\":\"Telengana\",\"pincode\":500032}],\"manager\":false}";

        Employee employee1 = objectMapper.readValue(employee, new TypeReference<Employee>(){});

        System.out.println(employee1.getAddressList().size());

//        Map<String , String> myMap = new HashMap<>();
//
//        myMap.put("empId", "123");
//        myMap.put("empName", "Ravi");
//        myMap.put("empManagerId", "345");
//        myMap.put("empSalary", "34567.45");
//        myMap.put("empAge", "34");
//
//        System.out.println(myMap);

        Map<String , Object> employeeMap = objectMapper.readValue(employee, new TypeReference<Map<String, Object>>() {});

        List<Address> addressList = (List<Address>)employeeMap.get("addressList");

        System.out.println(addressList.size());


    }
}
