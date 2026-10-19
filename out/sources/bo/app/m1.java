package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f21511k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k2 f21512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k2 f21513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r5 f21514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c2 f21515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f21516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f21517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SharedPreferences f21518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SharedPreferences f21519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SharedPreferences f21520i;
    private final AtomicInteger j;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f21521b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Did not find stored Feature Flags.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21522b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to find stored Feature Flag keys.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21523b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f21523b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Received null or blank serialized Feature Flag string for Feature Flag id "), this.f21523b, " from shared preferences. Not parsing.");
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21524b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.f21524b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored feature flags: " + this.f21524b;
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeatureFlag f21525b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(FeatureFlag featureFlag) {
            super(0);
            this.f21525b = featureFlag;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not logging a Feature Flag impression for Feature Flag with id " + this.f21525b.getId() + ". The Feature Flag already had an impression logged in the current session";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21526b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.f21526b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Not logging a Feature Flag impression for Feature Flag with id "), this.f21526b, ". The Feature Flag was not part of any matching campaign");
        }
    }

    public static final class h extends Lambda implements Ia.a {
        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not refreshing Feature Flags since another " + m1.this.b().get() + " request is currently in-flight.";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f21529c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j) {
            super(0);
            this.f21529c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return p005a4.o.d((m1.this.e() - this.f21529c) + ((long) m1.this.d().m()), " seconds remaining until next available flush.", new StringBuilder("Not enough time has passed since last Feature Flags refresh. Not refreshing Feature Flags. "));
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeatureFlag f21530b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(FeatureFlag featureFlag) {
            super(0);
            this.f21530b = featureFlag;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error storing Feature Flag: " + this.f21530b + '.';
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f21531b = new k();

        public k() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Added new Feature Flags to local storage.";
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21532b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j) {
            super(0);
            this.f21532b = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Updating last Feature Flags refresh time: " + this.f21532b;
        }
    }

    public m1(Context context, String apiKey, String str, k2 internalEventPublisher, k2 externalEventPublisher, r5 serverConfigStorageProvider, c2 brazeManager) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        kotlin.jvm.internal.i.e(internalEventPublisher, "internalEventPublisher");
        kotlin.jvm.internal.i.e(externalEventPublisher, "externalEventPublisher");
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        this.f21512a = internalEventPublisher;
        this.f21513b = externalEventPublisher;
        this.f21514c = serverConfigStorageProvider;
        this.f21515d = brazeManager;
        this.f21516e = EmptyList.f42983b;
        this.f21517f = new AtomicBoolean(false);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.managers.featureflags.eligibility" + StringUtils.getCacheFileSuffix(context, str, apiKey), 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f21518g = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("com.braze.managers.featureflags.storage" + StringUtils.getCacheFileSuffix(context, str, apiKey), 0);
        kotlin.jvm.internal.i.d(sharedPreferences2, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f21519h = sharedPreferences2;
        SharedPreferences sharedPreferences3 = context.getSharedPreferences("com.braze.managers.featureflags.impressions" + StringUtils.getCacheFileSuffix(context, str, apiKey), 0);
        kotlin.jvm.internal.i.d(sharedPreferences3, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f21520i = sharedPreferences3;
        this.j = new AtomicInteger(0);
        f();
        this.f21512a.c(a5.class, new Y(0, this));
        this.f21512a.c(z4.class, new IEventSubscriber() { // from class: bo.app.Z
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                m1.a(this.f20682a, (z4) obj);
            }
        });
        this.f21512a.c(p1.class, new IEventSubscriber() { // from class: bo.app.A0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                m1.a(this.f20643a, (p1) obj);
            }
        });
        this.f21512a.c(o1.class, new IEventSubscriber() { // from class: bo.app.B0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                m1.a(this.f20646a, (o1) obj);
            }
        });
    }

    private final void f() {
        SharedPreferences sharedPreferences = this.f21519h;
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.f21521b, 3, (Object) null);
            this.f21516e = EmptyList.f42983b;
            return;
        }
        Set<String> setKeySet = all.keySet();
        if (setKeySet.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.f21522b, 2, (Object) null);
            this.f21516e = EmptyList.f42983b;
            return;
        }
        for (String str : setKeySet) {
            String str2 = (String) all.get(str);
            if (str2 != null) {
                try {
                    if (!kotlin.text.n.S(str2)) {
                        FeatureFlag featureFlagA = com.braze.support.d.f24373a.a(new JSONObject(str2));
                        if (featureFlagA != null) {
                            arrayList.add(featureFlagA);
                        }
                    }
                } catch (Exception e10) {
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new e(str2));
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new d(str), 2, (Object) null);
        }
        this.f21516e = arrayList;
    }

    private final void j() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new l(jNowInSeconds), 2, (Object) null);
        this.f21518g.edit().putLong("last_refresh", jNowInSeconds).apply();
    }

    public final void g() {
        if (this.f21517f.get()) {
            this.f21513b.a(new FeatureFlagsUpdatedEvent(c()), FeatureFlagsUpdatedEvent.class);
        }
    }

    public final void h() {
        if (this.j.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(), 3, (Object) null);
            return;
        }
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        if (jNowInSeconds - e() >= this.f21514c.m()) {
            a();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new i(jNowInSeconds), 2, (Object) null);
            this.f21512a.a(new o1(), o1.class);
        }
    }

    public final void i() {
        this.f21520i.edit().clear().apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(m1 this$0, a5 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        if (it.a() instanceof q1) {
            this$0.j.incrementAndGet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long e() {
        return this.f21518g.getLong("last_refresh", 0L);
    }

    public final AtomicInteger b() {
        return this.j;
    }

    public final List c() {
        List list = this.f21516e;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
        }
        return arrayList;
    }

    public final r5 d() {
        return this.f21514c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public final List b(String str) {
        ?? arrayList;
        if (str != null) {
            List list = this.f21516e;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (kotlin.jvm.internal.i.a(((FeatureFlag) obj).getId(), str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = this.f21516e;
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
        }
        return arrayList2;
    }

    public final boolean d(String id) {
        Set<String> setKeySet;
        kotlin.jvm.internal.i.e(id, "id");
        Map<String, ?> all = this.f21520i.getAll();
        if (all == null || (setKeySet = all.keySet()) == null) {
            return false;
        }
        return setKeySet.contains(id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(m1 this$0, z4 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        if (it.a() instanceof q1) {
            this$0.j.decrementAndGet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(m1 this$0, p1 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        this$0.f21517f.set(true);
        this$0.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(m1 this$0, o1 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        this$0.f21517f.set(true);
        this$0.g();
    }

    public final void c(String id) {
        kotlin.jvm.internal.i.e(id, "id");
        this.f21520i.edit().putBoolean(id, true).apply();
    }

    public final void a(String id) {
        kotlin.jvm.internal.i.e(id, "id");
        FeatureFlag featureFlag = (FeatureFlag) kotlin.collections.q.P(b(id));
        if ((featureFlag != null ? featureFlag.getTrackingString$android_sdk_base_release() : null) != null) {
            if (!d(featureFlag.getId())) {
                a2 a2VarA = C1471i.f21202h.a(featureFlag);
                if (a2VarA != null) {
                    this.f21515d.a(a2VarA);
                }
                c(featureFlag.getId());
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new f(featureFlag), 2, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new g(id), 2, (Object) null);
    }

    public final void a() {
        this.f21515d.refreshFeatureFlags();
    }

    public final FeatureFlagsUpdatedEvent a(JSONArray featureFlagsData) {
        kotlin.jvm.internal.i.e(featureFlagsData, "featureFlagsData");
        this.f21516e = com.braze.support.d.f24373a.a(featureFlagsData);
        SharedPreferences.Editor editorEdit = this.f21519h.edit();
        editorEdit.clear();
        for (FeatureFlag featureFlag : this.f21516e) {
            try {
                editorEdit.putString(featureFlag.getId(), featureFlag.forJsonPut().toString());
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new j(featureFlag));
            }
        }
        editorEdit.apply();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, k.f21531b, 3, (Object) null);
        return new FeatureFlagsUpdatedEvent(c());
    }

    public static /* synthetic */ List a(m1 m1Var, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return m1Var.b(str);
    }
}
