package com.mlaughton

class Shift {
String timeOfDay
String datOfWeek
int numberOfHours
String startingTime

    static constraints = {
timeOfDay nullable: false, blank: false
dayOfWeek nullable: false, blank: false, minSize: 3, maxSize: 9
numberOfHours nullable: false, blank: false, maxSize: 24
startingTime nullable: false, blank: false

    }
}
