package p162n1;

import android.media.metrics.LogSessionId;
import java.util.Objects;
import p114j1.A;

/* JADX INFO: compiled from: PlayerId.java */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f44747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44748c;

    /* JADX INFO: compiled from: PlayerId.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LogSessionId f44749a;
    }

    static {
        new u("");
    }

    public u(String str) {
        a aVar;
        this.f44746a = str;
        if (A.f40996a >= 31) {
            aVar = new a();
            aVar.f44749a = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            aVar = null;
        }
        this.f44747b = aVar;
        this.f44748c = new Object();
    }

    public final synchronized LogSessionId a() {
        a aVar;
        aVar = this.f44747b;
        aVar.getClass();
        return aVar.f44749a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Objects.equals(this.f44746a, uVar.f44746a) && Objects.equals(this.f44747b, uVar.f44747b) && Objects.equals(this.f44748c, uVar.f44748c);
    }

    public final int hashCode() {
        return Objects.hash(this.f44746a, this.f44747b, this.f44748c);
    }
}
