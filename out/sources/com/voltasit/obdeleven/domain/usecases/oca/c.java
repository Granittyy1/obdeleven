package com.voltasit.obdeleven.domain.usecases.oca;

import java.util.Comparator;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t8, T t10) {
        return Cb.a.e(Long.valueOf(((I8.a) t10).f3912m), Long.valueOf(((I8.a) t8).f3912m));
    }
}
