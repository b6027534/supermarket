package com.mlaughton

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ManagerSpec extends Specification implements DomainUnitTest<Manager> {

    def setup() {
    }

    def cleanup() {
    }

    void sameValue() {
        when: "the username and password is the same"

	def manager=new Manager(userName:'Michael', password:'Michael')

	then: "the return value is true"
	
manager.sameUserAndPass()==true
    }
}
