package com.learn.java.basic.day34;

import java.util.List;

/**
 *
 *
 *    {
 *        "stuId": 123,
 *        "stuName": "Chandra",
 *        "stuAge": 23,
 *        "isClassMonitor": true,
 *        "classRoom": 12,
 *        "address":  {
 *            "apartmentName": "ABC Hyderabd Aprtment",
 *            "roadName" : "kondapur",
 *            "locality" : "kothaguda",
 *            "district": "hyderabad",
 *            "state": "telangana",
 *            "pincode" : 500032,
 *             "parentAddress": {
 *                "apartmentName": "ABC Hyderabd Aprtment",
 *                "district": "hyderabad",
 *                 "state": "telangana",
 *                 "pincode" : 500032
 *            }
 *       }
 *    }
 *
 *
 *
 *
 *
 */




public class Student {

    private int stuId;
    private String stuName;
    private int stuAge;
    private boolean isClassMonitor;
    private int classRoom;
    private List<Address> address;
}
