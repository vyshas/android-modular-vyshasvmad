@file:Repository("https://repo.maven.apache.org")
@file:DependsOn("org.apache.commons:commons-text:1.6")

//Testing plugin
import org.apache.commons.text.WordUtils
import systems.danger.kotlin.*

danger(args) {
    val allSourceFiles = git.modifiedFiles + git.createdFiles
    val sourceChanges = allSourceFiles.firstOrNull { it.contains("src") }

    onGitHub {
        val isTrivial = pullRequest.title.contains("#trivial")

        // Big PR Check
        if ((pullRequest.additions ?: 0) - (pullRequest.deletions ?: 0) > 500) {
            warn("Big PR, try to keep changes smaller if you can")
        }

        // Work in progress check
        if (pullRequest.title.contains("WIP", false)) {
            warn("PR is classed as Work in Progress")
        }
    }

    onGit {
        //No Java files check
        createdFiles.filter {
            it.endsWith(".java")
        }.forEach {
            // Using apache commons-text dependency to be sure the dependency resolution always works
            warn(WordUtils.capitalize("please consider to create new files in Kotlin"), it, 1)
        }
    }
}
