package com.google.firebase.remoteconfig.internal;

import D7.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.compose.foundation.C0936h;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p144l6.e;
import p144l6.f;
import p191p5.B;
import p191p5.InterfaceC2755a;
import p191p5.g;
import p191p5.j;

/* JADX INFO: compiled from: ConfigRealtimeHttpClient.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f28608p = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f28609q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f28610a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28612c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f28615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConfigFetchHandler f28616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f28617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p108i7.c f28618i;
    public final D7.e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f28619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f28620l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f28623o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28611b = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Random f28621m = new Random();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Y4.c f28622n = Y4.c.f7603a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28613d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28614e = false;

    /* JADX INFO: compiled from: ConfigRealtimeHttpClient.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            final d dVar = d.this;
            if (dVar.a()) {
                c.b bVarB = dVar.f28623o.b();
                dVar.f28622n.getClass();
                if (new Date(System.currentTimeMillis()).before(bVarB.f28607b)) {
                    dVar.h();
                    return;
                }
                p108i7.c cVar = dVar.f28618i;
                final B bA = cVar.a();
                final B id = cVar.getId();
                g<List<g<?>>> gVarG = j.g(bA, id);
                InterfaceC2755a<List<g<?>>, g<TContinuationResult>> interfaceC2755a = new InterfaceC2755a() { // from class: D7.n
                    @Override // p191p5.InterfaceC2755a
                    public final Object i(p191p5.g gVar) {
                        URL url;
                        com.google.firebase.remoteconfig.internal.d dVar2 = dVar;
                        dVar2.getClass();
                        p191p5.g gVar2 = bA;
                        if (!gVar2.o()) {
                            return p191p5.j.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", gVar2.j()));
                        }
                        p191p5.g gVar3 = id;
                        try {
                            if (!gVar3.o()) {
                                return p191p5.j.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", gVar3.j()));
                            }
                            try {
                                url = new URL(dVar2.c(dVar2.f28620l));
                            } catch (MalformedURLException unused) {
                                Log.e("FirebaseRemoteConfig", "URL is malformed");
                                url = null;
                            }
                            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                            dVar2.i(httpURLConnection, (String) gVar3.k(), ((p108i7.f) gVar2.k()).a());
                            return p191p5.j.e(httpURLConnection);
                        } catch (IOException e10) {
                            return p191p5.j.d(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e10));
                        }
                    }
                };
                ScheduledExecutorService scheduledExecutorService = dVar.f28615f;
                g<TContinuationResult> gVarI = gVarG.i(scheduledExecutorService, interfaceC2755a);
                j.g(gVarI).g(scheduledExecutorService, new m(dVar, gVarI));
            }
        }
    }

    public d(e eVar, p108i7.c cVar, ConfigFetchHandler configFetchHandler, D7.e eVar2, Context context, String str, LinkedHashSet linkedHashSet, c cVar2, ScheduledExecutorService scheduledExecutorService) {
        this.f28610a = linkedHashSet;
        this.f28615f = scheduledExecutorService;
        this.f28612c = Math.max(8 - cVar2.b().f28606a, 1);
        this.f28617h = eVar;
        this.f28616g = configFetchHandler;
        this.f28618i = cVar;
        this.j = eVar2;
        this.f28619k = context;
        this.f28620l = str;
        this.f28623o = cVar2;
    }

    public static void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        return (this.f28610a.isEmpty() || this.f28611b || this.f28613d || this.f28614e) ? false : true;
    }

    public final String c(String str) {
        e eVar = this.f28617h;
        eVar.a();
        Matcher matcher = f28609q.matcher(eVar.f44390c.f44401b);
        return C0936h.d("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i10 = this.f28612c;
                if (i10 > 0) {
                    this.f28612c = i10 - 1;
                    this.f28615f.schedule(new a(), j, TimeUnit.MILLISECONDS);
                } else if (!this.f28614e) {
                    g(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f28610a.iterator();
        while (it.hasNext()) {
            ((C7.c) it.next()).a(firebaseRemoteConfigException);
        }
    }

    public final synchronized void h() {
        this.f28622n.getClass();
        e(Math.max(0L, this.f28623o.b().f28607b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final void i(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        String strA;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        e eVar = this.f28617h;
        eVar.a();
        f fVar = eVar.f44390c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", fVar.f44400a);
        Context context = this.f28619k;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrA = Y4.a.a(context, context.getPackageName());
            if (bArrA == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strA = null;
            } else {
                strA = Y4.d.a(bArrA);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strA);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        HashMap map = new HashMap();
        eVar.a();
        Matcher matcher = f28609q.matcher(fVar.f44401b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.f28620l);
        map.put("lastKnownVersionNumber", Long.toString(this.f28616g.f28558g.f28600a.getLong("last_template_version", 0L)));
        eVar.a();
        map.put("appId", fVar.f44401b);
        map.put("sdkVersion", "21.6.3");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final synchronized com.google.firebase.remoteconfig.internal.a j(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.a(httpURLConnection, this.f28616g, this.j, this.f28610a, new b(), this.f28615f);
    }

    public final void k(Date date) {
        c cVar = this.f28623o;
        int i10 = cVar.b().f28606a + 1;
        long millis = TimeUnit.MINUTES.toMillis(f28608p[(i10 < 8 ? i10 : 8) - 1]);
        cVar.d(i10, new Date(date.getTime() + (millis / 2) + ((long) this.f28621m.nextInt((int) millis))));
    }

    /* JADX INFO: compiled from: ConfigRealtimeHttpClient.java */
    public class b implements C7.c {
        public b() {
        }

        @Override // C7.c
        public final void a(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            d dVar = d.this;
            synchronized (dVar) {
                dVar.f28613d = true;
            }
            d.this.g(firebaseRemoteConfigException);
        }

        @Override // C7.c
        public final void b(C7.a aVar) {
        }
    }
}
