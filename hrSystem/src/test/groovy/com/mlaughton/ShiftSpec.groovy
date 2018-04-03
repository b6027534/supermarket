package com.mlaughton

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ShiftSpec extends Specification implements DomainUnitTest<Shift> {

    def setup() {
    }

    def cleanup() {
    }

    void timeEqualsStartingTime() {
        when: "the timeOfDay is equvilent to the starting time (e.g. 6:00am = morning)"

def shift=new Shift(timeOfDay:'Morning', startingTime:'6:00am')

then: "the return value will be true"

shift.theTimeEqualsStartingTime()==true
    }
}
