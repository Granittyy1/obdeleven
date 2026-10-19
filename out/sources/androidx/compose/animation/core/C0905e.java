package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.animation.core.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0905e<T, V extends AbstractC0913m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0<T, V> f9531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f9532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lambda f9534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1085f0 f9535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public V f9536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9538h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1085f0 f9539i = J0.f(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public C0905e(Object obj, d0 d0Var, AbstractC0913m abstractC0913m, long j, Object obj2, long j10, Ia.a aVar) {
        this.f9531a = d0Var;
        this.f9532b = obj2;
        this.f9533c = j10;
        this.f9534d = (Lambda) aVar;
        this.f9535e = J0.f(obj);
        this.f9536f = (V) Q3.d.k(abstractC0913m);
        this.f9537g = j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    public final void a() {
        this.f9539i.setValue(Boolean.FALSE);
        this.f9534d.invoke();
    }
}
