package com.google.firebase.heartbeatinfo;

import B7.h;
import Q6.e;
import Q6.f;
import Q6.g;
import android.content.Context;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p096h7.b;
import p191p5.B;
import p191p5.j;
import p271w0.k;

/* JADX INFO: compiled from: DefaultHeartBeatController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements g, HeartBeatInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f28126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<h> f28128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<f> f28129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f28130e;

    public a() {
        throw null;
    }

    public a(Context context, String str, Set<f> set, b<h> bVar, Executor executor) {
        this.f28126a = new e(context, str);
        this.f28129d = set;
        this.f28130e = executor;
        this.f28128c = bVar;
        this.f28127b = context;
    }

    @Override // Q6.g
    public final B a() {
        return !k.a(this.f28127b) ? j.e("") : j.c(new Callable() { // from class: Q6.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                com.google.firebase.heartbeatinfo.a aVar = this.f5109b;
                synchronized (aVar) {
                    try {
                        h hVar = (h) aVar.f28126a.get();
                        ArrayList arrayListC = hVar.c();
                        hVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < arrayListC.size(); i10++) {
                            i iVar = (i) arrayListC.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", iVar.b());
                            jSONObject.put("dates", new JSONArray((Collection) iVar.a()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            }
        }, this.f28130e);
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public final synchronized HeartBeatInfo.HeartBeat b() {
        boolean zG;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Q6.h hVar = (Q6.h) this.f28126a.get();
        synchronized (hVar) {
            zG = hVar.g(jCurrentTimeMillis);
        }
        if (!zG) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        synchronized (hVar) {
            String strD = hVar.d(System.currentTimeMillis());
            hVar.f5113a.edit().putString("last-used-date", strD).commit();
            hVar.f(strD);
        }
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    public final void c() {
        if (this.f28129d.size() <= 0) {
            j.e(null);
        } else if (k.a(this.f28127b)) {
            j.c(new Q6.b(0, this), this.f28130e);
        } else {
            j.e(null);
        }
    }
}
