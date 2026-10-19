package com.voltasit.obdeleven.domain.usecases.device;

import java.util.Comparator;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t8, T t10) {
        return Cb.a.e(Boolean.valueOf(kotlin.jvm.internal.i.a(((Q8.b) t8).f5127b, "Unknown")), Boolean.valueOf(kotlin.jvm.internal.i.a(((Q8.b) t10).f5127b, "Unknown")));
    }
}
