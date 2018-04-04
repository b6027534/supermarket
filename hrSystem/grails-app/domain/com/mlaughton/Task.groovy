package com.mlaughton

class Task {
String taskName
int numberOfPeople
String sectionName
String department
String timeRequired
String description
boolean taskCompleted

boolean isTheTaskCompleted() {
if (taskCompleted == 'yes') {
return true
}
if (taskCompleted == 'no') {
return false
}
}

String toString() {
return taskName
}

static hasMany = [shift:Shift, team:Team, employee:Employee]

static belongsTo = [Team, Shift]

    static constraints = {
taskName nullable: false, blank: false
numberOfPeople nullable: false, blank: false
sectionName nullable: false, blank: false
department nullable: false, blank: false
timeRequired nullable: false, blank: false
description nullable: false, blank: false, widget:'textarea', maxSize: 5000
taskCompleted nullable: false, blank: false
shift nullable: true, blank: true
team nullable: true, blank: true
employee nullable: true, blank: true

    }
}
