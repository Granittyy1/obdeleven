package p318zb;

import Q3.d;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f49041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f49044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f49045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D f49046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public D f49047g;

    public D() {
        this.f49041a = new byte[8192];
        this.f49045e = true;
        this.f49044d = false;
    }

    public final D a() {
        D d10 = this.f49046f;
        if (d10 == this) {
            d10 = null;
        }
        D d11 = this.f49047g;
        i.b(d11);
        d11.f49046f = this.f49046f;
        D d12 = this.f49046f;
        i.b(d12);
        d12.f49047g = this.f49047g;
        this.f49046f = null;
        this.f49047g = null;
        return d10;
    }

    public final void b(D segment) {
        i.e(segment, "segment");
        segment.f49047g = this;
        segment.f49046f = this.f49046f;
        D d10 = this.f49046f;
        i.b(d10);
        d10.f49047g = segment;
        this.f49046f = segment;
    }

    public final D c() {
        this.f49044d = true;
        return new D(this.f49041a, this.f49042b, this.f49043c, true, false);
    }

    public final void d(D sink, int i10) {
        i.e(sink, "sink");
        if (!sink.f49045e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f49043c;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (sink.f49044d) {
                throw new IllegalArgumentException();
            }
            int i13 = sink.f49042b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f49041a;
            d.s(bArr, bArr, 0, i13, i11, 2);
            sink.f49043c -= sink.f49042b;
            sink.f49042b = 0;
        }
        int i14 = sink.f49043c;
        int i15 = this.f49042b;
        d.l(i14, i15, i15 + i10, this.f49041a, sink.f49041a);
        sink.f49043c += i10;
        this.f49042b += i10;
    }

    public D(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        i.e(data, "data");
        this.f49041a = data;
        this.f49042b = i10;
        this.f49043c = i11;
        this.f49044d = z10;
        this.f49045e = z11;
    }
}
