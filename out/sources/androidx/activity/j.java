package androidx.activity;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.perf.config.ConfigurationConstants$LogSourceName;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p033c7.C1501n;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8235c;

    public /* synthetic */ j(int i10, Object obj) {
        this.f8234b = i10;
        this.f8235c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        SubscriptionType subscriptionType;
        ConfigurationConstants$LogSourceName configurationConstants$LogSourceName;
        String strA;
        switch (this.f8234b) {
            case 0:
                ComponentActivity.f fVar = (ComponentActivity.f) this.f8235c;
                Runnable runnable = fVar.f8175c;
                if (runnable != null) {
                    runnable.run();
                    fVar.f8175c = null;
                    return;
                }
                return;
            case 1:
                ((C1501n.e) this.f8235c).getClass();
                throw null;
            case 2:
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h) this.f8235c;
                hVar.w();
                new com.voltasit.obdeleven.presentation.dialogs.f().J(hVar);
                return;
            case 3:
                OnlineControlUnitListFragment this$0 = (OnlineControlUnitListFragment) this.f8235c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                G8.D d10 = (G8.D) this$0.O().f32808y.d();
                if (d10 == null || (subscriptionType = d10.f3410a) == null || !subscriptionType.c()) {
                    this$0.O().d();
                    return;
                } else {
                    this$0.V().o();
                    return;
                }
            case 4:
                ((p128k2.j) this.f8235c).f41510n.start();
                return;
            case 5:
                p297y1.d.this.f48033h.a();
                return;
            default:
                p314z7.f fVar2 = (p314z7.f) this.f8235c;
                p144l6.e eVar = fVar2.f48934e;
                eVar.a();
                Context context = eVar.f44388a;
                fVar2.f48939k = context;
                fVar2.f48944p = context.getPackageName();
                fVar2.f48940l = p218r7.a.e();
                fVar2.f48941m = new p314z7.c(fVar2.f48939k, new com.google.firebase.perf.util.f(100L, 1L, TimeUnit.MINUTES));
                fVar2.f48942n = p206q7.a.a();
                p096h7.b<p311z4.h> bVar = fVar2.f48937h;
                p218r7.a aVar = fVar2.f48940l;
                aVar.getClass();
                ConfigurationConstants$LogSourceName configurationConstants$LogSourceName2 = ConfigurationConstants$LogSourceName.f28432c;
                synchronized (ConfigurationConstants$LogSourceName.class) {
                    try {
                        if (ConfigurationConstants$LogSourceName.f28432c == null) {
                            ConfigurationConstants$LogSourceName.f28432c = new ConfigurationConstants$LogSourceName();
                        }
                        configurationConstants$LogSourceName = ConfigurationConstants$LogSourceName.f28432c;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                configurationConstants$LogSourceName.getClass();
                Long l10 = (Long) aVar.f46362a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l10.getClass();
                Map<Long, String> map = ConfigurationConstants$LogSourceName.f28433d;
                if (!map.containsKey(l10) || (strA = map.get(l10)) == null) {
                    com.google.firebase.perf.util.d<String> dVarD = aVar.d(configurationConstants$LogSourceName);
                    strA = dVarD.b() ? dVarD.a() : "FIREPERF";
                } else {
                    aVar.f46364c.f("com.google.firebase.perf.LogSourceName", strA);
                }
                fVar2.f48938i = new p314z7.a(bVar, strA);
                p206q7.a aVar2 = fVar2.f48942n;
                WeakReference weakReference = new WeakReference(p314z7.f.f48930t);
                synchronized (aVar2.f46152g) {
                    aVar2.f46152g.add(weakReference);
                    break;
                }
                com.google.firebase.perf.v1.c.a aVarS = com.google.firebase.perf.v1.c.S();
                fVar2.f48943o = aVarS;
                p144l6.e eVar2 = fVar2.f48934e;
                eVar2.a();
                String str = eVar2.f44390c.f44401b;
                aVarS.r();
                com.google.firebase.perf.v1.c.H((com.google.firebase.perf.v1.c) aVarS.f29047c, str);
                com.google.firebase.perf.v1.a.C0283a c0283aN = com.google.firebase.perf.v1.a.N();
                String str2 = fVar2.f48944p;
                c0283aN.r();
                com.google.firebase.perf.v1.a.H((com.google.firebase.perf.v1.a) c0283aN.f29047c, str2);
                c0283aN.r();
                com.google.firebase.perf.v1.a.I((com.google.firebase.perf.v1.a) c0283aN.f29047c);
                Context context2 = fVar2.f48939k;
                String str3 = "";
                try {
                    String str4 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    while (true) {
                        ConcurrentLinkedQueue<p314z7.b> concurrentLinkedQueue = fVar2.f48932c;
                        if (concurrentLinkedQueue.isEmpty()) {
                            return;
                        }
                        p314z7.b bVarPoll = concurrentLinkedQueue.poll();
                        if (bVarPoll != null) {
                            fVar2.j.execute(new androidx.compose.ui.contentcapture.i(fVar2, 3, bVarPoll));
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                c0283aN.r();
                com.google.firebase.perf.v1.a.J((com.google.firebase.perf.v1.a) c0283aN.f29047c, str3);
                aVarS.r();
                com.google.firebase.perf.v1.c.L((com.google.firebase.perf.v1.c) aVarS.f29047c, c0283aN.p());
                fVar2.f48933d.set(true);
                break;
        }
    }

    public /* synthetic */ j(C1501n.e eVar, p083g7.h hVar) {
        this.f8234b = 1;
        this.f8235c = eVar;
    }
}
