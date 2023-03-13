package SubProjectWithMavenTests

import SubProjectWithMavenTests.buildTypes.*
import SubProjectWithMavenTests.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("SubProjectWithMavenTests")
    name = "SubProject with Maven Tests"

    vcsRoot(SubProjectWithMavenTests_MavenProjectWithTests)

    buildType(SubProjectWithMavenTests_RunMavenTests)
})
