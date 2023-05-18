import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.int

class HappyNumber : CliktCommand() {
    private val range by option(help = "End inclusive range of numbers to test").int().default(1000000)

    override fun run() {
        val distinctHappyNumbers = countDistinctHappyNumbers(IntRange(0, range))
        println("happy numbers: $distinctHappyNumbers")
    }
}

fun main(args: Array<String>) = HappyNumber().main(args)