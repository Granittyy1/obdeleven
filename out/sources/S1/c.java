package S1;

import A1.C0574i;
import java.io.IOException;
import p114j1.r;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f5472a = new r(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5473b;

    public final long a(C0574i c0574i) throws IOException {
        r rVar = this.f5472a;
        int i10 = 0;
        c0574i.c(rVar.f41062a, 0, 1, false);
        int i11 = rVar.f41062a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        c0574i.c(rVar.f41062a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (rVar.f41062a[i10] & 255) + (i14 << 8);
        }
        this.f5473b = i13 + 1 + this.f5473b;
        return i14;
    }
}
