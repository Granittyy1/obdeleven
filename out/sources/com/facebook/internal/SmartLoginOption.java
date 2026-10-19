package com.facebook.internal;

import java.util.Arrays;
import java.util.EnumSet;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SmartLoginOption.kt */
/* JADX INFO: loaded from: classes.dex */
public enum SmartLoginOption {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("None"),
    f25019c("Enabled"),
    f25020d("RequireConfirm");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumSet<SmartLoginOption> f25018b;
    private final long value;

    static {
        EnumSet<SmartLoginOption> enumSetAllOf = EnumSet.allOf(SmartLoginOption.class);
        i.d(enumSetAllOf, "allOf(SmartLoginOption::class.java)");
        f25018b = enumSetAllOf;
    }

    SmartLoginOption(String str) {
        this.value = j;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static SmartLoginOption[] valuesCustom() {
        return (SmartLoginOption[]) Arrays.copyOf(values(), 3);
    }

    public final long a() {
        return this.value;
    }
}
