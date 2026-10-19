package Ua;

import Ya.k;
import java.time.ZoneOffset;

/* JADX INFO: compiled from: TimeZoneJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@k(with = Xa.a.class)
public final class c extends h {
    public static final a Companion = new a();

    /* JADX INFO: compiled from: TimeZoneJvm.kt */
    public static final class a {
        public final Ya.b<c> serializer() {
            return Xa.a.f7434a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(i iVar) {
        ZoneOffset zoneId = iVar.f6585a;
        kotlin.jvm.internal.i.e(zoneId, "zoneId");
        super(zoneId);
    }
}
