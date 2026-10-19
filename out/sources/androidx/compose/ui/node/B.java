package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1155a;
import java.util.Map;

/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B implements androidx.compose.ui.layout.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<AbstractC1155a, Integer> f14316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r> f14317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LookaheadCapablePlaceable f14318e;

    public B(int i10, int i11, Map map, Ia.l lVar, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.f14314a = i10;
        this.f14315b = i11;
        this.f14316c = map;
        this.f14317d = lVar;
        this.f14318e = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getHeight() {
        return this.f14315b;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getWidth() {
        return this.f14314a;
    }

    @Override // androidx.compose.ui.layout.F
    public final Map<AbstractC1155a, Integer> o() {
        return this.f14316c;
    }

    @Override // androidx.compose.ui.layout.F
    public final void p() {
        this.f14317d.invoke(this.f14318e.j);
    }

    @Override // androidx.compose.ui.layout.F
    public final Ia.l<Object, p293xa.r> q() {
        return null;
    }
}
