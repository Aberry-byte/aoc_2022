/*
Author: Alex Huft
Description: Advent of Code 2022 Day 4
 */
import java.io.File


fun encompasses(firstRangeLeft: Int, firstRangeRight: Int,
                secondRangeLeft: Int, secondRangeRight: Int): Boolean {
    val firstRange = firstRangeLeft..firstRangeRight
    val secondRange = secondRangeLeft..secondRangeRight
    if (firstRange.first in secondRange || firstRange.last in secondRange
        || secondRange.first in firstRange || secondRange.last in firstRange) {
        return true
    }
    return false
}


fun main(args: Array<String>) {
    val input = "input.txt"
    // val input = "small_input.txt"
    val file = File(input)
    val lines = file.readLines()
    var encompasses = 0
    for (line in lines) {
        val splitLine = line.split(',')
        val firstRange = splitLine[0].split('-')
        val secondRange = splitLine[1].split('-')
        if (encompasses(firstRange[0].toInt(), firstRange[1].toInt(),
                        secondRange[0].toInt(), secondRange[1].toInt())) {
            encompasses++
        }
    }
    println(encompasses)
}