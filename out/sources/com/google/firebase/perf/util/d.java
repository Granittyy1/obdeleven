package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Optional.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f28497a;

    public d() {
        this.f28497a = null;
    }

    public final T a() {
        T t8 = this.f28497a;
        if (t8 != null) {
            return t8;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        return this.f28497a != null;
    }

    public d(T t8) {
        if (t8 != null) {
            this.f28497a = t8;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
