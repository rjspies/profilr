class Runner(private val task: String) {
    fun performRun() {
        performWarmupRun()
        performProfiling()
    }

    private fun performProfiling() {
        println("Performing full run...")
        for (count in 0..80) {
            println("Beginning run number $count")
            Gradlew(task).execute(Gradlew.Options.Full)
        }
    }

    private fun performWarmupRun() {
        println("Performing warmup run...")
        Gradlew(task).execute()
    }
}
