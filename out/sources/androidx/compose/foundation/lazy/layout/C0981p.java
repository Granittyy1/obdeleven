package androidx.compose.foundation.lazy.layout;

import java.util.Comparator;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0981p<T> implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0987w f10729b;

    public C0981p(InterfaceC0987w interfaceC0987w) {
        this.f10729b = interfaceC0987w;
    }

    @Override // java.util.Comparator
    public final int compare(T t8, T t10) {
        Object key = ((z) t10).getKey();
        InterfaceC0987w interfaceC0987w = this.f10729b;
        return Cb.a.e(Integer.valueOf(interfaceC0987w.e(key)), Integer.valueOf(interfaceC0987w.e(((z) t8).getKey())));
    }
}
