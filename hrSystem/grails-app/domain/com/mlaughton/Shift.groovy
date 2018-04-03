package com.mlaughton

class Shift {
String timeOfDay
String dayOfWeek
int numberOfHours
String startingTime

    static constraints = {
timeOfDay nullable: false, blank: false
dayOfWeek nullable: false, blank: false
numberOfHours nullable: false, blank: false
startingTime nullable: false, blank: false

    }
}
