package V1;

import A1.C0574i;
import A1.F;
import A1.u;
import A1.v;
import A1.w;
import A1.x;
import java.util.Arrays;
import p078g1.n;
import p078g1.t;
import p114j1.A;
import p114j1.r;

/* JADX INFO: compiled from: FlacReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x f6676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f6677o;

    /* JADX INFO: compiled from: FlacReader.java */
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public x f6678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public x.a f6679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f6680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f6681d;

        @Override // V1.f
        public final long a(C0574i c0574i) {
            long j = this.f6681d;
            if (j < 0) {
                return -1L;
            }
            long j10 = -(j + 2);
            this.f6681d = -1L;
            return j10;
        }

        @Override // V1.f
        public final F b() {
            p241t7.b.k(this.f6680c != -1);
            return new w(this.f6678a, this.f6680c);
        }

        @Override // V1.f
        public final void c(long j) {
            long[] jArr = this.f6679b.f567a;
            this.f6681d = jArr[A.d(jArr, j, true)];
        }
    }

    @Override // V1.h
    public final long b(r rVar) {
        byte[] bArr = rVar.f41062a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            rVar.H(4);
            rVar.B();
        }
        int iB = u.b(i10, rVar);
        rVar.G(0);
        return iB;
    }

    @Override // V1.h
    public final boolean c(r rVar, long j, h.a aVar) {
        byte[] bArr = rVar.f41062a;
        x xVar = this.f6676n;
        if (xVar == null) {
            x xVar2 = new x(17, bArr);
            this.f6676n = xVar2;
            n.a aVarA = xVar2.c(Arrays.copyOfRange(bArr, 9, rVar.f41064c), null).a();
            aVarA.f35337l = t.m("audio/ogg");
            aVar.f6712a = new n(aVarA);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & 127) != 3) {
            if (b10 != -1) {
                return true;
            }
            a aVar2 = this.f6677o;
            if (aVar2 != null) {
                aVar2.f6680c = j;
                aVar.f6713b = aVar2;
            }
            aVar.f6712a.getClass();
            return false;
        }
        x.a aVarA2 = v.a(rVar);
        x xVar3 = new x(xVar.f556a, xVar.f557b, xVar.f558c, xVar.f559d, xVar.f560e, xVar.f562g, xVar.f563h, xVar.j, aVarA2, xVar.f566l);
        this.f6676n = xVar3;
        a aVar3 = new a();
        aVar3.f6678a = xVar3;
        aVar3.f6679b = aVarA2;
        aVar3.f6680c = -1L;
        aVar3.f6681d = -1L;
        this.f6677o = aVar3;
        return true;
    }

    @Override // V1.h
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f6676n = null;
            this.f6677o = null;
        }
    }
}
