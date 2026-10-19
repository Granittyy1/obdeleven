package com.google.firebase.remoteconfig.internal;

import D7.e;
import android.util.Log;
import androidx.compose.ui.text.font.s;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.R;
import org.json.JSONException;
import org.json.JSONObject;
import p191p5.InterfaceC2755a;
import p191p5.g;
import p191p5.j;

/* JADX INFO: compiled from: ConfigAutoFetch.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f28574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f28575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConfigFetchHandler f28576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f28577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d.b f28578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f28579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Random f28580g = new Random();

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConfigAutoFetch.java */
    public class RunnableC0284a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f28581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f28582c;

        public RunnableC0284a(int i10, long j) {
            this.f28581b = i10;
            this.f28582c = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final a aVar = a.this;
            int i10 = this.f28581b;
            final long j = this.f28582c;
            synchronized (aVar) {
                final int i11 = i10 - 1;
                final g gVarC = aVar.f28576c.c(3 - i11);
                final g<b> gVarB = aVar.f28577d.b();
                j.g(gVarC, gVarB).i(aVar.f28579f, new InterfaceC2755a() { // from class: D7.a
                    @Override // p191p5.InterfaceC2755a
                    public final Object i(p191p5.g gVar) throws JSONException {
                        Boolean boolValueOf;
                        JSONObject jSONObject;
                        com.google.firebase.remoteconfig.internal.a aVar2 = aVar;
                        p191p5.g gVar2 = gVarC;
                        p191p5.g gVar3 = gVarB;
                        long j10 = j;
                        int i12 = i11;
                        aVar2.getClass();
                        if (!gVar2.o()) {
                            return p191p5.j.d(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", gVar2.j()));
                        }
                        if (!gVar3.o()) {
                            return p191p5.j.d(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", gVar3.j()));
                        }
                        ConfigFetchHandler.a aVar3 = (ConfigFetchHandler.a) gVar2.k();
                        com.google.firebase.remoteconfig.internal.b bVarA = (com.google.firebase.remoteconfig.internal.b) gVar3.k();
                        com.google.firebase.remoteconfig.internal.b bVar = aVar3.f28564b;
                        if (bVar != null) {
                            boolValueOf = Boolean.valueOf(bVar.f28590f >= j10);
                        } else {
                            boolValueOf = Boolean.valueOf(aVar3.f28563a == 1);
                        }
                        if (!boolValueOf.booleanValue()) {
                            aVar2.a(i12, j10);
                            return p191p5.j.e(null);
                        }
                        if (aVar3.f28564b == null) {
                            return p191p5.j.e(null);
                        }
                        if (bVarA == null) {
                            bVarA = com.google.firebase.remoteconfig.internal.b.c().a();
                        }
                        com.google.firebase.remoteconfig.internal.b bVar2 = aVar3.f28564b;
                        com.google.firebase.remoteconfig.internal.b bVarA2 = com.google.firebase.remoteconfig.internal.b.a(new JSONObject(bVar2.f28585a.toString()));
                        HashMap mapB = bVarA.b();
                        HashMap mapB2 = bVar2.b();
                        HashSet hashSet = new HashSet();
                        JSONObject jSONObject2 = bVarA.f28586b;
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (true) {
                            boolean zHasNext = itKeys.hasNext();
                            jSONObject = bVarA2.f28586b;
                            if (!zHasNext) {
                                break;
                            }
                            String next = itKeys.next();
                            JSONObject jSONObject3 = bVar2.f28586b;
                            if (!jSONObject3.has(next)) {
                                hashSet.add(next);
                            } else if (jSONObject2.get(next).equals(jSONObject3.get(next))) {
                                JSONObject jSONObject4 = bVarA.f28589e;
                                boolean zHas = jSONObject4.has(next);
                                JSONObject jSONObject5 = bVar2.f28589e;
                                if ((zHas && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                    hashSet.add(next);
                                } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                    hashSet.add(next);
                                } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                                    hashSet.add(next);
                                } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
                                    hashSet.add(next);
                                } else {
                                    jSONObject.remove(next);
                                }
                            } else {
                                hashSet.add(next);
                            }
                        }
                        Iterator<String> itKeys2 = jSONObject.keys();
                        while (itKeys2.hasNext()) {
                            hashSet.add(itKeys2.next());
                        }
                        if (hashSet.isEmpty()) {
                            return p191p5.j.e(null);
                        }
                        C7.a aVar4 = new C7.a(hashSet);
                        synchronized (aVar2) {
                            Iterator it = aVar2.f28574a.iterator();
                            while (it.hasNext()) {
                                ((C7.c) it.next()).b(aVar4);
                            }
                        }
                        return p191p5.j.e(null);
                    }
                });
            }
        }
    }

    public a(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, e eVar, LinkedHashSet linkedHashSet, d.b bVar, ScheduledExecutorService scheduledExecutorService) {
        this.f28575b = httpURLConnection;
        this.f28576c = configFetchHandler;
        this.f28577d = eVar;
        this.f28574a = linkedHashSet;
        this.f28578e = bVar;
        this.f28579f = scheduledExecutorService;
    }

    public final void a(int i10, long j) {
        if (i10 == 0) {
            d(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.f28579f.schedule(new RunnableC0284a(i10, j), this.f28580g.nextInt(4), TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strB = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strB = s.b(strB, line);
            if (line.contains("}")) {
                int iIndexOf = strB.indexOf(R.styleable.AppCompatTheme_windowFixedWidthMinor);
                int iLastIndexOf = strB.lastIndexOf(R.styleable.AppCompatTheme_windowMinWidthMinor);
                String strSubstring = "";
                if (iIndexOf >= 0 && iLastIndexOf >= 0 && iIndexOf < iLastIndexOf) {
                    strSubstring = strB.substring(iIndexOf, iLastIndexOf + 1);
                }
                strB = strSubstring;
                if (strB.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strB);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            this.f28578e.a(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = this.f28574a.isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j = this.f28576c.f28558g.f28600a.getLong("last_template_version", 0L);
                            long j10 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j10 > j) {
                                a(3, j10);
                            }
                        }
                        strB = "";
                    } catch (JSONException e10) {
                        d(new FirebaseRemoteConfigClientException(e10.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e10);
                    }
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.f28575b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            b(inputStream);
            inputStream.close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public final synchronized void d(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f28574a.iterator();
        while (it.hasNext()) {
            ((C7.c) it.next()).a(firebaseRemoteConfigException);
        }
    }
}
