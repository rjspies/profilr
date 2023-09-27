import platform.posix.system

value class Gradlew(private val task: String) {
    fun execute() {
        "./gradlew --offline --rerun-tasks --no-daemon $task".also {
            println("Executing '$it'")
            system(it)
        }
    }
}
