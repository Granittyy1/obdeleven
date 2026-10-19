package bo.app;

import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21651e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f21653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5 f21654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d2 f21655d;

    public static final class a {

        /* JADX INFO: renamed from: bo.app.n0$a$a, reason: collision with other inner class name */
        public static final class C0228a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0228a f21656b = new C0228a();

            public C0228a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "There should be a session ID here";
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final n0 a(List events) {
            kotlin.jvm.internal.i.e(events, "events");
            return new n0(b.ADD_BRAZE_EVENTS, events, null, null, 12, null);
        }

        public final n0 b(List events) {
            kotlin.jvm.internal.i.e(events, "events");
            return new n0(b.ADD_PENDING_BRAZE_EVENT, events, null, null, 12, null);
        }

        private a() {
        }

        public final n0 a(v5 v5Var) {
            if (v5Var == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, C0228a.f21656b, 3, (Object) null);
            }
            return new n0(b.FLUSH_PENDING_BRAZE_EVENTS, null, v5Var, null, 10, null);
        }

        public final n0 a(d2 request) {
            kotlin.jvm.internal.i.e(request, "request");
            return new n0(b.ADD_REQUEST, null, null, request, 6, null);
        }
    }

    public enum b {
        ADD_PENDING_BRAZE_EVENT,
        ADD_BRAZE_EVENTS,
        FLUSH_PENDING_BRAZE_EVENTS,
        ADD_REQUEST
    }

    private n0(b bVar, List list, v5 v5Var, d2 d2Var) {
        this.f21652a = bVar;
        this.f21653b = list;
        this.f21654c = v5Var;
        this.f21655d = d2Var;
    }

    public final b a() {
        return this.f21652a;
    }

    public final List b() {
        return this.f21653b;
    }

    public final v5 c() {
        return this.f21654c;
    }

    public final d2 d() {
        return this.f21655d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f21652a == n0Var.f21652a && kotlin.jvm.internal.i.a(this.f21653b, n0Var.f21653b) && kotlin.jvm.internal.i.a(this.f21654c, n0Var.f21654c) && kotlin.jvm.internal.i.a(this.f21655d, n0Var.f21655d);
    }

    public int hashCode() {
        int iD = p005a4.p.d(this.f21652a.hashCode() * 31, 31, this.f21653b);
        v5 v5Var = this.f21654c;
        int iHashCode = (iD + (v5Var == null ? 0 : v5Var.hashCode())) * 31;
        d2 d2Var = this.f21655d;
        return iHashCode + (d2Var != null ? d2Var.hashCode() : 0);
    }

    public String toString() {
        return kotlin.text.i.v("\n            commandType = " + this.f21652a + "\n            brazeEvents = " + this.f21653b + "\n            sessionId = " + this.f21654c + "\n            brazeRequest = " + this.f21655d + "\n        ");
    }

    public n0(b bVar, List list, v5 v5Var, d2 d2Var, int i10, kotlin.jvm.internal.e eVar) {
        this(bVar, (i10 & 2) != 0 ? EmptyList.f42983b : list, (i10 & 4) != 0 ? null : v5Var, (i10 & 8) != 0 ? null : d2Var);
    }
}
