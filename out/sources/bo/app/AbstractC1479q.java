package bo.app;

import com.braze.Braze;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: bo.app.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1479q extends y4 implements d2 {
    public static final a j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r5 f21762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f21763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f21764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f21765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f21766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i0 f21767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f21768i;

    /* JADX INFO: renamed from: bo.app.q$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: bo.app.q$b */
    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21769b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f21769b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error occurred while executing Braze request: " + this.f21769b;
        }
    }

    /* JADX INFO: renamed from: bo.app.q$c */
    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21770b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "******************************************************************";
        }
    }

    /* JADX INFO: renamed from: bo.app.q$d */
    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f21771b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**                        !! WARNING !!                         **";
        }
    }

    /* JADX INFO: renamed from: bo.app.q$e */
    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f21772b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**  The current API key/endpoint combination is invalid. This   **";
        }
    }

    /* JADX INFO: renamed from: bo.app.q$f */
    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f21773b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "** is potentially an integration error. Please ensure that your **";
        }
    }

    /* JADX INFO: renamed from: bo.app.q$g */
    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f21774b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**     API key AND custom endpoint information are correct.     **";
        }
    }

    /* JADX INFO: renamed from: bo.app.q$h */
    public static final class h extends Lambda implements Ia.a {
        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ">> API key    : " + AbstractC1479q.this.i();
        }
    }

    /* JADX INFO: renamed from: bo.app.q$i */
    public static final class i extends Lambda implements Ia.a {
        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ">> Request Uri: " + AbstractC1479q.this.f();
        }
    }

    /* JADX INFO: renamed from: bo.app.q$j */
    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f21777b = new j();

        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "******************************************************************";
        }
    }

    /* JADX INFO: renamed from: bo.app.q$k */
    public static final class k extends Lambda implements Ia.a {
        public k() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AbstractC1479q.this + " for " + AbstractC1479q.this.e() + " executed successfully.";
        }
    }

    /* JADX INFO: renamed from: bo.app.q$l */
    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f21779b = new l();

        public l() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    public /* synthetic */ AbstractC1479q(g5 g5Var, String str, r5 r5Var, int i10, kotlin.jvm.internal.e eVar) {
        this(g5Var, (i10 & 2) != 0 ? null : str, r5Var);
    }

    @Override // bo.app.d2
    public String a() {
        return this.f21761b;
    }

    @Override // bo.app.d2
    public void b(String str) {
        this.f21766g = str;
    }

    @Override // bo.app.d2
    public void c(String str) {
        this.f21764e = str;
    }

    @Override // bo.app.d2
    public void d(String str) {
        this.f21768i = str;
    }

    @Override // bo.app.d2
    public void e(String str) {
        this.f21765f = str;
    }

    @Override // bo.app.p2
    public g5 f() {
        return new g5(Braze.Companion.getApiEndpoint(this.f22240a.a()));
    }

    @Override // bo.app.d2
    public Long g() {
        return this.f21763d;
    }

    @Override // bo.app.d2
    public String h() {
        return this.f21768i;
    }

    public String i() {
        return this.f21765f;
    }

    public String j() {
        return this.f21764e;
    }

    public String k() {
        return this.f21766g;
    }

    public String toString() {
        return hashCode() + " - " + JsonUtils.getPrettyPrintedString(d()) + "\nto target: " + f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1479q(g5 requestTarget, String str, r5 serverConfigStorageProvider) {
        super(requestTarget);
        kotlin.jvm.internal.i.e(requestTarget, "requestTarget");
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f21761b = str;
        this.f21762c = serverConfigStorageProvider;
    }

    @Override // bo.app.d2
    public void a(String str) {
        this.f21761b = str;
    }

    @Override // bo.app.d2
    public i0 b() {
        return this.f21767h;
    }

    public boolean c() {
        ArrayList<j2> arrayList = new ArrayList();
        arrayList.add(b());
        for (j2 j2Var : arrayList) {
            if (j2Var != null && !j2Var.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            i0 i0VarB = b();
            if (i0VarB != null && !i0VarB.isEmpty()) {
                jSONObject.put("device", i0VarB.forJsonPut());
            }
            if (j() != null) {
                jSONObject.put("device_id", j());
            }
            if (g() != null) {
                jSONObject.put("time", g());
            }
            if (i() != null) {
                jSONObject.put("api_key", i());
            }
            if (k() != null) {
                jSONObject.put("sdk_version", k());
            }
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, l.f21779b);
            return null;
        }
    }

    @Override // bo.app.d2
    public void a(Long l10) {
        this.f21763d = l10;
    }

    @Override // bo.app.p2
    public void b(k2 internalPublisher) {
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        internalPublisher.a(new z4(this), z4.class);
    }

    @Override // bo.app.d2
    public void a(i0 i0Var) {
        this.f21767h = i0Var;
    }

    @Override // bo.app.p2
    public void a(k2 internalPublisher, k2 externalPublisher, d4 apiResponse) {
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        kotlin.jvm.internal.i.e(externalPublisher, "externalPublisher");
        kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
        if (apiResponse.i() != null) {
            t2 t2VarI = apiResponse.i();
            externalPublisher.a(new BrazeSdkAuthenticationErrorEvent(new j5(t2VarI.a(), t2VarI.d(), t2VarI.b(), null, 8, null)), BrazeSdkAuthenticationErrorEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new k(), 3, (Object) null);
    }

    @Override // bo.app.p2
    public void a(k2 internalPublisher, k2 externalPublisher, r2 responseError) {
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        kotlin.jvm.internal.i.e(externalPublisher, "externalPublisher");
        kotlin.jvm.internal.i.e(responseError, "responseError");
        String strC = responseError.c();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new b(strC), 2, (Object) null);
        if (responseError instanceof k3) {
            internalPublisher.a(responseError, k3.class);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, c.f21770b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, d.f21771b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, e.f21772b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, f.f21773b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, g.f21774b, 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new h(), 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new i(), 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, j.f21777b, 2, (Object) null);
        }
        if (responseError instanceof j5) {
            externalPublisher.a(new BrazeSdkAuthenticationErrorEvent((j5) responseError), BrazeSdkAuthenticationErrorEvent.class);
        }
    }

    @Override // bo.app.p2
    public void a(k2 internalPublisher) {
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        internalPublisher.a(new a5(this), a5.class);
    }

    public void a(Map existingHeaders) {
        kotlin.jvm.internal.i.e(existingHeaders, "existingHeaders");
        existingHeaders.put("X-Braze-Api-Key", i());
        String strH = h();
        if (strH == null || strH.length() == 0) {
            return;
        }
        existingHeaders.put("X-Braze-Auth-Signature", h());
    }
}
