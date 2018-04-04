package com.mlaughton

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TaskSpec extends Specification implements DomainUnitTest<Task> {

    def setup() {
    }

    def cleanup() {
    }

    void taskCompletion() {
        when: "the task is completed"
	def task=new Task(taskCompleted: 'yes')

then: "the return value is true"
	task.isTheTaskCompleted()==true
    }
}
