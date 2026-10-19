package bo.app;

import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: bo.app.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1468g0 extends AbstractC1479q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f21107s = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b4 f21108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private SdkFlavor f21109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c4 f21110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C1472j f21111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private EnumSet f21112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f21113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f21114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final d2.a f21115r;

    /* JADX INFO: renamed from: bo.app.g0$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: bo.app.g0$b */
    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21116b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger dispatch completed. Alerting subscribers.";
        }
    }

    /* JADX INFO: renamed from: bo.app.g0$c */
    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21117b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning empty object.";
        }
    }

    public /* synthetic */ C1468g0(r5 r5Var, String str, b4 b4Var, int i10, kotlin.jvm.internal.e eVar) {
        this(r5Var, str, (i10 & 4) != 0 ? new b4.a(null, null, null, null, 15, null).a() : b4Var);
    }

    public final void a(SdkFlavor sdkFlavor) {
        this.f21109l = sdkFlavor;
    }

    @Override // bo.app.AbstractC1479q, bo.app.p2
    public void b(k2 internalPublisher) {
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        if (this.f21108k.z()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.f21116b, 3, (Object) null);
            internalPublisher.a(new o6(this), o6.class);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[RETURN, SYNTHETIC] */
    @Override // bo.app.AbstractC1479q, bo.app.d2
    public boolean c() {
        ArrayList<j2> arrayList = new ArrayList();
        arrayList.add(b());
        arrayList.add(this.f21110m);
        arrayList.add(this.f21111n);
        arrayList.add(this.f21108k);
        if (!arrayList.isEmpty()) {
            for (j2 j2Var : arrayList) {
                if (j2Var == null || j2Var.isEmpty()) {
                }
            }
            if (super.c()) {
                return true;
            }
        } else if (super.c()) {
            return true;
        }
        return false;
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public JSONObject d() {
        JSONObject jSONObjectD = super.d();
        if (jSONObjectD == null) {
            return null;
        }
        try {
            String str = this.f21113p;
            if (str != null) {
                jSONObjectD.put("app_version", str);
            }
            String str2 = this.f21114q;
            if (str2 != null && !kotlin.text.n.S(str2)) {
                jSONObjectD.put("app_version_code", this.f21114q);
            }
            c4 c4Var = this.f21110m;
            if (c4Var != null && !c4Var.isEmpty()) {
                jSONObjectD.put("attributes", c4Var.forJsonPut());
            }
            C1472j c1472j = this.f21111n;
            if (c1472j != null && !c1472j.isEmpty()) {
                jSONObjectD.put("events", JsonUtils.constructJsonArray(c1472j.b()));
            }
            SdkFlavor sdkFlavor = this.f21109l;
            if (sdkFlavor != null) {
                jSONObjectD.put("sdk_flavor", sdkFlavor.forJsonPut());
            }
            EnumSet enumSet = this.f21112o;
            if (enumSet != null) {
                jSONObjectD.put("sdk_metadata", BrazeSdkMetadata.Companion.a(enumSet));
            }
            jSONObjectD.put("respond_with", this.f21108k.forJsonPut());
            return jSONObjectD;
        } catch (JSONException e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, c.f21117b);
            return null;
        }
    }

    @Override // bo.app.d2
    public d2.a e() {
        return this.f21115r;
    }

    public final void f(String str) {
        this.f21114q = str;
    }

    public final void g(String str) {
        this.f21113p = str;
    }

    public final C1472j l() {
        return this.f21111n;
    }

    public final b4 m() {
        return this.f21108k;
    }

    public final c4 n() {
        return this.f21110m;
    }

    public final EnumSet o() {
        return this.f21112o;
    }

    public final void a(c4 c4Var) {
        this.f21110m = c4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1468g0(r5 serverConfigStorageProvider, String urlBase, b4 outboundRespondWith) {
        super(new g5(urlBase.concat("data")), null, serverConfigStorageProvider, 2, null);
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(urlBase, "urlBase");
        kotlin.jvm.internal.i.e(outboundRespondWith, "outboundRespondWith");
        this.f21108k = outboundRespondWith;
        this.f21115r = d2.a.V3_DATA;
    }

    public final void a(C1472j c1472j) {
        this.f21111n = c1472j;
    }

    public final void a(EnumSet enumSet) {
        this.f21112o = enumSet;
    }

    @Override // bo.app.AbstractC1479q, bo.app.p2
    public void a(k2 internalPublisher) {
        kotlin.jvm.internal.i.e(internalPublisher, "internalPublisher");
        if (this.f21108k.z()) {
            internalPublisher.a(new p6(this), p6.class);
        }
    }

    @Override // bo.app.AbstractC1479q, bo.app.d2
    public void a(Map existingHeaders) {
        boolean z10;
        kotlin.jvm.internal.i.e(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        if (this.f21108k.isEmpty()) {
            return;
        }
        boolean z11 = true;
        if (this.f21108k.y()) {
            existingHeaders.put("X-Braze-FeedRequest", "true");
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f21108k.z()) {
            existingHeaders.put("X-Braze-TriggersRequest", "true");
        } else {
            z11 = z10;
        }
        if (z11) {
            existingHeaders.put("X-Braze-DataRequest", "true");
        }
    }

    public final boolean a(C1468g0 c1468g0) {
        C1472j c1472j;
        if (c1468g0 == null) {
            return false;
        }
        if (this.f21110m != null && c1468g0.f21110m != null) {
            return false;
        }
        C1472j c1472j2 = this.f21111n;
        if ((c1472j2 != null && !c1472j2.isEmpty()) || ((c1472j = c1468g0.f21111n) != null && !c1472j.isEmpty())) {
            return false;
        }
        b4.a aVar = new b4.a(null, null, null, null, 15, null);
        b4 b4Var = c1468g0.f21108k;
        if (this.f21108k.y() || b4Var.y()) {
            aVar.d();
        }
        if (this.f21108k.z() || b4Var.z()) {
            aVar.e();
        }
        a4 a4VarV = this.f21108k.v();
        if (a4VarV != null) {
            aVar.a(a4VarV);
        }
        a4 a4VarV2 = b4Var.v();
        if (a4VarV2 != null) {
            aVar.a(a4VarV2);
        }
        String strW = this.f21108k.w();
        if (strW != null) {
            aVar.b(strW);
        }
        String strW2 = b4Var.w();
        if (strW2 != null) {
            aVar.b(strW2);
        }
        this.f21108k = aVar.a();
        return true;
    }
}
