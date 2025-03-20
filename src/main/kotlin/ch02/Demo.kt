package ch02

import ch02.geometry.shapes.Rectangle

fun main() {
    val person = Person("Bob", true)
    println(person.name)
    println(person.isStudent)

    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}