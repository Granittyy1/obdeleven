package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: compiled from: MediaPeriodInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.h.b f18163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18171i;
    public final boolean j;

    public W(androidx.media3.exoplayer.source.h.b bVar, long j, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        p241t7.b.e(!z14 || z12);
        p241t7.b.e(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        p241t7.b.e(z15);
        this.f18163a = bVar;
        this.f18164b = j;
        this.f18165c = j10;
        this.f18166d = j11;
        this.f18167e = j12;
        this.f18168f = z10;
        this.f18169g = z11;
        this.f18170h = z12;
        this.f18171i = z13;
        this.j = z14;
    }

    public final W a(long j) {
        if (j == this.f18165c) {
            return this;
        }
        return new W(this.f18163a, this.f18164b, j, this.f18166d, this.f18167e, this.f18168f, this.f18169g, this.f18170h, this.f18171i, this.j);
    }

    public final W b(long j) {
        if (j == this.f18164b) {
            return this;
        }
        return new W(this.f18163a, j, this.f18165c, this.f18166d, this.f18167e, this.f18168f, this.f18169g, this.f18170h, this.f18171i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w3 = (W) obj;
        return this.f18164b == w3.f18164b && this.f18165c == w3.f18165c && this.f18166d == w3.f18166d && this.f18167e == w3.f18167e && this.f18168f == w3.f18168f && this.f18169g == w3.f18169g && this.f18170h == w3.f18170h && this.f18171i == w3.f18171i && this.j == w3.j && Objects.equals(this.f18163a, w3.f18163a);
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f18163a.hashCode() + 527) * 31) + ((int) this.f18164b)) * 31) + ((int) this.f18165c)) * 31) + ((int) this.f18166d)) * 31) + ((int) this.f18167e)) * 31) + (this.f18168f ? 1 : 0)) * 31) + (this.f18169g ? 1 : 0)) * 31) + (this.f18170h ? 1 : 0)) * 31) + (this.f18171i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
