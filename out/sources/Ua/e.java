package Ua;

import Ya.k;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlinx.datetime.format.InterfaceC2723h;
import kotlinx.datetime.format.LocalDateFormatKt;

/* JADX INFO: compiled from: LocalDate.kt */
/* JADX INFO: loaded from: classes2.dex */
@k(with = Xa.c.class)
public final class e implements Comparable<e> {
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f6578b;

    /* JADX INFO: compiled from: LocalDate.kt */
    public static final class a {
        public final Ya.b<e> serializer() {
            return Xa.c.f7438a;
        }
    }

    /* JADX INFO: compiled from: LocalDate.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InterfaceC2723h<e> f6579a = (InterfaceC2723h) LocalDateFormatKt.f43746b.getValue();
    }

    static {
        LocalDate MIN = LocalDate.MIN;
        kotlin.jvm.internal.i.d(MIN, "MIN");
        new e(MIN);
        LocalDate MAX = LocalDate.MAX;
        kotlin.jvm.internal.i.d(MAX, "MAX");
        new e(MAX);
    }

    public e(LocalDate value) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f6578b = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        e other = eVar;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f6578b.compareTo((ChronoLocalDate) other.f6578b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                if (kotlin.jvm.internal.i.a(this.f6578b, ((e) obj).f6578b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6578b.hashCode();
    }

    public final String toString() {
        String string = this.f6578b.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
