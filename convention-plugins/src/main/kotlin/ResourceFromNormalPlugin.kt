import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class ResourceFromNormalPlugin : DefaultTask() {

    @TaskAction
    fun printResource() {
        println(javaClass.getResource("/resource.txt").readText())
    }

}