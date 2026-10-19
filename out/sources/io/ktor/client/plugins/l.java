package io.ktor.client.plugins;

import java.nio.charset.Charset;
import java.util.Comparator;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t8, T t10) {
        return Cb.a.e(p049da.a.c((Charset) t8), p049da.a.c((Charset) t10));
    }
}
