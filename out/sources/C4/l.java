package C4;

import com.google.android.datatransport.Priority;
import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_TransportContext.java */
/* JADX INFO: loaded from: classes.dex */
public final class l extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Priority f2382c;

    public l(String str, byte[] bArr, Priority priority) {
        this.f2380a = str;
        this.f2381b = bArr;
        this.f2382c = priority;
    }

    @Override // C4.t
    public final String a() {
        return this.f2380a;
    }

    @Override // C4.t
    public final byte[] b() {
        return this.f2381b;
    }

    @Override // C4.t
    public final Priority c() {
        return this.f2382c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f2380a.equals(tVar.a())) {
            if (Arrays.equals(this.f2381b, tVar instanceof l ? ((l) tVar).f2381b : tVar.b()) && this.f2382c.equals(tVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2380a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2381b)) * 1000003) ^ this.f2382c.hashCode();
    }
}
