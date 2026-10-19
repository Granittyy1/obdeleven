package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0967b f10692a = new C0967b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.collection.K<Object, C0967b> f10693b = androidx.collection.U.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0967b f10695d;

    public final C0967b a(Object obj) {
        C0967b c0967b = this.f10695d;
        if (this.f10694c == obj && c0967b != null) {
            return c0967b;
        }
        androidx.collection.K<Object, C0967b> k10 = this.f10693b;
        C0967b c0967bD = k10.d(obj);
        if (c0967bD == null) {
            C0967b c0967b2 = this.f10692a;
            c0967b2.getClass();
            C0967b c0967b3 = new C0967b();
            c0967b3.f10709a = c0967b2.f10709a;
            c0967b3.f10710b = c0967b2.f10710b;
            k10.l(obj, c0967b3);
            c0967bD = c0967b3;
        }
        C0967b c0967b4 = c0967bD;
        this.f10694c = obj;
        this.f10695d = c0967b4;
        return c0967b4;
    }
}
