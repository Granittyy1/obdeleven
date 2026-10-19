package bo.app;

import A1.C0575j;
import android.content.Context;
import android.content.SharedPreferences;
import com.braze.enums.GeofenceTransitionType;
import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* JADX INFO: renamed from: bo.app.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1474l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f21427i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f21428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f21429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f21430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f21431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21435h;

    /* JADX INFO: renamed from: bo.app.l$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: bo.app.l$b */
    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21436b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(0);
            this.f21436b = i10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C0575j.b(new StringBuilder("Min time since last geofence request reset via server configuration: "), this.f21436b, '.');
        }
    }

    /* JADX INFO: renamed from: bo.app.l$c */
    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21437b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10) {
            super(0);
            this.f21437b = i10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C0575j.b(new StringBuilder("Min time since last geofence report reset via server configuration: "), this.f21437b, '.');
        }
    }

    /* JADX INFO: renamed from: bo.app.l$d */
    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21439c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f21439c = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Retrieving geofence id ");
            C1474l c1474l = C1474l.this;
            String reEligibilityId = this.f21439c;
            kotlin.jvm.internal.i.d(reEligibilityId, "reEligibilityId");
            sb2.append(c1474l.a(reEligibilityId));
            sb2.append(" eligibility information from local storage.");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: bo.app.l$e */
    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1474l f21441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f21442d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, C1474l c1474l, String str) {
            super(0);
            this.f21440b = j;
            this.f21441c = c1474l;
            this.f21442d = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofence report suppressed since only " + this.f21440b + " seconds have passed since the last time geofences were reported globally (minimum interval: " + this.f21441c.f21435h + "). id:" + this.f21442d;
        }
    }

    /* JADX INFO: renamed from: bo.app.l$f */
    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f21445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GeofenceTransitionType f21446e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, int i10, String str, GeofenceTransitionType geofenceTransitionType) {
            super(0);
            this.f21443b = j;
            this.f21444c = i10;
            this.f21445d = str;
            this.f21446e = geofenceTransitionType;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofence report suppressed since only " + this.f21443b + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + this.f21444c + "). id:" + this.f21445d + " transition:" + this.f21446e;
        }
    }

    /* JADX INFO: renamed from: bo.app.l$g */
    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f21449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ GeofenceTransitionType f21450e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j, int i10, String str, GeofenceTransitionType geofenceTransitionType) {
            super(0);
            this.f21447b = j;
            this.f21448c = i10;
            this.f21449d = str;
            this.f21450e = geofenceTransitionType;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f21447b + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + this.f21448c + "). id:" + this.f21449d + " transition:" + this.f21450e;
        }
    }

    /* JADX INFO: renamed from: bo.app.l$h */
    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GeofenceTransitionType f21452c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, GeofenceTransitionType geofenceTransitionType) {
            super(0);
            this.f21451b = str;
            this.f21452c = geofenceTransitionType;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofence report eligible since this geofence/transition combination has never been reported.id:" + this.f21451b + " transition:" + this.f21452c;
        }
    }

    /* JADX INFO: renamed from: bo.app.l$i */
    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1474l f21454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f21455d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j, C1474l c1474l, String str) {
            super(0);
            this.f21453b = j;
            this.f21454c = c1474l;
            this.f21455d = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofence report eligible since " + this.f21453b + " seconds have passed since the last time geofences were reported globally (minimum interval: " + this.f21454c.f21435h + "). id:" + this.f21455d;
        }
    }

    /* JADX INFO: renamed from: bo.app.l$j */
    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1474l f21457c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j, C1474l c1474l) {
            super(0);
            this.f21456b = j;
            this.f21457c = c1474l;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Geofence request suppressed since only ");
            sb2.append(this.f21456b);
            sb2.append(" seconds have passed since the last time geofences were requested (minimum interval: ");
            return p005a4.q.c(sb2, this.f21457c.f21434g, ").");
        }
    }

    /* JADX INFO: renamed from: bo.app.l$k */
    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21458b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j) {
            super(0);
            this.f21458b = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Ignoring rate limit for this geofence request. Elapsed time since last request:" + this.f21458b;
        }
    }

    /* JADX INFO: renamed from: bo.app.l$l, reason: collision with other inner class name */
    public static final class C0224l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1474l f21460c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0224l(long j, C1474l c1474l) {
            super(0);
            this.f21459b = j;
            this.f21460c = c1474l;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f21459b);
            sb2.append(" seconds have passed since the last time geofences were requested (minimum interval: ");
            return p005a4.q.c(sb2, this.f21460c.f21434g, ").");
        }
    }

    /* JADX INFO: renamed from: bo.app.l$m */
    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f21461b = new m();

        public m() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofences have not been requested for the current session yet. Request is eligible.";
        }
    }

    /* JADX INFO: renamed from: bo.app.l$n */
    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f21462b = new n();

        public n() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofences have already been requested for the current session. Geofence request not eligible.";
        }
    }

    /* JADX INFO: renamed from: bo.app.l$o */
    public static final class o extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21463b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(0);
            this.f21463b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception trying to parse re-eligibility id: " + this.f21463b;
        }
    }

    /* JADX INFO: renamed from: bo.app.l$p */
    public static final class p extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21464b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(0);
            this.f21464b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Deleting outdated id "), this.f21464b, " from re-eligibility list.");
        }
    }

    /* JADX INFO: renamed from: bo.app.l$q */
    public static final class q extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21465b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(0);
            this.f21465b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Retaining id "), this.f21465b, " in re-eligibility list.");
        }
    }

    /* JADX INFO: renamed from: bo.app.l$r */
    public static final class r extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21466b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(long j) {
            super(0);
            this.f21466b = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Updating the last successful location request time to: " + this.f21466b;
        }
    }

    public C1474l(Context context, String apiKey, r5 serverConfigStorageProvider, k2 internalIEventMessenger) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(internalIEventMessenger, "internalIEventMessenger");
        internalIEventMessenger.c(u5.class, new X(0, this));
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.managers.geofences.eligibility.global.".concat(apiKey), 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f21428a = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.appboy.managers.geofences.eligibility.individual.".concat(apiKey), 0);
        kotlin.jvm.internal.i.d(sharedPreferences2, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f21429b = sharedPreferences2;
        this.f21430c = a(sharedPreferences2);
        this.f21431d = new AtomicBoolean(false);
        this.f21432e = sharedPreferences.getLong("last_request_global", 0L);
        this.f21433f = sharedPreferences.getLong("last_report_global", 0L);
        this.f21434g = serverConfigStorageProvider.s();
        this.f21435h = serverConfigStorageProvider.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1474l this$0, u5 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        this$0.f21431d.set(false);
    }

    public final void a(List brazeGeofenceList) {
        kotlin.jvm.internal.i.e(brazeGeofenceList, "brazeGeofenceList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = brazeGeofenceList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((BrazeGeofence) it.next()).getId());
        }
        HashSet<String> hashSet = new HashSet(this.f21430c.keySet());
        SharedPreferences.Editor editorEdit = this.f21429b.edit();
        for (String reEligibilityId : hashSet) {
            kotlin.jvm.internal.i.d(reEligibilityId, "reEligibilityId");
            if (linkedHashSet.contains(a(reEligibilityId))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new q(reEligibilityId), 3, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new p(reEligibilityId), 3, (Object) null);
                this.f21430c.remove(reEligibilityId);
                editorEdit.remove(reEligibilityId);
            }
        }
        editorEdit.apply();
    }

    public final boolean a(long j10, BrazeGeofence geofence, GeofenceTransitionType transitionType) {
        kotlin.jvm.internal.i.e(geofence, "geofence");
        kotlin.jvm.internal.i.e(transitionType, "transitionType");
        String id = geofence.getId();
        long j11 = j10 - this.f21433f;
        if (this.f21435h > j11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(j11, this, id), 3, (Object) null);
            return false;
        }
        String strA = a(id, transitionType);
        int cooldownEnterSeconds = transitionType == GeofenceTransitionType.ENTER ? geofence.getCooldownEnterSeconds() : geofence.getCooldownExitSeconds();
        if (this.f21430c.containsKey(strA)) {
            Long l10 = (Long) this.f21430c.get(strA);
            if (l10 != null) {
                long jLongValue = j10 - l10.longValue();
                if (cooldownEnterSeconds > jLongValue) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(jLongValue, cooldownEnterSeconds, id, transitionType), 3, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(jLongValue, cooldownEnterSeconds, id, transitionType), 3, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(id, transitionType), 3, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(j11, this, id), 3, (Object) null);
        this.f21430c.put(strA, Long.valueOf(j10));
        this.f21429b.edit().putLong(strA, j10).apply();
        this.f21433f = j10;
        this.f21428a.edit().putLong("last_report_global", j10).apply();
        return true;
    }

    public final boolean a(boolean z10, long j10) {
        long j11 = j10 - this.f21432e;
        if (!z10 && this.f21434g > j11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(j11, this), 3, (Object) null);
            return false;
        }
        if (z10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new k(j11), 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new C0224l(j11, this), 3, (Object) null);
        }
        if (this.f21431d.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, m.f21461b, 3, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, n.f21462b, 3, (Object) null);
        return false;
    }

    public final void a(long j10) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new r(j10), 3, (Object) null);
        this.f21432e = j10;
        this.f21428a.edit().putLong("last_request_global", this.f21432e).apply();
    }

    public final String a(String reEligibilityId) {
        kotlin.jvm.internal.i.e(reEligibilityId, "reEligibilityId");
        try {
            return new Regex("_").h(reEligibilityId, 2).get(1);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new o(reEligibilityId));
            return null;
        }
    }

    public final String a(String geofenceId, GeofenceTransitionType transitionType) {
        kotlin.jvm.internal.i.e(geofenceId, "geofenceId");
        kotlin.jvm.internal.i.e(transitionType, "transitionType");
        StringBuilder sb2 = new StringBuilder();
        String string = transitionType.toString();
        Locale locale = Locale.US;
        sb2.append(J4.n.d(locale, "US", string, locale, "this as java.lang.String).toLowerCase(locale)"));
        sb2.append('_');
        sb2.append(geofenceId);
        return sb2.toString();
    }

    public final void a(p5 serverConfig) {
        kotlin.jvm.internal.i.e(serverConfig, "serverConfig");
        int iV = serverConfig.v();
        if (iV >= 0) {
            this.f21434g = iV;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new b(iV), 2, (Object) null);
        }
        int iU = serverConfig.u();
        if (iU >= 0) {
            this.f21435h = iU;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(iU), 2, (Object) null);
        }
    }

    public final Map a(SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.i.e(sharedPreferences, "sharedPreferences");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            Set<String> setKeySet = all.keySet();
            if (setKeySet.isEmpty()) {
                return concurrentHashMap;
            }
            for (String reEligibilityId : setKeySet) {
                long j10 = sharedPreferences.getLong(reEligibilityId, 0L);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(reEligibilityId), 3, (Object) null);
                Long lValueOf = Long.valueOf(j10);
                kotlin.jvm.internal.i.d(reEligibilityId, "reEligibilityId");
                concurrentHashMap.put(reEligibilityId, lValueOf);
            }
        }
        return concurrentHashMap;
    }
}
