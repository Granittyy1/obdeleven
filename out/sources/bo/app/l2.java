package bo.app;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface l2 {
    a a(g5 g5Var, Map map, JSONObject jSONObject);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f21470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final JSONObject f21471c;

        public a(int i10, Map responseHeaders, JSONObject jSONObject) {
            kotlin.jvm.internal.i.e(responseHeaders, "responseHeaders");
            this.f21469a = i10;
            this.f21470b = responseHeaders;
            this.f21471c = jSONObject;
        }

        public final JSONObject a() {
            return this.f21471c;
        }

        public final Map b() {
            return this.f21470b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21469a == aVar.f21469a && kotlin.jvm.internal.i.a(this.f21470b, aVar.f21470b) && kotlin.jvm.internal.i.a(this.f21471c, aVar.f21471c);
        }

        public int hashCode() {
            int iHashCode = (this.f21470b.hashCode() + (Integer.hashCode(this.f21469a) * 31)) * 31;
            JSONObject jSONObject = this.f21471c;
            return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public String toString() {
            return "HttpConnectorResult(responseCode=" + this.f21469a + ", responseHeaders=" + this.f21470b + ", jsonResponse=" + this.f21471c + ')';
        }

        public /* synthetic */ a(int i10, Map map, JSONObject jSONObject, int i11, kotlin.jvm.internal.e eVar) {
            this(i10, (i11 & 2) != 0 ? kotlin.collections.y.p() : map, (i11 & 4) != 0 ? null : jSONObject);
        }
    }
}
