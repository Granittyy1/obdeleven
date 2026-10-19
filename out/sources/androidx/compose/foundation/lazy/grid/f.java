package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: LazyGridIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements LazyLayoutIntervalContent.Interval {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.l<Integer, Object> f10455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.p<l, Integer, c> f10456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.l<Integer, Object> f10457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComposableLambdaImpl f10458d;

    public f(Ia.l lVar, Ia.p pVar, Ia.l lVar2, ComposableLambdaImpl composableLambdaImpl) {
        this.f10455a = lVar;
        this.f10456b = pVar;
        this.f10457c = lVar2;
        this.f10458d = composableLambdaImpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final Ia.l<Integer, Object> getKey() {
        return this.f10455a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final Ia.l<Integer, Object> getType() {
        return this.f10457c;
    }
}
