package com.learn.java.basic.day34;

import java.util.List;

/**
 *    JSON  -> object  {}   Array []
 *
 *    {
 *        "empId" : 123,
 *        "empName": "Ravi",
 *        "empManagerId" : 345,
 *        "empSalary" : 45678.45,
 *        "empAge": 34,
 *        "isManager": false,
 *        "addresses": [
 *        {
 *            "apartmentName": "ABC Hyderabd Aprtment",
 *            "roadName" : "kondapur",
 *            "locality" : "kothaguda",
 *            "district": "hyderabad",
 *            "state": "telangana",
 *            "pincode" : 500032,
 *            "parentAddress": {
 *                "apartmentName": "ABC Hyderabd Aprtment",
 *                "district": "hyderabad",
 *                 "state": "telangana",
 *                 "pincode" : 500032
 *            }
 *        },
 *        {
 *            "apartmentName": "ABC Hyderabd Aprtment",
 *            "roadName" : "kondapur",
 *            "locality" : "kothaguda",
 *            "district": "hyderabad",
 *            "state": "telangana",
 *            "pincode" : 500032,
 *            "parentAddress": {
 *                "apartmentName": "ABC Hyderabd Aprtment",
 *                "district": "hyderabad",
 *                 "state": "telangana",
 *                 "pincode" : 500032
 *            }
 *        },
 *        {
 *            "apartmentName": "ABC Hyderabd Aprtment",
 *            "roadName" : "kondapur",
 *            "locality" : "kothaguda",
 *            "district": "hyderabad",
 *            "state": "telangana",
 *            "pincode" : 500032,
 *            "parentAddress": {
 *                "apartmentName": "ABC Hyderabd Aprtment",
 *                "district": "hyderabad",
 *                 "state": "telangana",
 *                 "pincode" : 500032
 *            }
 *        }
 *        ]
 *    }
 *
 */
public class Employee {

    private int empId;
    private String empName;
    private int empManagerId;
    private double empSalary;
    private int empAge;
    private boolean isManager;
    private List<Address> addresses;
}
