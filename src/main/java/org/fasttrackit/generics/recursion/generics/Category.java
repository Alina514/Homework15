package org.fasttrackit.generics.recursion.generics;

import java.lang.annotation.Annotation;

public enum Category implements jdk.jfr.Category {
    ON_SALE,
    NEW,
    REFURBISHED;

    Category() {
    }

    @Override
    public String[] value() {
        return new String[0];
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
