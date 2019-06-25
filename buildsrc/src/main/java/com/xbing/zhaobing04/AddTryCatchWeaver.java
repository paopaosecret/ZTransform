package com.xbing.zhaobing04;

import com.quinn.hunter.transform.asm.BaseWeaver;


import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;



public class AddTryCatchWeaver extends BaseWeaver {
    @Override
    public boolean isWeavableClass(String fullQualifiedClassName) {
        return Config.getInstance().extension.hookPoint.containsKey(fullQualifiedClassName.replace(".class", ""));
    }

    @Override
    protected ClassVisitor wrapClassWriter(ClassWriter classWriter) {
        return new AddTryCatchClassAdapter(classWriter);
    }
}
