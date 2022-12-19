/*
Author: Alex Huft
Description: Advent of Code 2022 Day 3
 */
import java.io.File


fun findGroupSimilarity(group: List<String>): Char? {
    // Will always be groups of 3
    val initialChars: List<Char> = group[0].toList()
    for (c in initialChars) {
        if (group[1].contains(c) && group[2].contains(c)) {
            return c
        }
    }
    return null
}


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
    for (group in lines.chunked(3)) {
        val similarChar = findGroupSimilarity(group)
        totalPriority += getPriority(similarChar)
    }
    println(totalPriority)
}