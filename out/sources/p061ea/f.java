package p061ea;

import A8.A;
import J4.i;
import androidx.compose.material.T;
import com.google.gson.internal.b;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import p074fa.a;
import p293xa.d;

/* JADX INFO: compiled from: Input.kt */
/* JADX INFO: loaded from: classes.dex */
@d
public abstract class f implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p086ga.d<a> f34865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f34866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f34867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f34870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f34871h;

    /* JADX WARN: Illegal instructions before constructor call */
    public f() {
        a aVar = a.f35065k;
        this(aVar, T.k(aVar), b.f34861a);
    }

    public final void B(a aVar) {
        a aVarF = aVar.f();
        if (aVarF == null) {
            aVarF = a.f35065k;
        }
        M(aVarF);
        C(this.f34870g - ((long) (aVarF.f34857c - aVarF.f34856b)));
        aVar.i(this.f34865b);
    }

    public final void C(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(b.b(j, "tailRemaining shouldn't be negative: ").toString());
        }
        this.f34870g = j;
    }

    public final void M(a aVar) {
        this.f34866c = aVar;
        this.f34867d = aVar.f34855a;
        this.f34868e = aVar.f34856b;
        this.f34869f = aVar.f34857c;
    }

    public final void b(int i10) throws EOFException {
        if (i10 < 0) {
            throw new IllegalArgumentException(i.b(i10, "Negative discard is not allowed: ").toString());
        }
        int i11 = 0;
        int i12 = i10;
        while (i12 != 0) {
            a aVarS = s();
            if (this.f34869f - this.f34868e < 1) {
                aVarS = x(1, aVarS);
            }
            if (aVarS == null) {
                break;
            }
            int iMin = Math.min(aVarS.f34857c - aVarS.f34856b, i12);
            aVarS.c(iMin);
            this.f34868e += iMin;
            if (aVarS.f34857c - aVarS.f34856b == 0) {
                B(aVarS);
            }
            i12 -= iMin;
            i11 += iMin;
        }
        if (i11 != i10) {
            throw new EOFException(i.c(i10, "Unable to discard ", " bytes due to end of packet"));
        }
    }

    public final a c() {
        if (this.f34871h) {
            return null;
        }
        a aVarI = i();
        if (aVarI == null) {
            this.f34871h = true;
            return null;
        }
        a aVar = this.f34866c;
        kotlin.jvm.internal.i.e(aVar, "<this>");
        while (true) {
            a aVarG = aVar.g();
            if (aVarG == null) {
                break;
            }
            aVar = aVarG;
        }
        if (aVar == a.f35065k) {
            M(aVarI);
            if (this.f34870g != 0) {
                throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
            }
            a aVarG2 = aVarI.g();
            C(aVarG2 != null ? T.k(aVarG2) : 0L);
        } else {
            aVar.k(aVarI);
            C(T.k(aVarI) + this.f34870g);
        }
        return aVarI;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        a aVarS = s();
        a aVar = a.f35065k;
        if (aVarS != aVar) {
            M(aVar);
            C(0L);
            p086ga.d<a> pool = this.f34865b;
            kotlin.jvm.internal.i.e(pool, "pool");
            while (aVarS != null) {
                a aVarF = aVarS.f();
                aVarS.i(pool);
                aVarS = aVarF;
            }
        }
        if (this.f34871h) {
            return;
        }
        this.f34871h = true;
    }

    public final a h(a aVar) {
        a aVar2 = a.f35065k;
        while (aVar != aVar2) {
            a aVarF = aVar.f();
            aVar.i(this.f34865b);
            if (aVarF == null) {
                M(aVar2);
                C(0L);
                aVar = aVar2;
            } else {
                if (aVarF.f34857c > aVarF.f34856b) {
                    M(aVarF);
                    C(this.f34870g - ((long) (aVarF.f34857c - aVarF.f34856b)));
                    return aVarF;
                }
                aVar = aVarF;
            }
        }
        return c();
    }

    public a i() {
        p086ga.d<a> dVar = this.f34865b;
        a aVarY = dVar.y();
        try {
            aVarY.e();
            j(aVarY.f34855a);
            this.f34871h = true;
            if (aVarY.f34857c > aVarY.f34856b) {
                aVarY.a(0);
                return aVarY;
            }
            aVarY.i(dVar);
            return null;
        } catch (Throwable th) {
            aVarY.i(dVar);
            throw th;
        }
    }

    public abstract void j(ByteBuffer byteBuffer);

    public final void k(a aVar) {
        if (this.f34871h && aVar.g() == null) {
            this.f34868e = aVar.f34856b;
            this.f34869f = aVar.f34857c;
            C(0L);
            return;
        }
        int i10 = aVar.f34857c - aVar.f34856b;
        int iMin = Math.min(i10, 8 - (aVar.f34860f - aVar.f34859e));
        p086ga.d<a> dVar = this.f34865b;
        if (i10 > iMin) {
            a aVarY = dVar.y();
            a aVarY2 = dVar.y();
            aVarY.e();
            aVarY2.e();
            aVarY.k(aVarY2);
            aVarY2.k(aVar.f());
            A.l(aVarY, aVar, i10 - iMin);
            A.l(aVarY2, aVar, iMin);
            M(aVarY);
            C(T.k(aVarY2));
        } else {
            a aVarY3 = dVar.y();
            aVarY3.e();
            aVarY3.k(aVar.f());
            A.l(aVarY3, aVar, i10);
            M(aVarY3);
        }
        aVar.i(dVar);
    }

    public final boolean p() {
        return this.f34869f - this.f34868e == 0 && this.f34870g == 0 && (this.f34871h || c() == null);
    }

    public final a s() throws EOFException {
        a aVar = this.f34866c;
        int i10 = this.f34868e;
        if (i10 < 0 || i10 > aVar.f34857c) {
            int i11 = aVar.f34856b;
            G0.a.c(i10 - i11, aVar.f34857c - i11);
            throw null;
        }
        if (aVar.f34856b != i10) {
            aVar.f34856b = i10;
        }
        return aVar;
    }

    public final a x(int i10, a aVar) {
        while (true) {
            int i11 = this.f34869f - this.f34868e;
            if (i11 >= i10) {
                return aVar;
            }
            a aVarG = aVar.g();
            if (aVarG == null && (aVarG = c()) == null) {
                return null;
            }
            if (i11 == 0) {
                if (aVar != a.f35065k) {
                    B(aVar);
                }
                aVar = aVarG;
            } else {
                int iL = A.l(aVar, aVarG, i10 - i11);
                this.f34869f = aVar.f34857c;
                C(this.f34870g - ((long) iL));
                int i12 = aVarG.f34857c;
                int i13 = aVarG.f34856b;
                if (i12 <= i13) {
                    aVar.f();
                    aVar.k(aVarG.f());
                    aVarG.i(this.f34865b);
                } else {
                    if (iL < 0) {
                        throw new IllegalArgumentException(i.b(iL, "startGap shouldn't be negative: ").toString());
                    }
                    if (i13 >= iL) {
                        aVarG.f34858d = iL;
                    } else {
                        if (i13 != i12) {
                            StringBuilder sbE = A8.f.e(iL, "Unable to reserve ", " start gap: there are already ");
                            sbE.append(aVarG.f34857c - aVarG.f34856b);
                            sbE.append(" content bytes starting at offset ");
                            sbE.append(aVarG.f34856b);
                            throw new IllegalStateException(sbE.toString());
                        }
                        if (iL > aVarG.f34859e) {
                            int i14 = aVarG.f34860f;
                            if (iL > i14) {
                                throw new IllegalArgumentException(A8.f.d(iL, i14, "Start gap ", " is bigger than the capacity "));
                            }
                            StringBuilder sbE2 = A8.f.e(iL, "Unable to reserve ", " start gap: there are already ");
                            sbE2.append(i14 - aVarG.f34859e);
                            sbE2.append(" bytes reserved in the end");
                            throw new IllegalStateException(sbE2.toString());
                        }
                        aVarG.f34857c = iL;
                        aVarG.f34856b = iL;
                        aVarG.f34858d = iL;
                    }
                }
                if (aVar.f34857c - aVar.f34856b >= i10) {
                    return aVar;
                }
                if (i10 > 8) {
                    throw new IllegalStateException(i.c(i10, "minSize of ", " is too big (should be less than 8)"));
                }
            }
        }
    }

    public f(a head, long j, p086ga.d<a> pool) {
        kotlin.jvm.internal.i.e(head, "head");
        kotlin.jvm.internal.i.e(pool, "pool");
        this.f34865b = pool;
        this.f34866c = head;
        this.f34867d = head.f34855a;
        int i10 = head.f34856b;
        this.f34868e = i10;
        int i11 = head.f34857c;
        this.f34869f = i11;
        this.f34870g = j - ((long) (i11 - i10));
    }
}
