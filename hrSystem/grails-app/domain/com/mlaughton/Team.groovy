package com.mlaughton

class Team {
String teamName
int numberOfEmployees
String sectionName
String description
TeamLeader teamLeader

static hasMany = [shift:Shift, task:Task, employee:Employee]

String toString() {
String comma = ', ';
teamName+comma+numberOfEmployees+comma+sectionName
}

    static constraints = {
teamName nullable: false, blank: false
numberOfEmployees nullable: false, blank: false
sectionName nullable: false, blank: false
description nullable: false, blank: false, widget:'textarea', maxSize: 5000
shift nullable: true, blank: true
task nullable: true, blank: true
employee nullable: true, blank: true

    }
}
