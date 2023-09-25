import kotlin.time.DurationUnit
import kotlin.time.measureTime
import kotlin.time.toDuration

class Runner(private val task: String) {
    fun performRun() {
        println("Performing full run...")
        val durations = mutableListOf<Long>()
        for (count in 0..80) {
            println("Beginning run number $count")
            val duration = measureTime {
                Gradlew(task).execute()
            }
            durations += duration.toLong(DurationUnit.MILLISECONDS)
        }
        println("Average = ${durations.average().toDuration(DurationUnit.MILLISECONDS)}")
    }
}
