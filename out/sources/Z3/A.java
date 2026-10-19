package Z3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProfileManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f7741d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile A f7742e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p065f1.a f7743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f7744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f7745c;

    /* JADX INFO: compiled from: ProfileManager.kt */
    public static final class a {
        public final synchronized A a() {
            A a10;
            try {
                if (A.f7742e == null) {
                    p065f1.a aVarA = p065f1.a.a(q.a());
                    kotlin.jvm.internal.i.d(aVarA, "getInstance(applicationContext)");
                    A.f7742e = new A(aVarA, new z());
                }
                a10 = A.f7742e;
                if (a10 == null) {
                    kotlin.jvm.internal.i.m("instance");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return a10;
        }
    }

    public A(p065f1.a aVar, z zVar) {
        this.f7743a = aVar;
        this.f7744b = zVar;
    }

    public final void a(y yVar, boolean z10) {
        y yVar2 = this.f7745c;
        this.f7745c = yVar;
        if (z10) {
            SharedPreferences sharedPreferences = (SharedPreferences) this.f7744b.f7914a;
            if (yVar != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", yVar.f7907b);
                    jSONObject.put("first_name", yVar.f7908c);
                    jSONObject.put("middle_name", yVar.f7909d);
                    jSONObject.put("last_name", yVar.f7910e);
                    jSONObject.put("name", yVar.f7911f);
                    Uri uri = yVar.f7912g;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = yVar.f7913h;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (p165n4.s.a(yVar2, yVar)) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", yVar2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", yVar);
        this.f7743a.c(intent);
    }
}
