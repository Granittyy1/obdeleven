package Ua;

import Ya.k;
import java.time.ZoneOffset;

/* JADX INFO: compiled from: UtcOffsetJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@k(with = Xa.g.class)
public final class i {
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZoneOffset f6585a;

    /* JADX INFO: compiled from: UtcOffsetJvm.kt */
    public static final class a {
        public final Ya.b<i> serializer() {
            return Xa.g.f7446a;
        }
    }

    static {
        ZoneOffset UTC = ZoneOffset.UTC;
        kotlin.jvm.internal.i.d(UTC, "UTC");
        new i(UTC);
    }

    public i(ZoneOffset zoneOffset) {
        kotlin.jvm.internal.i.e(zoneOffset, "zoneOffset");
        this.f6585a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (kotlin.jvm.internal.i.a(this.f6585a, ((i) obj).f6585a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6585a.hashCode();
    }

    public final String toString() {
        String string = this.f6585a.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
