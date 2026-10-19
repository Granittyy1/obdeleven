package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyFieldLite.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2081x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile J f29204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ByteString f29205b;

    static {
        C2071m.a();
    }

    public final J a(J j) {
        if (this.f29204a == null) {
            synchronized (this) {
                if (this.f29204a == null) {
                    try {
                        this.f29204a = j;
                        this.f29205b = ByteString.f29007b;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f29204a = j;
                        this.f29205b = ByteString.f29007b;
                    }
                }
            }
        }
        return this.f29204a;
    }

    public final ByteString b() {
        if (this.f29205b != null) {
            return this.f29205b;
        }
        synchronized (this) {
            try {
                if (this.f29205b != null) {
                    return this.f29205b;
                }
                if (this.f29204a == null) {
                    this.f29205b = ByteString.f29007b;
                } else {
                    this.f29205b = this.f29204a.b();
                }
                return this.f29205b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2081x)) {
            return false;
        }
        C2081x c2081x = (C2081x) obj;
        J j = this.f29204a;
        J j10 = c2081x.f29204a;
        if (j == null && j10 == null) {
            return b().equals(c2081x.b());
        }
        if (j == null || j10 == null) {
            return j != null ? j.equals(c2081x.a(j.a())) : a(j10.a()).equals(j10);
        }
        return j.equals(j10);
    }

    public int hashCode() {
        return 1;
    }
}
