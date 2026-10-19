package io.grpc.okhttp;

import A8.p;
import com.braze.support.BrazeLogger;
import java.io.IOException;
import p318zb.C2839f;

/* JADX INFO: compiled from: OutboundFlowController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f37920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.grpc.okhttp.a f37921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37922c = 65535;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f37923d = new b(0, 65535, null);

    /* JADX INFO: compiled from: OutboundFlowController.java */
    public interface a {
        void b(int i10);
    }

    /* JADX INFO: compiled from: OutboundFlowController.java */
    public final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f37925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f37928e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2839f f37924a = new C2839f();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f37929f = false;

        public b(int i10, int i11, a aVar) {
            this.f37925b = i10;
            this.f37926c = i11;
            this.f37928e = aVar;
        }

        public final int a(int i10) {
            if (i10 <= 0 || BrazeLogger.SUPPRESS - i10 >= this.f37926c) {
                int i11 = this.f37926c + i10;
                this.f37926c = i11;
                return i11;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f37925b);
        }

        public final void b(C2839f c2839f, int i10, boolean z10) {
            do {
                e eVar = e.this;
                int iMin = Math.min(i10, eVar.f37921b.M0());
                int i11 = -iMin;
                eVar.f37923d.a(i11);
                a(i11);
                try {
                    eVar.f37921b.v(c2839f.f49074c == ((long) iMin) && z10, this.f37925b, c2839f, iMin);
                    this.f37928e.b(iMin);
                    i10 -= iMin;
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } while (i10 > 0);
        }

        public final void c(int i10, c cVar) {
            int i11 = this.f37926c;
            e eVar = e.this;
            int iMin = Math.min(i10, Math.min(i11, eVar.f37923d.f37926c));
            int i12 = 0;
            while (true) {
                C2839f c2839f = this.f37924a;
                long j = c2839f.f49074c;
                if (j <= 0 || iMin <= 0) {
                    return;
                }
                if (iMin >= j) {
                    int i13 = (int) j;
                    i12 += i13;
                    b(c2839f, i13, this.f37929f);
                } else {
                    i12 += iMin;
                    b(c2839f, iMin, false);
                }
                cVar.f37931a++;
                iMin = Math.min(i10 - i12, Math.min(this.f37926c, eVar.f37923d.f37926c));
            }
        }
    }

    /* JADX INFO: compiled from: OutboundFlowController.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37931a;
    }

    public e(d dVar, io.grpc.okhttp.a aVar) {
        this.f37920a = dVar;
        this.f37921b = aVar;
    }

    public final void a(boolean z10, b bVar, C2839f c2839f, boolean z11) {
        p.j(c2839f, "source");
        int iMin = Math.min(bVar.f37926c, e.this.f37923d.f37926c);
        C2839f c2839f2 = bVar.f37924a;
        boolean z12 = c2839f2.f49074c > 0;
        int i10 = (int) c2839f.f49074c;
        if (z12 || iMin < i10) {
            if (!z12 && iMin > 0) {
                bVar.b(c2839f, iMin, false);
            }
            c2839f2.t0(c2839f, (int) c2839f.f49074c);
            bVar.f37929f = z10 | bVar.f37929f;
        } else {
            bVar.b(c2839f, i10, z10);
        }
        if (z11) {
            try {
                this.f37921b.flush();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void b(b bVar, int i10) {
        if (bVar == null) {
            this.f37923d.a(i10);
            c();
            return;
        }
        bVar.a(i10);
        c cVar = new c();
        bVar.c(Math.min(bVar.f37926c, e.this.f37923d.f37926c), cVar);
        if (cVar.f37931a > 0) {
            try {
                this.f37921b.flush();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void c() {
        /*
            r13 = this;
            io.grpc.okhttp.d r0 = r13.f37920a
            io.grpc.okhttp.e$b[] r1 = r0.i()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            io.grpc.okhttp.e$b r2 = r13.f37923d
            int r2 = r2.f37926c
            int r3 = r1.length
        L12:
            r4 = 0
            if (r3 <= 0) goto L66
            if (r2 <= 0) goto L66
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L22:
            if (r7 >= r3) goto L64
            if (r2 <= 0) goto L64
            r8 = r1[r7]
            int r9 = r8.f37926c
            zb.f r10 = r8.f37924a
            long r11 = r10.f49074c
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f37927d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4a
            int r11 = r8.f37927d
            int r11 = r11 + r9
            r8.f37927d = r11
            int r2 = r2 - r9
        L4a:
            int r9 = r8.f37926c
            long r10 = r10.f49074c
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f37927d
            int r9 = r9 - r10
            if (r9 <= 0) goto L61
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L61:
            int r7 = r7 + 1
            goto L22
        L64:
            r3 = r6
            goto L12
        L66:
            io.grpc.okhttp.e$c r1 = new io.grpc.okhttp.e$c
            r1.<init>()
            io.grpc.okhttp.e$b[] r0 = r0.i()
            int r2 = r0.length
            r3 = r4
        L71:
            if (r3 >= r2) goto L7f
            r5 = r0[r3]
            int r6 = r5.f37927d
            r5.c(r6, r1)
            r5.f37927d = r4
            int r3 = r3 + 1
            goto L71
        L7f:
            int r0 = r1.f37931a
            if (r0 <= 0) goto L90
            io.grpc.okhttp.a r0 = r13.f37921b     // Catch: java.io.IOException -> L89
            r0.flush()     // Catch: java.io.IOException -> L89
            goto L90
        L89:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.e.c():void");
    }
}
