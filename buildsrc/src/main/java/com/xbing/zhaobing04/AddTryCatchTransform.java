package com.xbing.zhaobing04;

import com.quinn.hunter.transform.HunterTransform;

import org.gradle.api.Project;

public class AddTryCatchTransform extends HunterTransform {
    public AddTryCatchTransform(Project project) {
        super(project);
        this.bytecodeWeaver = new AddTryCatchWeaver();
    }
}
