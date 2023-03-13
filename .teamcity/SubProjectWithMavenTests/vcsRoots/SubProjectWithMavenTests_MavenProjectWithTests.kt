package SubProjectWithMavenTests.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object SubProjectWithMavenTests_MavenProjectWithTests : GitVcsRoot({
    name = "maven project with tests"
    url = "https://github.com/burnasheva/maven_unbalanced_messages"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
})
