package p091h2;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p078g1.n;
import p078g1.t;
import p114j1.d;
import p114j1.r;

/* JADX INFO: renamed from: h2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultTsPayloadReaderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2207g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<n> f35879a;

    public C2207g(List list) {
        this.f35879a = list;
    }

    public final List<n> a(F.b bVar) {
        String str;
        int i10;
        List<byte[]> listSingletonList;
        List<n> list = this.f35879a;
        r rVar = new r(bVar.f35805d);
        while (rVar.a() > 0) {
            int iU = rVar.u();
            int iU2 = rVar.f41063b + rVar.u();
            if (iU == 134) {
                ArrayList arrayList = new ArrayList();
                int iU3 = rVar.u() & 31;
                for (int i11 = 0; i11 < iU3; i11++) {
                    String strS = rVar.s(3, StandardCharsets.UTF_8);
                    int iU4 = rVar.u();
                    boolean z10 = (iU4 & 128) != 0;
                    if (z10) {
                        i10 = iU4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bU = (byte) rVar.u();
                    rVar.H(1);
                    if (z10) {
                        boolean z11 = (bU & 64) != 0;
                        byte[] bArr = d.f41012a;
                        listSingletonList = Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    n.a aVar = new n.a();
                    aVar.f35338m = t.m(str);
                    aVar.f35330d = strS;
                    aVar.f35322H = i10;
                    aVar.f35341p = listSingletonList;
                    arrayList.add(new n(aVar));
                }
                list = arrayList;
            }
            rVar.G(iU2);
        }
        return list;
    }
}
