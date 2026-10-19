package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import java.util.Map;

/* JADX INFO: compiled from: MeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<AbstractC1155a, Integer> f14177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f14179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ia.l<Y.a, p293xa.r> f14180f;

    public G(int i10, int i11, Map map, H h8, Ia.l lVar) {
        this.f14178d = i10;
        this.f14179e = h8;
        this.f14180f = lVar;
        this.f14175a = i10;
        this.f14176b = i11;
        this.f14177c = map;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getHeight() {
        return this.f14176b;
    }

    @Override // androidx.compose.ui.layout.F
    public final int getWidth() {
        return this.f14175a;
    }

    @Override // androidx.compose.ui.layout.F
    public final Map<AbstractC1155a, Integer> o() {
        return this.f14177c;
    }

    @Override // androidx.compose.ui.layout.F
    public final void p() {
        H h8 = this.f14179e;
        boolean z10 = h8 instanceof LookaheadCapablePlaceable;
        Ia.l<Y.a, p293xa.r> lVar = this.f14180f;
        if (z10) {
            lVar.invoke(((LookaheadCapablePlaceable) h8).j);
        } else {
            lVar.invoke(new d0(this.f14178d, h8.getLayoutDirection()));
        }
    }

    @Override // androidx.compose.ui.layout.F
    public final Ia.l<Object, p293xa.r> q() {
        return null;
    }
}
