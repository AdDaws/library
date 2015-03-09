package com.library

class Student {

String name
String email
String studentId
Course course
Library library

static hasMany=[books: Book]

String toString() {name}

    static constraints = {

name()
email()
studentId()
course()

    }
}
