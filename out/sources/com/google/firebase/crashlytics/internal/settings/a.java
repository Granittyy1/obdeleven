package com.google.firebase.crashlytics.internal.settings;

import F6.b;
import F6.d;
import F6.e;
import F6.f;
import F6.h;
import F6.i;
import H3.c;
import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p191p5.B;
import p191p5.j;
import p302y6.I;
import p302y6.Q;

/* JADX INFO: compiled from: SettingsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f28103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f28104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f28105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F6.a f28106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F6.c f28107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final I f28108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference<d> f28109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference<p191p5.h<d>> f28110i;

    public a(Context context, i iVar, c cVar, f fVar, F6.a aVar, F6.c cVar2, I i10) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f28109h = atomicReference;
        this.f28110i = new AtomicReference<>(new p191p5.h());
        this.f28102a = context;
        this.f28103b = iVar;
        this.f28105d = cVar;
        this.f28104c = fVar;
        this.f28106e = aVar;
        this.f28107f = cVar2;
        this.f28108g = i10;
        atomicReference.set(b.b(cVar));
    }

    public final d a(SettingsCacheBehavior settingsCacheBehavior) throws Throwable {
        d dVar = null;
        try {
            if (!SettingsCacheBehavior.f28099c.equals(settingsCacheBehavior)) {
                JSONObject jSONObjectF = this.f28106e.f();
                if (jSONObjectF != null) {
                    d dVarA = this.f28104c.a(jSONObjectF);
                    jSONObjectF.toString();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    this.f28105d.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (SettingsCacheBehavior.f28100d.equals(settingsCacheBehavior) || dVarA.f3263c >= jCurrentTimeMillis) {
                        try {
                            Log.isLoggable("FirebaseCrashlytics", 2);
                            dVar = dVarA;
                        } catch (Exception e10) {
                            e = e10;
                            dVar = dVarA;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                        }
                    } else {
                        Log.isLoggable("FirebaseCrashlytics", 2);
                    }
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return dVar;
    }

    public final d b() {
        return this.f28109h.get();
    }

    public final B c(ExecutorService executorService) throws Throwable {
        B b10;
        Object objP;
        d dVarA;
        SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.f28098b;
        boolean zEquals = this.f28102a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(this.f28103b.f3278f);
        AtomicReference<p191p5.h<d>> atomicReference = this.f28110i;
        AtomicReference<d> atomicReference2 = this.f28109h;
        if (!zEquals || (dVarA = a(settingsCacheBehavior)) == null) {
            d dVarA2 = a(SettingsCacheBehavior.f28100d);
            if (dVarA2 != null) {
                atomicReference2.set(dVarA2);
                atomicReference.get().d(dVarA2);
            }
            I i10 = this.f28108g;
            B b11 = i10.f48329e.f45811a;
            synchronized (i10.f48326b) {
                b10 = i10.f48327c.f45811a;
            }
            ExecutorService executorService2 = Q.f48352a;
            p191p5.h hVar = new p191p5.h();
            U6.f fVar = new U6.f(hVar);
            b11.g(executorService, fVar);
            b10.g(executorService, fVar);
            objP = hVar.f45811a.p(executorService, new e(this));
        } else {
            atomicReference2.set(dVarA);
            atomicReference.get().d(dVarA);
            objP = j.e(null);
        }
        return (B) objP;
    }
}
