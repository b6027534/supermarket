package com.mlaughton

class TeamLeader {
String fullName
String department
String employeeID
String sectionName
int officePhone
String leaderEmail
String password

boolean isItNull() {
if (fullName == '') {
return true
}
if (fullName != '') {
return false
}
}

    static constraints = {
fullName nullable: false, blank: false
department nullable: false, blank: false
employeeID nullable: false, blank: false
sectionName nullable: false, blank: false
officePhone nullable: false, blank: false
leaderEmail nullable: false, blank: false, email: true
password nullable: false, blank: false
    }
}
