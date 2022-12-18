/*
Author: Alex Huft
Description: Advent of Code 2022 day 2
 */
import java.io.File
import kotlin.system.exitProcess

// Rock     == A == X == 1
// Paper    == B == Y == 2
// Scissors == C == Z == 3
/*
        Rock
       >    \
      /      >
  Paper <--  scissors

 */

fun runRound(left: String, right: String): Int {
    var roundScore = 0
    when (right) {
        "X" -> {
            when (left) {
                "A" -> roundScore = 3 // 0 + 3
                "B" -> roundScore = 1 // 0 + 1
                "C" -> roundScore = 2 // 0 + 2
            }
        }
        "Y" -> {
            when (left) {
                "A" -> roundScore = 4 // 3 + 1
                "B" -> roundScore = 5 // 3 + 2
                "C" -> roundScore = 6 // 3 + 3
            }
        }
        "Z" -> {
            when (left) {
                "A" -> roundScore = 8 // 6 + 2
                "B" -> roundScore = 9 // 6 + 3
                "C" -> roundScore = 7 // 6 + 1
            }
        }
        else -> {
            exitProcess(1)
        }
    }
    return roundScore
}


fun main(args: Array<String>) {
    // val input = "short_input.txt"
    val input = "input.txt"
    val file = File(input)
    val lines = file.readLines()
    var totalPoints: Int = 0
    for (line in lines) {
        val splitLine = line.split(' ')
        totalPoints += runRound(splitLine[0], splitLine[1])
    }
    println(totalPoints)
}