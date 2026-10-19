package Ua;

import Ya.k;
import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlinx.datetime.IllegalTimeZoneException;

/* JADX INFO: compiled from: TimeZoneJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@k(with = Xa.f.class)
public class h {
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f6583b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZoneId f6584a;

    /* JADX INFO: compiled from: TimeZoneJvm.kt */
    public static final class a {
        public static h a(String zoneId) throws Exception {
            kotlin.jvm.internal.i.e(zoneId, "zoneId");
            try {
                ZoneId zoneIdOf = ZoneId.of(zoneId);
                kotlin.jvm.internal.i.d(zoneIdOf, "of(...)");
                return b(zoneIdOf);
            } catch (Exception e10) {
                if (e10 instanceof DateTimeException) {
                    throw new IllegalTimeZoneException(e10);
                }
                throw e10;
            }
        }

        public static h b(ZoneId zoneId) {
            boolean zIsFixedOffset;
            if (zoneId instanceof ZoneOffset) {
                return new c(new i((ZoneOffset) zoneId));
            }
            try {
                zIsFixedOffset = zoneId.getRules().isFixedOffset();
            } catch (ArrayIndexOutOfBoundsException unused) {
                zIsFixedOffset = false;
            }
            if (!zIsFixedOffset) {
                return new h(zoneId);
            }
            ZoneId zoneIdNormalized = zoneId.normalized();
            kotlin.jvm.internal.i.c(zoneIdNormalized, "null cannot be cast to non-null type java.time.ZoneOffset");
            new i((ZoneOffset) zoneIdNormalized);
            return new c(zoneId);
        }

        public final Ya.b<h> serializer() {
            return Xa.f.f7444a;
        }
    }

    static {
        ZoneOffset UTC = ZoneOffset.UTC;
        kotlin.jvm.internal.i.d(UTC, "UTC");
        f6583b = new c(new i(UTC));
    }

    public h(ZoneId zoneId) {
        kotlin.jvm.internal.i.e(zoneId, "zoneId");
        this.f6584a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (kotlin.jvm.internal.i.a(this.f6584a, ((h) obj).f6584a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6584a.hashCode();
    }

    public final String toString() {
        String string = this.f6584a.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
