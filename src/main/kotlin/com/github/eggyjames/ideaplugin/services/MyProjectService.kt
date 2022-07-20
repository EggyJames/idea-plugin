package com.github.eggyjames.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.eggyjames.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
