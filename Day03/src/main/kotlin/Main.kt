/*
Author: Alex Huft
Description: Advent of Code 2022 Day 3
 */
import java.io.File


fun getPriority(c: Char?): Int {
    val asciiVal = c!!.code
    if (asciiVal < 91) {
        return asciiVal - (65 - 27)
    }
    else {
        return asciiVal - 96
    }
}


fun main(args: Array<String>) {
    val input = "input.txt"
    // val input = "short_input.txt"
    val file = File(input)
    val lines = file.readLines()
    var totalPriority = 0
    for (line in lines) {
        var similarChar: Char? = null
        val firstHalf = line.substring(0, line.length/2)
        val secondHalf = line.substring(line.length/2, line.length)
        for (c in firstHalf) {
            if (secondHalf.contains(c)) {
                similarChar = c
                break
            }
        }
        totalPriority += getPriority(similarChar)
    }
    println(totalPriority)
}