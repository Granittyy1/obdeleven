package com.google.firebase.perf.config;

import C7.i;
import C7.k;
import C7.o;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.util.d;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p096h7.b;
import p144l6.e;
import p144l6.g;
import p218r7.u;
import p241t7.a;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, k> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final u cache;
    private final Executor executor;
    private i firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private b<o> firebaseRemoteConfigProvider;
    private static final a logger = a.d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    private RemoteConfigManager() {
        this(u.b(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, MIN_APP_START_CONFIG_FETCH_DELAY_MS + ((long) new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS)), getInitialStartupMillis());
    }

    @VisibleForTesting
    public static long getInitialStartupMillis() {
        g gVar = (g) e.c().b(g.class);
        return gVar != null ? gVar.b() : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private k getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        k kVar = this.allRcConfigMap.get(str);
        if (kVar.getSource() != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", kVar.c(), str);
        return kVar;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.a().f(this.executor, new D7.i(this)).d(this.executor, new I4.e(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.b());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public d<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a();
            return new d<>();
        }
        k remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new d<>(Boolean.valueOf(remoteConfigValue.d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.c().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.c(), str);
                }
            }
        }
        return new d<>();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public d<Double> getDouble(String str) {
        if (str == null) {
            logger.a();
            return new d<>();
        }
        k remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new d<>(Double.valueOf(remoteConfigValue.b()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.c().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.c(), str);
                }
            }
        }
        return new d<>();
    }

    public d<Long> getLong(String str) {
        if (str == null) {
            logger.a();
            return new d<>();
        }
        k remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new d<>(Long.valueOf(remoteConfigValue.a()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.c().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.c(), str);
                }
            }
        }
        return new d<>();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t8) {
        Object objValueOf;
        k remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue == null) {
            return t8;
        }
        try {
            if (t8 instanceof Boolean) {
                objValueOf = Boolean.valueOf(remoteConfigValue.d());
            } else if (t8 instanceof Double) {
                objValueOf = Double.valueOf(remoteConfigValue.b());
            } else if ((t8 instanceof Long) || (t8 instanceof Integer)) {
                objValueOf = Long.valueOf(remoteConfigValue.a());
            } else {
                if (!(t8 instanceof String)) {
                    T t10 = (T) remoteConfigValue.c();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t8);
                        return t10;
                    } catch (IllegalArgumentException unused) {
                        t8 = t10;
                        if (remoteConfigValue.c().isEmpty()) {
                            return t8;
                        }
                        logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.c(), str);
                        return t8;
                    }
                }
                objValueOf = remoteConfigValue.c();
            }
            return (T) objValueOf;
        } catch (IllegalArgumentException unused2) {
        }
    }

    public d<String> getString(String str) {
        if (str == null) {
            logger.a();
            return new d<>();
        }
        k remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new d<>(remoteConfigValue.c()) : new d<>();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        b<o> bVar;
        o oVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (oVar = bVar.get()) != null) {
            this.firebaseRemoteConfig = oVar.b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        i iVar = this.firebaseRemoteConfig;
        return iVar == null || iVar.c().f2871a == 1 || this.firebaseRemoteConfig.c().f2871a == 2;
    }

    public void setFirebaseRemoteConfigProvider(b<o> bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, k> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        p218r7.d dVarI0 = p218r7.d.i0();
        ConcurrentHashMap<String, k> concurrentHashMap = this.allRcConfigMap;
        dVarI0.getClass();
        k kVar = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (kVar == null) {
            logger.a();
            return;
        }
        try {
            this.cache.g("com.google.firebase.perf.ExperimentTTID", kVar.d());
        } catch (Exception unused) {
            logger.a();
        }
    }

    @VisibleForTesting
    public RemoteConfigManager(u uVar, Executor executor, i iVar, long j, long j10) {
        ConcurrentHashMap<String, k> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = uVar;
        this.executor = executor;
        this.firebaseRemoteConfig = iVar;
        if (iVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(iVar.b());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j10;
        this.appStartConfigFetchDelayInMs = j;
    }
}
