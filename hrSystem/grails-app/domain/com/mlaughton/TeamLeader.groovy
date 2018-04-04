package com.mlaughton

class TeamLeader {
String fullName
String department
String employeeID
String sectionName
String officePhone
String leaderEmail
String password

Team team
Manager manager

static hasMany = [employee:Employee]

boolean isItNull() {
if (fullName == '') {
return true
}
if (fullName != '') {
return false
}
}

String toString() {
return fullName
}


    static constraints = {
fullName nullable: false, blank: false
department nullable: false, blank: false
employeeID nullable: false, blank: false
sectionName nullable: false, blank: false
officePhone nullable: false, blank: false
leaderEmail nullable: false, blank: false, email: true
password nullable: false, blank: false
team nullable: true, blank: true
manager nullable: true, blank: true
employee nullable: true, blank: true
    }
}
