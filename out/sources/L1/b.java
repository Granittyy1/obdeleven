package L1;

import C.g;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p078g1.s;
import p114j1.r;

/* JADX INFO: compiled from: EventMessageDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    @Override // C.g
    public final s K(J1.a aVar, ByteBuffer byteBuffer) {
        r rVar = new r(byteBuffer.limit(), byteBuffer.array());
        String strP = rVar.p();
        strP.getClass();
        String strP2 = rVar.p();
        strP2.getClass();
        return new s(new a(strP, strP2, rVar.o(), rVar.o(), Arrays.copyOfRange(rVar.f41062a, rVar.f41063b, rVar.f41064c)));
    }
}
