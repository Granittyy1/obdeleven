package p079g3;

import java.util.Arrays;

/* JADX INFO: compiled from: LottieResult.java */
/* JADX INFO: loaded from: classes.dex */
public final class r<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f35591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f35592b;

    public r(V v10) {
        this.f35591a = v10;
        this.f35592b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        V v10 = this.f35591a;
        if (v10 != null && v10.equals(rVar.f35591a)) {
            return true;
        }
        Throwable th = this.f35592b;
        if (th == null || rVar.f35592b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35591a, this.f35592b});
    }

    public r(Throwable th) {
        this.f35592b = th;
        this.f35591a = null;
    }
}
