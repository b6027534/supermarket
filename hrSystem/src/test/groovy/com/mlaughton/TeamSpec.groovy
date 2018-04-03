package com.mlaughton

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamSpec extends Specification implements DomainUnitTest<Team> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
        when:"A team has a teamName, numberOfEmployees and sectionName"

def team= new Team(teamName:'team', numberOfEmployees:5, sectionName:'section')

then:"the to string method will merge them"

team.toString()=='team, 5, section'
    }
}
