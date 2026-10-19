package com.voltasit.obdeleven;

import Ia.l;
import P8.c;
import Q3.d;
import android.content.ComponentCallbacks;
import android.net.ConnectivityManager;
import android.text.format.DateFormat;
import android.util.LruCache;
import com.braze.Braze;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.braze.configuration.BrazeConfig;
import com.braze.support.BrazeLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.obdeleven.service.util.Texttabe;
import com.parse.ControlUnitDB;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.voltasit.obdeleven.common.AppModuleFactoriesKt;
import com.voltasit.obdeleven.common.AppModuleSinglesKt;
import com.voltasit.obdeleven.common.AppModuleViewModelsKt;
import com.voltasit.obdeleven.common.ManufacturerAppModuleKt;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.data.providers.q;
import com.voltasit.obdeleven.presentation.notification.NotificationActivity;
import com.voltasit.obdeleven.presentation.startup.StartupActivity;
import com.voltasit.obdeleven.ui.activity.LoginActivity;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.parse.model.ControlUnitLabelDB;
import com.voltasit.parse.model.HistoryDB;
import io.intercom.android.sdk.Intercom;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.k;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.koin.core.error.KoinAppAlreadyStartedException;
import org.koin.core.logger.Level;
import p197pb.f;
import p255u9.A;
import p255u9.B;
import p255u9.C;
import p255u9.C2798a;
import p255u9.C2800c;
import p255u9.C2801d;
import p255u9.C2802e;
import p255u9.C2803f;
import p255u9.C2804g;
import p255u9.D;
import p255u9.E;
import p255u9.F;
import p255u9.G;
import p255u9.h;
import p255u9.j;
import p255u9.m;
import p255u9.n;
import p255u9.p;
import p255u9.t;
import p255u9.u;
import p255u9.v;
import p255u9.w;
import p255u9.x;
import p255u9.z;
import p293xa.g;
import p293xa.r;

