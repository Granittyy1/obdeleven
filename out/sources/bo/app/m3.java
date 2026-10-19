package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class m3 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2 f21533a;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p293xa.g f21534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g5 f21535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m3 f21536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f21537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ JSONObject f21538f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p293xa.g gVar, g5 g5Var, m3 m3Var, Map map, JSONObject jSONObject) {
            super(0);
            this.f21534b = gVar;
            this.f21535c = g5Var;
            this.f21536d = m3Var;
            this.f21537e = map;
            this.f21538f = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String str;
            StringBuilder sb2 = new StringBuilder("\n                |Making request with id => \"");
            sb2.append((String) this.f21534b.getValue());
            sb2.append("\"\n                |to url: ");
            sb2.append(this.f21535c);
            sb2.append("\n                \n                |with headers:\n                ");
            sb2.append(this.f21536d.a(this.f21537e));
            sb2.append("\n                |\n                |");
            if (this.f21538f == null) {
                str = "";
            } else {
                str = "and JSON :\n" + JsonUtils.getPrettyPrintedString(this.f21538f);
            }
            sb2.append(str);
            sb2.append("\n                ");
            return kotlin.text.i.w(sb2.toString());
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21539b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception while logging request: ";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p293xa.g f21540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g5 f21541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f21542d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m3 f21543e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f21544f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ JSONObject f21545g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p293xa.g gVar, g5 g5Var, long j, m3 m3Var, Map map, JSONObject jSONObject) {
            super(0);
            this.f21540b = gVar;
            this.f21541c = g5Var;
            this.f21542d = j;
            this.f21543e = m3Var;
            this.f21544f = map;
            this.f21545g = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return kotlin.text.i.w("\n                |Made request with id => \"" + ((String) this.f21540b.getValue()) + "\"\n                |to url: " + this.f21541c + "\n                |took: " + this.f21542d + "ms\n                \n                |with response headers:\n                " + this.f21543e.a(this.f21544f) + "\n                |\n                |and response JSON:\n                |" + JsonUtils.getPrettyPrintedString(this.f21545g) + "\n                ");
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f21546b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception while logging result: ";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g5 f21547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f21548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f21549d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(g5 g5Var, Map map, JSONObject jSONObject) {
            super(0);
            this.f21547b = g5Var;
            this.f21548c = map;
            this.f21549d = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return com.braze.support.g.a(this.f21547b, this.f21548c, this.f21549d);
        }
    }

    public m3(l2 httpConnector) {
        kotlin.jvm.internal.i.e(httpConnector, "httpConnector");
        this.f21533a = httpConnector;
    }

    @Override // bo.app.l2
    public l2.a a(g5 requestTarget, Map requestHeaders, JSONObject payload) {
        kotlin.jvm.internal.i.e(requestTarget, "requestTarget");
        kotlin.jvm.internal.i.e(requestHeaders, "requestHeaders");
        kotlin.jvm.internal.i.e(payload, "payload");
        p293xa.g gVarA = kotlin.a.a(new e(requestTarget, requestHeaders, payload));
        a(requestTarget, requestHeaders, gVarA, payload);
        long jCurrentTimeMillis = System.currentTimeMillis();
        l2.a aVarA = this.f21533a.a(requestTarget, requestHeaders, payload);
        a(gVarA, requestTarget, aVarA.b(), aVarA.a(), System.currentTimeMillis() - jCurrentTimeMillis);
        return aVarA;
    }

    private final void a(g5 g5Var, Map map, p293xa.g gVar, JSONObject jSONObject) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(gVar, g5Var, this, map, jSONObject), 3, (Object) null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f21539b);
        }
    }

    private final void a(p293xa.g gVar, g5 g5Var, Map map, JSONObject jSONObject, long j) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(gVar, g5Var, j, this, map, jSONObject), 3, (Object) null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, d.f21546b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add("|\"" + ((String) entry.getKey()) + "\" => \"" + ((String) entry.getValue()) + '\"');
        }
        return kotlin.collections.q.U(arrayList, "\n", null, null, null, 62);
    }
}
