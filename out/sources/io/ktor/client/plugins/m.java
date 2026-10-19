package io.ktor.client.plugins;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t8, T t10) {
        return Cb.a.e((Float) ((Pair) t10).d(), (Float) ((Pair) t8).d());
    }
}
