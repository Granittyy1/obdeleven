package androidx.compose.material3;

import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ClockDialModifier extends androidx.compose.ui.node.H<ClockDialNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1047b f12076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12078d;

    public ClockDialModifier(C1047b c1047b, boolean z10, int i10) {
        this.f12076b = c1047b;
        this.f12077c = z10;
        this.f12078d = i10;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new ClockDialNode(this.f12076b, this.f12077c, this.f12078d);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ClockDialNode clockDialNode = (ClockDialNode) cVar;
        C1047b c1047b = this.f12076b;
        clockDialNode.f12079r = c1047b;
        clockDialNode.f12080s = this.f12077c;
        int i10 = clockDialNode.f12081t;
        int i11 = this.f12078d;
        if (k0.a(i10, i11)) {
            return;
        }
        clockDialNode.f12081t = i11;
        C2680e.c(clockDialNode.E1(), null, null, new ClockDialNode$updateNode$1(c1047b, null), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return kotlin.jvm.internal.i.a(this.f12076b, clockDialModifier.f12076b) && this.f12077c == clockDialModifier.f12077c && k0.a(this.f12078d, clockDialModifier.f12078d);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12078d) + androidx.compose.animation.D.b(this.f12076b.hashCode() * 31, 31, this.f12077c);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ClockDialModifier(state=");
        sb2.append(this.f12076b);
        sb2.append(", autoSwitchToMinute=");
        sb2.append(this.f12077c);
        sb2.append(", selection=");
        int i10 = this.f12078d;
        if (k0.a(i10, 0)) {
            str = "Hour";
        } else {
            str = k0.a(i10, 1) ? "Minute" : "";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
