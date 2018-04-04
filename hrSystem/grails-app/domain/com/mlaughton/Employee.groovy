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
TeamLeader teamleader
Manager manager
Shift shift

static hasMany = [team:Team, task:Task]

static belongsTo = [Team, Task, TeamLeader]

int CalculateTenHoursOfWages(){
10*hourlyRate
}

static hasOne = [shift:Shift]

    static constraints = {
fullName nullable: false, blank: false
dateOfBirth nullable: false, blank: false
residence nullable: false, blank: false
hourlyRate nullable: false, blank: false
employeeID nullable: false, blank: false
dateEmployed nullable: false, blank: false
taxCode nullable: false, blank: false
contract nullable: false, blank: false
shift nullable: true, blank: true
task nullable: true, blank: true
team nullable: true, blank: true
    }
}
