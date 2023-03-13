package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object SimpleHelloWorld : BuildType({
    templates(BuildWithHelloWorldTemplate)
    name = "simple hello world"
})
