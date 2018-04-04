package com.mlaughton

class Shift {
String timeOfDay
String dayOfWeek
int numberOfHours
String startingTime

boolean theTimeEqualsStartingTime() {
if (timeOfDay == 'Morning') {
	if (startingTime == '1:00am' || startingTime == '2:00am' || startingTime == '3:00am' 
|| startingTime == '4:00am' || startingTime == '5:00am' || startingTime == '6:00am' || startingTime == '7:00am' 
|| startingTime == '8:00am' || startingTime == '9:00am' || startingTime == '10:00am' || startingTime == '11:00am') {
return true
	}
}


if (timeOfDay == 'Afternoon') {
	if (startingTime == '12:00am' || startingTime == '13:00am' || startingTime == '14:00am' 
|| startingTime == '15:00am' || startingTime == '16:00am' || startingTime == '17:00am') {
return true
	}
}


if (timeOfDay == 'Evening') {
	if (startingTime == '18:00am' || startingTime == '19:00am' || startingTime == '20:00am' 
|| startingTime == '21:00am' || startingTime == '22:00am' || startingTime == '23:00am' || startingTime == '12:00pm') {
return true
	}
}
return false
}

static hasMany = [team:Team, employee:Employee, task:Task]

static belongsTo = [Team]

    static constraints = {
timeOfDay nullable: false, blank: false
dayOfWeek nullable: false, blank: false
numberOfHours nullable: false, blank: false
startingTime nullable: false, blank: false
team nullable: true, blank: true
employee nullable: true, blank: true
task nullable: true, blank: true

    }
}
