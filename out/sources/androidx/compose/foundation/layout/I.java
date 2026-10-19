package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class I extends androidx.compose.ui.h.c implements androidx.compose.ui.node.W {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10148q;

    @Override // androidx.compose.ui.node.W
    public final Object u1(p013b0.c cVar, Object obj) {
        Q q10 = obj instanceof Q ? (Q) obj : null;
        if (q10 == null) {
            q10 = new Q(0);
        }
        q10.f10199a = this.f10147p;
        q10.f10200b = this.f10148q;
        return q10;
    }
}
