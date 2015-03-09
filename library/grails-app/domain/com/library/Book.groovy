package com.library

class Book {

String title
String author
String isbn
Date dateBorrowed
Date returnDate
Student student
Library library

String toString() {"$title, $author, $isbn"}

    static constraints = {

title()
author()
isbn()
dateBorrowed()
returnDate()
student()
library()

    }
}
