package Q1;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p078g1.s;
import p114j1.q;
import p114j1.r;
import p114j1.w;

/* JADX INFO: compiled from: SpliceInfoDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f4987c = new r();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f4988d = new q();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f4989e;

    /* JADX WARN: Code duplicated, block: B:14:0x0019  */
    @Override // C.g
    public final s K(J1.a aVar, ByteBuffer byteBuffer) {
        s.a eVar;
        List list;
        long jD;
        long j;
        w wVar = this.f4989e;
        if (wVar != null) {
            long j10 = aVar.j;
            synchronized (wVar) {
                j = wVar.f41076b;
            }
            if (j10 != j) {
                w wVar2 = new w(aVar.f17943g);
                this.f4989e = wVar2;
                wVar2.a(aVar.f17943g - aVar.j);
            }
        } else {
            w wVar3 = new w(aVar.f17943g);
            this.f4989e = wVar3;
            wVar3.a(aVar.f17943g - aVar.j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        r rVar = this.f4987c;
        rVar.E(iLimit, bArrArray);
        q qVar = this.f4988d;
        qVar.k(iLimit, bArrArray);
        qVar.o(39);
        long jG = (((long) qVar.g(1)) << 32) | ((long) qVar.g(32));
        qVar.o(20);
        int iG = qVar.g(12);
        int iG2 = qVar.g(8);
        rVar.H(14);
        if (iG2 == 0) {
            eVar = new e();
        } else if (iG2 == 255) {
            long jW = rVar.w();
            int i10 = iG - 4;
            rVar.f(new byte[i10], 0, i10);
            eVar = new a(jW, jG);
        } else if (iG2 == 4) {
            int iU = rVar.u();
            ArrayList arrayList = new ArrayList(iU);
            for (int i11 = 0; i11 < iU; i11++) {
                rVar.w();
                boolean z10 = (rVar.u() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z10) {
                    int iU2 = rVar.u();
                    boolean z11 = (iU2 & 64) != 0;
                    boolean z12 = (iU2 & 32) != 0;
                    if (z11) {
                        rVar.w();
                    }
                    if (!z11) {
                        int iU3 = rVar.u();
                        ArrayList arrayList3 = new ArrayList(iU3);
                        for (int i12 = 0; i12 < iU3; i12++) {
                            rVar.u();
                            rVar.w();
                            arrayList3.add(new f.a());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z12) {
                        rVar.u();
                        rVar.w();
                    }
                    rVar.A();
                    rVar.u();
                    rVar.u();
                }
                arrayList.add(new f.b(arrayList2));
            }
            eVar = new f(arrayList);
        } else if (iG2 == 5) {
            w wVar4 = this.f4989e;
            rVar.w();
            boolean z13 = (rVar.u() & 128) != 0;
            List listEmptyList = Collections.emptyList();
            if (z13) {
                list = listEmptyList;
                jD = -9223372036854775807L;
            } else {
                int iU4 = rVar.u();
                boolean z14 = (iU4 & 64) != 0;
                boolean z15 = (32 & iU4) != 0;
                boolean z16 = (iU4 & 16) != 0;
                jD = (!z14 || z16) ? -9223372036854775807L : g.d(jG, rVar);
                if (!z14) {
                    int iU5 = rVar.u();
                    ArrayList arrayList4 = new ArrayList(iU5);
                    for (int i13 = 0; i13 < iU5; i13++) {
                        rVar.u();
                        wVar4.b(!z16 ? g.d(jG, rVar) : -9223372036854775807L);
                        arrayList4.add(new d.a());
                    }
                    listEmptyList = arrayList4;
                }
                if (z15) {
                    rVar.u();
                    rVar.w();
                }
                rVar.A();
                rVar.u();
                rVar.u();
                list = listEmptyList;
            }
            eVar = new d(jD, wVar4.b(jD), list);
        } else if (iG2 != 6) {
            eVar = null;
        } else {
            w wVar5 = this.f4989e;
            long jD2 = g.d(jG, rVar);
            eVar = new g(jD2, wVar5.b(jD2));
        }
        return eVar == null ? new s(new s.a[0]) : new s(eVar);
    }
}
