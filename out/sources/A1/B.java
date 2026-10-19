package A1;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: Id3Peeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p114j1.r f396a = new p114j1.r(10);

    public final p078g1.s a(C0574i c0574i, O1.g.a aVar) throws IOException {
        p114j1.r rVar = this.f396a;
        p078g1.s sVarI0 = null;
        int i10 = 0;
        while (true) {
            try {
                c0574i.c(rVar.f41062a, 0, 10, false);
                rVar.G(0);
                if (rVar.x() != 4801587) {
                    break;
                }
                rVar.H(3);
                int iT = rVar.t();
                int i11 = iT + 10;
                if (sVarI0 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(rVar.f41062a, 0, bArr, 0, 10);
                    c0574i.c(bArr, 10, iT, false);
                    sVarI0 = new O1.g(aVar).i0(i11, bArr);
                } else {
                    c0574i.k(iT, false);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        c0574i.f525f = 0;
        c0574i.k(i10, false);
        return sVarI0;
    }
}
