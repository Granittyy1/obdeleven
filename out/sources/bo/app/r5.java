package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class r5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f21840e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f21841f = (int) TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f21842g = (int) TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f21843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantLock f21844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.sync.a f21845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p5 f21846d;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21848c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(0);
            this.f21847b = str;
            this.f21848c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Detected SDK update from '");
            sb2.append(this.f21847b);
            sb2.append("' -> '");
            return Q8.d.a(sb2, this.f21848c, "'. Clearing config update time.");
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final int a() {
            return r5.f21842g;
        }

        public final int b() {
            return r5.f21841f;
        }

        private b() {
        }

        public final String a(String apiKey) {
            kotlin.jvm.internal.i.e(apiKey, "apiKey");
            return "com.braze.storage.server_config.".concat(apiKey);
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21849b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Attempting to acquire server config lock";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f21850b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not allowing server config info unlock. Returning null.";
        }
    }

    public static final class e extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f21851b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONArray jSONArray) {
            super(1);
            this.f21851b = jSONArray;
        }

        public final Boolean a(int i10) {
            return Boolean.valueOf(this.f21851b.opt(i10) instanceof String);
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class f extends Lambda implements Ia.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONArray f21852b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JSONArray jSONArray) {
            super(1);
            this.f21852b = jSONArray;
        }

        public final Object a(int i10) throws JSONException {
            Object obj = this.f21852b.get(i10);
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

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f21853b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Experienced exception retrieving blocklisted strings from local storage. Returning null.";
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f21854b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Attempting to unlock server config info";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f21855b = new i();

        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unlocking config info lock.";
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f21856b = new j();

        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not persist server config to shared preferences.";
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p5 f21857b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(p5 p5Var) {
            super(0);
            this.f21857b = p5Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Finishing updating server config to " + this.f21857b;
        }
    }

    public r5(Context context, String apiKey) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(f21840e.a(apiKey), 0);
        this.f21843a = sharedPreferences;
        this.f21844b = new ReentrantLock();
        this.f21845c = kotlinx.coroutines.sync.b.a();
        String string = sharedPreferences.getString("last_accessed_sdk_version", "");
        if (!Constants.BRAZE_SDK_VERSION.equals(string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a(string, Constants.BRAZE_SDK_VERSION), 2, (Object) null);
            sharedPreferences.edit().putLong("config_time", 0L).putString("last_accessed_sdk_version", Constants.BRAZE_SDK_VERSION).apply();
        }
        F();
    }

    private final void F() {
        p5 p5Var = new p5(0L, null, null, null, 0, 0, 0, false, false, false, 0L, false, false, 0, false, 0, 0, false, 0L, false, 0, 0, false, 0L, 0, 0, 0, 134217727, null);
        p5Var.a(d());
        p5Var.b(e());
        p5Var.c(f());
        p5Var.a(g());
        p5Var.b(q());
        p5Var.k(s());
        p5Var.j(r());
        p5Var.i(p());
        p5Var.f(B());
        p5Var.g(C());
        p5Var.b(x());
        p5Var.d(z());
        p5Var.e(A());
        p5Var.f(m());
        p5Var.a(w());
        p5Var.a(h());
        p5Var.b(i());
        p5Var.i(E());
        p5Var.c(t());
        p5Var.c(y());
        p5Var.h(D());
        p5Var.h(o());
        p5Var.g(n());
        p5Var.d(u());
        p5Var.e(l());
        p5Var.d(k());
        p5Var.c(j());
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            this.f21846d = p5Var;
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean A() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.l() : this.f21843a.getBoolean("feature_flags_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean B() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.n() : this.f21843a.getBoolean("geofences_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean C() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.o() : this.f21843a.getBoolean("geofences_enabled_set", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean D() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.r() : this.f21843a.getBoolean("global_req_rate_limit_enabled", true);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean E() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.w() : this.f21843a.getBoolean("push_max_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void G() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, h.f21854b, 2, (Object) null);
        if (this.f21845c.e()) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, i.f21855b, 3, (Object) null);
            this.f21845c.g(null);
        }
    }

    public final Pair c() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, c.f21849b, 2, (Object) null);
        if (this.f21845c.d(null)) {
            return new Pair(Long.valueOf(g()), Boolean.valueOf(v()));
        }
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, d.f21850b, 2, (Object) null);
        return null;
    }

    public final Set d() {
        Set setA;
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            if (p5Var == null || (setA = p5Var.a()) == null) {
                setA = a("blacklisted_attributes");
            }
            return setA;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set e() {
        Set setA;
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            if (p5Var == null || (setA = p5Var.b()) == null) {
                setA = a("blacklisted_events");
            }
            return setA;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set f() {
        Set setA;
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            if (p5Var == null || (setA = p5Var.c()) == null) {
                setA = a("blacklisted_purchases");
            }
            return setA;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long g() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.d() : this.f21843a.getLong("config_time", 0L);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int h() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.e() : this.f21843a.getInt("content_cards_rate_capacity", -1);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int i() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.f() : this.f21843a.getInt("content_cards_rate_refill_rate", -1);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int j() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.h() : this.f21843a.getInt("default_backoff_max_sleep_duration_ms", f21842g);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int k() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.i() : this.f21843a.getInt("default_backoff_min_sleep_duration__ms", f21841f);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int l() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.j() : this.f21843a.getInt("default_backoff_scale_factor", 3);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int m() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.m() : this.f21843a.getInt("feature_flags_refresh_rate_limit", -1);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int n() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.p() : this.f21843a.getInt("global_req_rate_capacity", 30);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int o() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.q() : this.f21843a.getInt("global_req_rate_refill_rate", 30);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int p() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.s() : this.f21843a.getInt("geofences_max_num_to_register", -1);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long q() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.t() : this.f21843a.getLong("messaging_session_timeout", -1L);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int r() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.u() : this.f21843a.getInt("geofences_min_time_since_last_report", -1);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int s() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.v() : this.f21843a.getInt("geofences_min_time_since_last_request", -1);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long t() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.x() : this.f21843a.getLong("push_max_redeliver_buffer", 86400L);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long u() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.y() : this.f21843a.getLong("push_max_redeliver_dedupe_buffer", -1L);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean v() {
        return g() <= 0;
    }

    public final boolean w() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.g() : this.f21843a.getBoolean("content_cards_rate_limit_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean x() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.z() : this.f21843a.getBoolean("content_cards_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean y() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.A() : this.f21843a.getBoolean("dust_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean z() {
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            p5 p5Var = this.f21846d;
            return p5Var != null ? p5Var.k() : this.f21843a.getBoolean("ephemeral_events_enabled", false);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(p5 serverConfig) {
        kotlin.jvm.internal.i.e(serverConfig, "serverConfig");
        ReentrantLock reentrantLock = this.f21844b;
        reentrantLock.lock();
        try {
            this.f21846d = serverConfig;
            p293xa.r rVar = p293xa.r.f47939a;
            reentrantLock.unlock();
            try {
                SharedPreferences.Editor editorEdit = this.f21843a.edit();
                if (serverConfig.b() != null) {
                    editorEdit.putString("blacklisted_events", new JSONArray((Collection) serverConfig.b()).toString());
                }
                if (serverConfig.a() != null) {
                    editorEdit.putString("blacklisted_attributes", new JSONArray((Collection) serverConfig.a()).toString());
                }
                if (serverConfig.c() != null) {
                    editorEdit.putString("blacklisted_purchases", new JSONArray((Collection) serverConfig.c()).toString());
                }
                editorEdit.putLong("config_time", serverConfig.d()).putInt("geofences_min_time_since_last_request", serverConfig.v()).putInt("geofences_min_time_since_last_report", serverConfig.u()).putInt("geofences_max_num_to_register", serverConfig.s()).putBoolean("geofences_enabled", serverConfig.n()).putBoolean("geofences_enabled_set", serverConfig.o()).putLong("messaging_session_timeout", serverConfig.t()).putBoolean("ephemeral_events_enabled", serverConfig.k()).putBoolean("feature_flags_enabled", serverConfig.l()).putInt("feature_flags_refresh_rate_limit", serverConfig.m()).putBoolean("content_cards_enabled", serverConfig.z()).putBoolean("content_cards_rate_limit_enabled", serverConfig.g()).putInt("content_cards_rate_capacity", serverConfig.e()).putInt("content_cards_rate_refill_rate", serverConfig.f()).putBoolean("push_max_enabled", serverConfig.w()).putLong("push_max_redeliver_buffer", serverConfig.x()).putBoolean("dust_enabled", serverConfig.A()).putBoolean("global_req_rate_limit_enabled", serverConfig.r()).putInt("global_req_rate_capacity", serverConfig.p()).putInt("global_req_rate_refill_rate", serverConfig.q()).putLong("push_max_redeliver_dedupe_buffer", serverConfig.y()).putInt("default_backoff_scale_factor", serverConfig.j()).putInt("default_backoff_min_sleep_duration__ms", serverConfig.i()).putInt("default_backoff_max_sleep_duration_ms", serverConfig.h());
                editorEdit.apply();
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, j.f21856b);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new k(serverConfig), 2, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final Set a(String str) {
        try {
            String string = this.f21843a.getString(str, "");
            HashSet hashSet = new HashSet();
            if (string != null && !kotlin.text.n.S(string)) {
                JSONArray jSONArray = new JSONArray(string);
                kotlin.sequences.e eVarC = SequencesKt___SequencesKt.C(kotlin.collections.q.H(Na.l.J(0, jSONArray.length())), new e(jSONArray));
                f fVar = new f(jSONArray);
                Iterator<T> it = eVarC.iterator();
                while (it.hasNext()) {
                    hashSet.add((String) fVar.invoke(it.next()));
                }
                return hashSet;
            }
            return hashSet;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, g.f21853b);
            return new HashSet();
        }
    }
}
