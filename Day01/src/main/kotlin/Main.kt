/*
Author: Alex Huft
Description: Advent of Code 2022 Day 1 solution
 */
import java.io.File


fun main(args: Array<String>) {
    // setup
    val filepath = "input.txt"
    val reader = File(filepath)
    val lines = reader.readLines()
    var maxCalories: Int = Int.MIN_VALUE
    var currentElfIndex = 1
    var maxElfIndex: Int = 0
    var currentCalorieCount = 0
    //
    for(line in lines) {
        if (line == "") {
            if (currentCalorieCount > maxCalories) {
                maxCalories = currentCalorieCount
                maxElfIndex = currentElfIndex
            }
            currentElfIndex++
            currentCalorieCount = 0
            continue
        }
        currentCalorieCount += line.toInt()
    }
    println("$maxElfIndex has $maxCalories")
}