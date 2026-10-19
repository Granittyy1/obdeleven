package androidx.compose.ui.text.input;

import A1.C0575j;

/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15578b;

    public x(int i10, int i11) {
        this.f15577a = i10;
        this.f15578b = i11;
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(i iVar) {
        int iD = Na.l.D(this.f15577a, 0, iVar.f15543a.a());
        int iD2 = Na.l.D(this.f15578b, 0, iVar.f15543a.a());
        if (iD < iD2) {
            iVar.f(iD, iD2);
        } else {
            iVar.f(iD2, iD);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f15577a == xVar.f15577a && this.f15578b == xVar.f15578b;
    }

    public final int hashCode() {
        return (this.f15577a * 31) + this.f15578b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f15577a);
        sb2.append(", end=");
        return C0575j.b(sb2, this.f15578b, ')');
    }
}
