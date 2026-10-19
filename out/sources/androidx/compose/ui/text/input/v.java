package androidx.compose.ui.text.input;

import A1.C0575j;

/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15574b;

    public v(int i10, int i11) {
        this.f15573a = i10;
        this.f15574b = i11;
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(i iVar) {
        if (iVar.f15546d != -1) {
            iVar.f15546d = -1;
            iVar.f15547e = -1;
        }
        s sVar = iVar.f15543a;
        int iD = Na.l.D(this.f15573a, 0, sVar.a());
        int iD2 = Na.l.D(this.f15574b, 0, sVar.a());
        if (iD != iD2) {
            if (iD < iD2) {
                iVar.e(iD, iD2);
            } else {
                iVar.e(iD2, iD);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f15573a == vVar.f15573a && this.f15574b == vVar.f15574b;
    }

    public final int hashCode() {
        return (this.f15573a * 31) + this.f15574b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f15573a);
        sb2.append(", end=");
        return C0575j.b(sb2, this.f15574b, ')');
    }
}
