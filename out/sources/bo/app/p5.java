package bo.app;

import A1.C0575j;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p5 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f21724B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f21725A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f21726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set f21727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f21728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f21729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21734i;
    private boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f21735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f21737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21738n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f21739o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f21740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f21741q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f21742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f21743s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f21744t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f21745u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f21746v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f21747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f21748x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f21749y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f21750z;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21751b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting required content cards fields. Using defaults.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21752b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting Content Card rate limit fields. Using defaults.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f21753b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting required DUST enabled field. Using default of false.";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f21754b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting required ephemeral events fields. Using defaults.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f21755b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting required feature flag fields. Disabling feature flags.";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f21756b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting required geofence fields. Using defaults.";
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f21757b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error getting required push max fields. Disabling push max.";
        }
    }

    public static final class i extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f21758b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(JSONArray jSONArray) {
            super(1);
            this.f21758b = jSONArray;
        }

        public final Boolean a(int i10) {
            return Boolean.valueOf(this.f21758b.opt(i10) instanceof String);
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class j extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f21759b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(JSONArray jSONArray) {
            super(1);
            this.f21759b = jSONArray;
        }

        public final Object a(int i10) throws JSONException {
            Object obj = this.f21759b.get(i10);
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

    public p5(long j10, Set set, Set set2, Set set3, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, long j11, boolean z13, boolean z14, int i13, boolean z15, int i14, int i15, boolean z16, long j12, boolean z17, int i16, int i17, boolean z18, long j13, int i18, int i19, int i20) {
        this.f21726a = j10;
        this.f21727b = set;
        this.f21728c = set2;
        this.f21729d = set3;
        this.f21730e = i10;
        this.f21731f = i11;
        this.f21732g = i12;
        this.f21733h = z10;
        this.f21734i = z11;
        this.j = z12;
        this.f21735k = j11;
        this.f21736l = z13;
        this.f21737m = z14;
        this.f21738n = i13;
        this.f21739o = z15;
        this.f21740p = i14;
        this.f21741q = i15;
        this.f21742r = z16;
        this.f21743s = j12;
        this.f21744t = z17;
        this.f21745u = i16;
        this.f21746v = i17;
        this.f21747w = z18;
        this.f21748x = j13;
        this.f21749y = i18;
        this.f21750z = i19;
        this.f21725A = i20;
    }

    public final boolean A() {
        return this.f21747w;
    }

    public final void a(long j10) {
        this.f21726a = j10;
    }

    public final Set b() {
        return this.f21727b;
    }

    public final Set c() {
        return this.f21729d;
    }

    public final long d() {
        return this.f21726a;
    }

    public final void e(boolean z10) {
        this.f21737m = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return this.f21726a == p5Var.f21726a && kotlin.jvm.internal.i.a(this.f21727b, p5Var.f21727b) && kotlin.jvm.internal.i.a(this.f21728c, p5Var.f21728c) && kotlin.jvm.internal.i.a(this.f21729d, p5Var.f21729d) && this.f21730e == p5Var.f21730e && this.f21731f == p5Var.f21731f && this.f21732g == p5Var.f21732g && this.f21733h == p5Var.f21733h && this.f21734i == p5Var.f21734i && this.j == p5Var.j && this.f21735k == p5Var.f21735k && this.f21736l == p5Var.f21736l && this.f21737m == p5Var.f21737m && this.f21738n == p5Var.f21738n && this.f21739o == p5Var.f21739o && this.f21740p == p5Var.f21740p && this.f21741q == p5Var.f21741q && this.f21742r == p5Var.f21742r && this.f21743s == p5Var.f21743s && this.f21744t == p5Var.f21744t && this.f21745u == p5Var.f21745u && this.f21746v == p5Var.f21746v && this.f21747w == p5Var.f21747w && this.f21748x == p5Var.f21748x && this.f21749y == p5Var.f21749y && this.f21750z == p5Var.f21750z && this.f21725A == p5Var.f21725A;
    }

    public final void f(boolean z10) {
        this.f21734i = z10;
    }

    public final void g(boolean z10) {
        this.f21733h = z10;
    }

    public final void h(boolean z10) {
        this.f21744t = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v28, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.f21726a) * 31;
        Set set = this.f21727b;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f21728c;
        int iHashCode3 = (iHashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set set3 = this.f21729d;
        int iB = p005a4.q.b(this.f21732g, p005a4.q.b(this.f21731f, p005a4.q.b(this.f21730e, (iHashCode3 + (set3 != null ? set3.hashCode() : 0)) * 31, 31), 31), 31);
        boolean z10 = this.f21733h;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iB + r10) * 31;
        boolean z11 = this.f21734i;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.j;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int iC = C4.b.c(this.f21735k, (i11 + r12) * 31, 31);
        boolean z13 = this.f21736l;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i12 = (iC + r13) * 31;
        boolean z14 = this.f21737m;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int iB2 = p005a4.q.b(this.f21738n, (i12 + r14) * 31, 31);
        boolean z15 = this.f21739o;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int iB3 = p005a4.q.b(this.f21741q, p005a4.q.b(this.f21740p, (iB2 + r15) * 31, 31), 31);
        boolean z16 = this.f21742r;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int iC2 = C4.b.c(this.f21743s, (iB3 + r16) * 31, 31);
        boolean z17 = this.f21744t;
        ?? r17 = z17;
        if (z17) {
            r17 = 1;
        }
        int iB4 = p005a4.q.b(this.f21746v, p005a4.q.b(this.f21745u, (iC2 + r17) * 31, 31), 31);
        boolean z18 = this.f21747w;
        return Integer.hashCode(this.f21725A) + p005a4.q.b(this.f21750z, p005a4.q.b(this.f21749y, C4.b.c(this.f21748x, (iB4 + (z18 ? 1 : z18)) * 31, 31), 31), 31);
    }

    public final void i(int i10) {
        this.f21732g = i10;
    }

    public final void j(int i10) {
        this.f21731f = i10;
    }

    public final void k(int i10) {
        this.f21730e = i10;
    }

    public final boolean l() {
        return this.f21737m;
    }

    public final int m() {
        return this.f21738n;
    }

    public final boolean n() {
        return this.f21734i;
    }

    public final boolean o() {
        return this.f21733h;
    }

    public final int p() {
        return this.f21746v;
    }

    public final int q() {
        return this.f21745u;
    }

    public final boolean r() {
        return this.f21744t;
    }

    public final int s() {
        return this.f21732g;
    }

    public final long t() {
        return this.f21735k;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ServerConfig(configTime=");
        sb2.append(this.f21726a);
        sb2.append(", blocklistedEvents=");
        sb2.append(this.f21727b);
        sb2.append(", blocklistedAttributes=");
        sb2.append(this.f21728c);
        sb2.append(", blocklistedPurchases=");
        sb2.append(this.f21729d);
        sb2.append(", minTimeSinceLastRequest=");
        sb2.append(this.f21730e);
        sb2.append(", minTimeSinceLastReport=");
        sb2.append(this.f21731f);
        sb2.append(", maxNumToRegister=");
        sb2.append(this.f21732g);
        sb2.append(", geofencesEnabledSet=");
        sb2.append(this.f21733h);
        sb2.append(", geofencesEnabled=");
        sb2.append(this.f21734i);
        sb2.append(", isContentCardsFeatureEnabled=");
        sb2.append(this.j);
        sb2.append(", messagingSessionTimeout=");
        sb2.append(this.f21735k);
        sb2.append(", ephemeralEventsEnabled=");
        sb2.append(this.f21736l);
        sb2.append(", featureFlagsEnabled=");
        sb2.append(this.f21737m);
        sb2.append(", featureFlagsRefreshRateLimit=");
        sb2.append(this.f21738n);
        sb2.append(", contentCardRateLimitEnabled=");
        sb2.append(this.f21739o);
        sb2.append(", contentCardRateLimitBucketRefillRate=");
        sb2.append(this.f21740p);
        sb2.append(", contentCardRateLimitBucketCapacity=");
        sb2.append(this.f21741q);
        sb2.append(", pushMaxEnabled=");
        sb2.append(this.f21742r);
        sb2.append(", pushMaxRedeliverBuffer=");
        sb2.append(this.f21743s);
        sb2.append(", globalRequestRateLimitEnabled=");
        sb2.append(this.f21744t);
        sb2.append(", globalRequestRateLimitBucketRefillRate=");
        sb2.append(this.f21745u);
        sb2.append(", globalRequestRateLimitBucketCapacity=");
        sb2.append(this.f21746v);
        sb2.append(", isDustFeatureEnabled=");
        sb2.append(this.f21747w);
        sb2.append(", pushMaxRedeliverDedupeBuffer=");
        sb2.append(this.f21748x);
        sb2.append(", defaultBackoffMinSleepMs=");
        sb2.append(this.f21749y);
        sb2.append(", defaultBackoffMaxSleepMs=");
        sb2.append(this.f21750z);
        sb2.append(", defaultBackoffScaleFactor=");
        return C0575j.b(sb2, this.f21725A, ')');
    }

    public final int u() {
        return this.f21731f;
    }

    public final int v() {
        return this.f21730e;
    }

    public final boolean w() {
        return this.f21742r;
    }

    public final long x() {
        return this.f21743s;
    }

    public final long y() {
        return this.f21748x;
    }

    public final boolean z() {
        return this.j;
    }

    public final Set a() {
        return this.f21728c;
    }

    public final void b(Set set) {
        this.f21727b = set;
    }

    public final void c(Set set) {
        this.f21729d = set;
    }

    public final void d(boolean z10) {
        this.f21736l = z10;
    }

    public final int e() {
        return this.f21741q;
    }

    public final void f(int i10) {
        this.f21738n = i10;
    }

    public final boolean g() {
        return this.f21739o;
    }

    public final void h(int i10) {
        this.f21745u = i10;
    }

    public final void i(boolean z10) {
        this.f21742r = z10;
    }

    public final int j() {
        return this.f21725A;
    }

    public final boolean k() {
        return this.f21736l;
    }

    public final void a(Set set) {
        this.f21728c = set;
    }

    public final void b(boolean z10) {
        this.j = z10;
    }

    public final void c(long j10) {
        this.f21743s = j10;
    }

    public final void d(long j10) {
        this.f21748x = j10;
    }

    public final void e(int i10) {
        this.f21725A = i10;
    }

    public final int f() {
        return this.f21740p;
    }

    public final void g(int i10) {
        this.f21746v = i10;
    }

    public final int h() {
        return this.f21750z;
    }

    public final int i() {
        return this.f21749y;
    }

    private final void e(JSONObject jSONObject) {
        boolean z10;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ephemeral_events");
        if (jSONObjectOptJSONObject != null) {
            try {
                z10 = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
            } catch (JSONException e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, e.f21754b);
                z10 = false;
            }
            this.f21736l = z10;
        }
    }

    private final void f(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("feature_flags");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f21737m = jSONObjectOptJSONObject.optBoolean(FeatureFlag.ENABLED);
                this.f21738n = jSONObjectOptJSONObject.getInt("refresh_rate_limit");
            } catch (JSONException e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, f.f21755b);
                this.f21737m = false;
            }
        }
    }

    private final void g(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("geofences");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f21730e = jSONObjectOptJSONObject.getInt("min_time_since_last_request");
                this.f21731f = jSONObjectOptJSONObject.getInt("min_time_since_last_report");
                this.f21734i = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
                this.f21733h = true;
                this.f21732g = jSONObjectOptJSONObject.optInt("max_num_to_register", 20);
            } catch (JSONException e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, g.f21756b);
                this.f21730e = -1;
                this.f21731f = -1;
                this.f21732g = -1;
                this.f21734i = false;
                this.f21733h = false;
            }
        }
    }

    private final void h(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("global_request_rate_limit");
        if (jSONObjectOptJSONObject != null) {
            if (!jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED)) {
                this.f21744t = false;
                return;
            }
            int i10 = jSONObjectOptJSONObject.getInt("refill_rate");
            int i11 = jSONObjectOptJSONObject.getInt("capacity");
            if (i11 < 10) {
                this.f21744t = false;
            } else {
                if (i10 <= 0) {
                    return;
                }
                this.f21744t = true;
                this.f21746v = i11;
                this.f21745u = i10;
            }
        }
    }

    private final void i(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("push_max");
        if (jSONObjectOptJSONObject != null) {
            try {
                this.f21742r = jSONObjectOptJSONObject.optBoolean(FeatureFlag.ENABLED);
                this.f21743s = jSONObjectOptJSONObject.optLong("redeliver_buffer", 86400L);
                this.f21748x = jSONObjectOptJSONObject.optLong("redeliver_dedupe_buffer", -1L);
            } catch (JSONException e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, h.f21757b);
                this.f21742r = false;
                this.f21743s = 0L;
                this.f21748x = -1L;
            }
        }
    }

    public final void a(boolean z10) {
        this.f21739o = z10;
    }

    public final void b(long j10) {
        this.f21735k = j10;
    }

    public final void c(boolean z10) {
        this.f21747w = z10;
    }

    public final void d(int i10) {
        this.f21749y = i10;
    }

    private final void d(JSONObject jSONObject) {
        boolean z10;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("dust");
        if (jSONObjectOptJSONObject != null) {
            try {
                z10 = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
            } catch (JSONException e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, d.f21753b);
                z10 = false;
            }
            this.f21747w = z10;
        }
    }

    public final void a(int i10) {
        this.f21741q = i10;
    }

    public final void b(int i10) {
        this.f21740p = i10;
    }

    public final void c(int i10) {
        this.f21750z = i10;
    }

    private final void a(JSONObject jSONObject) {
        this.f21727b = a(jSONObject, "events_blacklist");
        this.f21728c = a(jSONObject, "attributes_blacklist");
        this.f21729d = a(jSONObject, "purchases_blacklist");
    }

    private final void b(JSONObject jSONObject) {
        boolean z10;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("content_cards");
        if (jSONObjectOptJSONObject != null) {
            try {
                z10 = jSONObjectOptJSONObject.getBoolean(FeatureFlag.ENABLED);
            } catch (JSONException e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f21751b);
                z10 = false;
            }
            this.j = z10;
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rate_limit");
            if (jSONObjectOptJSONObject2 != null) {
                try {
                    this.f21739o = jSONObjectOptJSONObject2.getBoolean(FeatureFlag.ENABLED);
                    this.f21740p = jSONObjectOptJSONObject2.getInt("refill_rate");
                    this.f21741q = jSONObjectOptJSONObject2.getInt("capacity");
                } catch (JSONException e11) {
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e11, c.f21752b);
                    this.f21739o = false;
                    this.f21740p = -1;
                    this.f21741q = -1;
                }
            }
        }
    }

    private final void c(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("request_backoff");
        if (jSONObjectOptJSONObject != null) {
            this.f21749y = jSONObjectOptJSONObject.optInt("min_sleep_duration_ms", this.f21749y);
            this.f21750z = jSONObjectOptJSONObject.optInt("max_sleep_duration_ms", this.f21750z);
            this.f21725A = jSONObjectOptJSONObject.optInt("scale_factor", this.f21725A);
        }
    }

    private final Set a(JSONObject jSONObject, String str) {
        Iterator aVar;
        HashSet hashSet = new HashSet();
        if (jSONObject.has(str)) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                EmptyList.f42983b.getClass();
                aVar = kotlin.collections.r.f43021b;
            } else {
                aVar = new kotlin.sequences.n.a(new kotlin.sequences.n(SequencesKt___SequencesKt.C(kotlin.collections.q.H(Na.l.J(0, jSONArrayOptJSONArray.length())), new i(jSONArrayOptJSONArray)), new j(jSONArrayOptJSONArray)));
            }
            while (aVar.hasNext()) {
                hashSet.add((String) aVar.next());
            }
        }
        return hashSet;
    }

    public /* synthetic */ p5(long j10, Set set, Set set2, Set set3, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, long j11, boolean z13, boolean z14, int i13, boolean z15, int i14, int i15, boolean z16, long j12, boolean z17, int i16, int i17, boolean z18, long j13, int i18, int i19, int i20, int i21, kotlin.jvm.internal.e eVar) {
        this((i21 & 1) != 0 ? 0L : j10, (i21 & 2) != 0 ? null : set, (i21 & 4) != 0 ? null : set2, (i21 & 8) == 0 ? set3 : null, (i21 & 16) != 0 ? -1 : i10, (i21 & 32) != 0 ? -1 : i11, (i21 & 64) != 0 ? -1 : i12, (i21 & 128) != 0 ? false : z10, (i21 & 256) != 0 ? false : z11, (i21 & 512) != 0 ? false : z12, (i21 & 1024) != 0 ? -1L : j11, (i21 & 2048) != 0 ? false : z13, (i21 & 4096) != 0 ? false : z14, (i21 & 8192) != 0 ? -1 : i13, (i21 & 16384) != 0 ? false : z15, (i21 & 32768) != 0 ? -1 : i14, (i21 & 65536) != 0 ? -1 : i15, (i21 & 131072) != 0 ? false : z16, (i21 & 262144) != 0 ? 86400L : j12, (i21 & 524288) != 0 ? true : z17, (i21 & 1048576) != 0 ? 30 : i16, (i21 & 2097152) == 0 ? i17 : 30, (i21 & 4194304) != 0 ? false : z18, (i21 & 8388608) != 0 ? -1L : j13, (i21 & 16777216) != 0 ? r5.f21840e.b() : i18, (i21 & 33554432) != 0 ? r5.f21840e.a() : i19, (i21 & 67108864) != 0 ? 3 : i20);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public p5(JSONObject configJson) throws JSONException {
        kotlin.jvm.internal.i.e(configJson, "configJson");
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        this(0L, null, null, null, 0, 0, 0, false, false, false, 0L, false, objArr, objArr2, false, 0, 0, false, 0L, false, 0, 0, false, 0L, 0, 0, 0, 134217727, null);
        this.f21726a = configJson.optLong("time", 0L);
        this.f21735k = configJson.optLong("messaging_session_timeout", -1L);
        a(configJson);
        b(configJson);
        g(configJson);
        e(configJson);
        f(configJson);
        i(configJson);
        h(configJson);
        d(configJson);
        c(configJson);
    }
}
