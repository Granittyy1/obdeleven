package C4;

import java.util.Arrays;

/* JADX INFO: compiled from: EncodedPayload.java */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p311z4.c f2391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2392b;

    public n(p311z4.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f2391a = cVar;
        this.f2392b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f2391a.equals(nVar.f2391a)) {
            return Arrays.equals(this.f2392b, nVar.f2392b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2391a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2392b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f2391a + ", bytes=[...]}";
    }
}
