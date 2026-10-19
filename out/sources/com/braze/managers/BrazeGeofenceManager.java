package com.braze.managers;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import bo.app.C1471i;
import bo.app.C1473k;
import bo.app.C1474l;
import bo.app.C1475m;
import bo.app.a2;
import bo.app.c2;
import bo.app.k2;
import bo.app.l3;
import bo.app.p5;
import bo.app.r5;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.GeofenceTransitionType;
import com.braze.models.BrazeGeofence;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeGeofenceManager implements IBrazeGeofenceLocationUpdateListener {
    public static final Companion Companion = new Companion(null);
    private static final String GEOFENCE_STORAGE_SHARED_PREFS_LOCATION = "com.appboy.managers.geofences.storage";
    private final Context applicationContext;
    private final C1473k brazeGeofenceApi;
    private C1474l brazeGeofenceReEligibilityManager;
    private final List<BrazeGeofence> brazeGeofences;
    private final C1475m brazeLocationApi;
    private final c2 brazeManager;
    private final BrazeConfigurationProvider configurationProvider;
    private final ReentrantLock geofenceListLock;
    private IBrazeLocation geofenceRequestLocation;
    private final SharedPreferences geofenceStorageSharedPreferences;
    private final PendingIntent geofenceTransitionPendingIntent;
    private boolean isGeofencesEnabled;
    private int maxNumToRegister;
    private final r5 serverConfigStorageProvider;

    public static final class Companion {

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f24097b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Geofences enabled in server configuration.";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f24098b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Geofences explicitly disabled via server configuration.";
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f24099b = new c();

            public c() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Geofences implicitly disabled via server configuration.";
            }
        }

        public static final class d extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f24100b = new d();

            public d() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Did not find stored geofences.";
            }
        }

        public static final class e extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f24101b = new e();

            public e() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to find stored geofence keys.";
            }
        }

        public static final class f extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24102b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str) {
                super(0);
                this.f24102b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Q8.d.a(new StringBuilder("Received null or blank serialized geofence string for geofence id "), this.f24102b, " from shared preferences. Not parsing.");
            }
        }

        public static final class g extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24103b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String str) {
                super(0);
                this.f24103b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Encountered Json exception while parsing stored geofence: " + this.f24103b;
            }
        }

        public static final class h extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24104b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String str) {
                super(0);
                this.f24104b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Encountered unexpected exception while parsing stored geofence: " + this.f24104b;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final String getGeofenceSharedPreferencesName(String apiKey) {
            kotlin.jvm.internal.i.e(apiKey, "apiKey");
            return "com.appboy.managers.geofences.storage.".concat(apiKey);
        }

        public final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider configurationProvider) {
            kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
            return configurationProvider.isGeofencesEnabled();
        }

        public final boolean getGeofencesEnabledFromServerConfig(r5 serverConfigStorageProvider) {
            kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (!serverConfigStorageProvider.C()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, c.f24099b, 2, (Object) null);
                return false;
            }
            if (serverConfigStorageProvider.B()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, a.f24097b, 2, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, b.f24098b, 2, (Object) null);
            return false;
        }

        public final int getMaxNumToRegister(r5 serverConfigStorageProvider) {
            kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (serverConfigStorageProvider.p() > 0) {
                return serverConfigStorageProvider.p();
            }
            return 20;
        }

        public final List<BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage(SharedPreferences sharedPreferences) {
            kotlin.jvm.internal.i.e(sharedPreferences, "sharedPreferences");
            ArrayList arrayList = new ArrayList();
            Map<String, ?> all = sharedPreferences.getAll();
            if (all == null || all.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.f24100b, 3, (Object) null);
                return arrayList;
            }
            Set<String> setKeySet = all.keySet();
            if (setKeySet.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, e.f24101b, 2, (Object) null);
                return arrayList;
            }
            for (String str : setKeySet) {
                String string = sharedPreferences.getString(str, null);
                if (string != null) {
                    try {
                        if (!kotlin.text.n.S(string)) {
                            arrayList.add(new BrazeGeofence(new JSONObject(string)));
                        }
                    } catch (JSONException e10) {
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new g(string));
                    } catch (Exception e11) {
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e11, new h(string));
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new f(str), 2, (Object) null);
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24105b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "***Geofence API not found. Please include the android-sdk-location module***";
        }
    }

    public static final class a0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a0 f24106b = new a0();

        public a0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze geofences not enabled. Geofences not set up.";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f24107b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10) {
            super(0);
            this.f24107b = z10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C4.v.f(new StringBuilder("Geofences enabled server config value "), this.f24107b, " received.");
        }
    }

    public static final class b0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b0 f24108b = new b0();

        public b0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not get pending intent to setup geofences";
        }
    }

    public static final class c extends Lambda implements Ia.a {
        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofences enabled status newly set to " + BrazeGeofenceManager.this.isGeofencesEnabled() + " during server config update.";
        }
    }

    public static final class c0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c0 f24110b = new c0();

        public c0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Tearing down geofences.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f24111b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10) {
            super(0);
            this.f24111b = z10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C4.v.f(new StringBuilder("Geofences enabled status of `"), this.f24111b, "` was unchanged during server config update.");
        }
    }

    public static final class d0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d0 f24112b = new d0();

        public d0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unregistering any Braze geofences from Google Play Services.";
        }
    }

    public static final class e extends Lambda implements Ia.a {
        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Max number to register newly set to " + BrazeGeofenceManager.this.getMaxNumToRegister() + " via server config.";
        }
    }

    public static final class e0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e0 f24114b = new e0();

        public e0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Deleting locally stored geofences.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f24115b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Request to set up geofences received.";
        }
    }

    public static final class f0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f0 f24116b = new f0();

        public f0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze geofences not enabled. Not un-registering geofences.";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f24117b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not automatically requesting Geofences on initialization due to configuration.";
        }
    }

    public static final class g0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g0 f24118b = new g0();

        public g0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Tearing down all geofences.";
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f24119b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f24120b = new i();

        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Fine grained location permissions not found. Geofences not enabled.";
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f24121b = new j();

        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Background location access permission not found. Geofences not enabled.";
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f24122b = new k();

        public k() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Google Play Services not available. Geofences not enabled.";
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f24123b = new l();

        public l() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze Geofence API is not available";
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f24124b = new m();

        public m() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Google Play Services Location API not found. Geofences not enabled.";
        }
    }

    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f24125b = new n();

        public n() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Location permissions granted and Google Play Services available. Braze Geofencing enabled via config.";
        }
    }

    public static final class o extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IBrazeLocation f24126b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(IBrazeLocation iBrazeLocation) {
            super(0);
            this.f24126b = iBrazeLocation;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Single location request was successful, requesting Geofence refresh. Location:\n " + this.f24126b;
        }
    }

    public static final class p extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f24127b = new p();

        public p() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Single location request was unsuccessful, not storing last updated time.";
        }
    }

    public static final class q extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f24128b = new q();

        public q() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze geofences not enabled. Not posting geofence report.";
        }
    }

    public static final class r extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GeofenceTransitionType f24130c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, GeofenceTransitionType geofenceTransitionType) {
            super(0);
            this.f24129b = str;
            this.f24130c = geofenceTransitionType;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to record geofence " + this.f24129b + " transition with transition type " + this.f24130c + '.';
        }
    }

    public static final class s extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s f24131b = new s();

        public s() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze geofences not enabled. Not adding new geofences to local storage.";
        }
    }

    public static final class t extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f24132b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(List list) {
            super(0);
            this.f24132b = list;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Received new geofence list of size: " + this.f24132b.size();
        }
    }

    public static final class u extends Lambda implements Ia.a {
        public u() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Reached maximum number of new geofences: " + BrazeGeofenceManager.this.getMaxNumToRegister();
        }
    }

    public static final class v extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BrazeGeofence f24134b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(BrazeGeofence brazeGeofence) {
            super(0);
            this.f24134b = brazeGeofence;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Adding new geofence to local storage: " + this.f24134b;
        }
    }

    public static final class w extends Lambda implements Ia.a {
        public w() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Added " + BrazeGeofenceManager.this.getBrazeGeofences().size() + " new geofences to local storage.";
        }
    }

    public static final class x extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final x f24136b = new x();

        public x() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze geofences not enabled. Not requesting geofences.";
        }
    }

    public static final class y extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y f24137b = new y();

        public y() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze geofences not enabled. Not requesting geofences.";
        }
    }

    public static final class z extends Lambda implements Ia.l {
        public z() {
            super(1);
        }

        public final void a(IBrazeLocation location) {
            kotlin.jvm.internal.i.e(location, "location");
            BrazeGeofenceManager.this.onLocationRequestComplete(location);
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((IBrazeLocation) obj);
            return p293xa.r.f47939a;
        }
    }

    public BrazeGeofenceManager(Context context, String apiKey, c2 brazeManager, BrazeConfigurationProvider configurationProvider, r5 serverConfigStorageProvider, k2 internalIEventMessenger) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
        kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        kotlin.jvm.internal.i.e(internalIEventMessenger, "internalIEventMessenger");
        this.brazeManager = brazeManager;
        this.configurationProvider = configurationProvider;
        this.serverConfigStorageProvider = serverConfigStorageProvider;
        C1473k c1473k = new C1473k();
        this.brazeGeofenceApi = c1473k;
        this.brazeLocationApi = new C1475m(context, com.braze.managers.a.f24139d.a(configurationProvider), configurationProvider);
        this.applicationContext = context.getApplicationContext();
        this.geofenceListLock = new ReentrantLock();
        Companion companion = Companion;
        boolean z10 = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(companion.getGeofenceSharedPreferencesName(apiKey), 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.geofenceStorageSharedPreferences = sharedPreferences;
        this.brazeGeofences = kotlin.collections.q.p0(companion.retrieveBrazeGeofencesFromLocalStorage(sharedPreferences));
        this.geofenceTransitionPendingIntent = c1473k.b(context);
        this.brazeGeofenceReEligibilityManager = new C1474l(context, apiKey, serverConfigStorageProvider, internalIEventMessenger);
        if (companion.getGeofencesEnabledFromServerConfig(serverConfigStorageProvider) && isGeofencesEnabledFromEnvironment(context) && c1473k.a()) {
            z10 = true;
        }
        this.isGeofencesEnabled = z10;
        this.maxNumToRegister = companion.getMaxNumToRegister(serverConfigStorageProvider);
        if (!c1473k.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, a.f24105b, 2, (Object) null);
        }
        setUpGeofences(true);
    }

    public static final String getGeofenceSharedPreferencesName(String str) {
        return Companion.getGeofenceSharedPreferencesName(str);
    }

    public static final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider brazeConfigurationProvider) {
        return Companion.getGeofencesEnabledFromConfiguration(brazeConfigurationProvider);
    }

    public static final boolean getGeofencesEnabledFromServerConfig(r5 r5Var) {
        return Companion.getGeofencesEnabledFromServerConfig(r5Var);
    }

    public static final int getMaxNumToRegister(r5 r5Var) {
        return Companion.getMaxNumToRegister(r5Var);
    }

    public static final List<BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage(SharedPreferences sharedPreferences) {
        return Companion.retrieveBrazeGeofencesFromLocalStorage(sharedPreferences);
    }

    public final boolean analyticsEnabledForGeofenceId(String geofenceId, GeofenceTransitionType geofenceTransitionType) {
        kotlin.jvm.internal.i.e(geofenceId, "geofenceId");
        kotlin.jvm.internal.i.e(geofenceTransitionType, "geofenceTransitionType");
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeGeofence brazeGeofenceForGeofenceId = getBrazeGeofenceForGeofenceId(geofenceId);
            if (brazeGeofenceForGeofenceId != null) {
                if (geofenceTransitionType == GeofenceTransitionType.ENTER) {
                    return brazeGeofenceForGeofenceId.getAnalyticsEnabledEnter();
                }
                if (geofenceTransitionType == GeofenceTransitionType.EXIT) {
                    return brazeGeofenceForGeofenceId.getAnalyticsEnabledExit();
                }
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    public void configureFromServerConfig(p5 serverConfig) {
        boolean z10;
        kotlin.jvm.internal.i.e(serverConfig, "serverConfig");
        boolean zN = serverConfig.n();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new b(zN), 3, (Object) null);
        if (zN) {
            Context applicationContext = this.applicationContext;
            kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
            if (isGeofencesEnabledFromEnvironment(applicationContext) && this.brazeGeofenceApi.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10 != this.isGeofencesEnabled) {
            this.isGeofencesEnabled = z10;
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new c(), 2, (Object) null);
            if (this.isGeofencesEnabled) {
                setUpGeofences(false);
                if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
                    requestGeofenceRefresh(true);
                }
            } else {
                tearDownGeofences(this.geofenceTransitionPendingIntent);
            }
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new d(z10), 3, (Object) null);
        }
        int iS = serverConfig.s();
        if (iS >= 0) {
            this.maxNumToRegister = iS;
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new e(), 2, (Object) null);
        }
        this.brazeGeofenceReEligibilityManager.a(serverConfig);
    }

    public final C1473k getBrazeGeofenceApi() {
        return this.brazeGeofenceApi;
    }

    public final BrazeGeofence getBrazeGeofenceForGeofenceId(String geofenceId) {
        Object next;
        kotlin.jvm.internal.i.e(geofenceId, "geofenceId");
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.brazeGeofences.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.i.a(((BrazeGeofence) next).getId(), geofenceId));
            return (BrazeGeofence) next;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final C1474l getBrazeGeofenceReEligibilityManager() {
        return this.brazeGeofenceReEligibilityManager;
    }

    public final List<BrazeGeofence> getBrazeGeofences() {
        return this.brazeGeofences;
    }

    public final C1475m getBrazeLocationApi() {
        return this.brazeLocationApi;
    }

    public final c2 getBrazeManager() {
        return this.brazeManager;
    }

    public final IBrazeLocation getGeofenceRequestLocation() {
        return this.geofenceRequestLocation;
    }

    public final SharedPreferences getGeofenceStorageSharedPreferences() {
        return this.geofenceStorageSharedPreferences;
    }

    public final PendingIntent getGeofenceTransitionPendingIntent() {
        return this.geofenceTransitionPendingIntent;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public final void initializeGeofences() {
        boolean z10;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, f.f24115b, 3, (Object) null);
        if (Companion.getGeofencesEnabledFromServerConfig(this.serverConfigStorageProvider)) {
            Context applicationContext = this.applicationContext;
            kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
            if (isGeofencesEnabledFromEnvironment(applicationContext) && this.brazeGeofenceApi.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.isGeofencesEnabled = z10;
        if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
            requestGeofenceRefresh(true);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, g.f24117b, 3, (Object) null);
        }
    }

    public final boolean isGeofencesEnabled() {
        return this.isGeofencesEnabled;
    }

    public final boolean isGeofencesEnabledFromEnvironment(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        if (!Companion.getGeofencesEnabledFromConfiguration(this.configurationProvider)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.f24119b, 3, (Object) null);
            return false;
        }
        if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, i.f24120b, 2, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && !PermissionUtils.hasPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, j.f24121b, 2, (Object) null);
            return false;
        }
        if (!com.braze.support.f.a(context)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, k.f24122b, 3, (Object) null);
            return false;
        }
        if (!this.brazeGeofenceApi.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, l.f24123b, 3, (Object) null);
            return false;
        }
        try {
            Class.forName("com.google.android.gms.location.LocationServices", false, BrazeGeofenceManager.class.getClassLoader());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, n.f24125b, 3, (Object) null);
            return true;
        } catch (Exception unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, m.f24124b, 3, (Object) null);
            return false;
        }
    }

    @Override // com.braze.managers.IBrazeGeofenceLocationUpdateListener
    public void onLocationRequestComplete(IBrazeLocation iBrazeLocation) {
        if (iBrazeLocation == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, p.f24127b, 3, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new o(iBrazeLocation), 3, (Object) null);
        requestGeofenceRefresh(iBrazeLocation);
        this.brazeGeofenceReEligibilityManager.a(DateTimeUtils.nowInSeconds());
    }

    public void postGeofenceReport(String geofenceId, GeofenceTransitionType transitionType) {
        p293xa.r rVar;
        kotlin.jvm.internal.i.e(geofenceId, "geofenceId");
        kotlin.jvm.internal.i.e(transitionType, "transitionType");
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, q.f24128b, 2, (Object) null);
            return;
        }
        C1471i.a aVar = C1471i.f21202h;
        String string = transitionType.toString();
        Locale locale = Locale.US;
        a2 a2VarC = aVar.c(geofenceId, J4.n.d(locale, "US", string, locale, "this as java.lang.String).toLowerCase(locale)"));
        if (a2VarC != null) {
            if (analyticsEnabledForGeofenceId(geofenceId, transitionType)) {
                this.brazeManager.a(a2VarC);
            }
            BrazeGeofence brazeGeofenceForGeofenceId = getBrazeGeofenceForGeofenceId(geofenceId);
            if (brazeGeofenceForGeofenceId != null && this.brazeGeofenceReEligibilityManager.a(DateTimeUtils.nowInSeconds(), brazeGeofenceForGeofenceId, transitionType)) {
                this.brazeManager.b(a2VarC);
            }
            rVar = p293xa.r.f47939a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.E, (Throwable) null, new r(geofenceId, transitionType), 2, (Object) null);
        }
    }

    public void registerGeofences(List<BrazeGeofence> geofenceList) {
        kotlin.jvm.internal.i.e(geofenceList, "geofenceList");
        ArrayList<BrazeGeofence> arrayListP0 = kotlin.collections.q.p0(geofenceList);
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, s.f24131b, 2, (Object) null);
            return;
        }
        if (this.geofenceRequestLocation != null) {
            for (BrazeGeofence brazeGeofence : arrayListP0) {
                IBrazeLocation iBrazeLocation = this.geofenceRequestLocation;
                if (iBrazeLocation != null) {
                    brazeGeofence.setDistanceFromGeofenceRefresh(l3.a(iBrazeLocation.getLatitude(), iBrazeLocation.getLongitude(), brazeGeofence.getLatitude(), brazeGeofence.getLongitude()));
                }
            }
            kotlin.collections.p.F(arrayListP0);
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new t(arrayListP0), 3, (Object) null);
            SharedPreferences.Editor editorEdit = this.geofenceStorageSharedPreferences.edit();
            editorEdit.clear();
            this.brazeGeofences.clear();
            int i10 = 0;
            for (BrazeGeofence brazeGeofence2 : arrayListP0) {
                if (i10 == this.maxNumToRegister) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new u(), 3, (Object) null);
                    break;
                }
                this.brazeGeofences.add(brazeGeofence2);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new v(brazeGeofence2), 3, (Object) null);
                editorEdit.putString(brazeGeofence2.getId(), brazeGeofence2.forJsonPut().toString());
                i10++;
            }
            editorEdit.apply();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new w(), 3, (Object) null);
            p293xa.r rVar = p293xa.r.f47939a;
            reentrantLock.unlock();
            this.brazeGeofenceReEligibilityManager.a(arrayListP0);
            setUpGeofences(true);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void registerGeofencesWithGooglePlay(List<BrazeGeofence> geofenceList, PendingIntent geofenceRequestIntent) {
        kotlin.jvm.internal.i.e(geofenceList, "geofenceList");
        kotlin.jvm.internal.i.e(geofenceRequestIntent, "geofenceRequestIntent");
        C1473k c1473k = this.brazeGeofenceApi;
        Context applicationContext = this.applicationContext;
        kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
        c1473k.a(applicationContext, geofenceList, geofenceRequestIntent);
    }

    public void requestGeofenceRefresh(IBrazeLocation location) {
        kotlin.jvm.internal.i.e(location, "location");
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, x.f24136b, 3, (Object) null);
        } else {
            this.geofenceRequestLocation = location;
            this.brazeManager.a(location);
        }
    }

    public final void requestSingleLocationUpdateFromGooglePlay() {
        this.brazeLocationApi.a(new z());
    }

    public final void setBrazeGeofenceReEligibilityManager(C1474l c1474l) {
        kotlin.jvm.internal.i.e(c1474l, "<set-?>");
        this.brazeGeofenceReEligibilityManager = c1474l;
    }

    public final void setGeofenceRequestLocation(IBrazeLocation iBrazeLocation) {
        this.geofenceRequestLocation = iBrazeLocation;
    }

    public final void setGeofencesEnabled(boolean z10) {
        this.isGeofencesEnabled = z10;
    }

    public final void setMaxNumToRegister(int i10) {
        this.maxNumToRegister = i10;
    }

    public final void setUpGeofences(boolean z10) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, a0.f24106b, 3, (Object) null);
            return;
        }
        PendingIntent pendingIntent = this.geofenceTransitionPendingIntent;
        if (pendingIntent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b0.f24108b, 3, (Object) null);
            return;
        }
        if (z10) {
            ReentrantLock reentrantLock = this.geofenceListLock;
            reentrantLock.lock();
            try {
                registerGeofencesWithGooglePlay(this.brazeGeofences, pendingIntent);
                p293xa.r rVar = p293xa.r.f47939a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void tearDownGeofences(PendingIntent pendingIntent) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, c0.f24110b, 3, (Object) null);
        if (pendingIntent != null) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, d0.f24112b, 3, (Object) null);
            C1473k c1473k = this.brazeGeofenceApi;
            Context applicationContext = this.applicationContext;
            kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
            c1473k.a(applicationContext, pendingIntent);
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, e0.f24114b, 3, (Object) null);
            this.geofenceStorageSharedPreferences.edit().clear().apply();
            this.brazeGeofences.clear();
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void unregisterGeofences() {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f0.f24116b, 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, g0.f24118b, 3, (Object) null);
            tearDownGeofences(this.geofenceTransitionPendingIntent);
        }
    }

    public final int getMaxNumToRegister() {
        return this.maxNumToRegister;
    }

    public void requestGeofenceRefresh(boolean z10) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, y.f24137b, 3, (Object) null);
        } else if (this.brazeGeofenceReEligibilityManager.a(z10, DateTimeUtils.nowInSeconds())) {
            requestSingleLocationUpdateFromGooglePlay();
        }
    }

    public static /* synthetic */ void getBrazeGeofenceApi$annotations() {
    }

    public static /* synthetic */ void getBrazeGeofenceReEligibilityManager$annotations() {
    }

    public static /* synthetic */ void getBrazeGeofences$annotations() {
    }

    public static /* synthetic */ void getBrazeLocationApi$annotations() {
    }

    public static /* synthetic */ void getGeofenceRequestLocation$annotations() {
    }

    public static /* synthetic */ void getGeofenceStorageSharedPreferences$annotations() {
    }

    public static /* synthetic */ void getGeofenceTransitionPendingIntent$annotations() {
    }

    public static /* synthetic */ void getMaxNumToRegister$annotations() {
    }

    public static /* synthetic */ void isGeofencesEnabled$annotations() {
    }
}
