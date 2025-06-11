import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.float
import com.github.ajalt.clikt.parameters.types.int
import kotlin.time.Duration
import kotlin.time.DurationUnit
import kotlin.time.measureTime

class HappyNumber : CliktCommand() {
    private val range by option("-r", "--range", help = "End inclusive range of numbers to test").float()
        .default(1000000f)

    override fun run() {
        val (duration, count) = measureTimeOfRun {
            countDistinctHappyNumbers(IntRange(0, range.toInt()))
        }

        println("count: ${count}\ntime: ${duration.toString(DurationUnit.SECONDS, 5)}")
    }
}

inline fun <T> measureTimeOfRun(block: () -> T): Pair<Duration, T> {
    var result: T

    val duration = measureTime {
        result = block()
    }

    return duration to result
}

fun main(args: Array<String>) = HappyNumber().main(args)