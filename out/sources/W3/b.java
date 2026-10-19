package W3;

import B6.c;
import com.google.android.gms.internal.measurement.M1;
import java.security.MessageDigest;

/* JADX INFO: compiled from: ObjectKey.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements A3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7000b;

    public b(Object obj) {
        M1.d(obj, "Argument must not be null");
        this.f7000b = obj;
    }

    @Override // A3.b
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f7000b.toString().getBytes(A3.b.f574a));
    }

    @Override // A3.b
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f7000b.equals(((b) obj).f7000b);
        }
        return false;
    }

    @Override // A3.b
    public final int hashCode() {
        return this.f7000b.hashCode();
    }

    public final String toString() {
        return c.e(new StringBuilder("ObjectKey{object="), this.f7000b, '}');
    }
}
