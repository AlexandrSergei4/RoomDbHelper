package com.github.alexandrsergei4.roomdbhelper.services

import com.github.alexandrsergei4.roomdbhelper.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
