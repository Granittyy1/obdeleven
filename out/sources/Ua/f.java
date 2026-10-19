package Ua;

import Ya.k;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import kotlinx.datetime.format.LocalDateTimeFormatKt;
import kotlinx.datetime.format.u;

/* JADX INFO: compiled from: LocalDateTime.kt */
/* JADX INFO: loaded from: classes2.dex */
@k(with = Xa.d.class)
public final class f implements Comparable<f> {
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f6580b;

    /* JADX INFO: compiled from: LocalDateTime.kt */
    public static final class a {
        public final Ya.b<f> serializer() {
            return Xa.d.f7440a;
        }
    }

    /* JADX INFO: compiled from: LocalDateTime.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f6581a = (u) LocalDateTimeFormatKt.f43752a.getValue();
    }

    static {
        LocalDateTime MIN = LocalDateTime.MIN;
        kotlin.jvm.internal.i.d(MIN, "MIN");
        new f(MIN);
        LocalDateTime MAX = LocalDateTime.MAX;
        kotlin.jvm.internal.i.d(MAX, "MAX");
        new f(MAX);
    }

    public f(LocalDateTime value) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f6580b = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        f other = fVar;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f6580b.compareTo((ChronoLocalDateTime<?>) other.f6580b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                if (kotlin.jvm.internal.i.a(this.f6580b, ((f) obj).f6580b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6580b.hashCode();
    }

    public final String toString() {
        String string = this.f6580b.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
