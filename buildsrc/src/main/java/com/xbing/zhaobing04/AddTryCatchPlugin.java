package com.xbing.zhaobing04;

import org.gradle.api.Plugin;
import org.gradle.api.Project;



public class AddTryCatchPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        AddTryCatchExtension extension = project.getExtensions().create("addTryCatch", AddTryCatchExtension.class);
        Config.getInstance().extension = extension;

    }
}
