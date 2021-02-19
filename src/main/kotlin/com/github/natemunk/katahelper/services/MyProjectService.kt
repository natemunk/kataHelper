package com.github.natemunk.katahelper.services

import com.github.natemunk.katahelper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
