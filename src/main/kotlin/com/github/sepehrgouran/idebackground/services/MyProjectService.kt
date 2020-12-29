package com.github.sepehrgouran.idebackground.services

import com.intellij.openapi.project.Project
import com.github.sepehrgouran.idebackground.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
