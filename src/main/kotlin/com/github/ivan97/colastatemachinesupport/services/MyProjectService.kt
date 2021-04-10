package com.github.ivan97.colastatemachinesupport.services

import com.github.ivan97.colastatemachinesupport.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
