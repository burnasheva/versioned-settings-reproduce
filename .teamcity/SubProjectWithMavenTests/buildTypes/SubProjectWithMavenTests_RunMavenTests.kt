package SubProjectWithMavenTests.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven

object SubProjectWithMavenTests_RunMavenTests : BuildType({
    name = "run maven tests"

    vcs {
        root(SubProjectWithMavenTests.vcsRoots.SubProjectWithMavenTests_MavenProjectWithTests)
    }

    steps {
        maven {
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
    }
})
