package com.github.douxiyou.dockerbp.services

import com.intellij.openapi.project.Project
import com.github.douxiyou.dockerbp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
