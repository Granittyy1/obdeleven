package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: compiled from: LoadingInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18144c;

    /* JADX INFO: compiled from: LoadingInfo.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f18145a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f18146b = -3.4028235E38f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f18147c = -9223372036854775807L;
    }

    public T(a aVar) {
        this.f18142a = aVar.f18145a;
        this.f18143b = aVar.f18146b;
        this.f18144c = aVar.f18147c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t8 = (T) obj;
        return this.f18142a == t8.f18142a && this.f18143b == t8.f18143b && this.f18144c == t8.f18144c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f18142a), Float.valueOf(this.f18143b), Long.valueOf(this.f18144c));
    }
}
