package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test toString"() {

	when:"A Student has name,email,studentId and course"


	def student=new Student(name:'Rhys',
				email:'Rhys@gmail.com',
				studentId:'22007512',
				course:'Web')

	then:"the toString method will merg them."
	
	Student.toString()=='Rhys,Rhys@gmail.com,22007512,Web'

    }
}
