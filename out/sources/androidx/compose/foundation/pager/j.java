package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.P;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j extends LazyLayoutIntervalContent<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.r<n, Integer, InterfaceC1084f, Integer, p293xa.r> f10978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<Integer, Object> f10979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P f10980c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Ia.r<? super n, ? super Integer, ? super InterfaceC1084f, ? super Integer, p293xa.r> rVar, Ia.l<? super Integer, ? extends Object> lVar, int i10) {
        this.f10978a = rVar;
        this.f10979b = lVar;
        P p10 = new P();
        p10.a(i10, new h(lVar, rVar));
        this.f10980c = p10;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public final P i() {
        return this.f10980c;
    }
}
