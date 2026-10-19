package androidx.compose.ui.text.input;

import A1.C0575j;
import androidx.compose.ui.text.C1260a;

/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1260a f15575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15576b;

    public w(String str, int i10) {
        this.f15575a = new C1260a(str);
        this.f15576b = i10;
    }

    @Override // androidx.compose.ui.text.input.g
    public final void a(i iVar) {
        int i10 = iVar.f15546d;
        boolean z10 = i10 != -1;
        C1260a c1260a = this.f15575a;
        if (z10) {
            iVar.d(c1260a.f15408c, i10, iVar.f15547e);
            String str = c1260a.f15408c;
            if (str.length() > 0) {
                iVar.e(i10, str.length() + i10);
            }
        } else {
            int i11 = iVar.f15544b;
            iVar.d(c1260a.f15408c, i11, iVar.f15545c);
            String str2 = c1260a.f15408c;
            if (str2.length() > 0) {
                iVar.e(i11, str2.length() + i11);
            }
        }
        int i12 = iVar.f15544b;
        int i13 = iVar.f15545c;
        int i14 = i12 == i13 ? i13 : -1;
        int i15 = this.f15576b;
        int iD = Na.l.D(i15 > 0 ? (i14 + i15) - 1 : (i14 + i15) - c1260a.f15408c.length(), 0, iVar.f15543a.a());
        iVar.f(iD, iD);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.i.a(this.f15575a.f15408c, wVar.f15575a.f15408c) && this.f15576b == wVar.f15576b;
    }

    public final int hashCode() {
        return (this.f15575a.f15408c.hashCode() * 31) + this.f15576b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f15575a.f15408c);
        sb2.append("', newCursorPosition=");
        return C0575j.b(sb2, this.f15576b, ')');
    }
}
