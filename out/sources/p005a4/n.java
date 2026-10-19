package p005a4;

import Z3.C0835a;
import Z3.q;
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.internal.measurement.M1;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import p093h4.e;
import p117j4.b;
import p165n4.l;
import p165n4.s;
import p165n4.t;
import p293xa.r;

/* JADX INFO: compiled from: AppEventsLoggerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f8034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f8035d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f8036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f8037f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccessTokenAppIdPair f8039b;

    /* JADX INFO: compiled from: AppEventsLoggerImpl.kt */
    public static final class a {
        public static final void a(final AccessTokenAppIdPair accessTokenAppId, final AppEvent appEvent) {
            String str = j.f8027a;
            i.e(accessTokenAppId, "accessTokenAppId");
            j.f8030d.execute(new Runnable() { // from class: a4.f
                @Override // java.lang.Runnable
                public final void run() {
                    int i10;
                    int size;
                    AccessTokenAppIdPair accessTokenAppId2 = accessTokenAppId;
                    AppEvent appEvent2 = appEvent;
                    i.e(accessTokenAppId2, "$accessTokenAppId");
                    c cVar = j.f8029c;
                    synchronized (cVar) {
                        u uVarB = cVar.b(accessTokenAppId2);
                        if (uVarB != null) {
                            uVarB.a(appEvent2);
                        }
                    }
                    synchronized (n.f8035d) {
                    }
                    c cVar2 = j.f8029c;
                    synchronized (cVar2) {
                        try {
                            i10 = 0;
                            for (u uVar : ((HashMap) cVar2.f8018b).values()) {
                                synchronized (uVar) {
                                    try {
                                        size = uVar.f8046c.size();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                i10 += size;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (i10 > j.f8028b) {
                        j.a(FlushReason.f24782d);
                    } else if (j.f8031e == null) {
                        j.f8031e = j.f8030d.schedule(j.f8032f, 15L, TimeUnit.SECONDS);
                    }
                }
            });
            FeatureManager featureManager = FeatureManager.f24975a;
            if (FeatureManager.b(FeatureManager.Feature.OnDevicePostInstallEventProcessing) && b.a()) {
                final String applicationId = accessTokenAppId.b();
                i.e(applicationId, "applicationId");
                boolean z10 = appEvent.e() && b.f41133a.contains(appEvent.c());
                if (!appEvent.e() || z10) {
                    q.c().execute(new Runnable() { // from class: j4.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str2 = applicationId;
                            AppEvent appEvent2 = appEvent;
                            RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.f24959a;
                            List listK = M1.k(appEvent2);
                            RemoteServiceWrapper.EventType eventType = RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS;
                            RemoteServiceWrapper.f24959a.getClass();
                            RemoteServiceWrapper.b(eventType, str2, listK);
                        }
                    });
                }
            }
            if (appEvent.a() || n.f8037f) {
                return;
            }
            if (i.a(appEvent.c(), "fb_mobile_activate_app")) {
                n.f8037f = true;
            } else {
                l.a aVar = l.f44910c;
                l.a.a(LoggingBehavior.f24776d, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        public static void b() {
            synchronized (n.f8035d) {
                if (n.f8034c != null) {
                    return;
                }
                n.f8034c = new ScheduledThreadPoolExecutor(1);
                r rVar = r.f47939a;
                l lVar = new l();
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = n.f8034c;
                if (scheduledThreadPoolExecutor == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                scheduledThreadPoolExecutor.scheduleAtFixedRate(lVar, 0L, 86400L, TimeUnit.SECONDS);
            }
        }
    }

    public n(String str, String str2) {
        t.e();
        this.f8038a = str;
        Date date = C0835a.f7782m;
        C0835a c0835aB = C0835a.b.b();
        if (c0835aB == null || new Date().after(c0835aB.f7785b) || !(str2 == null || str2.equals(c0835aB.f7792i))) {
            if (str2 == null) {
                q.a();
                str2 = q.b();
            }
            this.f8039b = new AccessTokenAppIdPair(null, str2);
        } else {
            this.f8039b = new AccessTokenAppIdPair(c0835aB.f7789f, q.b());
        }
        a.b();
    }

    public final void a(String str, Double d10, Bundle bundle, boolean z10, UUID uuid) {
        if (str == null || str.length() == 0) {
            return;
        }
        p165n4.i iVar = p165n4.i.f44889a;
        boolean zB = p165n4.i.b("app_events_killswitch", q.b(), false);
        LoggingBehavior loggingBehavior = LoggingBehavior.f24776d;
        if (zB) {
            l.a aVar = l.f44910c;
            l.a.b(loggingBehavior, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
            return;
        }
        try {
            p080g4.a.d(bundle, str);
            ProtectedModeManager.a(bundle);
            a.a(this.f8039b, new AppEvent(this.f8038a, str, d10, bundle, z10, e.f36146k == 0, uuid));
        } catch (FacebookException e10) {
            l.a aVar2 = l.f44910c;
            l.a.b(loggingBehavior, "AppEvents", "Invalid app event: %s", e10.toString());
        } catch (JSONException e11) {
            l.a aVar3 = l.f44910c;
            l.a.b(loggingBehavior, "AppEvents", "JSON encoding for app event failed: '%s'", e11.toString());
        }
    }

    public n(Context context, String str) {
        this(s.l(context), str);
    }
}
