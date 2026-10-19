package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b4 implements IPutIntoJson, j2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f20750f = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f20752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f20753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a4 f20754e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Boolean f20756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f20757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a4 f20758d;

        public a(String str, Boolean bool, Boolean bool2, a4 a4Var) {
            this.f20755a = str;
            this.f20756b = bool;
            this.f20757c = bool2;
            this.f20758d = a4Var;
        }

        public final void a(String str) {
            this.f20755a = str;
        }

        public final Boolean b() {
            return this.f20756b;
        }

        public final Boolean c() {
            return this.f20757c;
        }

        public final a d() {
            this.f20756b = Boolean.TRUE;
            return this;
        }

        public final a e() {
            this.f20757c = Boolean.TRUE;
            return this;
        }

        public final a a(a4 outboundConfigParams) {
            kotlin.jvm.internal.i.e(outboundConfigParams, "outboundConfigParams");
            this.f20758d = outboundConfigParams;
            return this;
        }

        public final a b(String str) {
            this.f20755a = str;
            return this;
        }

        public final b4 a() {
            return new b4(this.f20755a, this.f20756b, this.f20757c, this.f20758d, null);
        }

        public /* synthetic */ a(String str, Boolean bool, Boolean bool2, a4 a4Var, int i10, kotlin.jvm.internal.e eVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : bool2, (i10 & 8) != 0 ? null : a4Var);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ b4(String str, Boolean bool, Boolean bool2, a4 a4Var, kotlin.jvm.internal.e eVar) {
        this(str, bool, bool2, a4Var);
    }

    public final boolean A() {
        String str = this.f20751b;
        return !(str == null || str.length() == 0);
    }

    @Override // bo.app.j2
    public boolean isEmpty() throws JSONException {
        a4 a4Var;
        JSONObject jSONObjectForJsonPut = forJsonPut();
        if (jSONObjectForJsonPut.length() == 0) {
            return true;
        }
        if (this.f20752c == null && this.f20753d == null && (a4Var = this.f20754e) != null) {
            return a4Var.isEmpty();
        }
        if (jSONObjectForJsonPut.length() == 1) {
            return jSONObjectForJsonPut.has("user_id");
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public JSONObject forJsonPut() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f20751b;
        if (str != null && str.length() != 0) {
            jSONObject.put("user_id", this.f20751b);
        }
        Boolean bool = this.f20752c;
        if (bool != null) {
            jSONObject.put("feed", bool.booleanValue());
        }
        Boolean bool2 = this.f20753d;
        if (bool2 != null) {
            jSONObject.put("triggers", bool2.booleanValue());
        }
        a4 a4Var = this.f20754e;
        if (a4Var != null) {
            jSONObject.put("config", a4Var.forJsonPut());
        }
        return jSONObject;
    }

    public final a4 v() {
        return this.f20754e;
    }

    public final String w() {
        return this.f20751b;
    }

    public final boolean x() {
        return this.f20754e != null;
    }

    public final boolean y() {
        return this.f20752c != null;
    }

    public final boolean z() {
        return this.f20753d != null;
    }

    private b4(String str, Boolean bool, Boolean bool2, a4 a4Var) {
        this.f20751b = str;
        this.f20752c = bool;
        this.f20753d = bool2;
        this.f20754e = a4Var;
    }
}
