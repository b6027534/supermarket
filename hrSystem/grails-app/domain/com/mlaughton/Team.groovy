package com.mlaughton

class Team {
String teamName
int numberOfEmployees
String sectionName
String description

String comma = ', ';

String toString() {
teamName+comma+numberOfEmployees+comma+sectionName
}

    static constraints = {
teamName nullable: false, blank: false
numberOfEmployees nullable: false, blank: false
sectionName nullable: false, blank: false
description nullable: false, blank: false, widget:'textArea', maxSize: 5000

    }
}
