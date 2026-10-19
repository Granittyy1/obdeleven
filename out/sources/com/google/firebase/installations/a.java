package com.google.firebase.installations;

import U4.C0804l;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.M1;
import com.google.firebase.concurrent.SequentialExecutor;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p019b6.f;
import p096h7.b;
import p108i7.c;
import p108i7.d;
import p108i7.g;
import p108i7.i;
import p133k7.a;
import p144l6.e;
import p191p5.B;
import p191p5.h;
import p191p5.j;
import p228s6.l;

/* JADX INFO: compiled from: FirebaseInstallations.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f28202m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f28203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.firebase.installations.remote.c f28204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PersistedInstallation f28205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f28206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<p133k7.a> f28207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f28208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f28209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f28210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SequentialExecutor f28211i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f28212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f28213l;

    static {
        new AtomicInteger(1);
    }

    public a() {
        throw null;
    }

    public a(final e eVar, b bVar, ExecutorService executorService, SequentialExecutor sequentialExecutor) {
        eVar.a();
        com.google.firebase.installations.remote.c cVar = new com.google.firebase.installations.remote.c(eVar.f44388a, bVar);
        PersistedInstallation persistedInstallation = new PersistedInstallation(eVar);
        if (M1.f25512b == null) {
            M1.f25512b = new M1();
        }
        M1 m7 = M1.f25512b;
        if (i.f36770d == null) {
            i.f36770d = new i(m7);
        }
        i iVar = i.f36770d;
        l<p133k7.a> lVar = new l<>(new b() { // from class: i7.b
            @Override // p096h7.b
            public final Object get() {
                return new a(eVar);
            }
        });
        g gVar = new g();
        this.f28209g = new Object();
        this.f28212k = new HashSet();
        this.f28213l = new ArrayList();
        this.f28203a = eVar;
        this.f28204b = cVar;
        this.f28205c = persistedInstallation;
        this.f28206d = iVar;
        this.f28207e = lVar;
        this.f28208f = gVar;
        this.f28210h = executorService;
        this.f28211i = sequentialExecutor;
    }

    @Override // p108i7.c
    public final B a() {
        d();
        h hVar = new h();
        d dVar = new d(this.f28206d, hVar);
        synchronized (this.f28209g) {
            this.f28213l.add(dVar);
        }
        this.f28210h.execute(new androidx.compose.ui.b(2, this));
        return hVar.f45811a;
    }

    public final void b() {
        com.google.firebase.installations.local.a aVarC;
        synchronized (f28202m) {
            try {
                e eVar = this.f28203a;
                eVar.a();
                f fVarB = f.b(eVar.f44388a);
                try {
                    aVarC = this.f28205c.c();
                    PersistedInstallation.RegistrationStatus registrationStatus = PersistedInstallation.RegistrationStatus.f28217c;
                    PersistedInstallation.RegistrationStatus registrationStatus2 = aVarC.f28223c;
                    if (registrationStatus2 == registrationStatus || registrationStatus2 == PersistedInstallation.RegistrationStatus.f28216b) {
                        String strE = e(aVarC);
                        PersistedInstallation persistedInstallation = this.f28205c;
                        com.google.firebase.installations.local.a.C0282a c0282aH = aVarC.h();
                        c0282aH.f28229a = strE;
                        c0282aH.f28230b = PersistedInstallation.RegistrationStatus.f28218d;
                        aVarC = c0282aH.a();
                        persistedInstallation.b(aVarC);
                    }
                    if (fVarB != null) {
                        fVarB.c();
                    }
                } catch (Throwable th) {
                    if (fVarB != null) {
                        fVarB.c();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h(aVarC);
        this.f28211i.execute(new M2.d(3, this));
    }

    public final com.google.firebase.installations.local.a c(com.google.firebase.installations.local.a aVar) throws FirebaseInstallationsException {
        HttpURLConnection httpURLConnectionC;
        com.google.firebase.installations.remote.b bVarF;
        e eVar = this.f28203a;
        eVar.a();
        String str = eVar.f44390c.f44400a;
        String str2 = aVar.f28222b;
        e eVar2 = this.f28203a;
        eVar2.a();
        String str3 = eVar2.f44390c.f44406g;
        String str4 = aVar.f28225e;
        com.google.firebase.installations.remote.c cVar = this.f28204b;
        p145l7.a aVar2 = cVar.f28259c;
        boolean zA = aVar2.a();
        FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.f28199c;
        if (!zA) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
        }
        URL urlA = com.google.firebase.installations.remote.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i10 = 0;
        while (true) {
            if (i10 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    com.google.firebase.installations.remote.c.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    aVar2.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        bVarF = com.google.firebase.installations.remote.c.f(httpURLConnectionC);
                        break;
                    }
                    com.google.firebase.installations.remote.c.b(httpURLConnectionC, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        com.google.firebase.installations.remote.b.a aVarA = TokenResult.a();
                        aVarA.f28254c = TokenResult.ResponseCode.f28242d;
                        bVarF = aVarA.a();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.f28200d);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        com.google.firebase.installations.remote.b.a aVarA2 = TokenResult.a();
                        aVarA2.f28254c = TokenResult.ResponseCode.f28241c;
                        bVarF = aVarA2.a();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i10++;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iOrdinal = bVarF.f28251c.ordinal();
        if (iOrdinal == 0) {
            i iVar = this.f28206d;
            iVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            iVar.f36771a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            com.google.firebase.installations.local.a.C0282a c0282aH = aVar.h();
            c0282aH.f28231c = bVarF.f28249a;
            c0282aH.f28233e = Long.valueOf(bVarF.f28250b);
            c0282aH.f28234f = Long.valueOf(seconds);
            return c0282aH.a();
        }
        if (iOrdinal == 1) {
            com.google.firebase.installations.local.a.C0282a c0282aH2 = aVar.h();
            c0282aH2.f28235g = "BAD CONFIG";
            c0282aH2.f28230b = PersistedInstallation.RegistrationStatus.f28220f;
            return c0282aH2.a();
        }
        if (iOrdinal != 2) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
        }
        synchronized (this) {
            this.j = null;
        }
        com.google.firebase.installations.local.a.C0282a c0282aH3 = aVar.h();
        c0282aH3.f28230b = PersistedInstallation.RegistrationStatus.f28217c;
        return c0282aH3.a();
    }

    public final void d() {
        e eVar = this.f28203a;
        eVar.a();
        C0804l.f(eVar.f44390c.f44401b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        C0804l.f(eVar.f44390c.f44406g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        C0804l.f(eVar.f44390c.f44400a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        String str = eVar.f44390c.f44401b;
        Pattern pattern = i.f36769c;
        C0804l.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        eVar.a();
        C0804l.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", i.f36769c.matcher(eVar.f44390c.f44400a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e A[Catch: all -> 0x0040, DONT_GENERATE, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:10:0x002f, B:11:0x0031, B:15:0x003e, B:19:0x0042, B:20:0x0046, B:27:0x0059, B:12:0x0032, B:13:0x003b), top: B:32:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:10:0x002f, B:11:0x0031, B:15:0x003e, B:19:0x0042, B:20:0x0046, B:27:0x0059, B:12:0x0032, B:13:0x003b), top: B:32:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public final String e(com.google.firebase.installations.local.a aVar) {
        p133k7.a aVar2;
        String string;
        e eVar = this.f28203a;
        eVar.a();
        if (!eVar.f44389b.equals("CHIME_ANDROID_SDK")) {
            e eVar2 = this.f28203a;
            eVar2.a();
            if ("[DEFAULT]".equals(eVar2.f44389b)) {
                if (aVar.f28223c == PersistedInstallation.RegistrationStatus.f28216b) {
                    aVar2 = this.f28207e.get();
                    synchronized (aVar2.f42560a) {
                        try {
                            synchronized (aVar2.f42560a) {
                                string = aVar2.f42560a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = aVar2.a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f28208f.getClass();
                    return g.a();
                }
            }
        } else if (aVar.f28223c == PersistedInstallation.RegistrationStatus.f28216b) {
            aVar2 = this.f28207e.get();
            synchronized (aVar2.f42560a) {
                synchronized (aVar2.f42560a) {
                    string = aVar2.f42560a.getString("|S|id", null);
                    if (string != null) {
                        string = aVar2.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f28208f.getClass();
                    return g.a();
                }
            }
        }
        this.f28208f.getClass();
        return g.a();
    }

    public final com.google.firebase.installations.local.a f(com.google.firebase.installations.local.a aVar) throws FirebaseInstallationsException {
        com.google.firebase.installations.remote.a aVarE;
        String str = aVar.f28222b;
        String string = null;
        if (str != null && str.length() == 11) {
            p133k7.a aVar2 = this.f28207e.get();
            synchronized (aVar2.f42560a) {
                try {
                    String[] strArr = p133k7.a.f42559c;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            break;
                        }
                        String str2 = strArr[i10];
                        String string2 = aVar2.f42560a.getString("|T|" + aVar2.f42561b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i10++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.google.firebase.installations.remote.c cVar = this.f28204b;
        e eVar = this.f28203a;
        eVar.a();
        String str3 = eVar.f44390c.f44400a;
        String str4 = aVar.f28222b;
        e eVar2 = this.f28203a;
        eVar2.a();
        String str5 = eVar2.f44390c.f44406g;
        e eVar3 = this.f28203a;
        eVar3.a();
        String str6 = eVar3.f44390c.f44401b;
        p145l7.a aVar3 = cVar.f28259c;
        boolean zA = aVar3.a();
        FirebaseInstallationsException.Status status = FirebaseInstallationsException.Status.f28199c;
        if (!zA) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
        }
        URL urlA = com.google.firebase.installations.remote.c.a("projects/" + str5 + "/installations");
        int i11 = 0;
        while (true) {
            if (i11 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", status);
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    com.google.firebase.installations.remote.c.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    aVar3.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        aVarE = com.google.firebase.installations.remote.c.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    com.google.firebase.installations.remote.c.b(httpURLConnectionC, str6, str3, str5);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.f28200d);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        com.google.firebase.installations.remote.a aVar4 = new com.google.firebase.installations.remote.a(null, null, null, null, InstallationResponse.ResponseCode.f28238c);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVarE = aVar4;
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i11++;
                } catch (IOException | AssertionError unused2) {
                }
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        int iOrdinal = aVarE.f28248e.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.f28199c);
            }
            com.google.firebase.installations.local.a.C0282a c0282aH = aVar.h();
            c0282aH.f28235g = "BAD CONFIG";
            c0282aH.f28230b = PersistedInstallation.RegistrationStatus.f28220f;
            return c0282aH.a();
        }
        String str7 = aVarE.f28245b;
        String str8 = aVarE.f28246c;
        i iVar = this.f28206d;
        iVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iVar.f36771a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        com.google.firebase.installations.remote.b bVar = aVarE.f28247d;
        String str9 = bVar.f28249a;
        long j = bVar.f28250b;
        com.google.firebase.installations.local.a.C0282a c0282aH2 = aVar.h();
        c0282aH2.f28229a = str7;
        c0282aH2.f28230b = PersistedInstallation.RegistrationStatus.f28219e;
        c0282aH2.f28231c = str9;
        c0282aH2.f28232d = str8;
        c0282aH2.f28233e = Long.valueOf(j);
        c0282aH2.f28234f = Long.valueOf(seconds);
        return c0282aH2.a();
    }

    public final void g(Exception exc) {
        synchronized (this.f28209g) {
            try {
                Iterator it = this.f28213l.iterator();
                while (it.hasNext()) {
                    if (((p108i7.h) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p108i7.c
    public final B getId() {
        String str;
        d();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return j.e(str);
        }
        h hVar = new h();
        p108i7.e eVar = new p108i7.e(hVar);
        synchronized (this.f28209g) {
            this.f28213l.add(eVar);
        }
        B b10 = hVar.f45811a;
        this.f28210h.execute(new X8.a(3, this));
        return b10;
    }

    public final void h(com.google.firebase.installations.local.a aVar) {
        synchronized (this.f28209g) {
            try {
                Iterator it = this.f28213l.iterator();
                while (it.hasNext()) {
                    if (((p108i7.h) it.next()).a(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
