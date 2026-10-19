package com.google.firebase.messaging;

import R4.C0754a;
import R4.C0756c;
import U4.C0804l;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.appcompat.widget.d0;
import androidx.media3.exoplayer.C1406y;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";
    private static K store;
    static ScheduledExecutorService syncExecutor;
    private final a autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final p144l6.e firebaseApp;
    private final w gmsRpc;
    private final R6.a iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final z metadata;
    private final H requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final p191p5.g<P> topicsSubscriberTask;
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    static p096h7.b<p311z4.h> transportFactory = new C2053p();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P6.d f28273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f28274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C2058v f28275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f28276d;

        public a(P6.d dVar) {
            this.f28273a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [P6.b, com.google.firebase.messaging.v] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final synchronized void a() {
            try {
                if (this.f28274b) {
                    return;
                }
                Boolean boolC = c();
                this.f28276d = boolC;
                if (boolC == null) {
                    ?? r10 = new P6.b() { // from class: com.google.firebase.messaging.v
                        @Override // P6.b
                        public final void a(P6.a aVar) {
                            FirebaseMessaging.a aVar2 = this.f28417a;
                            if (aVar2.b()) {
                                FirebaseMessaging.this.startSyncIfNecessary();
                            }
                        }
                    };
                    this.f28275c = r10;
                    this.f28273a.a(r10);
                }
                this.f28274b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized boolean b() {
            Boolean bool;
            try {
                a();
                bool = this.f28276d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.firebaseApp.g();
        }

        public final Boolean c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            p144l6.e eVar = FirebaseMessaging.this.firebaseApp;
            eVar.a();
            Context context = eVar.f44388a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FirebaseMessaging(p144l6.e eVar, R6.a aVar, p096h7.b<B7.h> bVar, p096h7.b<HeartBeatInfo> bVar2, p108i7.c cVar, p096h7.b<p311z4.h> bVar3, P6.d dVar) {
        this(eVar, aVar, bVar, bVar2, cVar, bVar3, dVar, new z(eVar.f44388a));
        eVar.a();
    }

    public static synchronized void clearStoreForTest() {
        store = null;
    }

    public static void clearTransportFactoryForTest() {
        transportFactory = new C2052o();
    }

    public static synchronized FirebaseMessaging getInstance() {
        return getInstance(p144l6.e.c());
    }

    private static synchronized K getStore(Context context) {
        try {
            if (store == null) {
                store = new K(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return store;
    }

    private String getSubtype() {
        p144l6.e eVar = this.firebaseApp;
        eVar.a();
        return "[DEFAULT]".equals(eVar.f44389b) ? "" : this.firebaseApp.d();
    }

    public static p311z4.h getTransportFactory() {
        return transportFactory.get();
    }

    private void handleProxiedNotificationData() {
        p191p5.g gVarD;
        int i10;
        C0756c c0756c = this.gmsRpc.f28420c;
        if (c0756c.f5272c.a() >= 241100000) {
            R4.A a10 = R4.A.a(c0756c.f5271b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (a10) {
                i10 = a10.f5257d;
                a10.f5257d = i10 + 1;
            }
            gVarD = a10.b(new R4.z(i10, 5, bundle)).g(R4.D.f5262b, R4.f.f5278b);
        } else {
            gVarD = p191p5.j.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        gVarD.f(this.initExecutor, new C7.h(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initializeProxyNotifications, reason: merged with bridge method [inline-methods] */
    public void lambda$new$4() {
        C.a(this.context);
        E.b(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        if (shouldRetainProxyNotifications()) {
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invokeOnTokenRefresh, reason: merged with bridge method [inline-methods] */
    public void lambda$new$1(String str) {
        p144l6.e eVar = this.firebaseApp;
        eVar.a();
        if ("[DEFAULT]".equals(eVar.f44389b)) {
            if (Log.isLoggable(TAG, 3)) {
                this.firebaseApp.a();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C2049l(this.context).b(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p191p5.g lambda$blockingGetToken$13(String str, K.a aVar, String str2) throws Exception {
        String string;
        K store2 = getStore(this.context);
        String subtype = getSubtype();
        String strA = this.metadata.a();
        synchronized (store2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i10 = K.a.f28292e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str2);
                jSONObject.put("appVersion", strA);
                jSONObject.put("timestamp", jCurrentTimeMillis);
                string = jSONObject.toString();
            } catch (JSONException e10) {
                e10.toString();
                string = null;
            }
            if (string != null) {
                SharedPreferences.Editor editorEdit = store2.f28290a.edit();
                editorEdit.putString(K.a(subtype, str), string);
                editorEdit.commit();
            }
        }
        if (aVar == null || !str2.equals(aVar.f28293a)) {
            lambda$new$1(str2);
        }
        return p191p5.j.e(str2);
    }

    private p191p5.g lambda$blockingGetToken$14(final String str, final K.a aVar) {
        w wVar = this.gmsRpc;
        return wVar.a(wVar.c(new Bundle(), z.b(wVar.f28418a), "*")).p(this.fileExecutor, new p191p5.f() { // from class: com.google.firebase.messaging.q
            @Override // p191p5.f
            public final p191p5.g c(Object obj) {
                return this.f28387b.lambda$blockingGetToken$13(str, aVar, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p311z4.h lambda$clearTransportFactoryForTest$12() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteToken$8(p191p5.h hVar) {
        try {
            R6.a aVar = this.iid;
            z.b(this.firebaseApp);
            aVar.b();
            hVar.b(null);
        } catch (Exception e10) {
            hVar.a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$deleteToken$9(p191p5.h hVar) {
        try {
            w wVar = this.gmsRpc;
            wVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("delete", "1");
            p191p5.j.a(wVar.a(wVar.c(bundle, z.b(wVar.f28418a), "*")));
            K store2 = getStore(this.context);
            String subtype = getSubtype();
            String strB = z.b(this.firebaseApp);
            synchronized (store2) {
                String strA = K.a(subtype, strB);
                SharedPreferences.Editor editorEdit = store2.f28290a.edit();
                editorEdit.remove(strA);
                editorEdit.commit();
            }
            hVar.b(null);
        } catch (Exception e10) {
            hVar.a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getToken$7(p191p5.h hVar) {
        try {
            hVar.b(blockingGetToken());
        } catch (Exception e10) {
            hVar.a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handleProxiedNotificationData$5(C0754a c0754a) {
        if (c0754a != null) {
            y.b(c0754a.f5265b);
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(P p10) {
        if (isAutoInitEnabled()) {
            p10.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setNotificationDelegationEnabled$6(Void r10) {
        E.b(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p311z4.h lambda$static$0() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p191p5.g lambda$subscribeToTopic$10(String str, P p10) throws Exception {
        p10.getClass();
        p191p5.B bD = p10.d(new M("S", str));
        p10.f();
        return bD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p191p5.g lambda$unsubscribeFromTopic$11(String str, P p10) throws Exception {
        p10.getClass();
        p191p5.B bD = p10.d(new M("U", str));
        p10.f();
        return bD;
    }

    private boolean shouldRetainProxyNotifications() {
        C.a(this.context);
        if (!C.b(this.context)) {
            return false;
        }
        if (this.firebaseApp.b(p192p6.a.class) != null) {
            return true;
        }
        return y.a() && transportFactory != null;
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncIfNecessary() {
        R6.a aVar = this.iid;
        if (aVar != null) {
            aVar.a();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String blockingGetToken() throws IOException {
        p191p5.g gVarI;
        R6.a aVar = this.iid;
        if (aVar != null) {
            try {
                return (String) p191p5.j.a(aVar.c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        K.a tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.f28293a;
        }
        String strB = z.b(this.firebaseApp);
        H h8 = this.requestDeduplicator;
        synchronized (h8) {
            gVarI = (p191p5.g) h8.f28279b.get(strB);
            if (gVarI != null) {
                Log.isLoggable(TAG, 3);
            } else {
                Log.isLoggable(TAG, 3);
                gVarI = lambda$blockingGetToken$14(strB, tokenWithoutTriggeringSync).i(h8.f28278a, new D7.h(h8, 3, strB));
                h8.f28279b.put(strB, gVarI);
            }
        }
        try {
            return (String) p191p5.j.a(gVarI);
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    public p191p5.g<Void> deleteToken() {
        if (this.iid != null) {
            p191p5.h hVar = new p191p5.h();
            this.initExecutor.execute(new RunnableC2056t(this, 0, hVar));
            return hVar.f45811a;
        }
        if (getTokenWithoutTriggeringSync() == null) {
            return p191p5.j.e(null);
        }
        p191p5.h hVar2 = new p191p5.h();
        Executors.newSingleThreadExecutor(new Z4.a("Firebase-Messaging-Network-Io")).execute(new RunnableC2057u(this, 0, hVar2));
        return hVar2.f45811a;
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return y.a();
    }

    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (syncExecutor == null) {
                    syncExecutor = new ScheduledThreadPoolExecutor(1, new Z4.a("TAG"));
                }
                syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public p191p5.g<String> getToken() {
        R6.a aVar = this.iid;
        if (aVar != null) {
            return aVar.c();
        }
        p191p5.h hVar = new p191p5.h();
        this.initExecutor.execute(new RunnableC2055s(this, 0, hVar));
        return hVar.f45811a;
    }

    public K.a getTokenWithoutTriggeringSync() {
        K.a aVarA;
        K store2 = getStore(this.context);
        String subtype = getSubtype();
        String strB = z.b(this.firebaseApp);
        synchronized (store2) {
            aVarA = K.a.a(store2.f28290a.getString(K.a(subtype, strB), null));
        }
        return aVarA;
    }

    public p191p5.g<P> getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.b();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.c();
    }

    public boolean isNotificationDelegationEnabled() {
        return C.b(this.context);
    }

    @Deprecated
    public void send(F f10) {
        if (TextUtils.isEmpty(f10.f28271b.getString("google.to"))) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent(SEND_INTENT_ACTION);
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra(EXTRA_DUMMY_P_INTENT, PendingIntent.getBroadcast(this.context, 0, intent2, 67108864));
        intent.setPackage(GMS_PACKAGE);
        intent.putExtras(f10.f28271b);
        this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z10) {
        a aVar = this.autoInit;
        synchronized (aVar) {
            try {
                aVar.a();
                C2058v c2058v = aVar.f28275c;
                if (c2058v != null) {
                    aVar.f28273a.b(c2058v);
                    aVar.f28275c = null;
                }
                p144l6.e eVar = FirebaseMessaging.this.firebaseApp;
                eVar.a();
                SharedPreferences.Editor editorEdit = eVar.f44388a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("auto_init", z10);
                editorEdit.apply();
                if (z10) {
                    FirebaseMessaging.this.startSyncIfNecessary();
                }
                aVar.f28276d = Boolean.valueOf(z10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z10) {
        p144l6.e eVarC = p144l6.e.c();
        eVarC.a();
        eVarC.f44388a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z10).apply();
        E.b(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    public p191p5.g<Void> setNotificationDelegationEnabled(boolean z10) {
        p191p5.B bE;
        Executor executor = this.initExecutor;
        Context context = this.context;
        if (Build.VERSION.SDK_INT >= 29) {
            p191p5.h hVar = new p191p5.h();
            executor.execute(new B(context, z10, hVar));
            bE = hVar.f45811a;
        } else {
            bE = p191p5.j.e(null);
        }
        bE.f(new p188p2.b(), new r(this));
        return bE;
    }

    public synchronized void setSyncScheduledOrRunning(boolean z10) {
        this.syncScheduledOrRunning = z10;
    }

    public p191p5.g<Void> subscribeToTopic(String str) {
        return this.topicsSubscriberTask.q(new C2051n(str));
    }

    public synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new L(this, Math.min(Math.max(MIN_DELAY_SEC, 2 * j), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    public boolean tokenNeedsRefresh(K.a aVar) {
        if (aVar != null) {
            String strA = this.metadata.a();
            if (System.currentTimeMillis() <= aVar.f28295c + K.a.f28291d && strA.equals(aVar.f28294b)) {
                return false;
            }
        }
        return true;
    }

    public p191p5.g<Void> unsubscribeFromTopic(String str) {
        return this.topicsSubscriberTask.q(new C1406y(str));
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(p144l6.e eVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) eVar.b(FirebaseMessaging.class);
        C0804l.i(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public FirebaseMessaging(p144l6.e eVar, R6.a aVar, p096h7.b<B7.h> bVar, p096h7.b<HeartBeatInfo> bVar2, p108i7.c cVar, p096h7.b<p311z4.h> bVar3, P6.d dVar, z zVar) {
        this(eVar, aVar, bVar3, dVar, zVar, new w(eVar, zVar, bVar, bVar2, cVar), Executors.newSingleThreadExecutor(new Z4.a("Firebase-Messaging-Task")), new ScheduledThreadPoolExecutor(1, new Z4.a("Firebase-Messaging-Init")), new ThreadPoolExecutor(0, 1, MIN_DELAY_SEC, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Z4.a("Firebase-Messaging-File-Io")));
    }

    public FirebaseMessaging(p144l6.e eVar, R6.a aVar, p096h7.b<p311z4.h> bVar, P6.d dVar, final z zVar, final w wVar, Executor executor, Executor executor2, Executor executor3) {
        int i10 = 1;
        this.syncScheduledOrRunning = false;
        transportFactory = bVar;
        this.firebaseApp = eVar;
        this.iid = aVar;
        this.autoInit = new a(dVar);
        eVar.a();
        final Context context = eVar.f44388a;
        this.context = context;
        C2050m c2050m = new C2050m();
        this.lifecycleCallbacks = c2050m;
        this.metadata = zVar;
        this.gmsRpc = wVar;
        this.requestDeduplicator = new H(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        eVar.a();
        Context context2 = eVar.f44388a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(c2050m);
        } else {
            Objects.toString(context2);
        }
        if (aVar != null) {
            aVar.d();
        }
        executor2.execute(new I4.q(2, this));
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new Z4.a("Firebase-Messaging-Topics-Io"));
        int i11 = P.j;
        p191p5.B bC = p191p5.j.c(new Callable() { // from class: com.google.firebase.messaging.O
            @Override // java.util.concurrent.Callable
            public final Object call() {
                N n10;
                Context context3 = context;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = scheduledThreadPoolExecutor;
                FirebaseMessaging firebaseMessaging = this;
                z zVar2 = zVar;
                w wVar2 = wVar;
                synchronized (N.class) {
                    try {
                        WeakReference<N> weakReference = N.f28305b;
                        n10 = weakReference != null ? weakReference.get() : null;
                        if (n10 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            N n11 = new N();
                            synchronized (n11) {
                                n11.f28306a = J.a(sharedPreferences, scheduledThreadPoolExecutor2);
                            }
                            N.f28305b = new WeakReference<>(n11);
                            n10 = n11;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new P(firebaseMessaging, zVar2, n10, wVar2, context3, scheduledThreadPoolExecutor2);
            }
        }, scheduledThreadPoolExecutor);
        this.topicsSubscriberTask = bC;
        bC.f(executor2, new I4.r(this));
        executor2.execute(new d0(i10, this));
    }
}
