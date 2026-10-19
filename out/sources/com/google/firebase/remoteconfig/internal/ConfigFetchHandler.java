package com.google.firebase.remoteconfig.internal;

import B7.f;
import D7.e;
import D7.h;
import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p191p5.B;
import p191p5.InterfaceC2755a;
import p191p5.g;
import p191p5.j;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfigFetchHandler {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f28551i = TimeUnit.HOURS.toSeconds(12);
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p108i7.c f28552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p096h7.b<p192p6.a> f28553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f28554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f28555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f28556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f28557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f28558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f28559h;

    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        FetchType(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f28564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f28565c;

        public a(int i10, b bVar, String str) {
            this.f28563a = i10;
            this.f28564b = bVar;
            this.f28565c = str;
        }
    }

    public ConfigFetchHandler(p108i7.c cVar, p096h7.b bVar, Executor executor, Random random, e eVar, ConfigFetchHttpClient configFetchHttpClient, c cVar2, HashMap map) {
        this.f28552a = cVar;
        this.f28553b = bVar;
        this.f28554c = executor;
        this.f28555d = random;
        this.f28556e = eVar;
        this.f28557f = configFetchHttpClient;
        this.f28558g = cVar2;
        this.f28559h = map;
    }

    public final a a(String str, String str2, Date date, HashMap map) throws FirebaseRemoteConfigException {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f28557f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f28557f;
            HashMap mapD = d();
            String string = this.f28558g.f28600a.getString("last_fetch_etag", null);
            p192p6.a aVar = this.f28553b.get();
            a aVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, aVar == null ? null : (Long) aVar.b(true).get("_fot"), date);
            b bVar = aVarFetch.f28564b;
            if (bVar != null) {
                c cVar = this.f28558g;
                long j10 = bVar.f28590f;
                synchronized (cVar.f28601b) {
                    cVar.f28600a.edit().putLong("last_template_version", j10).apply();
                }
            }
            String str4 = aVarFetch.f28565c;
            if (str4 != null) {
                c cVar2 = this.f28558g;
                synchronized (cVar2.f28601b) {
                    cVar2.f28600a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f28558g.c(0, c.f28599f);
            return aVarFetch;
        } catch (FirebaseRemoteConfigServerException e10) {
            int iA = e10.a();
            c cVar3 = this.f28558g;
            if (iA == 429 || iA == 502 || iA == 503 || iA == 504) {
                int i10 = cVar3.a().f28604a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = j;
                long millis = timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]);
                cVar3.c(i10, new Date(date.getTime() + (millis / 2) + ((long) this.f28555d.nextInt((int) millis))));
            }
            c.a aVarA = cVar3.a();
            int iA2 = e10.a();
            if (aVarA.f28604a > 1 || iA2 == 429) {
                throw new FirebaseRemoteConfigFetchThrottledException("Fetch was throttled.", aVarA.f28605b.getTime());
            }
            int iA3 = e10.a();
            if (iA3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (iA3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (iA3 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (iA3 != 500) {
                    switch (iA3) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(e10.a(), "Fetch failed: ".concat(str3), e10);
        }
    }

    public final g b(g gVar, long j10, final HashMap map) {
        g gVarI;
        final Date date = new Date(System.currentTimeMillis());
        boolean zO = gVar.o();
        c cVar = this.f28558g;
        if (zO) {
            Date date2 = new Date(cVar.f28600a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(c.f28598e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j10) + date2.getTime()))) {
                return j.e(new a(2, null, null));
            }
        }
        Date date3 = cVar.a().f28605b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f28554c;
        if (date4 != null) {
            gVarI = j.d(new FirebaseRemoteConfigFetchThrottledException(B7.b.c("Fetch is throttled. Please wait before calling fetch again: ", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()))), date4.getTime()));
        } else {
            p108i7.c cVar2 = this.f28552a;
            final B id = cVar2.getId();
            final B bA = cVar2.a();
            gVarI = j.g(id, bA).i(executor, new InterfaceC2755a() { // from class: D7.g
                @Override // p191p5.InterfaceC2755a
                public final Object i(p191p5.g gVar2) {
                    Date date5 = date;
                    HashMap map2 = map;
                    ConfigFetchHandler configFetchHandler = this.f2841b;
                    configFetchHandler.getClass();
                    p191p5.g gVar3 = id;
                    if (!gVar3.o()) {
                        return p191p5.j.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", gVar3.j()));
                    }
                    p191p5.g gVar4 = bA;
                    if (!gVar4.o()) {
                        return p191p5.j.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", gVar4.j()));
                    }
                    try {
                        ConfigFetchHandler.a aVarA = configFetchHandler.a((String) gVar3.k(), ((p108i7.f) gVar4.k()).a(), date5, map2);
                        return aVarA.f28563a != 0 ? p191p5.j.e(aVarA) : configFetchHandler.f28556e.d(aVarA.f28564b).p(configFetchHandler.f28554c, new i(aVarA));
                    } catch (FirebaseRemoteConfigException e10) {
                        return p191p5.j.d(e10);
                    }
                }
            });
        }
        return gVarI.i(executor, new f(this, date));
    }

    public final g c(int i10) {
        FetchType fetchType = FetchType.REALTIME;
        HashMap map = new HashMap(this.f28559h);
        map.put("X-Firebase-RC-Fetch-Type", fetchType.a() + "/" + i10);
        return this.f28556e.b().i(this.f28554c, new h(this, 0, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        p192p6.a aVar = this.f28553b.get();
        if (aVar == null) {
            return map;
        }
        for (Map.Entry<String, Object> entry : aVar.b(false).entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
        return map;
    }
}
