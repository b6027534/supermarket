package com.mlaughton

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EmployeeSpec extends Specification implements DomainUnitTest<Employee> {

    def setup() {
    }

    def cleanup() {
    }

    void tenHoursOfWages() {
when:"An employee specifices their hourly rate"

def steve=new Employee(hourlyRate:5)

then: "The calculateTenHoursOfWages method will total amount"

steve.CalculateTenHoursOfWages()==50
    }
}
