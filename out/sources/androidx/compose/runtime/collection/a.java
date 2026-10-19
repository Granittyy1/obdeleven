package androidx.compose.runtime.collection;

import Ia.l;
import java.util.Comparator;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f12941b;

    public a(l lVar) {
        this.f12941b = lVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t8, T t10) {
        l lVar = this.f12941b;
        return Cb.a.e((Comparable) lVar.invoke(t8), (Comparable) lVar.invoke(t10));
    }
}
