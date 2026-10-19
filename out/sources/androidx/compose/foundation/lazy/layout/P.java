package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class P<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<C0971f<T>> f10669a = new androidx.compose.runtime.collection.c<>(new C0971f[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0971f<? extends T> f10671c;

    public final void a(int i10, LazyLayoutIntervalContent.Interval interval) {
        if (i10 < 0) {
            p245u.c.a("size should be >=0");
        }
        if (i10 == 0) {
            return;
        }
        C0971f c0971f = new C0971f(this.f10670b, i10, interval);
        this.f10670b += i10;
        this.f10669a.b(c0971f);
    }

    public final C0971f<T> b(int i10) {
        if (i10 < 0 || i10 >= this.f10670b) {
            StringBuilder sbE = A8.f.e(i10, "Index ", ", size ");
            sbE.append(this.f10670b);
            p245u.c.d(sbE.toString());
        }
        C0971f<? extends T> c0971f = this.f10671c;
        if (c0971f != null) {
            int i11 = c0971f.f10715a;
            if (i10 < c0971f.f10716b + i11 && i11 <= i10) {
                return c0971f;
            }
        }
        androidx.compose.runtime.collection.c<C0971f<T>> cVar = this.f10669a;
        C0971f c0971f2 = (C0971f<? extends T>) cVar.f12943b[F8.a.a(i10, cVar)];
        this.f10671c = c0971f2;
        return c0971f2;
    }
}
