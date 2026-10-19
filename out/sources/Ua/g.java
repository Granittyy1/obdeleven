package Ua;

import Ya.k;
import java.time.LocalTime;

/* JADX INFO: compiled from: LocalTime.kt */
/* JADX INFO: loaded from: classes2.dex */
@k(with = Xa.e.class)
public final class g implements Comparable<g> {
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f6582b;

    /* JADX INFO: compiled from: LocalTime.kt */
    public static final class a {
        public final Ya.b<g> serializer() {
            return Xa.e.f7442a;
        }
    }

    static {
        LocalTime MIN = LocalTime.MIN;
        kotlin.jvm.internal.i.d(MIN, "MIN");
        new g(MIN);
        LocalTime MAX = LocalTime.MAX;
        kotlin.jvm.internal.i.d(MAX, "MAX");
        new g(MAX);
    }

    public g(LocalTime value) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f6582b = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(g gVar) {
        g other = gVar;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f6582b.compareTo(other.f6582b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                if (kotlin.jvm.internal.i.a(this.f6582b, ((g) obj).f6582b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6582b.hashCode();
    }

    public final String toString() {
        String string = this.f6582b.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
