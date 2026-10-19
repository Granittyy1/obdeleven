package org.simpleframework.xml;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface Element {
    boolean data() default false;

    String name() default "";

    boolean required() default false;

    Class type() default void.class;
}
