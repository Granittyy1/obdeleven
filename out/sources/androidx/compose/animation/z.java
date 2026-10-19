package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0923x;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.p<p013b0.l, p013b0.l, InterfaceC0923x<p013b0.l>> f9676b;

    public z(Ia.p pVar, boolean z10) {
        this.f9675a = z10;
        this.f9676b = pVar;
    }

    @Override // androidx.compose.animation.y
    public final boolean a() {
        return this.f9675a;
    }

    @Override // androidx.compose.animation.y
    public final InterfaceC0923x<p013b0.l> b(long j, long j10) {
        return this.f9676b.invoke(new p013b0.l(j), new p013b0.l(j10));
    }
}
