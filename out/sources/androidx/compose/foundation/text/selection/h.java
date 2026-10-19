package androidx.compose.foundation.text.selection;

import A1.C0575j;
import androidx.compose.ui.text.B;

/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f11601d;

    public h(int i10, int i11, int i12, B b10) {
        this.f11598a = i10;
        this.f11599b = i11;
        this.f11600c = i12;
        this.f11601d = b10;
    }

    public final i.a a(int i10) {
        return new i.a(p.a(this.f11601d, i10), i10, 1L);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionInfo(id=1, range=(");
        int i10 = this.f11598a;
        sb2.append(i10);
        sb2.append('-');
        B b10 = this.f11601d;
        sb2.append(p.a(b10, i10));
        sb2.append(',');
        int i11 = this.f11599b;
        sb2.append(i11);
        sb2.append('-');
        sb2.append(p.a(b10, i11));
        sb2.append("), prevOffset=");
        return C0575j.b(sb2, this.f11600c, ')');
    }
}
