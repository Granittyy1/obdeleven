package com.voltasit.obdeleven;

import O.e;
import P8.c;
import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.obdeleven.service.enums.ValueUnit;
import com.parse.ParseUser;
import com.voltasit.obdeleven.presentation.models.StartView;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import org.json.JSONException;
import org.json.JSONObject;
import p255u9.z;

/* JADX INFO: compiled from: AppPreferences.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<String> f29638c = l.s("key_installed_languages", "offers");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f29639d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f29640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f29641b;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppPreferences.kt */
    public static final class C0320a {
        public static a a(Context context) {
            i.e(context, "context");
            if (a.f29639d == null) {
                a.f29639d = new a(context);
            }
            a aVar = a.f29639d;
            i.b(aVar);
            return aVar;
        }
    }

    public a(Context context) {
        this.f29640a = context.getSharedPreferences(Constants.BRAZE_PUSH_CONTENT_KEY, 0);
    }

    public final String a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f29640a;
        try {
            int i10 = z.f47484b;
            if (((z) ParseUser.getCurrentUser()) != null) {
                z zVar = (z) ParseUser.getCurrentUser();
                i.b(zVar);
                JSONObject jSONObjectA = zVar.a();
                String string = sharedPreferences.getString(str, str2);
                if (string == null) {
                    string = "";
                }
                str = jSONObjectA.optString(str, string);
            } else {
                str = sharedPreferences.getString(str, str2);
            }
        } catch (RuntimeException e10) {
            e.m(e10);
            str = sharedPreferences.getString(str, str2);
        }
        i.b(str);
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final boolean b(String str, boolean z10) {
        SharedPreferences sharedPreferences = this.f29640a;
        try {
            int i10 = z.f47484b;
            if (((z) ParseUser.getCurrentUser()) != null) {
                z zVar = (z) ParseUser.getCurrentUser();
                i.b(zVar);
                str = zVar.a().optBoolean(str, sharedPreferences.getBoolean(str, z10));
            } else {
                str = sharedPreferences.getBoolean(str, z10);
            }
            return str;
        } catch (RuntimeException e10) {
            e.m(e10);
            return sharedPreferences.getBoolean(str, z10);
        }
    }

    public final String c() {
        return a("databaseLanguage", "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    public final int d(String key, int i10) {
        i.e(key, "key");
        try {
            ?? r10 = this.f29640a;
            try {
                int i11 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) != null) {
                    z zVar = (z) ParseUser.getCurrentUser();
                    i.b(zVar);
                    key = zVar.a().optInt(key, r10.getInt(key, i10));
                } else {
                    key = r10.getInt(key, i10);
                }
            } catch (RuntimeException e10) {
                e.m(e10);
                key = r10.getInt(key, i10);
            }
            return key == true ? 1 : 0;
        } catch (ClassCastException e11) {
            p279w9.b bVar = Application.f29634b;
            c.b(e11);
            return i10;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:19:0x003e */
    public final long e(String key) {
        i.e(key, "key");
        long jOptLong = 0;
        try {
            SharedPreferences sharedPreferences = this.f29640a;
            try {
                int i10 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) != null) {
                    z zVar = (z) ParseUser.getCurrentUser();
                    i.b(zVar);
                    jOptLong = zVar.a().optLong(key, sharedPreferences.getLong(key, 0L));
                } else {
                    jOptLong = sharedPreferences.getLong(key, 0L);
                }
            } catch (RuntimeException e10) {
                e.m(e10);
                jOptLong = sharedPreferences.getLong(key, 0L);
            }
        } catch (ClassCastException e11) {
            p279w9.b bVar = Application.f29634b;
            c.b(e11);
        }
        return jOptLong;
    }

    public final SharedPreferences.Editor f() {
        if (this.f29641b == null) {
            this.f29641b = this.f29640a.edit();
        }
        return this.f29641b;
    }

    public final String g() {
        return a("sharingEmail", "");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    public final StartView h() {
        StartView.a aVar = StartView.f32644b;
        int iD = d("start_view", StartView.AUTO.a());
        aVar.getClass();
        for (StartView startView : StartView.values()) {
            if (startView.a() == iD) {
                if (startView == null) {
                    return StartView.AUTO;
                }
                return startView;
            }
        }
        startView = null;
        if (startView == null) {
            return StartView.AUTO;
        }
        return startView;
    }

    public final ValueUnit i() {
        return ValueUnit.valueOf(a("valueUnit", "METRIC"));
    }

    public final void j(String str, boolean z10) {
        SharedPreferences.Editor editorF = f();
        if (editorF != null) {
            editorF.putBoolean(str, z10);
            editorF.apply();
            int i10 = z.f47484b;
            if (((z) ParseUser.getCurrentUser()) == null || m.I(str, "parse_", false)) {
                return;
            }
            z zVar = (z) ParseUser.getCurrentUser();
            i.b(zVar);
            JSONObject jSONObjectA = zVar.a();
            try {
                jSONObjectA.put(str, z10);
                z zVar2 = (z) ParseUser.getCurrentUser();
                i.b(zVar2);
                zVar2.put("settings", jSONObjectA);
                zVar2.saveInBackground();
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void k(int i10, String str) {
        SharedPreferences.Editor editorF = f();
        if (editorF != null) {
            editorF.putInt(str, i10);
            editorF.apply();
            try {
                int i11 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) != null && !m.I(str, "parse_", false)) {
                    z zVar = (z) ParseUser.getCurrentUser();
                    i.b(zVar);
                    JSONObject jSONObjectA = zVar.a();
                    jSONObjectA.put(str, i10);
                    z zVar2 = (z) ParseUser.getCurrentUser();
                    i.b(zVar2);
                    zVar2.put("settings", jSONObjectA);
                    zVar2.saveInBackground();
                }
            } catch (RuntimeException e10) {
                e10.printStackTrace();
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    public final void l(int i10, String key) {
        i.e(key, "key");
        SharedPreferences.Editor editorF = f();
        if (editorF != null) {
            editorF.putInt(key, i10);
            editorF.apply();
            try {
                int i11 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) != null && !m.I(key, "parse_", false)) {
                    z zVar = (z) ParseUser.getCurrentUser();
                    i.b(zVar);
                    JSONObject jSONObjectA = zVar.a();
                    jSONObjectA.put(key, i10);
                    z zVar2 = (z) ParseUser.getCurrentUser();
                    i.b(zVar2);
                    zVar2.put("settings", jSONObjectA);
                }
            } catch (RuntimeException e10) {
                e10.printStackTrace();
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    public final void m(long j, String str) {
        SharedPreferences.Editor editorF = f();
        if (editorF != null) {
            editorF.putLong(str, j);
            editorF.apply();
            try {
                int i10 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) != null && !m.I(str, "parse_", false)) {
                    z zVar = (z) ParseUser.getCurrentUser();
                    i.b(zVar);
                    JSONObject jSONObjectA = zVar.a();
                    jSONObjectA.put(str, j);
                    z zVar2 = (z) ParseUser.getCurrentUser();
                    i.b(zVar2);
                    zVar2.put("settings", jSONObjectA);
                    zVar2.saveInBackground();
                }
            } catch (RuntimeException e10) {
                e10.printStackTrace();
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    public final void n(long j, String key) {
        i.e(key, "key");
        SharedPreferences.Editor editorF = f();
        if (editorF != null) {
            editorF.putLong(key, j);
            editorF.apply();
            try {
                int i10 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) != null && !m.I(key, "parse_", false)) {
                    z zVar = (z) ParseUser.getCurrentUser();
                    i.b(zVar);
                    JSONObject jSONObjectA = zVar.a();
                    jSONObjectA.put(key, j);
                    z zVar2 = (z) ParseUser.getCurrentUser();
                    i.b(zVar2);
                    zVar2.put("settings", jSONObjectA);
                }
            } catch (RuntimeException e10) {
                e10.printStackTrace();
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    public final void o(String str, String str2) {
        SharedPreferences.Editor editorF = f();
        if (editorF != null) {
            editorF.putString(str, str2);
            editorF.apply();
            try {
                int i10 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) != null && !m.I(str, "parse_", false)) {
                    z zVar = (z) ParseUser.getCurrentUser();
                    i.b(zVar);
                    JSONObject jSONObjectA = zVar.a();
                    jSONObjectA.put(str, str2);
                    z zVar2 = (z) ParseUser.getCurrentUser();
                    i.b(zVar2);
                    zVar2.put("settings", jSONObjectA);
                    zVar2.saveInBackground();
                }
            } catch (RuntimeException e10) {
                e10.printStackTrace();
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
    }

    public final void p(JSONObject jSONObject, Iterator<String> it) {
        Object obj;
        String key = it.next();
        if (f29638c.contains(key)) {
            return;
        }
        try {
            obj = jSONObject.has(key) ? jSONObject.get(key) : null;
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Integer) {
                l(((Number) obj).intValue(), key);
                return;
            }
            if (!(obj instanceof Boolean)) {
                if (obj instanceof Long) {
                    n(((Number) obj).longValue(), key);
                    return;
                }
                return;
            } else {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SharedPreferences.Editor editorF = f();
                if (editorF != null) {
                    editorF.putBoolean(key, zBooleanValue);
                    editorF.apply();
                    return;
                }
                return;
            }
        }
        String str = (String) obj;
        SharedPreferences.Editor editorF2 = f();
        if (editorF2 != null) {
            editorF2.putString(key, str);
            editorF2.apply();
            i.e(key, "key");
            try {
                int i10 = z.f47484b;
                if (((z) ParseUser.getCurrentUser()) != null && !m.I(key, "parse_", false)) {
                    z zVar = (z) ParseUser.getCurrentUser();
                    i.b(zVar);
                    JSONObject jSONObjectA = zVar.a();
                    jSONObjectA.put(key, str);
                    z zVar2 = (z) ParseUser.getCurrentUser();
                    i.b(zVar2);
                    zVar2.put("settings", jSONObjectA);
                }
            } catch (RuntimeException e11) {
                e11.printStackTrace();
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
        }
    }
}
