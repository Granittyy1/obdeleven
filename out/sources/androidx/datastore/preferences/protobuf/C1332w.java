package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyFieldLite.java */
/* JADX INFO: loaded from: classes.dex */
public class C1332w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile I f17284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ByteString f17285b;

    static {
        C1323m.a();
    }

    public final I a(I i10) {
        if (this.f17284a == null) {
            synchronized (this) {
                if (this.f17284a == null) {
                    try {
                        this.f17284a = i10;
                        this.f17285b = ByteString.f17095b;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f17284a = i10;
                        this.f17285b = ByteString.f17095b;
                    }
                }
            }
        }
        return this.f17284a;
    }

    public final ByteString b() {
        if (this.f17285b != null) {
            return this.f17285b;
        }
        synchronized (this) {
            try {
                if (this.f17285b != null) {
                    return this.f17285b;
                }
                if (this.f17284a == null) {
                    this.f17285b = ByteString.f17095b;
                } else {
                    this.f17285b = this.f17284a.b();
                }
                return this.f17285b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1332w)) {
            return false;
        }
        C1332w c1332w = (C1332w) obj;
        I i10 = this.f17284a;
        I i11 = c1332w.f17284a;
        if (i10 == null && i11 == null) {
            return b().equals(c1332w.b());
        }
        if (i10 == null || i11 == null) {
            return i10 != null ? i10.equals(c1332w.a(i10.a())) : a(i11.a()).equals(i11);
        }
        return i10.equals(i11);
    }

    public int hashCode() {
        return 1;
    }
}
