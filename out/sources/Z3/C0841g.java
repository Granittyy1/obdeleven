package Z3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessTokenSource;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.HttpMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Z3.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AccessTokenManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0841g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f7810f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static C0841g f7811g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p065f1.a f7812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0836b f7813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0835a f7814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7815d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f7816e = new Date(0);

    /* JADX INFO: renamed from: Z3.g$a */
    /* JADX INFO: compiled from: AccessTokenManager.kt */
    public static final class a {
        public final C0841g a() {
            C0841g c0841g;
            C0841g c0841g2 = C0841g.f7811g;
            if (c0841g2 != null) {
                return c0841g2;
            }
            synchronized (this) {
                c0841g = C0841g.f7811g;
                if (c0841g == null) {
                    p065f1.a aVarA = p065f1.a.a(q.a());
                    kotlin.jvm.internal.i.d(aVarA, "getInstance(applicationContext)");
                    C0841g c0841g3 = new C0841g(aVarA, new C0836b());
                    C0841g.f7811g = c0841g3;
                    c0841g = c0841g3;
                }
            }
            return c0841g;
        }
    }

    /* JADX INFO: renamed from: Z3.g$b */
    /* JADX INFO: compiled from: AccessTokenManager.kt */
    public static final class b implements e {
        @Override // Z3.C0841g.e
        public final String a() {
            return "fb_extend_sso_token";
        }

        @Override // Z3.C0841g.e
        public final String b() {
            return "oauth/access_token";
        }
    }

    /* JADX INFO: renamed from: Z3.g$c */
    /* JADX INFO: compiled from: AccessTokenManager.kt */
    public static final class c implements e {
        @Override // Z3.C0841g.e
        public final String a() {
            return "ig_refresh_token";
        }

        @Override // Z3.C0841g.e
        public final String b() {
            return "refresh_access_token";
        }
    }

    /* JADX INFO: renamed from: Z3.g$d */
    /* JADX INFO: compiled from: AccessTokenManager.kt */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f7820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f7821e;
    }

    /* JADX INFO: renamed from: Z3.g$e */
    /* JADX INFO: compiled from: AccessTokenManager.kt */
    public interface e {
        String a();

        String b();
    }

    public C0841g(p065f1.a aVar, C0836b c0836b) {
        this.f7812a = aVar;
        this.f7813b = c0836b;
    }

    public final void a() {
        final C0835a c0835a = this.f7814c;
        if (c0835a != null && this.f7815d.compareAndSet(false, true)) {
            this.f7816e = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final HashSet hashSet3 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final d dVar = new d();
            r.b bVar = new r.b() { // from class: Z3.d
                /* JADX WARN: Code duplicated, block: B:35:0x0087  */
                @Override // Z3.r.b
                public final void b(x xVar) {
                    JSONArray jSONArrayOptJSONArray;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    HashSet hashSet4 = hashSet;
                    HashSet hashSet5 = hashSet2;
                    HashSet hashSet6 = hashSet3;
                    JSONObject jSONObject = xVar.f7906d;
                    if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) == null) {
                        return;
                    }
                    atomicBoolean2.set(true);
                    int length = jSONArrayOptJSONArray.length();
                    if (length <= 0) {
                        return;
                    }
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("permission");
                            String status = jSONObjectOptJSONObject.optString("status");
                            if (!p165n4.s.y(strOptString) && !p165n4.s.y(status)) {
                                kotlin.jvm.internal.i.d(status, "status");
                                Locale locale = Locale.US;
                                String strD = J4.n.d(locale, "US", status, locale, "(this as java.lang.String).toLowerCase(locale)");
                                int iHashCode = strD.hashCode();
                                if (iHashCode != -1309235419) {
                                    if (iHashCode != 280295099) {
                                        if (iHashCode == 568196142 && strD.equals("declined")) {
                                            hashSet5.add(strOptString);
                                        } else {
                                            kotlin.jvm.internal.i.k(strD, "Unexpected status: ");
                                        }
                                    } else if (strD.equals("granted")) {
                                        hashSet4.add(strOptString);
                                    } else {
                                        kotlin.jvm.internal.i.k(strD, "Unexpected status: ");
                                    }
                                } else if (strD.equals("expired")) {
                                    hashSet6.add(strOptString);
                                } else {
                                    kotlin.jvm.internal.i.k(strD, "Unexpected status: ");
                                }
                            }
                        }
                        if (i11 >= length) {
                            return;
                        } else {
                            i10 = i11;
                        }
                    }
                }
            };
            HttpMethod httpMethod = HttpMethod.f24771b;
            Bundle bundleD = C4.v.d("fields", "permission,status");
            String str = r.j;
            r rVarG = r.c.g(c0835a, "me/permissions", bVar);
            rVarG.f7876d = bundleD;
            rVarG.f7880h = httpMethod;
            r.b bVar2 = new r.b() { // from class: Z3.e
                @Override // Z3.r.b
                public final void b(x xVar) {
                    C0841g.d dVar2 = dVar;
                    JSONObject jSONObject = xVar.f7906d;
                    if (jSONObject == null) {
                        return;
                    }
                    dVar2.f7817a = jSONObject.optString("access_token");
                    dVar2.f7818b = jSONObject.optInt("expires_at");
                    dVar2.f7819c = jSONObject.optInt("expires_in");
                    dVar2.f7820d = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                    dVar2.f7821e = jSONObject.optString("graph_domain", null);
                }
            };
            String str2 = c0835a.f7794l;
            if (str2 == null) {
                str2 = "facebook";
            }
            e cVar = str2.equals("instagram") ? new c() : new b();
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", cVar.a());
            bundle.putString("client_id", c0835a.f7792i);
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            r rVarG2 = r.c.g(c0835a, cVar.b(), bVar2);
            rVarG2.f7876d = bundle;
            rVarG2.f7880h = httpMethod;
            w wVar = new w(rVarG, rVarG2);
            w.a aVar = new w.a() { // from class: Z3.f
                /* JADX WARN: Code duplicated, block: B:11:0x0041  */
                @Override // Z3.w.a
                public final void a(w it) throws Throwable {
                    boolean z10;
                    C0841g.a aVar2;
                    boolean z11;
                    C0835a c0835a2 = c0835a;
                    C0841g.d dVar2 = dVar;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    Collection collection = hashSet;
                    Collection collection2 = hashSet2;
                    Collection collection3 = hashSet3;
                    C0841g this$0 = this;
                    kotlin.jvm.internal.i.e(this$0, "this$0");
                    AtomicBoolean atomicBoolean3 = this$0.f7815d;
                    kotlin.jvm.internal.i.e(it, "it");
                    String str3 = dVar2.f7817a;
                    int i10 = dVar2.f7818b;
                    Long l10 = dVar2.f7820d;
                    String str4 = dVar2.f7821e;
                    try {
                        C0841g.a aVar3 = C0841g.f7810f;
                        if (aVar3.a().f7814c != null) {
                            try {
                                C0835a c0835a3 = aVar3.a().f7814c;
                                if ((c0835a3 == null ? null : c0835a3.j) != c0835a2.j) {
                                    z11 = false;
                                } else {
                                    if (!atomicBoolean2.get() && str3 == null && i10 == 0) {
                                        atomicBoolean3.set(false);
                                        return;
                                    }
                                    Date date = c0835a2.f7785b;
                                    if (dVar2.f7818b != 0) {
                                        aVar2 = aVar3;
                                        date = new Date(((long) dVar2.f7818b) * 1000);
                                    } else {
                                        aVar2 = aVar3;
                                        if (dVar2.f7819c != 0) {
                                            date = new Date((((long) dVar2.f7819c) * 1000) + new Date().getTime());
                                        }
                                    }
                                    Date date2 = date;
                                    if (str3 == null) {
                                        str3 = c0835a2.f7789f;
                                    }
                                    String str5 = str3;
                                    String str6 = c0835a2.f7792i;
                                    String str7 = c0835a2.j;
                                    if (!atomicBoolean2.get()) {
                                        collection = c0835a2.f7786c;
                                    }
                                    Collection collection4 = collection;
                                    if (!atomicBoolean2.get()) {
                                        collection2 = c0835a2.f7787d;
                                    }
                                    Collection collection5 = collection2;
                                    if (!atomicBoolean2.get()) {
                                        collection3 = c0835a2.f7788e;
                                    }
                                    Collection collection6 = collection3;
                                    AccessTokenSource accessTokenSource = c0835a2.f7790g;
                                    Date date3 = new Date();
                                    Date date4 = l10 != null ? new Date(l10.longValue() * 1000) : c0835a2.f7793k;
                                    if (str4 == null) {
                                        str4 = c0835a2.f7794l;
                                    }
                                    aVar2.a().c(new C0835a(str5, str6, str7, collection4, collection5, collection6, accessTokenSource, date2, date3, date4, str4), true);
                                    z11 = false;
                                }
                            } catch (Throwable th) {
                                th = th;
                                z10 = false;
                                atomicBoolean3.set(z10);
                                throw th;
                            }
                        } else {
                            z11 = false;
                        }
                        atomicBoolean3.set(z11);
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                    }
                }
            };
            ArrayList arrayList = wVar.f7901e;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
            p165n4.t.c(wVar);
            new v(wVar).executeOnExecutor(q.c(), new Void[0]);
        }
    }

    public final void b(C0835a c0835a, C0835a c0835a2) {
        Intent intent = new Intent(q.a(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", c0835a);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", c0835a2);
        this.f7812a.c(intent);
    }

    public final void c(C0835a c0835a, boolean z10) {
        C0835a c0835a2 = this.f7814c;
        this.f7814c = c0835a;
        this.f7815d.set(false);
        this.f7816e = new Date(0L);
        if (z10) {
            SharedPreferences sharedPreferences = this.f7813b.f7795a;
            if (c0835a != null) {
                try {
                    sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", c0835a.a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                p165n4.s.d(q.a());
            }
        }
        if (p165n4.s.a(c0835a2, c0835a)) {
            return;
        }
        b(c0835a2, c0835a);
        Context contextA = q.a();
        Date date = C0835a.f7782m;
        C0835a c0835aB = C0835a.b.b();
        AlarmManager alarmManager = (AlarmManager) contextA.getSystemService("alarm");
        if (C0835a.b.c()) {
            if ((c0835aB == null ? null : c0835aB.f7785b) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextA, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, c0835aB.f7785b.getTime(), PendingIntent.getBroadcast(contextA, 0, intent, 67108864));
            } catch (Exception unused2) {
            }
        }
    }
}
