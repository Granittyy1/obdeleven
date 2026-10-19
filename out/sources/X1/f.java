package X1;

import java.util.List;

/* JADX INFO: compiled from: LegacySubtitleUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static void a(h hVar, int i10, p114j1.f<c> fVar) {
        long jB = hVar.b(i10);
        List<p102i1.a> listC = hVar.c(jB);
        if (listC.isEmpty()) {
            return;
        }
        if (i10 == hVar.e() - 1) {
            throw new IllegalStateException();
        }
        long jB2 = hVar.b(i10 + 1) - hVar.b(i10);
        if (jB2 > 0) {
            fVar.a(new c(jB, jB2, listC));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    public static void b(h hVar, l.b bVar, p114j1.f<c> fVar) {
        int iA;
        boolean z10;
        long j = bVar.f7153a;
        if (j == -9223372036854775807L) {
            iA = 0;
        } else {
            iA = hVar.a(j);
            if (iA == -1) {
                iA = hVar.e();
            }
            if (iA > 0 && hVar.b(iA - 1) == j) {
                iA--;
            }
        }
        if (j == -9223372036854775807L || iA >= hVar.e()) {
            z10 = false;
        } else {
            List<p102i1.a> listC = hVar.c(j);
            long jB = hVar.b(iA);
            if (listC.isEmpty()) {
                z10 = false;
            } else {
                long j10 = bVar.f7153a;
                if (j10 < jB) {
                    fVar.a(new c(j10, jB - j10, listC));
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        for (int i10 = iA; i10 < hVar.e(); i10++) {
            a(hVar, i10, fVar);
        }
        if (bVar.f7154b) {
            if (z10) {
                iA--;
            }
            for (int i11 = 0; i11 < iA; i11++) {
                a(hVar, i11, fVar);
            }
            if (z10) {
                fVar.a(new c(hVar.b(iA), j - hVar.b(iA), hVar.c(j)));
            }
        }
    }
}
