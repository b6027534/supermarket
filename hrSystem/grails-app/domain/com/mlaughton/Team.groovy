package com.mlaughton

class Team {
String teamName
int numberOfEmployees
String sectionName
String description

    static constraints = {
teamName nullable: false, blank: false
numberOfEmployees nullable: false, blank: false
sectionName nullable: false, blank: false
description nullable: false, blank: false, widget: "textArea", minSize: 5, maxSize: 5000

    }
}
