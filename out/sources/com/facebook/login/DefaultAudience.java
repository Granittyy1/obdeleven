package com.facebook.login;

import java.util.Arrays;

/* JADX INFO: compiled from: DefaultAudience.kt */
/* JADX INFO: loaded from: classes.dex */
public enum DefaultAudience {
    NONE(null),
    /* JADX INFO: Fake field, exist only in values array */
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    /* JADX INFO: Fake field, exist only in values array */
    EVERYONE("everyone");

    private final String nativeProtocolAudience;

    DefaultAudience(String str) {
        this.nativeProtocolAudience = str;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static DefaultAudience[] valuesCustom() {
        return (DefaultAudience[]) Arrays.copyOf(values(), 4);
    }

    public final String a() {
        return this.nativeProtocolAudience;
    }
}
