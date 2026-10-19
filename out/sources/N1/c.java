package N1;

import java.util.Arrays;
import p078g1.r;
import p078g1.s;

/* JADX INFO: compiled from: IcyInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4634c;

    public c(String str, byte[] bArr, String str2) {
        this.f4632a = bArr;
        this.f4633b = str;
        this.f4634c = str2;
    }

    @Override // g1.s.a
    public final void b(r.a aVar) {
        String str = this.f4633b;
        if (str != null) {
            aVar.f35420a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4632a, ((c) obj).f4632a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4632a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f4633b + "\", url=\"" + this.f4634c + "\", rawMetadata.length=\"" + this.f4632a.length + "\"";
    }
}
