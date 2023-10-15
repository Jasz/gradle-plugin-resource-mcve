tasks.register("resourceFromScriptPlugin") {
    doLast {
        println(javaClass.getResource("/resource.txt").readText())
    }
}

tasks.register<ResourceFromNormalPlugin>("resourceFromNormalPlugin")