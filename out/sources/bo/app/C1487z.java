package bo.app;

import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: bo.app.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1487z extends AbstractC1479q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f22252p = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f22253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f22254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f22255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f22256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d2.a f22257o;

    /* JADX INFO: renamed from: bo.app.z$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: bo.app.z$b */
    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f22258b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced JSONException while creating Content Cards request. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1487z(r5 serverConfigStorageProvider, String urlBase, long j, long j10, String str, int i10) {
        super(new g5(urlBase.concat("content_cards/sync")), str, serverConfigStorageProvider);
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(urlBase, "urlBase");
        this.f22253k = j;
        this.f22254l = j10;
        this.f22255m = i10;
        this.f22257o = d2.a.CONTENT_CARD_SYNC;
    }

    public final void a(long j) {
        this.f22253k = j;
    }

    public final void b(long j) {
        this.f22254l = j;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public boolean c() {
        return this.f22256n;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        if (jSONObjectD == null) {
            return null;
        }
        try {
            jSONObjectD.put("last_full_sync_at", this.f22254l);
            jSONObjectD.put("last_card_updated_at", this.f22253k);
            String strA = a();
            if (strA != null && !kotlin.text.n.S(strA)) {
                jSONObjectD.put("user_id", a());
            }
            return jSONObjectD;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, b.f22258b);
            return null;
        }
    }

    @Override // bo.app.d2
    public d2.a e() {
        return this.f22257o;
    }

    public final void a(int i10) {
        this.f22255m = i10;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public void a(Map existingHeaders) {
        kotlin.jvm.internal.i.e(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", "true");
        existingHeaders.put("X-Braze-ContentCardsRequest", "true");
        existingHeaders.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.f22255m));
    }
}
