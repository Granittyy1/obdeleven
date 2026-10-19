package com.google.firebase.messaging;

import R4.C0756c;
import R4.C0758e;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p033c7.b0;

/* JADX INFO: compiled from: GmsRpc.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p144l6.e f28418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f28419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0756c f28420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p096h7.b<B7.h> f28421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p096h7.b<HeartBeatInfo> f28422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p108i7.c f28423f;

    public w(p144l6.e eVar, z zVar, p096h7.b<B7.h> bVar, p096h7.b<HeartBeatInfo> bVar2, p108i7.c cVar) {
        eVar.a();
        C0756c c0756c = new C0756c(eVar.f44388a);
        this.f28418a = eVar;
        this.f28419b = zVar;
        this.f28420c = c0756c;
        this.f28421d = bVar;
        this.f28422e = bVar2;
        this.f28423f = cVar;
    }

    public final p191p5.g<String> a(p191p5.g<Bundle> gVar) {
        return gVar.g(new p188p2.b(), new b0(this));
    }

    public final void b(Bundle bundle, String str, String str2) throws ExecutionException, InterruptedException {
        int i10;
        String str3;
        String strEncodeToString;
        HeartBeatInfo.HeartBeat heartBeatB;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        p144l6.e eVar = this.f28418a;
        eVar.a();
        bundle.putString("gmp_app_id", eVar.f44390c.f44401b);
        z zVar = this.f28419b;
        synchronized (zVar) {
            try {
                if (zVar.f28430d == 0) {
                    try {
                        packageInfo = zVar.f28427a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e10) {
                        e10.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        zVar.f28430d = packageInfo.versionCode;
                    }
                }
                i10 = zVar.f28430d;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f28419b.a());
        z zVar2 = this.f28419b;
        synchronized (zVar2) {
            try {
                if (zVar2.f28429c == null) {
                    zVar2.d();
                }
                str3 = zVar2.f28429c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        p144l6.e eVar2 = this.f28418a;
        eVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(eVar2.f44389b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strA = ((p108i7.f) p191p5.j.a(this.f28423f.a())).a();
            if (!TextUtils.isEmpty(strA)) {
                bundle.putString("Goog-Firebase-Installations-Auth", strA);
            }
        } catch (InterruptedException | ExecutionException e11) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e11);
        }
        bundle.putString("appid", (String) p191p5.j.a(this.f28423f.getId()));
        bundle.putString("cliv", "fcm-24.1.1");
        HeartBeatInfo heartBeatInfo = this.f28422e.get();
        B7.h hVar = this.f28421d.get();
        if (heartBeatInfo == null || hVar == null || (heartBeatB = heartBeatInfo.b()) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatB.a()));
        bundle.putString("Firebase-Client", hVar.a());
    }

    public final p191p5.g c(Bundle bundle, String str, String str2) {
        int i10;
        try {
            b(bundle, str, str2);
            C0756c c0756c = this.f28420c;
            R4.B b10 = c0756c.f5272c;
            int iA = b10.a();
            R4.D d10 = R4.D.f5262b;
            if (iA < 12000000) {
                return b10.b() != 0 ? c0756c.a(bundle).i(d10, new R4.E(c0756c, bundle)) : p191p5.j.d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            R4.A a10 = R4.A.a(c0756c.f5271b);
            synchronized (a10) {
                i10 = a10.f5257d;
                a10.f5257d = i10 + 1;
            }
            return a10.b(new R4.z(i10, 1, bundle)).g(d10, C0758e.f5277b);
        } catch (InterruptedException | ExecutionException e10) {
            return p191p5.j.d(e10);
        }
    }
}
