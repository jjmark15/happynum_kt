package clumsywizard.happynum

import kotlin.math.pow

fun isAHappyNumber(number: Long): Boolean {
    var rollingSquareSum: Long = squareSum(number)
    while (true) when {
        rollingSquareSum == 1L -> return true
        isUnhappy(rollingSquareSum) -> return false
        else -> rollingSquareSum = squareSum(rollingSquareSum)
    }
}

fun squareSum(number: Long): Long {
    var ss = 0L
    var n: Long = number

    while (n > 0) {
        ss += n.rem(10).times(1.0).pow(2).toLong()
        n = n.div(10)
    }
    return ss
}

fun isUnhappy(number: Long): Boolean {
    val unhappyMarkers: Set<Long> = setOf(89, 145, 42, 37, 58, 20, 4, 16)
    return unhappyMarkers.contains(number)
}

fun countDistinctHappyNumbers(rangeInclusive: Long): Int {
    return (1..rangeInclusive + 1).filter { n -> isFirstIteration(n) && isAHappyNumber(n) }.count()
}
