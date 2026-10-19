package bo.app;

import android.content.Context;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class i6 extends a7 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f21319m = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c2 f21320i;
    private String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f21321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f21322l;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f21323b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(0);
            this.f21323b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Parsing templated triggered action with JSON: " + JsonUtils.getPrettyPrintedString(this.f21323b);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21324a;

        static {
            int[] iArr = new int[x4.values().length];
            try {
                iArr[x4.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x4.ZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x4.FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21324a = iArr;
        }
    }

    public static final class d extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f21325b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONArray jSONArray) {
            super(1);
            this.f21325b = jSONArray;
        }

        public final Boolean a(int i10) {
            return Boolean.valueOf(this.f21325b.opt(i10) instanceof String);
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class e extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f21326b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONArray jSONArray) {
            super(1);
            this.f21326b = jSONArray;
        }

        public final Object a(int i10) throws JSONException {
            Object obj = this.f21326b.get(i10);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f21327b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not convert TemplatedTriggeredAction to JSON";
        }
    }

    public static final class g extends Lambda implements Ia.a {
        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Posting templating request after delay of " + i6.this.n().o() + " seconds.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(JSONObject json, c2 brazeManager) throws JSONException {
        super(json);
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        this.f21321k = new ArrayList();
        this.f21322l = -1L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(json), 3, (Object) null);
        this.f21320i = brazeManager;
        JSONObject jSONObject = json.getJSONObject("data");
        String string = jSONObject.getString(InAppMessageBase.TRIGGER_ID);
        kotlin.jvm.internal.i.d(string, "dataObject.getString(TRIGGER_ID)");
        this.j = string;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("prefetch_image_urls");
        if (jSONArrayOptJSONArray != null) {
            a(jSONArrayOptJSONArray, x4.IMAGE);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("prefetch_zip_urls");
        if (jSONArrayOptJSONArray2 != null) {
            a(jSONArrayOptJSONArray2, x4.ZIP);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("prefetch_file_urls");
        if (jSONArrayOptJSONArray3 != null) {
            a(jSONArrayOptJSONArray3, x4.FILE);
        }
    }

    public final long A() {
        return this.f21322l;
    }

    @Override // bo.app.c3
    public void a(Context context, k2 internalEventPublisher, x2 triggerEvent, long j) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(internalEventPublisher, "internalEventPublisher");
        kotlin.jvm.internal.i.e(triggerEvent, "triggerEvent");
        this.f21322l = j;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(), 3, (Object) null);
        this.f21320i.a(this, triggerEvent);
    }

    @Override // bo.app.c3
    public List l() {
        return new ArrayList(this.f21321k);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObjectForJsonPut = super.forJsonPut();
            if (jSONObjectForJsonPut == null) {
                return null;
            }
            jSONObjectForJsonPut.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.j);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (w4 w4Var : this.f21321k) {
                int i10 = c.f21324a[w4Var.a().ordinal()];
                if (i10 == 1) {
                    jSONArray.put(w4Var.b());
                } else if (i10 == 2) {
                    jSONArray2.put(w4Var.b());
                } else if (i10 == 3) {
                    jSONArray3.put(w4Var.b());
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            jSONObjectForJsonPut.put("data", jSONObject);
            return jSONObjectForJsonPut;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, f.f21327b);
            return null;
        }
    }

    public final String z() {
        return this.j;
    }

    private final void a(JSONArray jSONArray, x4 x4Var) {
        Iterator aVar;
        if (jSONArray == null) {
            EmptyList.f42983b.getClass();
            aVar = kotlin.collections.r.f43021b;
        } else {
            aVar = new kotlin.sequences.n.a(new kotlin.sequences.n(SequencesKt___SequencesKt.C(kotlin.collections.q.H(Na.l.J(0, jSONArray.length())), new d(jSONArray)), new e(jSONArray)));
        }
        while (aVar.hasNext()) {
            this.f21321k.add(new w4(x4Var, (String) aVar.next()));
        }
    }
}
