package A3;

import android.text.TextUtils;
import java.security.MessageDigest;

/* JADX INFO: compiled from: Option.java */
/* JADX INFO: loaded from: classes.dex */
public final class c<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f575e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f579d;

    /* JADX INFO: compiled from: Option.java */
    public interface b<T> {
        void a(byte[] bArr, T t8, MessageDigest messageDigest);
    }

    public c(String str, T t8, b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f578c = str;
        this.f576a = t8;
        this.f577b = bVar;
    }

    public static c a(Object obj, String str) {
        return new c(str, obj, f575e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f578c.equals(((c) obj).f578c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f578c.hashCode();
    }

    public final String toString() {
        return Q8.d.a(new StringBuilder("Option{key='"), this.f578c, "'}");
    }

    /* JADX INFO: compiled from: Option.java */
    public class a implements b<Object> {
        @Override // A3.c.b
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
