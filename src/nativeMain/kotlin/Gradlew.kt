import platform.posix.system

value class Gradlew(private val task: String) {
    fun execute(options: Options = Options.Warmup) {
        "./gradlew ${options.rawValue} $task".also {
            println("Executing '$it'")
            system(it)
        }
    }

    sealed class Options(val rawValue: String) {
        data object Full : Options("--no-daemon --profile --offline --rerun-tasks")
        data object Warmup : Options("--rerun-tasks")
    }
}
