package androidx.compose.ui.node;

/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C implements p013b0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LookaheadCapablePlaceable f14330b;

    public C(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.f14330b = lookaheadCapablePlaceable;
    }

    @Override // p013b0.c
    public final float P0() {
        return this.f14330b.P0();
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f14330b.getDensity();
    }
}
