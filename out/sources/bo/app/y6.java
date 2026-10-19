package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class y6 implements c3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f22244g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s2 f22246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f22247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v6 f22248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f22249f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x2 f22251c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x2 x2Var) {
            super(0);
            this.f22251c = x2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered action " + y6.this.getId() + " not eligible to be triggered by " + this.f22251c.d() + " event. Current device time outside triggered action time window.";
        }
    }

    public y6(JSONObject json) throws JSONException {
        kotlin.jvm.internal.i.e(json, "json");
        ArrayList arrayList = new ArrayList();
        this.f22249f = arrayList;
        String string = json.getString("id");
        kotlin.jvm.internal.i.d(string, "json.getString(ID)");
        this.f22245b = string;
        this.f22246c = new h5(json);
        JSONArray jSONArray = json.getJSONArray("trigger_condition");
        if (jSONArray.length() > 0) {
            arrayList.addAll(w6.f22152a.a(jSONArray));
        }
        this.f22247d = json.optBoolean("prefetch", true);
    }

    private final boolean v() {
        return this.f22246c.p() == -1 || DateTimeUtils.nowInSeconds() < this.f22246c.p();
    }

    private final boolean w() {
        return this.f22246c.b() == -1 || DateTimeUtils.nowInSeconds() > this.f22246c.b();
    }

    private final boolean x() {
        return w() && v();
    }

    @Override // bo.app.c3
    public void a(v6 v6Var) {
        this.f22248e = v6Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // bo.app.c3
    public boolean b(x2 event) {
        kotlin.jvm.internal.i.e(event, "event");
        if (!x()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(event), 3, (Object) null);
            return false;
        }
        Iterator it = this.f22249f.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((w2) it.next()).a(event)) {
                if (i10 != -1) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 != -1) {
            return true;
        }
        return false;
    }

    @Override // bo.app.c3
    public v6 c() {
        return this.f22248e;
    }

    @Override // bo.app.c3
    public final boolean d() {
        return this.f22247d;
    }

    @Override // bo.app.c3
    public final String getId() {
        return this.f22245b;
    }

    @Override // bo.app.c3
    public final s2 n() {
        return this.f22246c;
    }

    public JSONObject u() {
        try {
            JSONObject jSONObject = (JSONObject) this.f22246c.forJsonPut();
            if (jSONObject != null) {
                jSONObject.put("id", this.f22245b);
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f22249f.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((w2) it.next()).forJsonPut());
                }
                jSONObject.put("trigger_condition", jSONArray);
                jSONObject.put("prefetch", this.f22247d);
                return jSONObject;
            }
        } catch (JSONException unused) {
        }
        return null;
    }
}
