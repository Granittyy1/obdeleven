package p223s1;

import C.g;
import J1.a;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.AbstractC1389g;
import androidx.media3.exoplayer.K;
import androidx.media3.exoplayer.Q;
import androidx.media3.exoplayer.n0;
import androidx.media3.exoplayer.source.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p078g1.n;
import p078g1.r;
import p078g1.s;
import p078g1.v;
import p114j1.A;
import p114j1.j;

/* JADX INFO: compiled from: MetadataRenderer.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1389g implements Handler.Callback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public s f46873A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f46874B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a.C0530a f46875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final K.a f46876t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Handler f46877u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f46878v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f46879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f46880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f46881y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f46882z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(K.a aVar, Looper looper) {
        super(5);
        a.C0530a c0530a = a.f46872a;
        this.f46876t = aVar;
        this.f46877u = looper == null ? null : new Handler(looper, this);
        this.f46875s = c0530a;
        this.f46878v = new a(1);
        this.f46874B = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void H() {
        this.f46873A = null;
        this.f46879w = null;
        this.f46874B = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void J(long j, boolean z10) {
        this.f46873A = null;
        this.f46880x = false;
        this.f46881y = false;
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g
    public final void O(n[] nVarArr, long j, long j10, h.b bVar) {
        this.f46879w = this.f46875s.a(nVarArr[0]);
        s sVar = this.f46873A;
        if (sVar != null) {
            long j11 = this.f46874B;
            long j12 = sVar.f35446b;
            long j13 = (j11 + j12) - j10;
            if (j12 != j13) {
                sVar = new s(j13, sVar.f35445a);
            }
            this.f46873A = sVar;
        }
        this.f46874B = j10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public final void Q(s sVar, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            s.a[] aVarArr = sVar.f35445a;
            if (i10 >= aVarArr.length) {
                return;
            }
            n nVarA = aVarArr[i10].a();
            if (nVarA != null) {
                a.C0530a c0530a = this.f46875s;
                if (c0530a.b(nVarA)) {
                    g gVarA = c0530a.a(nVarA);
                    byte[] bArrC = aVarArr[i10].c();
                    bArrC.getClass();
                    a aVar = this.f46878v;
                    aVar.k();
                    aVar.m(bArrC.length);
                    ByteBuffer byteBuffer = aVar.f17941e;
                    int i11 = A.f40996a;
                    byteBuffer.put(bArrC);
                    aVar.n();
                    s sVarJ = gVarA.J(aVar);
                    if (sVarJ != null) {
                        Q(sVarJ, arrayList);
                    }
                } else {
                    arrayList.add(aVarArr[i10]);
                }
            } else {
                arrayList.add(aVarArr[i10]);
            }
            i10++;
        }
    }

    public final long R(long j) {
        p241t7.b.k(j != -9223372036854775807L);
        p241t7.b.k(this.f46874B != -9223372036854775807L);
        return j - this.f46874B;
    }

    @Override // androidx.media3.exoplayer.m0
    public final boolean b() {
        return true;
    }

    @Override // androidx.media3.exoplayer.n0
    public final int c(n nVar) {
        if (this.f46875s.b(nVar)) {
            return n0.n(nVar.f35288M == 0 ? 4 : 2, 0, 0, 0);
        }
        return n0.n(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.AbstractC1389g, androidx.media3.exoplayer.m0
    public final boolean d() {
        return this.f46881y;
    }

    @Override // androidx.media3.exoplayer.m0, androidx.media3.exoplayer.n0
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        s sVar = (s) message.obj;
        K.a aVar = this.f46876t;
        K k10 = K.this;
        r.a aVarA = k10.f18024f0.a();
        int i10 = 0;
        while (true) {
            s.a[] aVarArr = sVar.f35445a;
            if (i10 >= aVarArr.length) {
                break;
            }
            aVarArr[i10].b(aVarA);
            i10++;
        }
        k10.f18024f0 = new r(aVarA);
        r rVarI0 = k10.i0();
        boolean zEquals = rVarI0.equals(k10.f18003P);
        j<v.c> jVar = k10.f18033m;
        if (!zEquals) {
            k10.f18003P = rVarI0;
            jVar.c(14, new androidx.compose.ui.graphics.colorspace.r(aVar));
        }
        jVar.c(28, new androidx.compose.ui.graphics.colorspace.s(1, sVar));
        jVar.b();
        return true;
    }

    @Override // androidx.media3.exoplayer.m0
    public final void v(long j, long j10) {
        int i10 = 1;
        boolean z10 = true;
        while (z10) {
            int i11 = 0;
            if (!this.f46880x && this.f46873A == null) {
                a aVar = this.f46878v;
                aVar.k();
                Q q10 = this.f18364d;
                q10.a();
                int iP = P(q10, aVar, 0);
                if (iP == -4) {
                    if (aVar.g(4)) {
                        this.f46880x = true;
                    } else if (aVar.f17943g >= this.f18372m) {
                        aVar.j = this.f46882z;
                        aVar.n();
                        g gVar = this.f46879w;
                        int i12 = A.f40996a;
                        s sVarJ = gVar.J(aVar);
                        if (sVarJ != null) {
                            ArrayList arrayList = new ArrayList(sVarJ.f35445a.length);
                            Q(sVarJ, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f46873A = new s(R(aVar.f17943g), (s.a[]) arrayList.toArray(new s.a[0]));
                            }
                        }
                    }
                } else if (iP == -5) {
                    n nVar = (n) q10.f18136b;
                    nVar.getClass();
                    this.f46882z = nVar.f35307s;
                }
            }
            s sVar = this.f46873A;
            if (sVar == null || sVar.f35446b > R(j)) {
                z10 = false;
            } else {
                s sVar2 = this.f46873A;
                Handler handler = this.f46877u;
                if (handler != null) {
                    handler.obtainMessage(1, sVar2).sendToTarget();
                } else {
                    K.a aVar2 = this.f46876t;
                    K k10 = K.this;
                    r.a aVarA = k10.f18024f0.a();
                    while (true) {
                        s.a[] aVarArr = sVar2.f35445a;
                        if (i11 >= aVarArr.length) {
                            break;
                        }
                        aVarArr[i11].b(aVarA);
                        i11++;
                    }
                    k10.f18024f0 = new r(aVarA);
                    r rVarI0 = k10.i0();
                    boolean zEquals = rVarI0.equals(k10.f18003P);
                    j<v.c> jVar = k10.f18033m;
                    if (!zEquals) {
                        k10.f18003P = rVarI0;
                        jVar.c(14, new androidx.compose.ui.graphics.colorspace.r(aVar2));
                    }
                    jVar.c(28, new androidx.compose.ui.graphics.colorspace.s(i10, sVar2));
                    jVar.b();
                }
                this.f46873A = null;
                z10 = true;
            }
            if (this.f46880x && this.f46873A == null) {
                this.f46881y = true;
            }
        }
    }
}
