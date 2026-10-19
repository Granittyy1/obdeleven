package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: LazyListIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements LazyLayoutIntervalContent.Interval {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.l<Integer, Object> f10392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<Integer, Object> f10393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposableLambdaImpl f10394c;

    public f(Ia.l lVar, Ia.l lVar2, ComposableLambdaImpl composableLambdaImpl) {
        this.f10392a = lVar;
        this.f10393b = lVar2;
        this.f10394c = composableLambdaImpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final Ia.l<Integer, Object> getKey() {
        return this.f10392a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final Ia.l<Integer, Object> getType() {
        return this.f10393b;
    }
}
