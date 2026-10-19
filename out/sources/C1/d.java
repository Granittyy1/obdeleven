package C1;

import p114j1.k;

/* JADX INFO: compiled from: AviStreamHeaderChunk.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2309f;

    public d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f2304a = i10;
        this.f2305b = i11;
        this.f2306c = i12;
        this.f2307d = i13;
        this.f2308e = i14;
        this.f2309f = i15;
    }

    public final int a() {
        int i10 = this.f2304a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        k.f("Found unsupported streamType fourCC: " + Integer.toHexString(i10));
        return -1;
    }

    @Override // C1.a
    public final int getType() {
        return 1752331379;
    }
}
