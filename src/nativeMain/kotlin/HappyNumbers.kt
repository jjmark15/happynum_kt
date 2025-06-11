val unHappyMarkerNumbers = listOf(0, 89, 145)

fun countDistinctHappyNumbers(range: IntRange): Int = range.filter(::isFirstIteration).count(::isHappy)

private fun isHappy(n: Int): Boolean {
    var squareSum = n

    while (true) {
        if (isUnhappy(squareSum)) {
            return false
        } else if (squareSum == 1) {
            return true
        }
        squareSum = squareSum(squareSum)
    }
}

private fun isUnhappy(n: Int) = unHappyMarkerNumbers.contains(n)

private fun squareSum(n: Int): Int = n.toString().toCharArray().sumOf {
    val digit = it.digitToInt()
    digit * digit
}

private fun isFirstIteration(n: Int): Boolean {
    var mut = n
    var prev = 9

    while (mut > 0) {
        val curr = mut % 10

        if (curr > prev) {
            return false
        }

        prev = curr
        mut /= 10
    }

    return true
}