package bo.app;

import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f21797l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2 f21798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f21799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k2 f21800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s1 f21801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c2 f21802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r5 f21803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1486y f21804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z0 f21805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c5.c f21806i;
    private final Map j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d2 f21807k;

    public static final class a {

        /* JADX INFO: renamed from: bo.app.r$a$a, reason: collision with other inner class name */
        public static final class C0230a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f21808b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0230a(Object obj) {
                super(0);
                this.f21808b = obj;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Encountered exception while parsing server response for " + this.f21808b;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(Object obj, Ia.a aVar) {
            try {
                aVar.invoke();
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(obj, BrazeLogger.Priority.E, e10, new C0230a(obj));
            }
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g5 f21809b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g5 g5Var) {
            super(0);
            this.f21809b = g5Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not parse request parameters for POST request to " + this.f21809b + ", cancelling request.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21810b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced network communication exception processing API response. Sending network error event.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1485x f21812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f21813d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C1485x c1485x, String str) {
            super(0);
            this.f21812c = c1485x;
            this.f21813d = str;
        }

        public final void a() {
            ContentCardsUpdatedEvent contentCardsUpdatedEventA = r.this.f21804g.a(this.f21812c, this.f21813d);
            if (contentCardsUpdatedEventA != null) {
                r.this.f21800c.a(contentCardsUpdatedEventA, ContentCardsUpdatedEvent.class);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONArray f21815c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONArray jSONArray) {
            super(0);
            this.f21815c = jSONArray;
        }

        public final void a() {
            r.this.f21799b.a(new n1(this.f21815c), n1.class);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONArray f21817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f21818d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JSONArray jSONArray, String str) {
            super(0);
            this.f21817c = jSONArray;
            this.f21818d = str;
        }

        public final void a() {
            FeedUpdatedEvent feedUpdatedEventA = r.this.f21801d.a(this.f21817c, this.f21818d);
            if (feedUpdatedEventA != null) {
                r.this.f21800c.a(feedUpdatedEventA, FeedUpdatedEvent.class);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f21820c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list) {
            super(0);
            this.f21820c = list;
        }

        public final void a() {
            r.this.f21799b.a(new w1(this.f21820c), w1.class);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p5 f21822c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(p5 p5Var) {
            super(0);
            this.f21822c = p5Var;
        }

        public final void a() {
            r.this.f21803f.a(this.f21822c);
            r.this.f21799b.a(new q5(this.f21822c), q5.class);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IInAppMessage f21824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f21825d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(IInAppMessage iInAppMessage, String str) {
            super(0);
            this.f21824c = iInAppMessage;
            this.f21825d = str;
        }

        public final void a() {
            if (r.this.f21807k instanceof h6) {
                this.f21824c.setExpirationTimestamp(((h6) r.this.f21807k).l());
                r.this.f21799b.a(new g3(((h6) r.this.f21807k).n(), ((h6) r.this.f21807k).o(), this.f21824c, this.f21825d), g3.class);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f21827c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List list) {
            super(0);
            this.f21827c = list;
        }

        public final void a() {
            r.this.f21799b.a(new b7(this.f21827c), b7.class);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21828b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.f21828b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Processing server response payload for user with id: " + this.f21828b;
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r2 f21829b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(r2 r2Var) {
            super(0);
            this.f21829b = r2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received server error from request: " + this.f21829b.c();
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f21830b = new m();

        public m() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Api response was null, failing task.";
        }
    }

    public r(e5 requestInfo, l2 httpConnector, k2 internalPublisher, k2 externalPublisher, s1 feedStorageProvider, c2 brazeManager, r5 serverConfigStorage, C1486y contentCardsStorage, z0 endpointMetadataProvider, c5.c requestDispatchCallback) {
        kotlin.jvm.internal.i.e(requestInfo, "requestInfo");
        kotlin.jvm.internal.i.e(httpConnector, "httpConnector");
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        kotlin.jvm.internal.i.e(externalPublisher, "externalPublisher");
        kotlin.jvm.internal.i.e(feedStorageProvider, "feedStorageProvider");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        kotlin.jvm.internal.i.e(serverConfigStorage, "serverConfigStorage");
        kotlin.jvm.internal.i.e(contentCardsStorage, "contentCardsStorage");
        kotlin.jvm.internal.i.e(endpointMetadataProvider, "endpointMetadataProvider");
        kotlin.jvm.internal.i.e(requestDispatchCallback, "requestDispatchCallback");
        this.f21798a = httpConnector;
        this.f21799b = internalPublisher;
        this.f21800c = externalPublisher;
        this.f21801d = feedStorageProvider;
        this.f21802e = brazeManager;
        this.f21803f = serverConfigStorage;
        this.f21804g = contentCardsStorage;
        this.f21805h = endpointMetadataProvider;
        this.f21806i = requestDispatchCallback;
        Map mapA = d5.a();
        this.j = mapA;
        d2 d2VarB = requestInfo.b();
        this.f21807k = d2VarB;
        d2VarB.a(mapA);
    }

    private final l2 b() {
        l2 l2VarB = y1.f22237a.b();
        return l2VarB == null ? this.f21798a : l2VarB;
    }

    public final AbstractC1461d a() {
        this.f21807k.a(Long.valueOf(DateTimeUtils.nowInSeconds()));
        g5 g5VarF = this.f21807k.f();
        JSONObject jSONObjectD = this.f21807k.d();
        if (jSONObjectD == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(g5VarF), 2, (Object) null);
            return new c7(this.f21807k, new l2.a(-1, null, null, 6, null));
        }
        this.j.put("X-Braze-Last-Req-Ms-Ago", String.valueOf(this.f21805h.a(g5VarF)));
        this.j.put("X-Braze-Req-Attempt", String.valueOf(this.f21805h.a(g5VarF, false)));
        l2.a aVarA = b().a(g5VarF, this.j, jSONObjectD);
        if (aVarA.a() != null) {
            return new d4(this.f21807k, aVarA, this.f21802e);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.E, (Throwable) null, c.f21810b, 2, (Object) null);
        this.f21800c.a(new BrazeNetworkFailureEvent(this.f21807k), BrazeNetworkFailureEvent.class);
        return new c7(this.f21807k, aVarA);
    }

    public final void c() {
        AbstractC1461d abstractC1461dA = a();
        if (abstractC1461dA instanceof d4) {
            d4 d4Var = (d4) abstractC1461dA;
            a(d4Var);
            if (d4Var.e() instanceof j5) {
                this.f21799b.a(new p0(this.f21807k), p0.class);
                return;
            } else {
                this.f21799b.a(new q0(this.f21807k), q0.class);
                return;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, m.f21830b, 2, (Object) null);
        s3 s3Var = new s3(this.f21807k, "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", abstractC1461dA.a());
        this.f21807k.a(this.f21799b, this.f21800c, s3Var);
        this.f21799b.a(new p0(this.f21807k), p0.class);
        a(s3Var);
        this.f21806i.a(abstractC1461dA);
    }

    public final void b(d4 apiResponse) {
        kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
        String strA = this.f21802e.a();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new k(strA), 2, (Object) null);
        a(apiResponse.g(), strA);
        a(apiResponse.c(), strA);
        a(apiResponse.k());
        b(apiResponse.m());
        a(apiResponse.h());
        a(apiResponse.f());
        a(apiResponse.l(), strA);
        a(apiResponse.d());
    }

    private final void b(List list) {
        if (list != null) {
            f21797l.a(list, new j(list));
        }
    }

    public final void a(d4 apiResponse) {
        kotlin.jvm.internal.i.e(apiResponse, "apiResponse");
        if (apiResponse.e() == null) {
            this.f21805h.b(this.f21807k.f(), false);
            this.f21807k.a(this.f21799b, this.f21800c, apiResponse);
            this.f21806i.a(apiResponse);
        } else {
            a(apiResponse.e());
            this.f21807k.a(this.f21799b, this.f21800c, apiResponse.e());
            this.f21806i.a((AbstractC1461d) apiResponse);
        }
        b(apiResponse);
    }

    public final void a(r2 responseError) {
        kotlin.jvm.internal.i.e(responseError, "responseError");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new l(responseError), 2, (Object) null);
        this.f21799b.a(new s5(responseError), s5.class);
        d2 d2Var = this.f21807k;
        if (d2Var instanceof h6) {
            k2 k2Var = this.f21800c;
            String strD = ((h6) d2Var).n().d();
            kotlin.jvm.internal.i.d(strD, "request.triggerEvent.triggerEventType");
            k2Var.a(new NoMatchingTriggerEvent(strD), NoMatchingTriggerEvent.class);
        }
    }

    private final void a(String str) {
        if (str != null) {
            this.f21799b.a(new v0(str), v0.class);
        }
    }

    private final void a(JSONArray jSONArray, String str) {
        if (jSONArray != null) {
            f21797l.a(jSONArray, new f(jSONArray, str));
        }
    }

    private final void a(C1485x c1485x, String str) {
        if (c1485x != null) {
            f21797l.a(c1485x, new d(c1485x, str));
        }
    }

    private final void a(p5 p5Var) {
        if (p5Var != null) {
            f21797l.a(p5Var, new h(p5Var));
        }
    }

    private final void a(List list) {
        if (list != null) {
            f21797l.a(list, new g(list));
        }
    }

    private final void a(JSONArray jSONArray) {
        if (jSONArray != null) {
            f21797l.a(jSONArray, new e(jSONArray));
        }
    }

    private final void a(IInAppMessage iInAppMessage, String str) {
        if (iInAppMessage != null) {
            f21797l.a(iInAppMessage, new i(iInAppMessage, str));
        }
    }
}
