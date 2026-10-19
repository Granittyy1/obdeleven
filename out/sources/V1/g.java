package V1;

import A1.N;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import p078g1.n;
import p078g1.s;
import p078g1.t;
import p114j1.C2479a;
import p114j1.r;

/* JADX INFO: compiled from: OpusReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f6697o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f6698p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6699n;

    public static boolean e(r rVar, byte[] bArr) {
        if (rVar.a() < bArr.length) {
            return false;
        }
        int i10 = rVar.f41063b;
        byte[] bArr2 = new byte[bArr.length];
        rVar.f(bArr2, 0, bArr.length);
        rVar.G(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // V1.h
    public final long b(r rVar) {
        byte[] bArr = rVar.f41062a;
        return (((long) this.f6708i) * C2479a.j(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // V1.h
    public final boolean c(r rVar, long j, h.a aVar) throws ParserException {
        if (e(rVar, f6697o)) {
            byte[] bArrCopyOf = Arrays.copyOf(rVar.f41062a, rVar.f41064c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListH = C2479a.h(bArrCopyOf);
            if (aVar.f6712a != null) {
                return true;
            }
            n.a aVar2 = new n.a();
            aVar2.f35337l = t.m("audio/ogg");
            aVar2.f35338m = t.m("audio/opus");
            aVar2.f35317C = i10;
            aVar2.f35318D = 48000;
            aVar2.f35341p = arrayListH;
            aVar.f6712a = new n(aVar2);
            return true;
        }
        if (!e(rVar, f6698p)) {
            p241t7.b.l(aVar.f6712a);
            return false;
        }
        p241t7.b.l(aVar.f6712a);
        if (this.f6699n) {
            return true;
        }
        this.f6699n = true;
        rVar.H(8);
        s sVarB = N.b(ImmutableList.I(N.c(rVar, false, false).f444a));
        if (sVarB == null) {
            return true;
        }
        n.a aVarA = aVar.f6712a.a();
        aVarA.f35336k = sVarB.b(aVar.f6712a.f35300l);
        aVar.f6712a = new n(aVarA);
        return true;
    }

    @Override // V1.h
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f6699n = false;
        }
    }
}
