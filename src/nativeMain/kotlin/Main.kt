import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import kotlinx.cli.optional

fun main(arguments: Array<String>) {
    val argumentParser = ArgParser("profilr")
    val task by argumentParser.argument(
        type = ArgType.String,
        fullName = "Task",
        description = "The task you want to profile",
    ).optional().default("assembleDebug")
    argumentParser.parse(arguments)
    Runner(task).performRun()
}
