package p318zb;

/* JADX INFO: compiled from: PeekSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class A implements H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2841h f49027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2839f f49028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D f49029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f49031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f49032g;

    public A(InterfaceC2841h interfaceC2841h) {
        this.f49027b = interfaceC2841h;
        C2839f c2839fF = interfaceC2841h.f();
        this.f49028c = c2839fF;
        D d10 = c2839fF.f49073b;
        this.f49029d = d10;
        this.f49030e = d10 != null ? d10.f49042b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f49031f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f49042b) goto L15;
     */
    @Override // p318zb.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l0(p318zb.C2839f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.i.e(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6c
            boolean r3 = r8.f49031f
            if (r3 != 0) goto L64
            zb.D r3 = r8.f49029d
            zb.f r4 = r8.f49028c
            if (r3 == 0) goto L2b
            zb.D r5 = r4.f49073b
            if (r3 != r5) goto L23
            int r3 = r8.f49030e
            kotlin.jvm.internal.i.b(r5)
            int r5 = r5.f49042b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f49032g
            r2 = 1
            long r0 = r0 + r2
            zb.h r2 = r8.f49027b
            boolean r0 = r2.g(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            zb.D r0 = r8.f49029d
            if (r0 != 0) goto L4c
            zb.D r0 = r4.f49073b
            if (r0 == 0) goto L4c
            r8.f49029d = r0
            int r0 = r0.f49042b
            r8.f49030e = r0
        L4c:
            long r0 = r4.f49074c
            long r2 = r8.f49032g
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            zb.f r2 = r8.f49028c
            long r4 = r8.f49032g
            r3 = r9
            r6 = r10
            r2.i(r3, r4, r6)
            long r0 = r8.f49032g
            long r0 = r0 + r10
            r8.f49032g = r0
            return r10
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6c:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = com.google.gson.internal.b.b(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p318zb.A.l0(zb.f, long):long");
    }

    @Override // p318zb.H
    public final I timeout() {
        return this.f49027b.timeout();
    }
}
