import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.int
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

class HappyNumber : CliktCommand() {
    private val range by option(help = "End inclusive range of numbers to test").int().default(1000000)

    @OptIn(ExperimentalTime::class)
    override fun run() {
        var distinctHappyNumbers: Int
        val duration: Duration = measureTime {
            distinctHappyNumbers = countDistinctHappyNumbers(IntRange(0, range))
        }

        println("count: $distinctHappyNumbers\ntime: ${duration.inWholeMilliseconds}ms")
    }
}

fun main(args: Array<String>) = HappyNumber().main(args)