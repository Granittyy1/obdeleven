package androidx.compose.ui.node;

/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class X implements V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.layout.F f14573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LookaheadCapablePlaceable f14574c;

    public X(androidx.compose.ui.layout.F f10, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.f14573b = f10;
        this.f14574c = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.node.V
    public final boolean a0() {
        return this.f14574c.C0().c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        return kotlin.jvm.internal.i.a(this.f14573b, x10.f14573b) && kotlin.jvm.internal.i.a(this.f14574c, x10.f14574c);
    }

    public final int hashCode() {
        return this.f14574c.hashCode() + (this.f14573b.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f14573b + ", placeable=" + this.f14574c + ')';
    }
}
