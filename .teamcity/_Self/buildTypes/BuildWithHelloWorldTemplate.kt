package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object BuildWithHelloWorldTemplate : Template({
    name = "build with hello world template"

    steps {
        script {
            id = "RUNNER_922"
            scriptContent = """echo "hello, world""""
        }
    }
})