/* JADX INFO: compiled from: Application.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Application extends android.app.Application {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p279w9.b f29634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static P8.b f29635c;

    static {
        p279w9.b bVar = new p279w9.b();
        bVar.f47824a = new LruCache<>(2000);
        f29634b = bVar;
    }

    @Override // android.app.Application
    public final void onCreate() {
        DatabaseLanguage databaseLanguageValueOf;
        String installationId;
        super.onCreate();
        l<Ib.b, r> lVar = new l<Ib.b, r>() { // from class: com.voltasit.obdeleven.Application.onCreate.1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Ib.b bVar) {
                Ib.b startKoin = bVar;
                i.e(startKoin, "$this$startKoin");
                Db.a aVar = new Db.a(Level.f45771e);
                Ib.a aVar2 = startKoin.f3938a;
                aVar2.getClass();
                aVar2.f3937c = aVar;
                org.koin.android.ext.koin.a.a(startKoin, Application.this);
                List<Nb.a> modules = k.d0(new Nb.a[]{AppModuleSinglesKt.f29806a, AppModuleFactoriesKt.f29645a, AppModuleViewModelsKt.f29871a, ManufacturerAppModuleKt.f29934a});
                i.e(modules, "modules");
                E3.b bVar2 = aVar2.f3937c;
                Level level = Level.f45769c;
                boolean zD = bVar2.D(level);
                boolean z10 = startKoin.f3939b;
                if (zD) {
                    long jNanoTime = System.nanoTime();
                    aVar2.b(modules, z10, false);
                    double dDoubleValue = ((Number) new Pair(r.f47939a, Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d)).d()).doubleValue();
                    int size = aVar2.f3936b.f5139b.size();
                    aVar2.f3937c.l(level, "Started " + size + " definitions in " + dDoubleValue + " ms");
                } else {
                    aVar2.b(modules, z10, false);
                }
                return r.f47939a;
            }
        };
        synchronized (Kb.a.f4374a) {
            Ib.b bVar = new Ib.b();
            if (Kb.a.f4375b != null) {
                throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
            }
            Kb.a.f4375b = bVar.f3938a;
            lVar.invoke(bVar);
            bVar.f3938a.a();
        }
        FirebaseAnalytics.getInstance(this);
        g gVarB = kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<q>(this) { // from class: com.voltasit.obdeleven.Application$setupOmniChannel$$inlined$inject$default$1
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.voltasit.obdeleven.data.providers.q, java.lang.Object] */
            @Override // Ia.a
            public final q invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, kotlin.jvm.internal.l.a(q.class));
            }
        });
        HashSet hashSet = new HashSet();
        hashSet.add(StartupActivity.class);
        hashSet.add(NotificationActivity.class);
        hashSet.add(LoginActivity.class);
        q qVar = (q) gVarB.getValue();
        qVar.getClass();
        Braze.Companion.configure(qVar.f30274a, new BrazeConfig.Builder().setHandlePushDeepLinksAutomatically(true).setIsLocationCollectionEnabled(false).setGoodNetworkDataFlushInterval(30).setGreatNetworkDataFlushInterval(30).setLargeNotificationIcon("ic_push_notification").setSmallNotificationIcon("ic_push_notification").build());
        BrazeLogger.setLogLevel(4);
        registerActivityLifecycleCallbacks(new BrazeActivityLifecycleCallbackListener(hashSet, (Set) null, 2, (e) null));
        List<String> list = a.f29638c;
        a aVarA = a.C0320a.a(this);
        UserTrackingUtils.f34238a = aVarA;
        UserTrackingUtils.f34239b = this;
        CharSequence charSequence = DateFormat.format("yyyy-MM-dd_HH:mm:ss", new Date());
        i.c(charSequence, "null cannot be cast to non-null type kotlin.String");
        String str = (String) charSequence;
        File file = new File(getCacheDir(), "logs");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            i.d(fileArrListFiles, "listFiles(...)");
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
        P8.b bVar2 = new P8.b(new File(file, str.concat(".log")));
        f29635c = bVar2;
        c.c(bVar2);
        c.c(new P8.a());
        O.e.f4722b = new d();
        p.f47479c = f29635c;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f42971b;
        final Map<String, String> mapA = ((J8.b) kotlin.a.b(lazyThreadSafetyMode, new Ia.a<J8.b>(this) { // from class: com.voltasit.obdeleven.Application$onCreate$$inlined$inject$default$1
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [J8.b, java.lang.Object] */
            @Override // Ia.a
            public final J8.b invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar, kotlin.jvm.internal.l.a(J8.b.class));
            }
        }).getValue()).a();
        System.loadLibrary("native");
        ParseObject.registerSubclass(C2798a.class);
        ParseObject.registerSubclass(C2800c.class);
        ParseObject.registerSubclass(C2801d.class);
        ParseObject.registerSubclass(ControlUnitDB.class);
        ParseObject.registerSubclass(ControlUnitLabelDB.class);
        ParseObject.registerSubclass(C2802e.class);
        ParseObject.registerSubclass(C2803f.class);
        ParseObject.registerSubclass(C2804g.class);
        ParseObject.registerSubclass(h.class);
        ParseObject.registerSubclass(HistoryDB.class);
        ParseObject.registerSubclass(p255u9.i.class);
        ParseObject.registerSubclass(j.class);
        ParseObject.registerSubclass(p255u9.l.class);
        ParseObject.registerSubclass(p.class);
        ParseObject.registerSubclass(t.class);
        ParseObject.registerSubclass(v.class);
        ParseObject.registerSubclass(u.class);
        ParseObject.registerSubclass(w.class);
        ParseObject.registerSubclass(z.class);
        ParseObject.registerSubclass(D.class);
        ParseObject.registerSubclass(E.class);
        ParseObject.registerSubclass(F.class);
        ParseObject.registerSubclass(E.class);
        ParseObject.registerSubclass(C.class);
        ParseObject.registerSubclass(x.class);
        ParseObject.registerSubclass(p255u9.k.class);
        ParseObject.registerSubclass(A.class);
        ParseObject.registerSubclass(B.class);
        ParseObject.registerSubclass(G.class);
        ParseObject.registerSubclass(p255u9.r.class);
        ParseObject.registerSubclass(m.class);
        ParseObject.registerSubclass(p255u9.q.class);
        ParseObject.registerSubclass(n.class);
        Parse.Configuration.Builder builder = new Parse.Configuration.Builder(this);
        okhttp3.t.a aVar = new okhttp3.t.a();
        aVar.a(new okhttp3.q() { // from class: s9.a
            @Override // okhttp3.q
            public final okhttp3.z intercept(okhttp3.q.a aVar2) {
                f fVar = (f) aVar2;
                okhttp3.u uVar = fVar.f45947e;
                okhttp3.u.a aVarB = uVar.b();
                aVarB.c("X-Mobile-Installation-Id", com.voltasit.parse.Parse.f34397d);
                for (Map.Entry entry : mapA.entrySet()) {
                    aVarB.c((String) entry.getKey(), (String) entry.getValue());
                }
                aVarB.e(uVar.f45662b, uVar.f45664d);
                return fVar.a(aVarB.a());
            }
        });
        builder.clientBuilder(aVar).server("https://parse.obdeleven.com").applicationId("Eb5pW5ferSHChwRzQgpckGE5J7M=");
        Parse.enableLocalDatastore(this);
        Parse.initialize(builder.maxRetries(0).build());
        com.voltasit.parse.Parse.b();
        ParseInstallation currentInstallation = ParseInstallation.getCurrentInstallation();
        String str2 = "";
        if (currentInstallation != null && (installationId = currentInstallation.getInstallationId()) != null) {
            str2 = installationId;
        }
        com.voltasit.parse.Parse.f34397d = str2;
        com.voltasit.parse.Parse.f34394a = new com.voltasit.sharednetwork.dataSources.b("https://parse.obdeleven.com", "Eb5pW5ferSHChwRzQgpckGE5J7M=", mapA, str2);
        com.voltasit.parse.Parse.f34396c = (ConnectivityManager) getSystemService("connectivity");
        g gVarB2 = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<p242t9.a>(this) { // from class: com.voltasit.obdeleven.Application$onCreate$$inlined$inject$default$2
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t9.a] */
            @Override // Ia.a
            public final p242t9.a invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar2 = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar2, kotlin.jvm.internal.l.a(p242t9.a.class));
            }
        });
        com.voltasit.parse.Parse.f34395b = (p242t9.a) gVarB2.getValue();
        g gVarB3 = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<J8.m>(this) { // from class: com.voltasit.obdeleven.Application$setupIntegrityHeaders$$inlined$inject$default$1
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [J8.m, java.lang.Object] */
            @Override // Ia.a
            public final J8.m invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar2 = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar2, kotlin.jvm.internal.l.a(J8.m.class));
            }
        });
        final g gVarB4 = kotlin.a.b(lazyThreadSafetyMode, new Ia.a<J8.p>(this) { // from class: com.voltasit.obdeleven.Application$setupIntegrityHeaders$$inlined$inject$default$2
            final /* synthetic */ ComponentCallbacks $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [J8.p, java.lang.Object] */
            @Override // Ia.a
            public final J8.p invoke() {
                ComponentCallbacks componentCallbacks = this.$this_inject;
                Pb.a aVar2 = this.$qualifier;
                return Cb.a.i(componentCallbacks).a(this.$parameters, aVar2, kotlin.jvm.internal.l.a(J8.p.class));
            }
        });
        com.voltasit.parse.Parse.f34394a.f34452g = new Application$setupIntegrityHeaders$1(gVarB3, null);
        com.voltasit.parse.Parse.f34394a.f34453h = new l<Throwable, r>() { // from class: com.voltasit.obdeleven.Application$setupIntegrityHeaders$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Throwable th) {
                Throwable error = th;
                i.e(error, "error");
                g<J8.p> gVar = gVarB4;
                p279w9.b bVar3 = Application.f29634b;
                gVar.getValue().b("Application", "Integrity header skipped: " + error.getMessage());
                return r.f47939a;
            }
        };
        String strC = aVarA.c();
        if (strC.length() == 0) {
            databaseLanguageValueOf = DatabaseLanguage.ENGLISH;
            aVarA.o("databaseLanguage", "ENGLISH");
        } else {
            try {
                databaseLanguageValueOf = DatabaseLanguage.valueOf(strC);
            } catch (Exception e10) {
                O.e.D("Application", "Unknown db language: ".concat(strC));
                ((p242t9.a) gVarB2.getValue()).b(e10);
                databaseLanguageValueOf = DatabaseLanguage.ENGLISH;
                aVarA.o("databaseLanguage", "ENGLISH");
            }
        }
        Intercom.Companion.initialize(this, "android_sdk-48edb1b49924c69e0fd468bb0535057c1e3609e5", "gthpnw16");
        Texttabe.d(this, databaseLanguageValueOf.b());
        com.obdeleven.service.odx.b bVar3 = new com.obdeleven.service.odx.b();
        try {
            bVar3.f29479b = getCacheDir();
            bVar3.f29480c = getExternalFilesDir("odx");
        } catch (Exception unused) {
            bVar3.f29480c = null;
        }
        com.obdeleven.service.odx.g.f29511a = bVar3;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        c.a(5, "Application", "onLowMemory() called", Arrays.copyOf(new Object[0], 0));
        f29634b.b();
    }

    @Override // android.app.Application
    public final void onTerminate() {
        CopyOnWriteArrayList copyOnWriteArrayList = c.f4964a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((P8.d) it.next()).d();
        }
        copyOnWriteArrayList.clear();
        super.onTerminate();
    }
}
