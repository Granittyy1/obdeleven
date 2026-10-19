package V1;

import A1.C0574i;
import java.io.EOFException;
import java.io.IOException;
import p114j1.r;

/* JADX INFO: compiled from: OggPacket.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f6685a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f6686b = new r(0, new byte[65025]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6687c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6689e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f6688d = 0;
        do {
            int i13 = this.f6688d;
            int i14 = i10 + i13;
            e eVar = this.f6685a;
            if (i14 >= eVar.f6692c) {
                break;
            }
            int[] iArr = eVar.f6695f;
            this.f6688d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final boolean b(C0574i c0574i) throws IOException {
        int i10;
        p241t7.b.k(c0574i != null);
        boolean z10 = this.f6689e;
        r rVar = this.f6686b;
        if (z10) {
            this.f6689e = false;
            rVar.D(0);
        }
        while (!this.f6689e) {
            int i11 = this.f6687c;
            e eVar = this.f6685a;
            if (i11 < 0) {
                if (eVar.b(c0574i, -1L) && eVar.a(c0574i, true)) {
                    int iA = eVar.f6693d;
                    if ((eVar.f6690a & 1) == 1 && rVar.f41064c == 0) {
                        iA += a(0);
                        i10 = this.f6688d;
                    } else {
                        i10 = 0;
                    }
                    try {
                        c0574i.i(iA);
                        this.f6687c = i10;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f6687c);
            int i12 = this.f6687c + this.f6688d;
            if (iA2 > 0) {
                rVar.b(rVar.f41064c + iA2);
                try {
                    c0574i.a(rVar.f41062a, rVar.f41064c, iA2, false);
                    rVar.F(rVar.f41064c + iA2);
                    this.f6689e = eVar.f6695f[i12 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == eVar.f6692c) {
                i12 = -1;
            }
            this.f6687c = i12;
        }
        return true;
    }
}
