package p091h2;

import p114j1.q;
import p241t7.b;

/* JADX INFO: compiled from: MpeghUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: compiled from: MpeghUtil.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f36082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36083c;
    }

    public static int a(q qVar, int i10, int i11, int i12) {
        b.e(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        p095h6.b.a(p095h6.b.a(i13, i14), 1 << i12);
        if (qVar.b() < i10) {
            return -1;
        }
        int iG = qVar.g(i10);
        if (iG != i13) {
            return iG;
        }
        if (qVar.b() < i11) {
            return -1;
        }
        int iG2 = qVar.g(i11);
        int i15 = iG + iG2;
        if (iG2 != i14) {
            return i15;
        }
        if (qVar.b() < i12) {
            return -1;
        }
        return i15 + qVar.g(i12);
    }

    public static void b(q qVar) {
        qVar.o(3);
        qVar.o(8);
        boolean zF = qVar.f();
        boolean zF2 = qVar.f();
        if (zF) {
            qVar.o(5);
        }
        if (zF2) {
            qVar.o(6);
        }
    }

    public static void c(q qVar) {
        int iG;
        int iG2 = qVar.g(2);
        if (iG2 == 0) {
            qVar.o(6);
            return;
        }
        int iA = a(qVar, 5, 8, 16) + 1;
        if (iG2 == 1) {
            qVar.o(iA * 7);
            return;
        }
        if (iG2 == 2) {
            boolean zF = qVar.f();
            int i10 = zF ? 1 : 5;
            int i11 = zF ? 7 : 5;
            int i12 = zF ? 8 : 6;
            int i13 = 0;
            while (i13 < iA) {
                if (qVar.f()) {
                    qVar.o(7);
                    iG = 0;
                } else {
                    if (qVar.g(2) == 3 && qVar.g(i11) * i10 != 0) {
                        qVar.n();
                    }
                    iG = qVar.g(i12) * i10;
                    if (iG != 0 && iG != 180) {
                        qVar.n();
                    }
                    qVar.n();
                }
                if (iG != 0 && iG != 180 && qVar.f()) {
                    i13++;
                }
                i13++;
            }
        }
    }
}
