package androidx.compose.ui.text.input;

import A1.C0575j;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1273e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15538b;

    public C1273e(int i10, int i11) {
        this.f15537a = i10;
        this.f15538b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        Y.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(i iVar) {
        int i10 = iVar.f15545c;
        int i11 = this.f15538b;
        int iA = i10 + i11;
        int i12 = (i10 ^ iA) & (i11 ^ iA);
        s sVar = iVar.f15543a;
        if (i12 < 0) {
            iA = sVar.a();
        }
        iVar.a(iVar.f15545c, Math.min(iA, sVar.a()));
        int i13 = iVar.f15544b;
        int i14 = this.f15537a;
        int i15 = i13 - i14;
        if (((i13 ^ i15) & (i14 ^ i13)) < 0) {
            i15 = 0;
        }
        iVar.a(Math.max(0, i15), iVar.f15544b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1273e)) {
            return false;
        }
        C1273e c1273e = (C1273e) obj;
        return this.f15537a == c1273e.f15537a && this.f15538b == c1273e.f15538b;
    }

    public final int hashCode() {
        return (this.f15537a * 31) + this.f15538b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f15537a);
        sb2.append(", lengthAfterCursor=");
        return C0575j.b(sb2, this.f15538b, ')');
    }
}
