package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.P;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: LazyGridIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<f> implements v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ia.p<l, Integer, c> f10395d = new Ia.p<l, Integer, c>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$Companion$DefaultSpan$1
        @Override // Ia.p
        public final c invoke(l lVar, Integer num) {
            num.intValue();
            return new c(1);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyGridSpanLayoutProvider f10396a = new LazyGridSpanLayoutProvider(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P<f> f10397b = new P<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10398c;

    public LazyGridIntervalContent(Ia.l<? super v, p293xa.r> lVar) {
        lVar.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.grid.v
    public final void b(int i10, Ia.l lVar, Ia.p pVar, Ia.l lVar2, ComposableLambdaImpl composableLambdaImpl) {
        this.f10397b.a(i10, new f(lVar, pVar == null ? f10395d : pVar, lVar2, composableLambdaImpl));
        if (pVar != null) {
            this.f10398c = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public final P i() {
        return this.f10397b;
    }
}
