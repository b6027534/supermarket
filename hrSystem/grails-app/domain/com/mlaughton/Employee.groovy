package com.mlaughton

class Employee {
String fullName
Date dateOfBirth
String residence
int hourlyRate
String employeeID
Date dateEmployed
String taxCode
String contract

    static constraints = {
fullName nullable: false, blank: false
dateOfBirth nullable: false, blank: false
residence nullable: false, blank: false
hourlyRate nullable: false, blank: false
employeeID nullable: false, blank: false
dateEmployed nullable: false, blank: false
taxCode nullable: false, blank: false
contract nullable: false, blank: false
    }
}
