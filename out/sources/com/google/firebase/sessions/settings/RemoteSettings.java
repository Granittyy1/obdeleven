package com.google.firebase.sessions.settings;

import android.os.Build;
import com.google.firebase.sessions.k;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.sync.MutexImpl;
import p293xa.r;

/* JADX INFO: compiled from: RemoteSettings.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f28743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p108i7.c f28744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f28745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SettingsCache f28746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutexImpl f28747e = kotlinx.coroutines.sync.b.a();

    public RemoteSettings(e eVar, p108i7.c cVar, com.google.firebase.sessions.b bVar, b bVar2, androidx.datastore.core.e eVar2) {
        this.f28743a = eVar;
        this.f28744b = cVar;
        this.f28745c = bVar2;
        this.f28746d = new SettingsCache(eVar2);
    }

    public final Boolean a() {
        c cVar = this.f28746d.f28760b;
        if (cVar != null) {
            return cVar.f28765a;
        }
        i.m("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b2 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:44:0x00a8, B:46:0x00b2, B:49:0x00b8, B:52:0x0147, B:36:0x0089, B:38:0x0091, B:41:0x0097), top: B:61:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:44:0x00a8, B:46:0x00b2, B:49:0x00b8, B:52:0x0147, B:36:0x0089, B:38:0x0091, B:41:0x0097), top: B:61:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0146  */
    /* JADX WARN: Code duplicated, block: B:52:0x0147 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:44:0x00a8, B:46:0x00b2, B:49:0x00b8, B:52:0x0147, B:36:0x0089, B:38:0x0091, B:41:0x0097), top: B:61:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:54:0x014b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    public final Object b(kotlin.coroutines.c<? super r> cVar) throws Throwable {
        RemoteSettings$updateSettings$1 remoteSettings$updateSettings$1;
        ?? r10;
        kotlinx.coroutines.sync.a aVar;
        RemoteSettings remoteSettings;
        String str;
        Object objF;
        if (cVar instanceof RemoteSettings$updateSettings$1) {
            remoteSettings$updateSettings$1 = (RemoteSettings$updateSettings$1) cVar;
            int i10 = remoteSettings$updateSettings$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                remoteSettings$updateSettings$1.label = i10 - Integer.MIN_VALUE;
            } else {
                remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(this, (ContinuationImpl) cVar);
            }
        } else {
            remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(this, (ContinuationImpl) cVar);
        }
        Object objA = remoteSettings$updateSettings$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        ?? r11 = remoteSettings$updateSettings$1.label;
        try {
            if (r11 == 0) {
                kotlin.b.b(objA);
                MutexImpl mutexImpl = this.f28747e;
                if (!mutexImpl.e() && !this.f28746d.b()) {
                    return r.f47939a;
                }
                remoteSettings$updateSettings$1.L$0 = this;
                remoteSettings$updateSettings$1.L$1 = mutexImpl;
                remoteSettings$updateSettings$1.label = 1;
                if (mutexImpl.f(null, remoteSettings$updateSettings$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = mutexImpl;
                remoteSettings = this;
            } else {
                if (r11 != 1) {
                    if (r11 != 2) {
                        if (r11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r10 = (kotlinx.coroutines.sync.a) remoteSettings$updateSettings$1.L$0;
                        try {
                            kotlin.b.b(objA);
                            r10 = r10;
                            r rVar = r.f47939a;
                            r10.g(null);
                            return r.f47939a;
                        } catch (Throwable th) {
                            th = th;
                            r10.g(null);
                            throw th;
                        }
                    }
                    aVar = (kotlinx.coroutines.sync.a) remoteSettings$updateSettings$1.L$1;
                    remoteSettings = (RemoteSettings) remoteSettings$updateSettings$1.L$0;
                    kotlin.b.b(objA);
                    str = ((k) objA).f28722a;
                    if (str.equals("")) {
                        r rVar2 = r.f47939a;
                        aVar.g(null);
                        return rVar2;
                    }
                    Pair pair = new Pair("X-Crashlytics-Installation-ID", str);
                    String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                    remoteSettings.getClass();
                    Pair pair2 = new Pair("X-Crashlytics-Device-Model", new Regex("/").f("", str2));
                    String INCREMENTAL = Build.VERSION.INCREMENTAL;
                    i.d(INCREMENTAL, "INCREMENTAL");
                    Pair pair3 = new Pair("X-Crashlytics-OS-Build-Version", new Regex("/").f("", INCREMENTAL));
                    String RELEASE = Build.VERSION.RELEASE;
                    i.d(RELEASE, "RELEASE");
                    Map mapS = y.s(pair, pair2, pair3, new Pair("X-Crashlytics-OS-Display-Version", new Regex("/").f("", RELEASE)), new Pair("X-Crashlytics-API-Client-Version", "1.2.3"));
                    b bVar = remoteSettings.f28745c;
                    RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings, null);
                    RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(2, null);
                    remoteSettings$updateSettings$1.L$0 = aVar;
                    remoteSettings$updateSettings$1.L$1 = null;
                    remoteSettings$updateSettings$1.label = 3;
                    objF = C2680e.f(bVar.f28763b, new RemoteSettingsFetcher$doConfigFetch$2(bVar, mapS, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, null), remoteSettings$updateSettings$1);
                    if (objF == coroutineSingletons) {
                        objF = r.f47939a;
                    }
                    if (objF == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    r10 = aVar;
                    r rVar3 = r.f47939a;
                    r10.g(null);
                    return r.f47939a;
                }
                aVar = (kotlinx.coroutines.sync.a) remoteSettings$updateSettings$1.L$1;
                remoteSettings = (RemoteSettings) remoteSettings$updateSettings$1.L$0;
                kotlin.b.b(objA);
            }
            if (!remoteSettings.f28746d.b()) {
                r rVar4 = r.f47939a;
                aVar.g(null);
                return rVar4;
            }
            k.a aVar2 = k.f28721c;
            p108i7.c cVar2 = remoteSettings.f28744b;
            remoteSettings$updateSettings$1.L$0 = remoteSettings;
            remoteSettings$updateSettings$1.L$1 = aVar;
            remoteSettings$updateSettings$1.label = 2;
            objA = aVar2.a(cVar2, remoteSettings$updateSettings$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = ((k) objA).f28722a;
            if (str.equals("")) {
                r rVar5 = r.f47939a;
                aVar.g(null);
                return rVar5;
            }
            Pair pair4 = new Pair("X-Crashlytics-Installation-ID", str);
            String str3 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
            remoteSettings.getClass();
            Pair pair5 = new Pair("X-Crashlytics-Device-Model", new Regex("/").f("", str3));
            String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
            i.d(INCREMENTAL2, "INCREMENTAL");
            Pair pair6 = new Pair("X-Crashlytics-OS-Build-Version", new Regex("/").f("", INCREMENTAL2));
            String RELEASE2 = Build.VERSION.RELEASE;
            i.d(RELEASE2, "RELEASE");
            Map mapS2 = y.s(pair4, pair5, pair6, new Pair("X-Crashlytics-OS-Display-Version", new Regex("/").f("", RELEASE2)), new Pair("X-Crashlytics-API-Client-Version", "1.2.3"));
            b bVar2 = remoteSettings.f28745c;
            RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$3 = new RemoteSettings$updateSettings$2$1(remoteSettings, null);
            RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$4 = new RemoteSettings$updateSettings$2$2(2, null);
            remoteSettings$updateSettings$1.L$0 = aVar;
            remoteSettings$updateSettings$1.L$1 = null;
            remoteSettings$updateSettings$1.label = 3;
            objF = C2680e.f(bVar2.f28763b, new RemoteSettingsFetcher$doConfigFetch$2(bVar2, mapS2, remoteSettings$updateSettings$2$3, remoteSettings$updateSettings$2$4, null), remoteSettings$updateSettings$1);
            if (objF == coroutineSingletons) {
                objF = r.f47939a;
            }
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            r10 = aVar;
            r rVar6 = r.f47939a;
            r10.g(null);
            return r.f47939a;
        } catch (Throwable th2) {
            th = th2;
            r10 = r11;
        }
    }
}
