package com.mlaughton

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamLeaderSpec extends Specification implements DomainUnitTest<TeamLeader> {

    def setup() {
    }

    def cleanup() {
    }

    void isTheValueNull() {
        when: "the field is left null"
def leader=new TeamLeader(fullName: '')

then: "the return value is false"
	leader.isItNull()==false
    }
}
