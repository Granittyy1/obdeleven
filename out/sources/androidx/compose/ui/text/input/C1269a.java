package androidx.compose.ui.text.input;

import A1.C0575j;
import androidx.compose.ui.text.C1260a;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1269a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1260a f15518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15519b;

    public C1269a(C1260a c1260a, int i10) {
        this.f15518a = c1260a;
        this.f15519b = i10;
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(i iVar) {
        int i10 = iVar.f15546d;
        boolean z10 = i10 != -1;
        C1260a c1260a = this.f15518a;
        if (z10) {
            iVar.d(c1260a.f15408c, i10, iVar.f15547e);
        } else {
            iVar.d(c1260a.f15408c, iVar.f15544b, iVar.f15545c);
        }
        int i11 = iVar.f15544b;
        int i12 = iVar.f15545c;
        int i13 = i11 == i12 ? i12 : -1;
        int i14 = this.f15519b;
        int iD = Na.l.D(i14 > 0 ? (i13 + i14) - 1 : (i13 + i14) - c1260a.f15408c.length(), 0, iVar.f15543a.a());
        iVar.f(iD, iD);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1269a)) {
            return false;
        }
        C1269a c1269a = (C1269a) obj;
        return kotlin.jvm.internal.i.a(this.f15518a.f15408c, c1269a.f15518a.f15408c) && this.f15519b == c1269a.f15519b;
    }

    public final int hashCode() {
        return (this.f15518a.f15408c.hashCode() * 31) + this.f15519b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f15518a.f15408c);
        sb2.append("', newCursorPosition=");
        return C0575j.b(sb2, this.f15519b, ')');
    }

    public C1269a(String str, int i10) {
        this(new C1260a(str), i10);
    }
}
