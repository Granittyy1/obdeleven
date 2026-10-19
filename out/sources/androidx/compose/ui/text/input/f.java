package androidx.compose.ui.text.input;

import A1.C0575j;

/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15540b;

    public f(int i10, int i11) {
        this.f15539a = i10;
        this.f15540b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        Y.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(i iVar) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f15539a; i11++) {
            int i12 = i10 + 1;
            int i13 = iVar.f15544b;
            if (i13 <= i12) {
                i10 = i13;
                break;
            }
            i10 = (Character.isHighSurrogate(iVar.b((i13 - i12) + (-1))) && Character.isLowSurrogate(iVar.b(iVar.f15544b - i12))) ? i10 + 2 : i12;
        }
        int iA = 0;
        for (int i14 = 0; i14 < this.f15540b; i14++) {
            int i15 = iA + 1;
            int i16 = iVar.f15545c + i15;
            s sVar = iVar.f15543a;
            if (i16 >= sVar.a()) {
                iA = sVar.a() - iVar.f15545c;
                break;
            }
            iA = (Character.isHighSurrogate(iVar.b((iVar.f15545c + i15) + (-1))) && Character.isLowSurrogate(iVar.b(iVar.f15545c + i15))) ? iA + 2 : i15;
        }
        int i17 = iVar.f15545c;
        iVar.a(i17, iA + i17);
        int i18 = iVar.f15544b;
        iVar.a(i18 - i10, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f15539a == fVar.f15539a && this.f15540b == fVar.f15540b;
    }

    public final int hashCode() {
        return (this.f15539a * 31) + this.f15540b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f15539a);
        sb2.append(", lengthAfterCursor=");
        return C0575j.b(sb2, this.f15540b, ')');
    }
}
