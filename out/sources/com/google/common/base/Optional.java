package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static <T> Optional<T> a() {
        return Absent.f27768b;
    }

    public static <T> Optional<T> d(T t8) {
        return new Present(t8);
    }

    public abstract T b();

    public abstract boolean c();
}
