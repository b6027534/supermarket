package com.mlaughton

class Task {
String taskName
int numberOfPeople
String sectionName
String department
String timeRequired
String description
boolean taskCompleted

    static constraints = {
taskName nullable: false, blank: false
numberOfPeople nullable: fasle, blank: false
sectionName nullable: false, blank: false
department nullable: false, blank: false
timeRequired nullable: false, blank: false
description nullable: false, blank: false, widget: "textArea", maxSize: 5000
taskCompleted nullable: false, blank: false

    }
}
