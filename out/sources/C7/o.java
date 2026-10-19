package C7;

import C4.v;
import D7.r;
import G7.f;
import T4.ComponentCallbacks2C0769b;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p191p5.g;

/* JADX INFO: compiled from: RemoteConfigComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements F7.a {
    public static final Random j = new Random();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f2451k = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f2454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p144l6.e f2455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p108i7.c f2456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p157m6.b f2457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p096h7.b<p192p6.a> f2458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f2460i;

    /* JADX INFO: compiled from: RemoteConfigComponent.java */
    public static class a implements ComponentCallbacks2C0769b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AtomicReference<a> f2461a = new AtomicReference<>();

        @Override // T4.ComponentCallbacks2C0769b.a
        public final void a(boolean z10) {
            Random random = o.j;
            synchronized (o.class) {
                Iterator it = o.f2451k.values().iterator();
                while (it.hasNext()) {
                    D7.l lVar = ((i) it.next()).f2442k;
                    synchronized (lVar) {
                        ((com.google.firebase.remoteconfig.internal.d) lVar.f2861b).f28614e = z10;
                        if (!z10) {
                            lVar.a();
                        }
                    }
                }
            }
        }
    }

    public o() {
        throw null;
    }

    public o(Context context, @p217r6.b ScheduledExecutorService scheduledExecutorService, p144l6.e eVar, p108i7.c cVar, p157m6.b bVar, p096h7.b<p192p6.a> bVar2) {
        this.f2452a = new HashMap();
        this.f2460i = new HashMap();
        this.f2453b = context;
        this.f2454c = scheduledExecutorService;
        this.f2455d = eVar;
        this.f2456e = cVar;
        this.f2457f = bVar;
        this.f2458g = bVar2;
        eVar.a();
        this.f2459h = eVar.f44390c.f44401b;
        AtomicReference<a> atomicReference = a.f2461a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference<a> atomicReference2 = a.f2461a;
        if (atomicReference2.get() == null) {
            a aVar = new a();
            while (!atomicReference2.compareAndSet(null, aVar)) {
                if (atomicReference2.get() != null) {
                }
            }
            ComponentCallbacks2C0769b.b(application);
            ComponentCallbacks2C0769b.f5916f.a(aVar);
        }
        p191p5.j.c(new m(0, this), scheduledExecutorService);
    }

    @Override // F7.a
    public final void a(final G7.f fVar) {
        final E7.e eVar = b("firebase").f2443l;
        eVar.f3125d.add(fVar);
        final p191p5.g<com.google.firebase.remoteconfig.internal.b> gVarB = eVar.f3122a.b();
        gVarB.f(eVar.f3124c, new p191p5.e() { // from class: E7.b
            @Override // p191p5.e
            public final void onSuccess(Object obj) {
                g gVar = gVarB;
                f fVar2 = fVar;
                e eVar2 = eVar;
                try {
                    com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) gVar.k();
                    if (bVar != null) {
                        eVar2.f3124c.execute(new d(fVar2, 0, eVar2.f3123b.a(bVar)));
                    }
                } catch (FirebaseRemoteConfigException unused) {
                }
            }
        });
    }

    public final synchronized i b(String str) {
        D7.e eVarD;
        D7.e eVarD2;
        D7.e eVarD3;
        com.google.firebase.remoteconfig.internal.c cVar;
        D7.k kVar;
        E7.e eVar;
        ScheduledExecutorService scheduledExecutorService;
        try {
            eVarD = d(str, "fetch");
            eVarD2 = d(str, "activate");
            eVarD3 = d(str, "defaults");
            cVar = new com.google.firebase.remoteconfig.internal.c(this.f2453b.getSharedPreferences("frc_" + this.f2459h + "_" + str + "_settings", 0));
            kVar = new D7.k(this.f2454c, eVarD2, eVarD3);
            p144l6.e eVar2 = this.f2455d;
            p096h7.b<p192p6.a> bVar = this.f2458g;
            eVar2.a();
            final r rVar = (eVar2.f44389b.equals("[DEFAULT]") && str.equals("firebase")) ? new r(bVar) : null;
            if (rVar != null) {
                Y4.b bVar2 = new Y4.b() { // from class: C7.l
                    @Override // Y4.b
                    public final void b(Object obj, Object obj2) {
                        JSONObject jSONObjectOptJSONObject;
                        r rVar2 = rVar;
                        String str2 = (String) obj;
                        com.google.firebase.remoteconfig.internal.b bVar3 = (com.google.firebase.remoteconfig.internal.b) obj2;
                        p192p6.a aVar = (p192p6.a) ((p096h7.b) rVar2.f2874b).get();
                        if (aVar == null) {
                            return;
                        }
                        JSONObject jSONObject = bVar3.f28589e;
                        if (jSONObject.length() < 1) {
                            return;
                        }
                        JSONObject jSONObject2 = bVar3.f28586b;
                        if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str2)) != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                            if (strOptString.isEmpty()) {
                                return;
                            }
                            synchronized (((Map) rVar2.f2875c)) {
                                try {
                                    if (!strOptString.equals(((Map) rVar2.f2875c).get(str2))) {
                                        ((Map) rVar2.f2875c).put(str2, strOptString);
                                        Bundle bundleD = v.d("arm_key", str2);
                                        bundleD.putString("arm_value", jSONObject2.optString(str2));
                                        bundleD.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                        bundleD.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                        bundleD.putString("group", jSONObjectOptJSONObject.optString("group"));
                                        aVar.c(bundleD, "fp", "personalization_assignment");
                                        Bundle bundle = new Bundle();
                                        bundle.putString("_fpid", strOptString);
                                        aVar.c(bundle, "fp", "_fpc");
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                };
                synchronized (kVar.f2856a) {
                    kVar.f2856a.add(bVar2);
                }
            }
            E7.a aVar = new E7.a();
            aVar.f3111a = eVarD2;
            aVar.f3112b = eVarD3;
            eVar = new E7.e();
            eVar.f3125d = Collections.newSetFromMap(new ConcurrentHashMap());
            eVar.f3122a = eVarD2;
            eVar.f3123b = aVar;
            scheduledExecutorService = this.f2454c;
            eVar.f3124c = scheduledExecutorService;
        } catch (Throwable th) {
            throw th;
        }
        return c(this.f2455d, str, this.f2456e, this.f2457f, scheduledExecutorService, eVarD, eVarD2, eVarD3, e(str, eVarD, cVar), kVar, cVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized i c(p144l6.e eVar, String str, p108i7.c cVar, p157m6.b bVar, Executor executor, D7.e eVar2, D7.e eVar3, D7.e eVar4, ConfigFetchHandler configFetchHandler, D7.k kVar, com.google.firebase.remoteconfig.internal.c cVar2, E7.e eVar5) {
        p157m6.b bVar2;
        Context context;
        if (!this.f2452a.containsKey(str)) {
            Context context2 = this.f2453b;
            if (str.equals("firebase")) {
                eVar.a();
                if (eVar.f44389b.equals("[DEFAULT]")) {
                    bVar2 = bVar;
                }
                context = this.f2453b;
                synchronized (this) {
                    i iVar = new i(context2, cVar, bVar2, executor, eVar2, eVar3, eVar4, configFetchHandler, kVar, cVar2, new D7.l(eVar, cVar, configFetchHandler, eVar3, context, str, cVar2, this.f2454c), eVar5);
                    eVar3.b();
                    eVar4.b();
                    eVar2.b();
                    this.f2452a.put(str, iVar);
                    f2451k.put(str, iVar);
                }
            }
            bVar2 = null;
            context = this.f2453b;
            synchronized (this) {
                i iVar2 = new i(context2, cVar, bVar2, executor, eVar2, eVar3, eVar4, configFetchHandler, kVar, cVar2, new D7.l(eVar, cVar, configFetchHandler, eVar3, context, str, cVar2, this.f2454c), eVar5);
                eVar3.b();
                eVar4.b();
                eVar2.b();
                this.f2452a.put(str, iVar2);
                f2451k.put(str, iVar2);
            }
        }
        return (i) this.f2452a.get(str);
    }

    public final D7.e d(String str, String str2) {
        D7.o oVar;
        D7.e eVar;
        String strA = Q8.d.a(B6.a.c("frc_", this.f2459h, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f2454c;
        Context context = this.f2453b;
        HashMap map = D7.o.f2868c;
        synchronized (D7.o.class) {
            try {
                HashMap map2 = D7.o.f2868c;
                if (!map2.containsKey(strA)) {
                    map2.put(strA, new D7.o(context, strA));
                }
                oVar = (D7.o) map2.get(strA);
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map3 = D7.e.f2832d;
        synchronized (D7.e.class) {
            try {
                String str3 = oVar.f2870b;
                HashMap map4 = D7.e.f2832d;
                if (!map4.containsKey(str3)) {
                    map4.put(str3, new D7.e(scheduledExecutorService, oVar));
                }
                eVar = (D7.e) map4.get(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public final synchronized ConfigFetchHandler e(String str, D7.e eVar, com.google.firebase.remoteconfig.internal.c cVar) {
        p108i7.c cVar2;
        p096h7.b nVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str2;
        p144l6.e eVar2;
        try {
            cVar2 = this.f2456e;
            p144l6.e eVar3 = this.f2455d;
            eVar3.a();
            nVar = eVar3.f44389b.equals("[DEFAULT]") ? this.f2458g : new n();
            scheduledExecutorService = this.f2454c;
            random = j;
            p144l6.e eVar4 = this.f2455d;
            eVar4.a();
            str2 = eVar4.f44390c.f44400a;
            eVar2 = this.f2455d;
            eVar2.a();
        } catch (Throwable th) {
            throw th;
        }
        return new ConfigFetchHandler(cVar2, nVar, scheduledExecutorService, random, eVar, new ConfigFetchHttpClient(this.f2453b, eVar2.f44390c.f44401b, str2, str, cVar.f28600a.getLong("fetch_timeout_in_seconds", 60L), cVar.f28600a.getLong("fetch_timeout_in_seconds", 60L)), cVar, this.f2460i);
    }
}
