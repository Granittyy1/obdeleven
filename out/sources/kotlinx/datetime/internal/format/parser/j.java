package kotlinx.datetime.internal.format.parser;

import java.util.Comparator;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t8, T t10) {
        return Cb.a.e(Integer.valueOf(((h) t10).f43915a), Integer.valueOf(((h) t8).f43915a));
    }
}
