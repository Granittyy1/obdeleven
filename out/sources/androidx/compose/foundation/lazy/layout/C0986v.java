package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.f0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0986v implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0983s f10740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.collection.H<Object> f10741b = androidx.collection.P.a();

    public C0986v(C0983s c0983s) {
        this.f10740a = c0983s;
    }

    @Override // androidx.compose.ui.layout.f0
    public final void a(f0.a aVar) {
        androidx.collection.H<Object> h8 = this.f10741b;
        h8.b();
        for (Object obj : aVar) {
            Object objB = this.f10740a.b(obj);
            int iA = h8.a(objB);
            int i10 = iA >= 0 ? h8.f9105c[iA] : 0;
            if (i10 == 7) {
                aVar.remove(obj);
            } else {
                h8.g(i10 + 1, objB);
            }
        }
    }

    @Override // androidx.compose.ui.layout.f0
    public final boolean b(Object obj, Object obj2) {
        C0983s c0983s = this.f10740a;
        return kotlin.jvm.internal.i.a(c0983s.b(obj), c0983s.b(obj2));
    }
}
