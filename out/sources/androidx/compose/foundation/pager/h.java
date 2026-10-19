package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h implements LazyLayoutIntervalContent.Interval {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.l<Integer, Object> f10976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.r<n, Integer, InterfaceC1084f, Integer, p293xa.r> f10977b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Ia.l<? super Integer, ? extends Object> lVar, Ia.r<? super n, ? super Integer, ? super InterfaceC1084f, ? super Integer, p293xa.r> rVar) {
        this.f10976a = lVar;
        this.f10977b = rVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final Ia.l<Integer, Object> getKey() {
        return this.f10976a;
    }
}
