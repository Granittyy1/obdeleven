package V1;

import A1.C0574i;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import p114j1.r;

/* JADX INFO: compiled from: OggPageHeader.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f6695f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f6696g = new r(255);

    public final boolean a(C0574i c0574i, boolean z10) throws IOException {
        boolean zC;
        boolean zC2;
        this.f6690a = 0;
        this.f6691b = 0L;
        this.f6692c = 0;
        this.f6693d = 0;
        this.f6694e = 0;
        r rVar = this.f6696g;
        rVar.D(27);
        try {
            zC = c0574i.c(rVar.f41062a, 0, 27, z10);
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
            zC = false;
        }
        if (!zC || rVar.w() != 1332176723) {
            return false;
        }
        if (rVar.u() != 0) {
            if (z10) {
                return false;
            }
            throw ParserException.b("unsupported bit stream revision");
        }
        this.f6690a = rVar.u();
        this.f6691b = rVar.k();
        rVar.l();
        rVar.l();
        rVar.l();
        int iU = rVar.u();
        this.f6692c = iU;
        this.f6693d = iU + 27;
        rVar.D(iU);
        try {
            zC2 = c0574i.c(rVar.f41062a, 0, this.f6692c, z10);
        } catch (EOFException e11) {
            if (!z10) {
                throw e11;
            }
            zC2 = false;
        }
        if (!zC2) {
            return false;
        }
        for (int i10 = 0; i10 < this.f6692c; i10++) {
            int iU2 = rVar.u();
            this.f6695f[i10] = iU2;
            this.f6694e += iU2;
        }
        return true;
    }

    public final boolean b(C0574i c0574i, long j) throws IOException {
        boolean zC;
        int iMin;
        p241t7.b.e(c0574i.f523d == c0574i.d());
        r rVar = this.f6696g;
        rVar.D(4);
        while (true) {
            if (j != -1 && c0574i.f523d + 4 >= j) {
                break;
            }
            try {
                zC = c0574i.c(rVar.f41062a, 0, 4, true);
            } catch (EOFException unused) {
                zC = false;
            }
            if (!zC) {
                break;
            }
            rVar.G(0);
            if (rVar.w() == 1332176723) {
                c0574i.f525f = 0;
                return true;
            }
            c0574i.i(1);
        }
        do {
            if (j != -1 && c0574i.f523d >= j) {
                break;
            }
            iMin = Math.min(c0574i.f526g, 1);
            c0574i.o(iMin);
            if (iMin == 0) {
                byte[] bArr = c0574i.f520a;
                iMin = c0574i.n(bArr, 0, Math.min(1, bArr.length), 0, true);
            }
            if (iMin != -1) {
                c0574i.f523d += (long) iMin;
            }
        } while (iMin != -1);
        return false;
    }
}
