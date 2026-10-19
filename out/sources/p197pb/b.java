package p197pb;

import D2.V;
import S4.o;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.i;
import okhttp3.A;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.e;
import okhttp3.internal.connection.f;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.m;
import okhttp3.q;
import okhttp3.u;
import okhttp3.y;
import okhttp3.z;
import p318zb.B;
import p318zb.v;

/* JADX INFO: compiled from: CallServerInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45939a;

    public b(boolean z10) {
        this.f45939a = z10;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x018b  */
    /* JADX WARN: Code duplicated, block: B:112:0x019e A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:105:0x0187, B:109:0x018f, B:113:0x01ac, B:115:0x01ba, B:122:0x01d3, B:124:0x01d7, B:128:0x01e4, B:130:0x01f7, B:132:0x0201, B:133:0x020b, B:117:0x01c4, B:112:0x019e), top: B:165:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01ba A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:105:0x0187, B:109:0x018f, B:113:0x01ac, B:115:0x01ba, B:122:0x01d3, B:124:0x01d7, B:128:0x01e4, B:130:0x01f7, B:132:0x0201, B:133:0x020b, B:117:0x01c4, B:112:0x019e), top: B:165:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4 A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:105:0x0187, B:109:0x018f, B:113:0x01ac, B:115:0x01ba, B:122:0x01d3, B:124:0x01d7, B:128:0x01e4, B:130:0x01f7, B:132:0x0201, B:133:0x020b, B:117:0x01c4, B:112:0x019e), top: B:165:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d3 A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:105:0x0187, B:109:0x018f, B:113:0x01ac, B:115:0x01ba, B:122:0x01d3, B:124:0x01d7, B:128:0x01e4, B:130:0x01f7, B:132:0x0201, B:133:0x020b, B:117:0x01c4, B:112:0x019e), top: B:165:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01d7 A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:105:0x0187, B:109:0x018f, B:113:0x01ac, B:115:0x01ba, B:122:0x01d3, B:124:0x01d7, B:128:0x01e4, B:130:0x01f7, B:132:0x0201, B:133:0x020b, B:117:0x01c4, B:112:0x019e), top: B:165:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e4 A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:105:0x0187, B:109:0x018f, B:113:0x01ac, B:115:0x01ba, B:122:0x01d3, B:124:0x01d7, B:128:0x01e4, B:130:0x01f7, B:132:0x0201, B:133:0x020b, B:117:0x01c4, B:112:0x019e), top: B:165:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x01f7 A[Catch: IOException -> 0x019c, TryCatch #13 {IOException -> 0x019c, blocks: (B:105:0x0187, B:109:0x018f, B:113:0x01ac, B:115:0x01ba, B:122:0x01d3, B:124:0x01d7, B:128:0x01e4, B:130:0x01f7, B:132:0x0201, B:133:0x020b, B:117:0x01c4, B:112:0x019e), top: B:165:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0200  */
    /* JADX WARN: Code duplicated, block: B:136:0x020f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0215  */
    /* JADX WARN: Code duplicated, block: B:139:0x0216  */
    /* JADX WARN: Code duplicated, block: B:141:0x0219  */
    /* JADX WARN: Code duplicated, block: B:156:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0109  */
    /* JADX WARN: Code duplicated, block: B:76:0x010d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0110  */
    /* JADX WARN: Code duplicated, block: B:81:0x011a A[Catch: IOException -> 0x012d, TryCatch #5 {IOException -> 0x012d, blocks: (B:79:0x0111, B:81:0x011a, B:86:0x012f), top: B:151:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x012a A[PHI: r18
      0x012a: PHI (r18v3 okhttp3.z$a) = (r18v2 okhttp3.z$a), (r18v4 okhttp3.z$a) binds: [B:77:0x010e, B:80:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0149  */
    /* JADX WARN: Code duplicated, block: B:91:0x014b  */
    /* JADX WARN: Code duplicated, block: B:98:0x015d A[Catch: IOException -> 0x017d, TryCatch #11 {IOException -> 0x017d, blocks: (B:88:0x0139, B:96:0x0154, B:98:0x015d, B:100:0x0168, B:103:0x017f), top: B:162:0x0139 }] */
    @Override // okhttp3.q
    public final z intercept(q.a aVar) throws Throwable {
        z.a aVarE;
        boolean z10;
        IOException iOException;
        z.a aVar2;
        IOException iOException2;
        z zVarA;
        int i10;
        z zVarA2;
        A a10;
        long jB;
        A a11;
        Long lValueOf;
        IOException iOException3;
        z.a aVarE2;
        boolean z11;
        boolean z12;
        f fVar = (f) aVar;
        c cVar = fVar.f45946d;
        i.b(cVar);
        m mVar = cVar.f45451b;
        e call = cVar.f45450a;
        d dVar = cVar.f45453d;
        f fVar2 = cVar.f45456g;
        u uVar = fVar.f45947e;
        y yVar = uVar.f45664d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                mVar.getClass();
                i.e(call, "call");
                dVar.b(uVar);
                try {
                    if (!o.m(uVar.f45662b) || yVar == null) {
                        iOException3 = null;
                        z10 = true;
                        call.f(cVar, true, false, null);
                        aVarE = null;
                    } else {
                        try {
                            if ("100-continue".equalsIgnoreCase(uVar.f45663c.e("Expect"))) {
                                try {
                                    dVar.f();
                                    aVarE2 = cVar.e(true);
                                    try {
                                        mVar.getClass();
                                        i.e(call, "call");
                                        z11 = false;
                                    } catch (IOException e10) {
                                        e = e10;
                                        aVarE = aVarE2;
                                        z10 = true;
                                        if (e instanceof ConnectionShutdownException) {
                                            throw e;
                                        }
                                        if (!cVar.f45455f) {
                                            throw e;
                                        }
                                        iOException = e;
                                        if (aVarE == null) {
                                            aVar2 = aVarE;
                                            aVar2.f45693a = uVar;
                                            aVar2.f45697e = fVar2.f45502e;
                                            aVar2.f45702k = jCurrentTimeMillis;
                                            iOException2 = iOException;
                                            aVar2.f45703l = System.currentTimeMillis();
                                            zVarA = aVar2.a();
                                            i10 = zVarA.f45683e;
                                            if (i10 != 100) {
                                                z.a aVarE3 = cVar.e(false);
                                                i.b(aVarE3);
                                                if (z10) {
                                                    mVar.getClass();
                                                    i.e(call, "call");
                                                }
                                                aVarE3.f45693a = uVar;
                                                aVarE3.f45697e = fVar2.f45502e;
                                                aVarE3.f45702k = jCurrentTimeMillis;
                                                aVarE3.f45703l = System.currentTimeMillis();
                                                zVarA = aVarE3.a();
                                                i10 = zVarA.f45683e;
                                            } else {
                                                z.a aVarE4 = cVar.e(false);
                                                i.b(aVarE4);
                                                if (z10) {
                                                    mVar.getClass();
                                                    i.e(call, "call");
                                                }
                                                aVarE4.f45693a = uVar;
                                                aVarE4.f45697e = fVar2.f45502e;
                                                aVarE4.f45702k = jCurrentTimeMillis;
                                                aVarE4.f45703l = System.currentTimeMillis();
                                                zVarA = aVarE4.a();
                                                i10 = zVarA.f45683e;
                                            }
                                            mVar.getClass();
                                            i.e(call, "call");
                                            if (this.f45939a) {
                                                z.a aVarI = zVarA.i();
                                                aVarI.f45699g = cVar.d(zVarA);
                                                zVarA2 = aVarI.a();
                                            } else {
                                                z.a aVarI2 = zVarA.i();
                                                aVarI2.f45699g = cVar.d(zVarA);
                                                zVarA2 = aVarI2.a();
                                            }
                                            if ("close".equalsIgnoreCase(zVarA2.f45680b.f45663c.e("Connection"))) {
                                                dVar.e().k();
                                            } else {
                                                dVar.e().k();
                                            }
                                            if (i10 != 204) {
                                                a10 = zVarA2.f45686h;
                                                if (a10 != null) {
                                                    jB = a10.b();
                                                } else {
                                                    jB = -1;
                                                }
                                                if (jB > 0) {
                                                    StringBuilder sb2 = new StringBuilder("HTTP ");
                                                    sb2.append(i10);
                                                    sb2.append(" had non-zero Content-Length: ");
                                                    a11 = zVarA2.f45686h;
                                                    if (a11 != null) {
                                                        lValueOf = Long.valueOf(a11.b());
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    sb2.append(lValueOf);
                                                    throw new ProtocolException(sb2.toString());
                                                }
                                            } else {
                                                a10 = zVarA2.f45686h;
                                                if (a10 != null) {
                                                    jB = a10.b();
                                                } else {
                                                    jB = -1;
                                                }
                                                if (jB > 0) {
                                                    StringBuilder sb3 = new StringBuilder("HTTP ");
                                                    sb3.append(i10);
                                                    sb3.append(" had non-zero Content-Length: ");
                                                    a11 = zVarA2.f45686h;
                                                    if (a11 != null) {
                                                        lValueOf = Long.valueOf(a11.b());
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    sb3.append(lValueOf);
                                                    throw new ProtocolException(sb3.toString());
                                                }
                                            }
                                            return zVarA2;
                                        }
                                        try {
                                            aVarE = cVar.e(false);
                                            i.b(aVarE);
                                            if (z10) {
                                                mVar.getClass();
                                                i.e(call, "call");
                                                aVar2 = aVarE;
                                                z10 = false;
                                            } else {
                                                aVar2 = aVarE;
                                            }
                                            aVar2.f45693a = uVar;
                                            aVar2.f45697e = fVar2.f45502e;
                                            aVar2.f45702k = jCurrentTimeMillis;
                                            iOException2 = iOException;
                                            try {
                                                aVar2.f45703l = System.currentTimeMillis();
                                                zVarA = aVar2.a();
                                                i10 = zVarA.f45683e;
                                                if (i10 != 100) {
                                                    z.a aVarE5 = cVar.e(false);
                                                    i.b(aVarE5);
                                                    if (z10) {
                                                        mVar.getClass();
                                                        i.e(call, "call");
                                                    }
                                                    aVarE5.f45693a = uVar;
                                                    aVarE5.f45697e = fVar2.f45502e;
                                                    aVarE5.f45702k = jCurrentTimeMillis;
                                                    aVarE5.f45703l = System.currentTimeMillis();
                                                    zVarA = aVarE5.a();
                                                    i10 = zVarA.f45683e;
                                                } else {
                                                    z.a aVarE6 = cVar.e(false);
                                                    i.b(aVarE6);
                                                    if (z10) {
                                                        mVar.getClass();
                                                        i.e(call, "call");
                                                    }
                                                    aVarE6.f45693a = uVar;
                                                    aVarE6.f45697e = fVar2.f45502e;
                                                    aVarE6.f45702k = jCurrentTimeMillis;
                                                    aVarE6.f45703l = System.currentTimeMillis();
                                                    zVarA = aVarE6.a();
                                                    i10 = zVarA.f45683e;
                                                }
                                                mVar.getClass();
                                                i.e(call, "call");
                                                try {
                                                    if (this.f45939a) {
                                                        z.a aVarI3 = zVarA.i();
                                                        aVarI3.f45699g = cVar.d(zVarA);
                                                        zVarA2 = aVarI3.a();
                                                    } else {
                                                        z.a aVarI4 = zVarA.i();
                                                        aVarI4.f45699g = cVar.d(zVarA);
                                                        zVarA2 = aVarI4.a();
                                                    }
                                                    if ("close".equalsIgnoreCase(zVarA2.f45680b.f45663c.e("Connection"))) {
                                                        dVar.e().k();
                                                    } else {
                                                        dVar.e().k();
                                                    }
                                                    if (i10 != 204) {
                                                        a10 = zVarA2.f45686h;
                                                        if (a10 != null) {
                                                            jB = a10.b();
                                                        } else {
                                                            jB = -1;
                                                        }
                                                        if (jB > 0) {
                                                            StringBuilder sb4 = new StringBuilder("HTTP ");
                                                            sb4.append(i10);
                                                            sb4.append(" had non-zero Content-Length: ");
                                                            a11 = zVarA2.f45686h;
                                                            if (a11 != null) {
                                                                lValueOf = Long.valueOf(a11.b());
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            sb4.append(lValueOf);
                                                            throw new ProtocolException(sb4.toString());
                                                        }
                                                    } else {
                                                        a10 = zVarA2.f45686h;
                                                        if (a10 != null) {
                                                            jB = a10.b();
                                                        } else {
                                                            jB = -1;
                                                        }
                                                        if (jB > 0) {
                                                            StringBuilder sb5 = new StringBuilder("HTTP ");
                                                            sb5.append(i10);
                                                            sb5.append(" had non-zero Content-Length: ");
                                                            a11 = zVarA2.f45686h;
                                                            if (a11 != null) {
                                                                lValueOf = Long.valueOf(a11.b());
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            sb5.append(lValueOf);
                                                            throw new ProtocolException(sb5.toString());
                                                        }
                                                    }
                                                    return zVarA2;
                                                } catch (IOException e11) {
                                                    e = e11;
                                                }
                                            } catch (IOException e12) {
                                                e = e12;
                                            }
                                        } catch (IOException e13) {
                                            e = e13;
                                            iOException2 = iOException;
                                        }
                                        if (iOException2 == null) {
                                            throw e;
                                        }
                                        IOException iOException4 = iOException2;
                                        V.e(iOException4, e);
                                        throw iOException4;
                                    }
                                } catch (IOException e14) {
                                    mVar.getClass();
                                    i.e(call, "call");
                                    cVar.f(e14);
                                    throw e14;
                                }
                            } else {
                                z11 = true;
                                aVarE2 = null;
                            }
                            if (aVarE2 == null) {
                                try {
                                    if (yVar.isDuplex()) {
                                        try {
                                            dVar.f();
                                            yVar.writeTo(v.a(cVar.b(uVar, true)));
                                        } catch (IOException e15) {
                                            mVar.getClass();
                                            i.e(call, "call");
                                            cVar.f(e15);
                                            throw e15;
                                        }
                                    } else {
                                        B bA = v.a(cVar.b(uVar, false));
                                        yVar.writeTo(bA);
                                        bA.close();
                                    }
                                    z12 = z11;
                                    aVarE = aVarE2;
                                } catch (IOException e16) {
                                    e = e16;
                                    z10 = z11;
                                    aVarE = aVarE2;
                                    if (e instanceof ConnectionShutdownException) {
                                        throw e;
                                    }
                                    if (!cVar.f45455f) {
                                        throw e;
                                    }
                                    iOException = e;
                                    if (aVarE == null) {
                                        aVar2 = aVarE;
                                        aVar2.f45693a = uVar;
                                        aVar2.f45697e = fVar2.f45502e;
                                        aVar2.f45702k = jCurrentTimeMillis;
                                        iOException2 = iOException;
                                        aVar2.f45703l = System.currentTimeMillis();
                                        zVarA = aVar2.a();
                                        i10 = zVarA.f45683e;
                                        if (i10 != 100) {
                                            z.a aVarE7 = cVar.e(false);
                                            i.b(aVarE7);
                                            if (z10) {
                                                mVar.getClass();
                                                i.e(call, "call");
                                            }
                                            aVarE7.f45693a = uVar;
                                            aVarE7.f45697e = fVar2.f45502e;
                                            aVarE7.f45702k = jCurrentTimeMillis;
                                            aVarE7.f45703l = System.currentTimeMillis();
                                            zVarA = aVarE7.a();
                                            i10 = zVarA.f45683e;
                                        } else {
                                            z.a aVarE8 = cVar.e(false);
                                            i.b(aVarE8);
                                            if (z10) {
                                                mVar.getClass();
                                                i.e(call, "call");
                                            }
                                            aVarE8.f45693a = uVar;
                                            aVarE8.f45697e = fVar2.f45502e;
                                            aVarE8.f45702k = jCurrentTimeMillis;
                                            aVarE8.f45703l = System.currentTimeMillis();
                                            zVarA = aVarE8.a();
                                            i10 = zVarA.f45683e;
                                        }
                                        mVar.getClass();
                                        i.e(call, "call");
                                        if (this.f45939a) {
                                            z.a aVarI5 = zVarA.i();
                                            aVarI5.f45699g = cVar.d(zVarA);
                                            zVarA2 = aVarI5.a();
                                        } else {
                                            z.a aVarI6 = zVarA.i();
                                            aVarI6.f45699g = cVar.d(zVarA);
                                            zVarA2 = aVarI6.a();
                                        }
                                        if ("close".equalsIgnoreCase(zVarA2.f45680b.f45663c.e("Connection"))) {
                                            dVar.e().k();
                                        } else {
                                            dVar.e().k();
                                        }
                                        if (i10 != 204) {
                                            a10 = zVarA2.f45686h;
                                            if (a10 != null) {
                                                jB = a10.b();
                                            } else {
                                                jB = -1;
                                            }
                                            if (jB > 0) {
                                                StringBuilder sb6 = new StringBuilder("HTTP ");
                                                sb6.append(i10);
                                                sb6.append(" had non-zero Content-Length: ");
                                                a11 = zVarA2.f45686h;
                                                if (a11 != null) {
                                                    lValueOf = Long.valueOf(a11.b());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                sb6.append(lValueOf);
                                                throw new ProtocolException(sb6.toString());
                                            }
                                        } else {
                                            a10 = zVarA2.f45686h;
                                            if (a10 != null) {
                                                jB = a10.b();
                                            } else {
                                                jB = -1;
                                            }
                                            if (jB > 0) {
                                                StringBuilder sb7 = new StringBuilder("HTTP ");
                                                sb7.append(i10);
                                                sb7.append(" had non-zero Content-Length: ");
                                                a11 = zVarA2.f45686h;
                                                if (a11 != null) {
                                                    lValueOf = Long.valueOf(a11.b());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                sb7.append(lValueOf);
                                                throw new ProtocolException(sb7.toString());
                                            }
                                        }
                                        return zVarA2;
                                    }
                                    aVarE = cVar.e(false);
                                    i.b(aVarE);
                                    if (z10) {
                                        mVar.getClass();
                                        i.e(call, "call");
                                        aVar2 = aVarE;
                                        z10 = false;
                                    } else {
                                        aVar2 = aVarE;
                                    }
                                    aVar2.f45693a = uVar;
                                    aVar2.f45697e = fVar2.f45502e;
                                    aVar2.f45702k = jCurrentTimeMillis;
                                    iOException2 = iOException;
                                    aVar2.f45703l = System.currentTimeMillis();
                                    zVarA = aVar2.a();
                                    i10 = zVarA.f45683e;
                                    if (i10 != 100) {
                                        z.a aVarE9 = cVar.e(false);
                                        i.b(aVarE9);
                                        if (z10) {
                                            mVar.getClass();
                                            i.e(call, "call");
                                        }
                                        aVarE9.f45693a = uVar;
                                        aVarE9.f45697e = fVar2.f45502e;
                                        aVarE9.f45702k = jCurrentTimeMillis;
                                        aVarE9.f45703l = System.currentTimeMillis();
                                        zVarA = aVarE9.a();
                                        i10 = zVarA.f45683e;
                                    } else {
                                        z.a aVarE10 = cVar.e(false);
                                        i.b(aVarE10);
                                        if (z10) {
                                            mVar.getClass();
                                            i.e(call, "call");
                                        }
                                        aVarE10.f45693a = uVar;
                                        aVarE10.f45697e = fVar2.f45502e;
                                        aVarE10.f45702k = jCurrentTimeMillis;
                                        aVarE10.f45703l = System.currentTimeMillis();
                                        zVarA = aVarE10.a();
                                        i10 = zVarA.f45683e;
                                    }
                                    mVar.getClass();
                                    i.e(call, "call");
                                    if (this.f45939a) {
                                        z.a aVarI7 = zVarA.i();
                                        aVarI7.f45699g = cVar.d(zVarA);
                                        zVarA2 = aVarI7.a();
                                    } else {
                                        z.a aVarI8 = zVarA.i();
                                        aVarI8.f45699g = cVar.d(zVarA);
                                        zVarA2 = aVarI8.a();
                                    }
                                    if ("close".equalsIgnoreCase(zVarA2.f45680b.f45663c.e("Connection"))) {
                                        dVar.e().k();
                                    } else {
                                        dVar.e().k();
                                    }
                                    if (i10 != 204) {
                                        a10 = zVarA2.f45686h;
                                        if (a10 != null) {
                                            jB = a10.b();
                                        } else {
                                            jB = -1;
                                        }
                                        if (jB > 0) {
                                            StringBuilder sb8 = new StringBuilder("HTTP ");
                                            sb8.append(i10);
                                            sb8.append(" had non-zero Content-Length: ");
                                            a11 = zVarA2.f45686h;
                                            if (a11 != null) {
                                                lValueOf = Long.valueOf(a11.b());
                                            } else {
                                                lValueOf = null;
                                            }
                                            sb8.append(lValueOf);
                                            throw new ProtocolException(sb8.toString());
                                        }
                                    } else {
                                        a10 = zVarA2.f45686h;
                                        if (a10 != null) {
                                            jB = a10.b();
                                        } else {
                                            jB = -1;
                                        }
                                        if (jB > 0) {
                                            StringBuilder sb9 = new StringBuilder("HTTP ");
                                            sb9.append(i10);
                                            sb9.append(" had non-zero Content-Length: ");
                                            a11 = zVarA2.f45686h;
                                            if (a11 != null) {
                                                lValueOf = Long.valueOf(a11.b());
                                            } else {
                                                lValueOf = null;
                                            }
                                            sb9.append(lValueOf);
                                            throw new ProtocolException(sb9.toString());
                                        }
                                    }
                                    return zVarA2;
                                    if (iOException2 == null) {
                                        throw e;
                                    }
                                    IOException iOException5 = iOException2;
                                    V.e(iOException5, e);
                                    throw iOException5;
                                }
                            } else {
                                z12 = z11;
                                aVarE = aVarE2;
                                try {
                                    call.f(cVar, true, false, null);
                                    if (!(fVar2.f45504g != null)) {
                                        dVar.e().k();
                                    }
                                } catch (IOException e17) {
                                    e = e17;
                                    z10 = z12;
                                    if (e instanceof ConnectionShutdownException) {
                                        throw e;
                                    }
                                    if (!cVar.f45455f) {
                                        throw e;
                                    }
                                    iOException = e;
                                    if (aVarE == null) {
                                        aVar2 = aVarE;
                                        aVar2.f45693a = uVar;
                                        aVar2.f45697e = fVar2.f45502e;
                                        aVar2.f45702k = jCurrentTimeMillis;
                                        iOException2 = iOException;
                                        aVar2.f45703l = System.currentTimeMillis();
                                        zVarA = aVar2.a();
                                        i10 = zVarA.f45683e;
                                        if (i10 != 100) {
                                            z.a aVarE11 = cVar.e(false);
                                            i.b(aVarE11);
                                            if (z10) {
                                                mVar.getClass();
                                                i.e(call, "call");
                                            }
                                            aVarE11.f45693a = uVar;
                                            aVarE11.f45697e = fVar2.f45502e;
                                            aVarE11.f45702k = jCurrentTimeMillis;
                                            aVarE11.f45703l = System.currentTimeMillis();
                                            zVarA = aVarE11.a();
                                            i10 = zVarA.f45683e;
                                        } else {
                                            z.a aVarE12 = cVar.e(false);
                                            i.b(aVarE12);
                                            if (z10) {
                                                mVar.getClass();
                                                i.e(call, "call");
                                            }
                                            aVarE12.f45693a = uVar;
                                            aVarE12.f45697e = fVar2.f45502e;
                                            aVarE12.f45702k = jCurrentTimeMillis;
                                            aVarE12.f45703l = System.currentTimeMillis();
                                            zVarA = aVarE12.a();
                                            i10 = zVarA.f45683e;
                                        }
                                        mVar.getClass();
                                        i.e(call, "call");
                                        if (this.f45939a) {
                                            z.a aVarI9 = zVarA.i();
                                            aVarI9.f45699g = cVar.d(zVarA);
                                            zVarA2 = aVarI9.a();
                                        } else {
                                            z.a aVarI10 = zVarA.i();
                                            aVarI10.f45699g = cVar.d(zVarA);
                                            zVarA2 = aVarI10.a();
                                        }
                                        if ("close".equalsIgnoreCase(zVarA2.f45680b.f45663c.e("Connection"))) {
                                            dVar.e().k();
                                        } else {
                                            dVar.e().k();
                                        }
                                        if (i10 != 204) {
                                            a10 = zVarA2.f45686h;
                                            if (a10 != null) {
                                                jB = a10.b();
                                            } else {
                                                jB = -1;
                                            }
                                            if (jB > 0) {
                                                StringBuilder sb10 = new StringBuilder("HTTP ");
                                                sb10.append(i10);
                                                sb10.append(" had non-zero Content-Length: ");
                                                a11 = zVarA2.f45686h;
                                                if (a11 != null) {
                                                    lValueOf = Long.valueOf(a11.b());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                sb10.append(lValueOf);
                                                throw new ProtocolException(sb10.toString());
                                            }
                                        } else {
                                            a10 = zVarA2.f45686h;
                                            if (a10 != null) {
                                                jB = a10.b();
                                            } else {
                                                jB = -1;
                                            }
                                            if (jB > 0) {
                                                StringBuilder sb11 = new StringBuilder("HTTP ");
                                                sb11.append(i10);
                                                sb11.append(" had non-zero Content-Length: ");
                                                a11 = zVarA2.f45686h;
                                                if (a11 != null) {
                                                    lValueOf = Long.valueOf(a11.b());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                sb11.append(lValueOf);
                                                throw new ProtocolException(sb11.toString());
                                            }
                                        }
                                        return zVarA2;
                                    }
                                    aVarE = cVar.e(false);
                                    i.b(aVarE);
                                    if (z10) {
                                        mVar.getClass();
                                        i.e(call, "call");
                                        aVar2 = aVarE;
                                        z10 = false;
                                    } else {
                                        aVar2 = aVarE;
                                    }
                                    aVar2.f45693a = uVar;
                                    aVar2.f45697e = fVar2.f45502e;
                                    aVar2.f45702k = jCurrentTimeMillis;
                                    iOException2 = iOException;
                                    aVar2.f45703l = System.currentTimeMillis();
                                    zVarA = aVar2.a();
                                    i10 = zVarA.f45683e;
                                    if (i10 != 100) {
                                        z.a aVarE13 = cVar.e(false);
                                        i.b(aVarE13);
                                        if (z10) {
                                            mVar.getClass();
                                            i.e(call, "call");
                                        }
                                        aVarE13.f45693a = uVar;
                                        aVarE13.f45697e = fVar2.f45502e;
                                        aVarE13.f45702k = jCurrentTimeMillis;
                                        aVarE13.f45703l = System.currentTimeMillis();
                                        zVarA = aVarE13.a();
                                        i10 = zVarA.f45683e;
                                    } else {
                                        z.a aVarE14 = cVar.e(false);
                                        i.b(aVarE14);
                                        if (z10) {
                                            mVar.getClass();
                                            i.e(call, "call");
                                        }
                                        aVarE14.f45693a = uVar;
                                        aVarE14.f45697e = fVar2.f45502e;
                                        aVarE14.f45702k = jCurrentTimeMillis;
                                        aVarE14.f45703l = System.currentTimeMillis();
                                        zVarA = aVarE14.a();
                                        i10 = zVarA.f45683e;
                                    }
                                    mVar.getClass();
                                    i.e(call, "call");
                                    if (this.f45939a) {
                                        z.a aVarI11 = zVarA.i();
                                        aVarI11.f45699g = cVar.d(zVarA);
                                        zVarA2 = aVarI11.a();
                                    } else {
                                        z.a aVarI12 = zVarA.i();
                                        aVarI12.f45699g = cVar.d(zVarA);
                                        zVarA2 = aVarI12.a();
                                    }
                                    if ("close".equalsIgnoreCase(zVarA2.f45680b.f45663c.e("Connection"))) {
                                        dVar.e().k();
                                    } else {
                                        dVar.e().k();
                                    }
                                    if (i10 != 204) {
                                        a10 = zVarA2.f45686h;
                                        if (a10 != null) {
                                            jB = a10.b();
                                        } else {
                                            jB = -1;
                                        }
                                        if (jB > 0) {
                                            StringBuilder sb12 = new StringBuilder("HTTP ");
                                            sb12.append(i10);
                                            sb12.append(" had non-zero Content-Length: ");
                                            a11 = zVarA2.f45686h;
                                            if (a11 != null) {
                                                lValueOf = Long.valueOf(a11.b());
                                            } else {
                                                lValueOf = null;
                                            }
                                            sb12.append(lValueOf);
                                            throw new ProtocolException(sb12.toString());
                                        }
                                    } else {
                                        a10 = zVarA2.f45686h;
                                        if (a10 != null) {
                                            jB = a10.b();
                                        } else {
                                            jB = -1;
                                        }
                                        if (jB > 0) {
                                            StringBuilder sb13 = new StringBuilder("HTTP ");
                                            sb13.append(i10);
                                            sb13.append(" had non-zero Content-Length: ");
                                            a11 = zVarA2.f45686h;
                                            if (a11 != null) {
                                                lValueOf = Long.valueOf(a11.b());
                                            } else {
                                                lValueOf = null;
                                            }
                                            sb13.append(lValueOf);
                                            throw new ProtocolException(sb13.toString());
                                        }
                                    }
                                    return zVarA2;
                                    if (iOException2 == null) {
                                        throw e;
                                    }
                                    IOException iOException6 = iOException2;
                                    V.e(iOException6, e);
                                    throw iOException6;
                                }
                            }
                            z10 = z12;
                            iOException3 = null;
                        } catch (IOException e18) {
                            e = e18;
                            z10 = true;
                            aVarE = null;
                        }
                    }
                    if (yVar != null) {
                        try {
                            if (!yVar.isDuplex()) {
                                try {
                                    dVar.a();
                                } catch (IOException e19) {
                                    cVar.f(e19);
                                    throw e19;
                                }
                            }
                            iOException = iOException3;
                        } catch (IOException e20) {
                            e = e20;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            if (!cVar.f45455f) {
                                throw e;
                            }
                            iOException = e;
                        }
                    } else {
                        dVar.a();
                        iOException = iOException3;
                    }
                } catch (IOException e21) {
                    e = e21;
                    z10 = true;
                    aVarE = null;
                    if (e instanceof ConnectionShutdownException) {
                        throw e;
                    }
                    if (!cVar.f45455f) {
                        throw e;
                    }
                    iOException = e;
                    if (aVarE == null) {
                        aVar2 = aVarE;
                        aVar2.f45693a = uVar;
                        aVar2.f45697e = fVar2.f45502e;
                        aVar2.f45702k = jCurrentTimeMillis;
                        iOException2 = iOException;
                        aVar2.f45703l = System.currentTimeMillis();
                        zVarA = aVar2.a();
                        i10 = zVarA.f45683e;
                        if (i10 != 100) {
                            z.a aVarE15 = cVar.e(false);
                            i.b(aVarE15);
                            if (z10) {
                                mVar.getClass();
                                i.e(call, "call");
                            }
                            aVarE15.f45693a = uVar;
                            aVarE15.f45697e = fVar2.f45502e;
                            aVarE15.f45702k = jCurrentTimeMillis;
                            aVarE15.f45703l = System.currentTimeMillis();
                            zVarA = aVarE15.a();
                            i10 = zVarA.f45683e;
                        } else {
                            z.a aVarE16 = cVar.e(false);
                            i.b(aVarE16);
                            if (z10) {
                                mVar.getClass();
                                i.e(call, "call");
                            }
                            aVarE16.f45693a = uVar;
                            aVarE16.f45697e = fVar2.f45502e;
                            aVarE16.f45702k = jCurrentTimeMillis;
                            aVarE16.f45703l = System.currentTimeMillis();
                            zVarA = aVarE16.a();
                            i10 = zVarA.f45683e;
                        }
                        mVar.getClass();
                        i.e(call, "call");
                        if (this.f45939a) {
                            z.a aVarI13 = zVarA.i();
                            aVarI13.f45699g = cVar.d(zVarA);
                            zVarA2 = aVarI13.a();
                        } else {
                            z.a aVarI14 = zVarA.i();
                            aVarI14.f45699g = cVar.d(zVarA);
                            zVarA2 = aVarI14.a();
                        }
                        if ("close".equalsIgnoreCase(zVarA2.f45680b.f45663c.e("Connection"))) {
                            dVar.e().k();
                        } else {
                            dVar.e().k();
                        }
                        if (i10 != 204) {
                            a10 = zVarA2.f45686h;
                            if (a10 != null) {
                                jB = a10.b();
                            } else {
                                jB = -1;
                            }
                            if (jB > 0) {
                                StringBuilder sb14 = new StringBuilder("HTTP ");
                                sb14.append(i10);
                                sb14.append(" had non-zero Content-Length: ");
                                a11 = zVarA2.f45686h;
                                if (a11 != null) {
                                    lValueOf = Long.valueOf(a11.b());
                                } else {
                                    lValueOf = null;
                                }
                                sb14.append(lValueOf);
                                throw new ProtocolException(sb14.toString());
                            }
                        } else {
                            a10 = zVarA2.f45686h;
                            if (a10 != null) {
                                jB = a10.b();
                            } else {
                                jB = -1;
                            }
                            if (jB > 0) {
                                StringBuilder sb15 = new StringBuilder("HTTP ");
                                sb15.append(i10);
                                sb15.append(" had non-zero Content-Length: ");
                                a11 = zVarA2.f45686h;
                                if (a11 != null) {
                                    lValueOf = Long.valueOf(a11.b());
                                } else {
                                    lValueOf = null;
                                }
                                sb15.append(lValueOf);
                                throw new ProtocolException(sb15.toString());
                            }
                        }
                        return zVarA2;
                    }
                    aVarE = cVar.e(false);
                    i.b(aVarE);
                    if (z10) {
                        mVar.getClass();
                        i.e(call, "call");
                        aVar2 = aVarE;
                        z10 = false;
                    } else {
                        aVar2 = aVarE;
                    }
                    aVar2.f45693a = uVar;
                    aVar2.f45697e = fVar2.f45502e;
                    aVar2.f45702k = jCurrentTimeMillis;
                    iOException2 = iOException;
                    aVar2.f45703l = System.currentTimeMillis();
                    zVarA = aVar2.a();
                    i10 = zVarA.f45683e;
                    if (i10 != 100) {
                        z.a aVarE17 = cVar.e(false);
                        i.b(aVarE17);
                        if (z10) {
                            mVar.getClass();
                            i.e(call, "call");
                        }
                        aVarE17.f45693a = uVar;
                        aVarE17.f45697e = fVar2.f45502e;
                        aVarE17.f45702k = jCurrentTimeMillis;
                        aVarE17.f45703l = System.currentTimeMillis();
                        zVarA = aVarE17.a();
                        i10 = zVarA.f45683e;
                    } else {
                        z.a aVarE18 = cVar.e(false);
                        i.b(aVarE18);
                        if (z10) {
                            mVar.getClass();
                            i.e(call, "call");
                        }
                        aVarE18.f45693a = uVar;
                        aVarE18.f45697e = fVar2.f45502e;
                        aVarE18.f45702k = jCurrentTimeMillis;
                        aVarE18.f45703l = System.currentTimeMillis();
                        zVarA = aVarE18.a();
                        i10 = zVarA.f45683e;
                    }
                    mVar.getClass();
                    i.e(call, "call");
                    if (this.f45939a) {
                        z.a aVarI15 = zVarA.i();
                        aVarI15.f45699g = cVar.d(zVarA);
                        zVarA2 = aVarI15.a();
                    } else {
                        z.a aVarI16 = zVarA.i();
                        aVarI16.f45699g = cVar.d(zVarA);
                        zVarA2 = aVarI16.a();
                    }
                    if ("close".equalsIgnoreCase(zVarA2.f45680b.f45663c.e("Connection"))) {
                        dVar.e().k();
                    } else {
                        dVar.e().k();
                    }
                    if (i10 != 204) {
                        a10 = zVarA2.f45686h;
                        if (a10 != null) {
                            jB = a10.b();
                        } else {
                            jB = -1;
                        }
                        if (jB > 0) {
                            StringBuilder sb16 = new StringBuilder("HTTP ");
                            sb16.append(i10);
                            sb16.append(" had non-zero Content-Length: ");
                            a11 = zVarA2.f45686h;
                            if (a11 != null) {
                                lValueOf = Long.valueOf(a11.b());
                            } else {
                                lValueOf = null;
                            }
                            sb16.append(lValueOf);
                            throw new ProtocolException(sb16.toString());
                        }
                    } else {
                        a10 = zVarA2.f45686h;
                        if (a10 != null) {
                            jB = a10.b();
                        } else {
                            jB = -1;
                        }
                        if (jB > 0) {
                            StringBuilder sb17 = new StringBuilder("HTTP ");
                            sb17.append(i10);
                            sb17.append(" had non-zero Content-Length: ");
                            a11 = zVarA2.f45686h;
                            if (a11 != null) {
                                lValueOf = Long.valueOf(a11.b());
                            } else {
                                lValueOf = null;
                            }
                            sb17.append(lValueOf);
                            throw new ProtocolException(sb17.toString());
                        }
                    }
                    return zVarA2;
                    if (iOException2 == null) {
                        throw e;
                    }
                    IOException iOException7 = iOException2;
                    V.e(iOException7, e);
                    throw iOException7;
                }
            } catch (IOException e22) {
                mVar.getClass();
                i.e(call, "call");
                cVar.f(e22);
                throw e22;
            }
        } catch (IOException e23) {
            e = e23;
        }
        if (aVarE == null) {
            aVarE = cVar.e(false);
            i.b(aVarE);
            if (z10) {
                mVar.getClass();
                i.e(call, "call");
                aVar2 = aVarE;
                z10 = false;
            } else {
                aVar2 = aVarE;
            }
            aVar2.f45693a = uVar;
            aVar2.f45697e = fVar2.f45502e;
            aVar2.f45702k = jCurrentTimeMillis;
            iOException2 = iOException;
            aVar2.f45703l = System.currentTimeMillis();
            zVarA = aVar2.a();
            i10 = zVarA.f45683e;
            if (i10 != 100 || (102 <= i10 && i10 < 200)) {
                z.a aVarE19 = cVar.e(false);
                i.b(aVarE19);
                if (z10) {
                    mVar.getClass();
                    i.e(call, "call");
                }
                aVarE19.f45693a = uVar;
                aVarE19.f45697e = fVar2.f45502e;
                aVarE19.f45702k = jCurrentTimeMillis;
                aVarE19.f45703l = System.currentTimeMillis();
                zVarA = aVarE19.a();
                i10 = zVarA.f45683e;
            }
            mVar.getClass();
            i.e(call, "call");
            if (this.f45939a || i10 != 101) {
                z.a aVarI17 = zVarA.i();
                aVarI17.f45699g = cVar.d(zVarA);
                zVarA2 = aVarI17.a();
            } else {
                z.a aVarI18 = zVarA.i();
                aVarI18.f45699g = p172nb.b.f45028c;
                zVarA2 = aVarI18.a();
            }
            if ("close".equalsIgnoreCase(zVarA2.f45680b.f45663c.e("Connection")) || "close".equalsIgnoreCase(z.c("Connection", zVarA2))) {
                dVar.e().k();
            }
            if (i10 != 204 || i10 == 205) {
                a10 = zVarA2.f45686h;
                if (a10 != null) {
                    jB = a10.b();
                } else {
                    jB = -1;
                }
                if (jB > 0) {
                    StringBuilder sb18 = new StringBuilder("HTTP ");
                    sb18.append(i10);
                    sb18.append(" had non-zero Content-Length: ");
                    a11 = zVarA2.f45686h;
                    if (a11 != null) {
                        lValueOf = Long.valueOf(a11.b());
                    } else {
                        lValueOf = null;
                    }
                    sb18.append(lValueOf);
                    throw new ProtocolException(sb18.toString());
                }
            }
            return zVarA2;
        }
        aVar2 = aVarE;
        aVar2.f45693a = uVar;
        aVar2.f45697e = fVar2.f45502e;
        aVar2.f45702k = jCurrentTimeMillis;
        iOException2 = iOException;
        aVar2.f45703l = System.currentTimeMillis();
        zVarA = aVar2.a();
        i10 = zVarA.f45683e;
        if (i10 != 100) {
            z.a aVarE110 = cVar.e(false);
            i.b(aVarE110);
            if (z10) {
                mVar.getClass();
                i.e(call, "call");
            }
            aVarE110.f45693a = uVar;
            aVarE110.f45697e = fVar2.f45502e;
            aVarE110.f45702k = jCurrentTimeMillis;
            aVarE110.f45703l = System.currentTimeMillis();
            zVarA = aVarE110.a();
            i10 = zVarA.f45683e;
        } else {
            z.a aVarE111 = cVar.e(false);
            i.b(aVarE111);
            if (z10) {
                mVar.getClass();
                i.e(call, "call");
            }
            aVarE111.f45693a = uVar;
            aVarE111.f45697e = fVar2.f45502e;
            aVarE111.f45702k = jCurrentTimeMillis;
            aVarE111.f45703l = System.currentTimeMillis();
            zVarA = aVarE111.a();
            i10 = zVarA.f45683e;
        }
        mVar.getClass();
        i.e(call, "call");
        if (this.f45939a) {
            z.a aVarI19 = zVarA.i();
            aVarI19.f45699g = cVar.d(zVarA);
            zVarA2 = aVarI19.a();
        } else {
            z.a aVarI110 = zVarA.i();
            aVarI110.f45699g = cVar.d(zVarA);
            zVarA2 = aVarI110.a();
        }
        if ("close".equalsIgnoreCase(zVarA2.f45680b.f45663c.e("Connection"))) {
            dVar.e().k();
        } else {
            dVar.e().k();
        }
        if (i10 != 204) {
            a10 = zVarA2.f45686h;
            if (a10 != null) {
                jB = a10.b();
            } else {
                jB = -1;
            }
            if (jB > 0) {
                StringBuilder sb19 = new StringBuilder("HTTP ");
                sb19.append(i10);
                sb19.append(" had non-zero Content-Length: ");
                a11 = zVarA2.f45686h;
                if (a11 != null) {
                    lValueOf = Long.valueOf(a11.b());
                } else {
                    lValueOf = null;
                }
                sb19.append(lValueOf);
                throw new ProtocolException(sb19.toString());
            }
        } else {
            a10 = zVarA2.f45686h;
            if (a10 != null) {
                jB = a10.b();
            } else {
                jB = -1;
            }
            if (jB > 0) {
                StringBuilder sb110 = new StringBuilder("HTTP ");
                sb110.append(i10);
                sb110.append(" had non-zero Content-Length: ");
                a11 = zVarA2.f45686h;
                if (a11 != null) {
                    lValueOf = Long.valueOf(a11.b());
                } else {
                    lValueOf = null;
                }
                sb110.append(lValueOf);
                throw new ProtocolException(sb110.toString());
            }
        }
        return zVarA2;
        if (iOException2 == null) {
            throw e;
        }
        IOException iOException8 = iOException2;
        V.e(iOException8, e);
        throw iOException8;
    }
}
