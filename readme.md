A minimal complete verifiable example of reading from resource seemingly not working from a precompiled script Gradle 
plugin.

To reproduce:

1. In the convention-plugins project run `gradle publishToMavenLocal`.
2. In the service project run `gradle resourceFromNormalPlugin`: this should print `text to print` from resource.txt.
3. In the service project run `gradle resourceFromScriptPlugin`: this should also print `text to print` but instead 
   fails because `javaClass.getResource("/resource.txt")` is null.