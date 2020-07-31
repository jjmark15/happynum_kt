package clumsywizard.happynum

fun isFirstIteration(n: Long): Boolean {
    var prev: Char = 0.toChar()
    for ((i, c) in n.toString().withIndex()) {
        if (i > 0 && prev > c) {
            return false
        }
        prev = c
    }
    return true
}
