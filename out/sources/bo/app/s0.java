package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends AbstractC1479q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f21896m = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f21897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d2.a f21898l;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21899b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced JSONException while creating DUST config request. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(r5 serverConfigStorageProvider, String urlBase, String str) {
        super(new g5(urlBase.concat("dust/config")), str, serverConfigStorageProvider);
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(urlBase, "urlBase");
        this.f21898l = d2.a.DUST_CONFIG;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public boolean c() {
        return this.f21897k;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        if (jSONObjectD == null) {
            return null;
        }
        try {
            String strA = a();
            if (strA != null && !kotlin.text.n.S(strA)) {
                jSONObjectD.put("user_id", a());
            }
            return jSONObjectD;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, b.f21899b);
            return null;
        }
    }

    @Override // bo.app.d2
    public d2.a e() {
        return this.f21898l;
    }
}
