/*
Author: Alex Huft
Description: Advent of Code 2022 Day 1 solution
 */
import java.io.File
import java.util.ArrayList


fun main(args: Array<String>) {
    // setup
    val list = ArrayList<Int>()
    val filepath = "input.txt"
    // val filepath = "small_test.txt"
    val reader = File(filepath)
    val lines = reader.readLines()
    // loop vars
    var currentCalorieCount = 0
    // loop through input
    for(line in lines) {
        if (line == "") {
            list.add(currentCalorieCount)
            currentCalorieCount = 0
            continue
        }
        currentCalorieCount += line.toInt()
    }
    list.sort()
    println(list)
    val maxCalories = list[list.size-1]
    val secondCalories = list[list.size-2]
    val thirdCalories = list[list.size-3]
    println("$maxCalories $secondCalories $thirdCalories")
    println(maxCalories + secondCalories + thirdCalories)
}