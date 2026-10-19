package p193p7;

import C7.o;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.activity.j;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.i;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.util.concurrent.ConcurrentHashMap;
import p108i7.c;
import p144l6.e;
import p241t7.a;
import p311z4.h;
import p314z7.f;

/* JADX INFO: compiled from: FirebasePerformance.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f45875e = a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f45876a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p096h7.b<o> f45877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f45878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p096h7.b<h> f45879d;

    public b(e eVar, p096h7.b<o> bVar, c cVar, p096h7.b<h> bVar2, RemoteConfigManager remoteConfigManager, p218r7.a aVar, SessionManager sessionManager) {
        Bundle bundle;
        this.f45877b = bVar;
        this.f45878c = cVar;
        this.f45879d = bVar2;
        if (eVar == null) {
            new com.google.firebase.perf.util.c(new Bundle());
            return;
        }
        f fVar = f.f48930t;
        fVar.f48934e = eVar;
        eVar.a();
        p144l6.f fVar2 = eVar.f44390c;
        fVar.f48945q = fVar2.f44406g;
        fVar.f48936g = cVar;
        fVar.f48937h = bVar2;
        fVar.j.execute(new j(6, fVar));
        eVar.a();
        Context context = eVar.f44388a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            e10.getMessage();
            bundle = null;
        }
        com.google.firebase.perf.util.c cVar2 = bundle != null ? new com.google.firebase.perf.util.c(bundle) : new com.google.firebase.perf.util.c();
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        aVar.f46363b = cVar2;
        p218r7.a.f46360d.f47353b = i.a(context);
        aVar.f46364c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolG = aVar.g();
        a aVar2 = f45875e;
        if (aVar2.f47353b) {
            if (boolG != null ? boolG.booleanValue() : e.c().g()) {
                eVar.a();
                "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(v.f(fVar2.f44406g, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (aVar2.f47353b) {
                    aVar2.f47352a.getClass();
                }
            }
        }
    }
}
