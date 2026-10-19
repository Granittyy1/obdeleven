package com.google.firebase.sessions.settings;

import Ia.l;
import Y4.f;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.MutablePreferences;
import com.google.firebase.sessions.m;
import com.google.firebase.sessions.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.i;
import p144l6.e;
import p293xa.r;

/* JADX INFO: compiled from: SessionsSettings.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionsSettings {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28748c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.datastore.preferences.b f28749d = androidx.datastore.preferences.a.a(m.f28729b, new O0.b(new l<CorruptionException, androidx.datastore.preferences.core.c>() { // from class: com.google.firebase.sessions.settings.SessionsSettings$Companion$dataStore$2
        @Override // Ia.l
        public final androidx.datastore.preferences.core.c invoke(CorruptionException corruptionException) throws Throwable {
            CorruptionException ex = corruptionException;
            i.e(ex, "ex");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                i.d(Process.myProcessName(), "myProcessName()");
            } else if (i10 < 28 || Application.getProcessName() == null) {
                f.a();
            }
            return new MutablePreferences(1, true);
        }
    }));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.firebase.sessions.settings.a f28750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteSettings f28751b;

    /* JADX INFO: compiled from: SessionsSettings.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Oa.l<Object>[] f28753a;

        static {
            PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(a.class);
            kotlin.jvm.internal.l.f43062a.getClass();
            f28753a = new Oa.l[]{propertyReference2Impl};
        }
    }

    public SessionsSettings(e eVar, kotlin.coroutines.e eVar2, kotlin.coroutines.e eVar3, p108i7.c cVar) {
        eVar.a();
        Context context = eVar.f44388a;
        i.d(context, "firebaseApp.applicationContext");
        q.f28736a.getClass();
        com.google.firebase.sessions.b bVarA = q.a(eVar);
        com.google.firebase.sessions.settings.a aVar = new com.google.firebase.sessions.settings.a(context);
        b bVar = new b(bVarA, eVar2);
        f28748c.getClass();
        RemoteSettings remoteSettings = new RemoteSettings(eVar3, cVar, bVarA, bVar, (androidx.datastore.core.e) f28749d.a(context, a.f28753a[0]));
        this.f28750a = aVar;
        this.f28751b = remoteSettings;
    }

    public final double a() {
        Bundle bundle = (Bundle) this.f28750a.f28761a;
        Double dValueOf = bundle.containsKey("firebase_sessions_sampling_rate") ? Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate")) : null;
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        c cVar = this.f28751b.f28746d.f28760b;
        if (cVar == null) {
            i.m("sessionConfigs");
            throw null;
        }
        Double d10 = cVar.f28766b;
        if (d10 != null) {
            double dDoubleValue2 = d10.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        SessionsSettings$updateSettings$1 sessionsSettings$updateSettings$1;
        SessionsSettings sessionsSettings;
        if (continuationImpl instanceof SessionsSettings$updateSettings$1) {
            sessionsSettings$updateSettings$1 = (SessionsSettings$updateSettings$1) continuationImpl;
            int i10 = sessionsSettings$updateSettings$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sessionsSettings$updateSettings$1.label = i10 - Integer.MIN_VALUE;
            } else {
                sessionsSettings$updateSettings$1 = new SessionsSettings$updateSettings$1(this, continuationImpl);
            }
        } else {
            sessionsSettings$updateSettings$1 = new SessionsSettings$updateSettings$1(this, continuationImpl);
        }
        Object obj = sessionsSettings$updateSettings$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = sessionsSettings$updateSettings$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                sessionsSettings = (SessionsSettings) sessionsSettings$updateSettings$1.L$0;
                kotlin.b.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        sessionsSettings$updateSettings$1.L$0 = this;
        sessionsSettings$updateSettings$1.label = 1;
        this.f28750a.getClass();
        if (r.f47939a == coroutineSingletons) {
            return coroutineSingletons;
        }
        sessionsSettings = this;
        RemoteSettings remoteSettings = sessionsSettings.f28751b;
        sessionsSettings$updateSettings$1.L$0 = null;
        sessionsSettings$updateSettings$1.label = 2;
        if (remoteSettings.b(sessionsSettings$updateSettings$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return r.f47939a;
    }
}
