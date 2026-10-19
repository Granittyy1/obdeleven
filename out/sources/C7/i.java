package C7;

import D7.p;
import D7.q;
import android.content.Context;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p191p5.InterfaceC2755a;

/* JADX INFO: compiled from: FirebaseRemoteConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p157m6.b f2434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f2435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D7.e f2436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D7.e f2437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D7.e f2438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConfigFetchHandler f2439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D7.k f2440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.c f2441i;
    public final p108i7.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D7.l f2442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E7.e f2443l;

    public i(Context context, p108i7.c cVar, p157m6.b bVar, Executor executor, D7.e eVar, D7.e eVar2, D7.e eVar3, ConfigFetchHandler configFetchHandler, D7.k kVar, com.google.firebase.remoteconfig.internal.c cVar2, D7.l lVar, E7.e eVar4) {
        this.f2433a = context;
        this.j = cVar;
        this.f2434b = bVar;
        this.f2435c = executor;
        this.f2436d = eVar;
        this.f2437e = eVar2;
        this.f2438f = eVar3;
        this.f2439g = configFetchHandler;
        this.f2440h = kVar;
        this.f2441i = cVar2;
        this.f2442k = lVar;
        this.f2443l = eVar4;
    }

    public static ArrayList d(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final p191p5.g<Boolean> a() {
        final ConfigFetchHandler configFetchHandler = this.f2439g;
        final long j = configFetchHandler.f28558g.f28600a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f28551i);
        final HashMap map = new HashMap(configFetchHandler.f28559h);
        map.put("X-Firebase-RC-Fetch-Type", ConfigFetchHandler.FetchType.BASE.a() + "/1");
        return configFetchHandler.f28556e.b().i(configFetchHandler.f28554c, new InterfaceC2755a() { // from class: D7.f
            @Override // p191p5.InterfaceC2755a
            public final Object i(p191p5.g gVar) {
                return configFetchHandler.b(gVar, j, map);
            }
        }).p(FirebaseExecutors.a(), new g()).p(this.f2435c, new d(this));
    }

    public final HashMap b() {
        q qVar;
        D7.k kVar = this.f2440h;
        HashSet<String> hashSet = new HashSet();
        D7.e eVar = kVar.f2858c;
        hashSet.addAll(D7.k.b(eVar));
        D7.e eVar2 = kVar.f2859d;
        hashSet.addAll(D7.k.b(eVar2));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            String strC = D7.k.c(eVar, str);
            if (strC != null) {
                kVar.a(str, eVar.c());
                qVar = new q(strC, 2);
            } else {
                String strC2 = D7.k.c(eVar2, str);
                qVar = strC2 != null ? new q(strC2, 1) : new q("", 0);
            }
            map.put(str, qVar);
        }
        return map;
    }

    public final p c() {
        p pVar;
        com.google.firebase.remoteconfig.internal.c cVar = this.f2441i;
        synchronized (cVar.f28601b) {
            try {
                cVar.f28600a.getLong("last_fetch_time_in_millis", -1L);
                int i10 = cVar.f28600a.getInt("last_fetch_status", 0);
                j.a aVar = new j.a();
                long j = cVar.f28600a.getLong("fetch_timeout_in_seconds", 60L);
                if (j < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
                }
                aVar.f2446a = j;
                aVar.a(cVar.f28600a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f28551i));
                pVar = new p(i10);
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }
}
