package A1;

import java.util.Arrays;

/* JADX INFO: compiled from: FlacMetadataReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static x.a a(p114j1.r rVar) {
        rVar.H(1);
        int iX = rVar.x();
        long j = ((long) rVar.f41063b) + ((long) iX);
        int i10 = iX / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jO = rVar.o();
            if (jO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jO;
            jArrCopyOf2[i11] = rVar.o();
            rVar.H(2);
        }
        rVar.H((int) (j - ((long) rVar.f41063b)));
        return new x.a(jArrCopyOf, jArrCopyOf2);
    }
}
