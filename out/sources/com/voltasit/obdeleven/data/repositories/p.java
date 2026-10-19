package com.voltasit.obdeleven.data.repositories;

import G8.C0706h;
import java.util.Comparator;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class p<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t8, T t10) {
        return Cb.a.e(Integer.valueOf(((C0706h) t8).f3500c), Integer.valueOf(((C0706h) t10).f3500c));
    }
}
