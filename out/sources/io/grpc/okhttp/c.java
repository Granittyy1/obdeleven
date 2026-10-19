package io.grpc.okhttp;

import A8.p;
import E9.f;
import E9.i;
import com.google.common.io.BaseEncoding;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.g;
import io.grpc.h;
import io.grpc.internal.AbstractC2208a;
import io.grpc.internal.AbstractC2216e;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.KeepAliveManager;
import io.grpc.internal.O0;
import io.grpc.internal.P;
import io.grpc.internal.S0;
import io.grpc.internal.U0;
import io.grpc.internal.y0;
import io.grpc.m;
import io.grpc.okhttp.internal.framed.ErrorCode;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import p318zb.C2839f;

/* JADX INFO: compiled from: OkHttpClientStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends AbstractC2208a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C2839f f37843p = new C2839f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MethodDescriptor<?, ?> f37844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f37845i;
    public final O0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f37846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f37847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f37848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final io.grpc.a f37849n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f37850o;

    /* JADX INFO: compiled from: OkHttpClientStream.java */
    public class a {
        public a() {
        }

        public final void a(m mVar, byte[] bArr) {
            p111ia.b.c();
            try {
                String str = "/" + c.this.f37844h.f36887b;
                if (bArr != null) {
                    c.this.f37850o = true;
                    str = str + "?" + BaseEncoding.f27996a.c(bArr);
                }
                synchronized (c.this.f37847l.f37865w) {
                    b.l(c.this.f37847l, mVar, str);
                }
                p111ia.b.f36850a.getClass();
            } catch (Throwable th) {
                try {
                    p111ia.b.f36850a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: OkHttpClientStream.java */
    public class b extends P implements e.a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public boolean f37852A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public boolean f37853B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f37854C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f37855D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public final io.grpc.okhttp.a f37856E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public final e f37857F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public final d f37858G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f37859H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public final p111ia.c f37860I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public e.b f37861J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f37862K;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f37864v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final Object f37865w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public ArrayList f37866x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final C2839f f37867y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f37868z;

        public b(int i10, O0 o10, Object obj, io.grpc.okhttp.a aVar, e eVar, d dVar, int i11) {
            super(i10, o10, c.this.f37499a);
            this.f37434s = com.google.common.base.b.f27791b;
            this.f37867y = new C2839f();
            this.f37868z = false;
            this.f37852A = false;
            this.f37853B = false;
            this.f37859H = true;
            this.f37862K = -1;
            p.j(obj, "lock");
            this.f37865w = obj;
            this.f37856E = aVar;
            this.f37857F = eVar;
            this.f37858G = dVar;
            this.f37854C = i11;
            this.f37855D = i11;
            this.f37864v = i11;
            p111ia.b.f36850a.getClass();
            this.f37860I = p111ia.a.f36848a;
        }

        public static void l(b bVar, m mVar, String str) {
            c cVar = c.this;
            String str2 = cVar.f37846k;
            boolean z10 = cVar.f37850o;
            d dVar = bVar.f37858G;
            boolean z11 = dVar.f37872B == null;
            F9.c cVar2 = E9.c.f3145a;
            p.j(mVar, "headers");
            p.j(str, "defaultPath");
            p.j(str2, "authority");
            mVar.a(GrpcUtil.f37207i);
            mVar.a(GrpcUtil.j);
            m.b bVar2 = GrpcUtil.f37208k;
            mVar.a(bVar2);
            ArrayList arrayList = new ArrayList(mVar.f37784b + 7);
            if (z11) {
                arrayList.add(E9.c.f3146b);
            } else {
                arrayList.add(E9.c.f3145a);
            }
            if (z10) {
                arrayList.add(E9.c.f3148d);
            } else {
                arrayList.add(E9.c.f3147c);
            }
            arrayList.add(new F9.c(F9.c.f3287h, str2));
            arrayList.add(new F9.c(F9.c.f3285f, str));
            arrayList.add(new F9.c(bVar2.f37787a, cVar.f37845i));
            arrayList.add(E9.c.f3149e);
            arrayList.add(E9.c.f3150f);
            Logger logger = S0.f37439a;
            Charset charset = g.f36967a;
            int i10 = mVar.f37784b * 2;
            byte[][] bArr = new byte[i10][];
            Object[] objArr = mVar.f37783a;
            if (objArr instanceof byte[][]) {
                System.arraycopy(objArr, 0, bArr, 0, i10);
            } else {
                for (int i11 = 0; i11 < mVar.f37784b; i11++) {
                    int i12 = i11 * 2;
                    Object[] objArr2 = mVar.f37783a;
                    bArr[i12] = (byte[]) objArr2[i12];
                    int i13 = i12 + 1;
                    Object obj = objArr2[i13];
                    bArr[i13] = obj instanceof byte[] ? (byte[]) obj : ((m.e) obj).a();
                }
            }
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15 += 2) {
                byte[] bArr2 = bArr[i15];
                byte[] bArr3 = bArr[i15 + 1];
                if (S0.a(bArr2, S0.f37440b)) {
                    bArr[i14] = bArr2;
                    Charset charset2 = g.f36967a;
                    bArr[i14 + 1] = m.f37782e.c(bArr3).getBytes(com.google.common.base.b.f27790a);
                } else {
                    int length = bArr3.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length) {
                            bArr[i14] = bArr2;
                            bArr[i14 + 1] = bArr3;
                        } else {
                            byte b10 = bArr3[i16];
                            if (b10 < 32 || b10 > 126) {
                                StringBuilder sbA = C7.g.a("Metadata key=", new String(bArr2, com.google.common.base.b.f27790a), ", value=");
                                sbA.append(Arrays.toString(bArr3));
                                sbA.append(" contains invalid ASCII characters");
                                S0.f37439a.warning(sbA.toString());
                            } else {
                                i16++;
                            }
                        }
                    }
                }
                i14 += 2;
            }
            if (i14 != i10) {
                bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i14);
            }
            for (int i17 = 0; i17 < bArr.length; i17 += 2) {
                ByteString byteStringN = ByteString.n(bArr[i17]);
                if (byteStringN.e() != 0 && byteStringN.k(0) != 58) {
                    arrayList.add(new F9.c(byteStringN, ByteString.n(bArr[i17 + 1])));
                }
            }
            bVar.f37866x = arrayList;
            Status status = dVar.f37906v;
            if (status != null) {
                cVar.f37847l.h(status, ClientStreamListener.RpcProgress.f37137e, true, new m());
                return;
            }
            if (dVar.f37898n.size() < dVar.f37873C) {
                dVar.t(cVar);
                return;
            }
            dVar.f37874D.add(cVar);
            if (!dVar.f37910z) {
                dVar.f37910z = true;
                KeepAliveManager keepAliveManager = dVar.f37876F;
                if (keepAliveManager != null) {
                    keepAliveManager.b();
                }
            }
            if (cVar.f37501c) {
                dVar.f37883M.G(cVar, true);
            }
        }

        public static void m(b bVar, C2839f c2839f, boolean z10, boolean z11) {
            if (bVar.f37853B) {
                return;
            }
            if (!bVar.f37859H) {
                p.p("streamId should be set", bVar.f37862K != -1);
                bVar.f37857F.a(z10, bVar.f37861J, c2839f, z11);
            } else {
                bVar.f37867y.t0(c2839f, (int) c2839f.f49074c);
                bVar.f37868z |= z10;
                bVar.f37852A |= z11;
            }
        }

        @Override // io.grpc.internal.MessageDeframer.a
        public final void c(boolean z10) {
            boolean z11 = this.f37515n;
            ClientStreamListener.RpcProgress rpcProgress = ClientStreamListener.RpcProgress.f37134b;
            if (z11) {
                this.f37858G.h(this.f37862K, null, rpcProgress, false, null, null);
            } else {
                this.f37858G.h(this.f37862K, null, rpcProgress, false, ErrorCode.CANCEL, null);
            }
            p.p("status should have been reported on deframer closed", this.f37516o);
            this.f37513l = true;
            if (this.f37517p && z10) {
                i(Status.f36904k.h("Encountered end-of-stream mid-frame"), true, new m());
            }
            AbstractC2208a.b.RunnableC0393a runnableC0393a = this.f37514m;
            if (runnableC0393a != null) {
                runnableC0393a.run();
                this.f37514m = null;
            }
        }

        @Override // io.grpc.internal.MessageDeframer.a
        public final void d(int i10) {
            int i11 = this.f37855D - i10;
            this.f37855D = i11;
            float f10 = i11;
            int i12 = this.f37864v;
            if (f10 <= i12 * 0.5f) {
                int i13 = i12 - i11;
                this.f37854C += i13;
                this.f37855D = i11 + i13;
                this.f37856E.Q(this.f37862K, i13);
            }
        }

        public final void n(Status status, boolean z10, m mVar) throws EOFException {
            if (this.f37853B) {
                return;
            }
            this.f37853B = true;
            if (!this.f37859H) {
                this.f37858G.h(this.f37862K, status, ClientStreamListener.RpcProgress.f37134b, z10, ErrorCode.CANCEL, mVar);
                return;
            }
            d dVar = this.f37858G;
            LinkedList linkedList = dVar.f37874D;
            c cVar = c.this;
            linkedList.remove(cVar);
            dVar.m(cVar);
            this.f37866x = null;
            this.f37867y.b();
            this.f37859H = false;
            if (mVar == null) {
                mVar = new m();
            }
            i(status, true, mVar);
        }

        public final void o(Throwable th) {
            n(Status.e(th), true, new m());
        }

        public final void p(C2839f c2839f, boolean z10) throws Throwable {
            long j = c2839f.f49074c;
            int i10 = this.f37854C - ((int) j);
            this.f37854C = i10;
            if (i10 < 0) {
                this.f37856E.Y0(this.f37862K, ErrorCode.FLOW_CONTROL_ERROR);
                this.f37858G.h(this.f37862K, Status.f36904k.h("Received data size exceeded our receiving window size"), ClientStreamListener.RpcProgress.f37134b, false, null, null);
                return;
            }
            f fVar = new f(c2839f);
            Status status = this.f37432q;
            boolean z11 = false;
            if (status != null) {
                Charset charset = this.f37434s;
                y0.b bVar = y0.f37743a;
                p.j(charset, "charset");
                int i11 = (int) c2839f.f49074c;
                byte[] bArr = new byte[i11];
                fVar.e0(bArr, 0, i11);
                this.f37432q = status.b("DATA-----------------------------\n".concat(new String(bArr, charset)));
                fVar.close();
                if (this.f37432q.f36909b.length() > 1000 || z10) {
                    n(this.f37432q, false, this.f37433r);
                    return;
                }
                return;
            }
            if (!this.f37435t) {
                n(Status.f36904k.h("headers not received before payload"), false, new m());
                return;
            }
            int i12 = (int) j;
            try {
                if (this.f37516o) {
                    AbstractC2208a.f37498g.log(Level.INFO, "Received data on closed stream");
                    fVar.close();
                } else {
                    try {
                        this.f37531a.i(fVar);
                    } catch (Throwable th) {
                        try {
                            o(th);
                        } catch (Throwable th2) {
                            th = th2;
                            if (z11) {
                                fVar.close();
                            }
                            throw th;
                        }
                    }
                }
                if (z10) {
                    if (i12 > 0) {
                        this.f37432q = Status.f36904k.h("Received unexpected EOS on non-empty DATA frame from server");
                    } else {
                        this.f37432q = Status.f36904k.h("Received unexpected EOS on empty DATA frame from server");
                    }
                    m mVar = new m();
                    this.f37433r = mVar;
                    i(this.f37432q, false, mVar);
                }
            } catch (Throwable th3) {
                th = th3;
                z11 = true;
            }
        }

        public final void q(ArrayList arrayList, boolean z10) throws EOFException {
            Status statusK;
            StringBuilder sb2;
            Status statusB;
            m.f fVar = P.f37431u;
            if (z10) {
                byte[][] bArrA = i.a(arrayList);
                int length = bArrA.length / 2;
                m mVar = new m();
                mVar.f37784b = length;
                mVar.f37783a = bArrA;
                if (this.f37432q == null && !this.f37435t) {
                    Status statusK2 = P.k(mVar);
                    this.f37432q = statusK2;
                    if (statusK2 != null) {
                        this.f37433r = mVar;
                    }
                }
                Status status = this.f37432q;
                if (status != null) {
                    Status statusB2 = status.b("trailers: " + mVar);
                    this.f37432q = statusB2;
                    n(statusB2, false, this.f37433r);
                    return;
                }
                m.f fVar2 = h.f36969b;
                Status status2 = (Status) mVar.c(fVar2);
                if (status2 != null) {
                    statusB = status2.h((String) mVar.c(h.f36968a));
                } else if (this.f37435t) {
                    statusB = Status.f36901g.h("missing GRPC status in response");
                } else {
                    Integer num = (Integer) mVar.c(fVar);
                    statusB = (num != null ? GrpcUtil.g(num.intValue()) : Status.f36904k.h("missing HTTP status code")).b("missing GRPC status, inferred error from HTTP status code");
                }
                mVar.a(fVar);
                mVar.a(fVar2);
                mVar.a(h.f36968a);
                if (this.f37516o) {
                    AbstractC2208a.f37498g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{statusB, mVar});
                    return;
                }
                for (C.g gVar : this.f37510h.f37429a) {
                    ((io.grpc.c) gVar).k0(mVar);
                }
                h(statusB, ClientStreamListener.RpcProgress.f37134b, false, mVar);
                return;
            }
            byte[][] bArrA2 = i.a(arrayList);
            int length2 = bArrA2.length / 2;
            m mVar2 = new m();
            mVar2.f37784b = length2;
            mVar2.f37783a = bArrA2;
            Status status3 = this.f37432q;
            if (status3 != null) {
                this.f37432q = status3.b("headers: " + mVar2);
                return;
            }
            try {
                if (this.f37435t) {
                    statusK = Status.f36904k.h("Received headers twice");
                    this.f37432q = statusK;
                    sb2 = new StringBuilder("headers: ");
                } else {
                    Integer num2 = (Integer) mVar2.c(fVar);
                    if (num2 == null || num2.intValue() < 100 || num2.intValue() >= 200) {
                        this.f37435t = true;
                        statusK = P.k(mVar2);
                        this.f37432q = statusK;
                        if (statusK != null) {
                            sb2 = new StringBuilder("headers: ");
                        } else {
                            mVar2.a(fVar);
                            mVar2.a(h.f36969b);
                            mVar2.a(h.f36968a);
                            g(mVar2);
                            statusK = this.f37432q;
                            if (statusK == null) {
                                return;
                            } else {
                                sb2 = new StringBuilder("headers: ");
                            }
                        }
                    } else {
                        statusK = this.f37432q;
                        if (statusK == null) {
                            return;
                        } else {
                            sb2 = new StringBuilder("headers: ");
                        }
                    }
                }
                sb2.append(mVar2);
                this.f37432q = statusK.b(sb2.toString());
                this.f37433r = mVar2;
                this.f37434s = P.j(mVar2);
            } catch (Throwable th) {
                Status status4 = this.f37432q;
                if (status4 != null) {
                    this.f37432q = status4.b("headers: " + mVar2);
                    this.f37433r = mVar2;
                    this.f37434s = P.j(mVar2);
                }
                throw th;
            }
        }
    }

    public c(MethodDescriptor methodDescriptor, m mVar, io.grpc.okhttp.a aVar, d dVar, e eVar, Object obj, int i10, int i11, String str, String str2, O0 o10, U0 u10, io.grpc.b bVar) {
        super(new C.e(), o10, u10, mVar, bVar, false);
        this.f37848m = new a();
        this.f37850o = false;
        this.j = o10;
        this.f37844h = methodDescriptor;
        this.f37846k = str;
        this.f37845i = str2;
        this.f37849n = dVar.f37905u;
        String str3 = methodDescriptor.f36887b;
        this.f37847l = new b(i10, o10, obj, aVar, eVar, dVar, i11);
    }

    @Override // io.grpc.internal.AbstractC2208a, io.grpc.internal.AbstractC2216e
    public final AbstractC2216e.a m() {
        return this.f37847l;
    }

    @Override // io.grpc.internal.AbstractC2208a
    public final a n() {
        return this.f37848m;
    }

    @Override // io.grpc.internal.AbstractC2208a
    /* JADX INFO: renamed from: p */
    public final b m() {
        return this.f37847l;
    }
}
