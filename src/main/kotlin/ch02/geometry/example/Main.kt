package ch02.geometry.example

import ch02.geometry.shapes.Rectangle
import ch02.geometry.shapes.createUnitSquare

fun main() {
    println(Rectangle(3, 4).isSquare)
    println(createUnitSquare().isSquare)
}