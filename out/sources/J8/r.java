package J8;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y;

/* JADX INFO: compiled from: OmniChannelEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Object> f4048b;

    /* JADX INFO: compiled from: OmniChannelEvent.kt */
    public static final class a {
        public static r a(String ocaId, String name, int i10, boolean z10) {
            kotlin.jvm.internal.i.e(ocaId, "ocaId");
            kotlin.jvm.internal.i.e(name, "name");
            return new r("oca_activation_ended", y.s(new Pair("id", ocaId), new Pair("name", name), new Pair("result", z10 ? "success" : "failure"), new Pair("credits", Integer.valueOf(i10)), new Pair("api_type", "Vag")));
        }
    }

    public /* synthetic */ r(String str) {
        this(str, y.p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.i.a(this.f4047a, rVar.f4047a) && kotlin.jvm.internal.i.a(this.f4048b, rVar.f4048b);
    }

    public final int hashCode() {
        return this.f4048b.hashCode() + (this.f4047a.hashCode() * 31);
    }

    public final String toString() {
        return "OmniChannelEvent(key=" + this.f4047a + ", params=" + this.f4048b + ")";
    }

    public r(String str, Map<String, ? extends Object> params) {
        kotlin.jvm.internal.i.e(params, "params");
        this.f4047a = str;
        this.f4048b = params;
    }
}
