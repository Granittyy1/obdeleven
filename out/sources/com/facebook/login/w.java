package com.facebook.login;

import Z3.C0835a;
import Z3.C0841g;
import Z3.C0842h;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.animation.D;
import androidx.compose.ui.node.f0;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import com.facebook.AuthenticationTokenManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LoginManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f25181b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<String> f25182c = kotlin.collections.B.C("ads_management", "create_event", "rsvp_event");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile w f25183d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f25184a;

    /* JADX INFO: compiled from: LoginManager.kt */
    public static final class a {
        public static boolean b(String str) {
            if (str != null) {
                return kotlin.text.m.I(str, "publish", false) || kotlin.text.m.I(str, "manage", false) || w.f25182c.contains(str);
            }
            return false;
        }

        public final w a() {
            if (w.f25183d == null) {
                synchronized (this) {
                    w.f25183d = new w();
                    p293xa.r rVar = p293xa.r.f47939a;
                }
            }
            w wVar = w.f25183d;
            if (wVar != null) {
                return wVar;
            }
            kotlin.jvm.internal.i.m("instance");
            throw null;
        }
    }

    /* JADX INFO: compiled from: LoginManager.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25185a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static t f25186b;

        public final synchronized t a(Activity activity) {
            t tVar;
            Context contextA = activity;
            synchronized (this) {
                if (activity == null) {
                    try {
                        contextA = Z3.q.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (f25186b == null) {
                    f25186b = new t(contextA, Z3.q.b());
                }
                tVar = f25186b;
            }
            return tVar;
        }
    }

    static {
        kotlin.jvm.internal.i.d(w.class.toString(), "LoginManager::class.java.toString()");
    }

    public w() {
        p165n4.t.e();
        SharedPreferences sharedPreferences = Z3.q.a().getSharedPreferences("com.facebook.loginManager", 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f25184a = sharedPreferences;
        if (!Z3.q.f7863m || p165n4.d.a() == null) {
            return;
        }
        C1771c c1771c = new C1771c();
        Context contextA = Z3.q.a();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty("com.android.chrome")) {
            intent.setPackage("com.android.chrome");
        }
        contextA.bindService(intent, c1771c, 33);
        Context contextA2 = Z3.q.a();
        String packageName = Z3.q.a().getPackageName();
        if (packageName == null) {
            return;
        }
        Context applicationContext = contextA2.getApplicationContext();
        p198q.a aVar = new p198q.a(applicationContext);
        try {
            Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(packageName)) {
                intent2.setPackage(packageName);
            }
            applicationContext.bindService(intent2, aVar, 33);
        } catch (SecurityException unused) {
        }
    }

    public static void a(Activity activity, LoginClient.Result.Code code, Map map, FacebookException facebookException, boolean z10, LoginClient.b bVar) {
        t tVarA = b.f25185a.a(activity);
        if (tVarA == null) {
            return;
        }
        if (bVar == null) {
            ScheduledExecutorService scheduledExecutorService = t.f25174d;
            tVarA.a("fb_mobile_login_complete", "");
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z10 ? "1" : "0");
        String str = bVar.f25089n ? "foa_mobile_login_complete" : "fb_mobile_login_complete";
        ScheduledExecutorService scheduledExecutorService2 = t.f25174d;
        String str2 = bVar.f25082f;
        Bundle bundleA = t.a.a(str2);
        if (code != null) {
            bundleA.putString("2_result", code.a());
        }
        if ((facebookException == null ? null : facebookException.getMessage()) != null) {
            bundleA.putString("5_error_message", facebookException.getMessage());
        }
        JSONObject jSONObject = map2.isEmpty() ? null : new JSONObject(map2);
        if (map != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Map.Entry entry : map.entrySet()) {
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    if (str3 != null) {
                        jSONObject.put(str3, str4);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            bundleA.putString("6_extras", jSONObject.toString());
        }
        tVarA.f25176b.a(bundleA, str);
        if (code == LoginClient.Result.Code.SUCCESS) {
            t.f25174d.schedule(new E6.c(tVarA, 2, t.a.a(str2)), 5L, TimeUnit.SECONDS);
        }
    }

    @p293xa.d
    public final void b(Fragment fragment, Collection<String> permissions) throws Exception {
        kotlin.jvm.internal.i.e(fragment, "fragment");
        kotlin.jvm.internal.i.e(permissions, "permissions");
        for (String str : permissions) {
            if (a.b(str)) {
                throw new FacebookException(androidx.compose.foundation.gestures.d.b("Cannot pass a publish or manage permission (", str, ") to a request for read authorization"));
            }
        }
        f0 f0Var = new f0(permissions);
        String strA = (String) f0Var.f14583c;
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.f25047b;
        try {
            strA = B.a(strA);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.f25048c;
        }
        LoginClient.b bVar = new LoginClient.b(kotlin.collections.q.s0((Set) f0Var.f14581a), Z3.q.b(), D.c("randomUUID().toString()"), (String) f0Var.f14582b, (String) f0Var.f14583c, strA, codeChallengeMethod);
        Date date = C0835a.f7782m;
        bVar.f25083g = C0835a.b.c();
        bVar.f25086k = null;
        bVar.f25087l = false;
        bVar.f25089n = false;
        bVar.f25090o = false;
        ActivityC1347l activity = fragment.getActivity();
        t tVarA = b.f25185a.a(activity);
        if (tVarA != null) {
            String str2 = bVar.f25089n ? "foa_mobile_login_start" : "fb_mobile_login_start";
            ScheduledExecutorService scheduledExecutorService = t.f25174d;
            Bundle bundleA = t.a.a(bVar.f25082f);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", "NATIVE_WITH_FALLBACK");
                jSONObject.put("request_code", CallbackManagerImpl.RequestCodeOffset.Login.a());
                jSONObject.put("permissions", TextUtils.join(",", bVar.f25079c));
                jSONObject.put("default_audience", bVar.f25080d.toString());
                jSONObject.put("isReauthorize", bVar.f25083g);
                String str3 = tVarA.f25177c;
                if (str3 != null) {
                    jSONObject.put("facebookVersion", str3);
                }
                LoginTargetApp loginTargetApp = bVar.f25088m;
                if (loginTargetApp != null) {
                    jSONObject.put("target_app", loginTargetApp.toString());
                }
                bundleA.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused2) {
            }
            tVarA.f25176b.a(bundleA, str2);
        }
        CallbackManagerImpl.b bVar2 = CallbackManagerImpl.f24970b;
        CallbackManagerImpl.RequestCodeOffset requestCodeOffset = CallbackManagerImpl.RequestCodeOffset.Login;
        int iA = requestCodeOffset.a();
        CallbackManagerImpl.a aVar = new CallbackManagerImpl.a() { // from class: com.facebook.login.v
            @Override // com.facebook.internal.CallbackManagerImpl.a
            public final void a(int i10, Intent intent) {
                w this$0 = this.f25180a;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.c(i10, intent, null);
            }
        };
        synchronized (bVar2) {
            HashMap map = CallbackManagerImpl.f24971c;
            if (!map.containsKey(Integer.valueOf(iA))) {
                map.put(Integer.valueOf(iA), aVar);
            }
        }
        Intent intent = new Intent();
        intent.setClass(Z3.q.a(), FacebookActivity.class);
        intent.setAction(bVar.f25078b.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", bVar);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (Z3.q.a().getPackageManager().resolveActivity(intent, 0) != null) {
            try {
                fragment.startActivityForResult(intent, requestCodeOffset.a());
                return;
            } catch (ActivityNotFoundException unused3) {
            }
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        a(activity, LoginClient.Result.Code.ERROR, null, facebookException, false, bVar);
        throw facebookException;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i10, Intent intent, Z3.k kVar) {
        LoginClient.Result.Code code;
        boolean z10;
        FacebookException facebookException;
        C0835a c0835a;
        LoginClient.b bVar;
        Map<String, String> map;
        C0842h c0842h;
        C0842h c0842h2;
        boolean z11;
        Object obj;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        y yVar = null;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                bVar = result.f25071g;
                code = result.f25066b;
                if (i10 != -1) {
                    if (i10 != 0) {
                        facebookException = null;
                        c0842h2 = null;
                        z11 = false;
                        obj = c0842h2;
                    } else {
                        z11 = true;
                        facebookException = null;
                        obj = null;
                        c0842h2 = null;
                    }
                } else if (code == LoginClient.Result.Code.SUCCESS) {
                    C0835a c0835a2 = result.f25067c;
                    c0842h2 = result.f25068d;
                    z11 = false;
                    obj = c0835a2;
                    facebookException = null;
                } else {
                    facebookException = new FacebookAuthorizationException(result.f25069e);
                    c0842h2 = null;
                    z11 = false;
                    obj = c0842h2;
                }
                z10 = z11;
                c0842h = c0842h2;
                map = result.f25072h;
                c0835a = obj;
            } else {
                code = code2;
                facebookException = null;
                c0835a = 0;
                bVar = null;
                map = null;
                c0842h = null;
                z10 = false;
            }
        } else if (i10 == 0) {
            code = LoginClient.Result.Code.CANCEL;
            z10 = true;
            facebookException = null;
            c0835a = 0;
            bVar = null;
            map = null;
            c0842h = null;
        } else {
            code = code2;
            facebookException = null;
            c0835a = 0;
            bVar = null;
            map = null;
            c0842h = null;
            z10 = false;
        }
        if (facebookException == null && c0835a == 0 && !z10) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        a(null, code, map, facebookException, true, bVar);
        if (c0835a != 0) {
            Date date = C0835a.f7782m;
            C0841g.f7810f.a().c(c0835a, true);
            C0835a c0835aB = C0835a.b.b();
            if (c0835aB != null) {
                if (C0835a.b.c()) {
                    p165n4.s.o(c0835aB.f7789f, new O.e());
                } else {
                    Z3.A.f7741d.a().a(null, true);
                }
            }
        }
        if (c0842h != null) {
            AuthenticationTokenManager.a aVar = AuthenticationTokenManager.f24737d;
            AuthenticationTokenManager authenticationTokenManager = AuthenticationTokenManager.f24738e;
            if (authenticationTokenManager == null) {
                synchronized (aVar) {
                    authenticationTokenManager = AuthenticationTokenManager.f24738e;
                    if (authenticationTokenManager == null) {
                        p065f1.a aVarA = p065f1.a.a(Z3.q.a());
                        kotlin.jvm.internal.i.d(aVarA, "getInstance(applicationContext)");
                        AuthenticationTokenManager authenticationTokenManager2 = new AuthenticationTokenManager(aVarA, new J2.l());
                        AuthenticationTokenManager.f24738e = authenticationTokenManager2;
                        authenticationTokenManager = authenticationTokenManager2;
                    }
                }
            }
            C0842h c0842h3 = authenticationTokenManager.f24741c;
            authenticationTokenManager.f24741c = c0842h;
            try {
                ((SharedPreferences) authenticationTokenManager.f24740b.f3968a).edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", c0842h.a().toString()).apply();
            } catch (JSONException unused) {
            }
            if (!p165n4.s.a(c0842h3, c0842h)) {
                Intent intent2 = new Intent(Z3.q.a(), (Class<?>) AuthenticationTokenManager.CurrentAuthenticationTokenChangedBroadcastReceiver.class);
                intent2.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
                intent2.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", c0842h3);
                intent2.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", c0842h);
                authenticationTokenManager.f24739a.c(intent2);
            }
        }
        if (kVar != null) {
            if (c0835a != 0 && bVar != null) {
                Set<String> set = bVar.f25079c;
                Set setR0 = kotlin.collections.q.r0(kotlin.collections.q.M(c0835a.f7786c));
                if (bVar.f25083g) {
                    setR0.retainAll(set);
                }
                Set setR1 = kotlin.collections.q.r0(kotlin.collections.q.M(set));
                setR1.removeAll(setR0);
                yVar = new y(c0835a, c0842h, setR0, setR1);
            }
            if (z10 || (yVar != null && yVar.f25191c.isEmpty())) {
                kVar.onCancel();
                return;
            }
            if (facebookException != null) {
                kVar.a(facebookException);
                return;
            }
            if (c0835a == 0 || yVar == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = this.f25184a.edit();
            editorEdit.putBoolean("express_login_allowed", true);
            editorEdit.apply();
            kVar.b(yVar);
        }
    }

    public final void d(CallbackManagerImpl callbackManagerImpl, final Z3.k kVar) {
        if (callbackManagerImpl == null) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        int iA = CallbackManagerImpl.RequestCodeOffset.Login.a();
        CallbackManagerImpl.a aVar = new CallbackManagerImpl.a() { // from class: com.facebook.login.u
            @Override // com.facebook.internal.CallbackManagerImpl.a
            public final void a(int i10, Intent intent) {
                w this$0 = this.f25178a;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.c(i10, intent, kVar);
            }
        };
        callbackManagerImpl.getClass();
        callbackManagerImpl.f24972a.put(Integer.valueOf(iA), aVar);
    }
}
