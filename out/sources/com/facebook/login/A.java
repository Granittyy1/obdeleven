package com.facebook.login;

import Z3.C0835a;
import Z3.I;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.ActivityC1347l;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: NativeAppLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class A extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f25040e;

    public /* synthetic */ A() {
        this.f25039d = 1;
    }

    @Override // com.facebook.login.x
    public boolean i(int i10, int i11, Intent intent) {
        String str;
        Object obj;
        switch (this.f25039d) {
            case 0:
                final LoginClient.b bVar = d().f25061h;
                LoginClient.Result.Code code = LoginClient.Result.Code.CANCEL;
                if (intent == null) {
                    m(new LoginClient.Result(bVar, code, null, null, "Operation canceled", null));
                } else {
                    LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
                    String string = null;
                    if (i11 == 0) {
                        Bundle extras = intent.getExtras();
                        String string2 = extras == null ? null : extras.getString("error");
                        if (string2 != null) {
                            str = string2;
                        } else if (extras == null) {
                            str = null;
                        } else {
                            string2 = extras.getString("error_type");
                            str = string2;
                        }
                        String string3 = (extras == null || (obj = extras.get("error_code")) == null) ? null : obj.toString();
                        int i12 = p165n4.p.f44923a;
                        if ("CONNECTION_FAILURE".equals(string3)) {
                            String string4 = extras == null ? null : extras.getString("error_message");
                            if (string4 != null) {
                                string = string4;
                            } else if (extras != null) {
                                string = extras.getString("error_description");
                            }
                            ArrayList arrayList = new ArrayList();
                            if (str != null) {
                                arrayList.add(str);
                            }
                            if (string != null) {
                                arrayList.add(string);
                            }
                            m(new LoginClient.Result(bVar, code2, null, null, TextUtils.join(": ", arrayList), string3));
                        } else {
                            m(new LoginClient.Result(bVar, code, null, null, str, null));
                        }
                    } else if (i11 != -1) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add("Unexpected resultCode from authorization.");
                        m(new LoginClient.Result(bVar, code2, null, null, TextUtils.join(": ", arrayList2), null));
                    } else {
                        final Bundle extras2 = intent.getExtras();
                        if (extras2 == null) {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add("Unexpected null from returned authorization data.");
                            m(new LoginClient.Result(bVar, code2, null, null, TextUtils.join(": ", arrayList3), null));
                        } else {
                            String string5 = extras2.getString("error");
                            if (string5 == null) {
                                string5 = extras2.getString("error_type");
                            }
                            Object obj2 = extras2.get("error_code");
                            string = obj2 != null ? obj2.toString() : null;
                            String string6 = extras2.getString("error_message");
                            if (string6 == null) {
                                string6 = extras2.getString("error_description");
                            }
                            String string7 = extras2.getString("e2e");
                            if (!p165n4.s.y(string7)) {
                                h(string7);
                            }
                            if (string5 != null || string != null || string6 != null || bVar == null) {
                                p(bVar, string5, string6, string);
                            } else if (!extras2.containsKey("code") || p165n4.s.y(extras2.getString("code"))) {
                                r(bVar, extras2);
                            } else {
                                Z3.q.c().execute(new Runnable() { // from class: com.facebook.login.z
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        A this$0 = this.f25193b;
                                        kotlin.jvm.internal.i.e(this$0, "this$0");
                                        LoginClient.b request = bVar;
                                        kotlin.jvm.internal.i.e(request, "$request");
                                        Bundle bundle = extras2;
                                        try {
                                            this$0.j(request, bundle);
                                            this$0.r(request, bundle);
                                        } catch (FacebookServiceException e10) {
                                            FacebookRequestError facebookRequestErrorA = e10.a();
                                            this$0.p(request, facebookRequestErrorA.f24762e, facebookRequestErrorA.a(), String.valueOf(facebookRequestErrorA.f24760c));
                                        } catch (FacebookException e11) {
                                            this$0.p(request, null, e11.getMessage(), null);
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
                return true;
            default:
                return super.i(i10, i11, intent);
        }
    }

    public void m(LoginClient.Result result) {
        if (result != null) {
            d().d(result);
        } else {
            d().k();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    public Bundle n(LoginClient.b request) {
        ActivityC1347l activityC1347lE;
        kotlin.jvm.internal.i.e(request, "request");
        Bundle bundle = new Bundle();
        Set<String> set = request.f25079c;
        if (set != null && !set.isEmpty()) {
            String strJoin = TextUtils.join(",", request.f25079c);
            bundle.putString("scope", strJoin);
            a("scope", strJoin);
        }
        DefaultAudience defaultAudience = request.f25080d;
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        bundle.putString("default_audience", defaultAudience.a());
        bundle.putString("state", c(request.f25082f));
        Date date = C0835a.f7782m;
        C0835a c0835aB = C0835a.b.b();
        String str = c0835aB == null ? null : c0835aB.f7789f;
        if (str == null) {
            activityC1347lE = d().e();
            if (activityC1347lE != null) {
                p165n4.s.d(activityC1347lE);
            }
            a("access_token", "0");
        } else {
            Context contextE = d().e();
            if (contextE == null) {
                contextE = Z3.q.a();
            }
            if (str.equals(contextE.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
                bundle.putString("access_token", str);
                a("access_token", "1");
            } else {
                activityC1347lE = d().e();
                if (activityC1347lE != null) {
                    p165n4.s.d(activityC1347lE);
                }
                a("access_token", "0");
            }
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        Z3.q qVar = Z3.q.f7852a;
        bundle.putString("ies", I.a() ? "1" : "0");
        return bundle;
    }

    public AccessTokenSource o() {
        return (AccessTokenSource) this.f25040e;
    }

    public void p(LoginClient.b bVar, String str, String str2, String str3) {
        if (str != null && str.equals("logged_out")) {
            C1770b.f25102k = true;
            m(null);
            return;
        }
        int i10 = p165n4.p.f44923a;
        if (kotlin.collections.q.J(kotlin.collections.l.s("service_disabled", "AndroidAuthKillSwitchException"), str)) {
            m(null);
            return;
        }
        if (kotlin.collections.q.J(kotlin.collections.l.s("access_denied", "OAuthAccessDeniedException"), str)) {
            m(new LoginClient.Result(bVar, LoginClient.Result.Code.CANCEL, null, null, null, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        m(new LoginClient.Result(bVar, LoginClient.Result.Code.ERROR, null, null, TextUtils.join(": ", arrayList), str3));
    }

    public void r(LoginClient.b request, Bundle bundle) {
        kotlin.jvm.internal.i.e(request, "request");
        try {
            m(new LoginClient.Result(request, LoginClient.Result.Code.SUCCESS, x.a.b(request.f25079c, bundle, o(), request.f25081e), x.a.c(bundle, request.f25091p), null, null));
        } catch (FacebookException e10) {
            String message = e10.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            m(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, null, null, TextUtils.join(": ", arrayList), null));
        }
    }

    public void t(LoginClient.b request, Bundle bundle, FacebookException facebookException) {
        LoginClient.Result result;
        kotlin.jvm.internal.i.e(request, "request");
        LoginClient loginClientD = d();
        String strValueOf = null;
        this.f25040e = null;
        LoginClient.Result.Code code = LoginClient.Result.Code.ERROR;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f25040e = bundle.getString("e2e");
            }
            try {
                C0835a c0835aB = x.a.b(request.f25079c, bundle, o(), request.f25081e);
                result = new LoginClient.Result(loginClientD.f25061h, LoginClient.Result.Code.SUCCESS, c0835aB, x.a.c(bundle, request.f25091p), null, null);
                if (loginClientD.e() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClientD.e()).sync();
                    } catch (Exception unused) {
                    }
                    if (c0835aB != null) {
                        String str = c0835aB.f7789f;
                        Context contextE = d().e();
                        if (contextE == null) {
                            contextE = Z3.q.a();
                        }
                        contextE.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
                    }
                }
            } catch (FacebookException e10) {
                LoginClient.b bVar = loginClientD.f25061h;
                String message = e10.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                result = new LoginClient.Result(bVar, code, null, null, TextUtils.join(": ", arrayList), null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = new LoginClient.Result(loginClientD.f25061h, LoginClient.Result.Code.CANCEL, null, null, "User canceled log in.", null);
        } else {
            this.f25040e = null;
            String message2 = facebookException == null ? null : facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError facebookRequestErrorA = ((FacebookServiceException) facebookException).a();
                strValueOf = String.valueOf(facebookRequestErrorA.f24760c);
                message2 = facebookRequestErrorA.toString();
            }
            String str2 = strValueOf;
            LoginClient.b bVar2 = loginClientD.f25061h;
            ArrayList arrayList2 = new ArrayList();
            if (message2 != null) {
                arrayList2.add(message2);
            }
            result = new LoginClient.Result(bVar2, code, null, null, TextUtils.join(": ", arrayList2), str2);
        }
        if (!p165n4.s.y((String) this.f25040e)) {
            h((String) this.f25040e);
        }
        loginClientD.d(result);
    }

    public boolean u(Intent intent) {
        if (intent != null) {
            List<ResolveInfo> listQueryIntentActivities = Z3.q.a().getPackageManager().queryIntentActivities(intent, 65536);
            kotlin.jvm.internal.i.d(listQueryIntentActivities, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            if (!listQueryIntentActivities.isEmpty()) {
                s sVar = d().f25057d;
                p293xa.r rVar = null;
                if (sVar == null) {
                    sVar = null;
                }
                if (sVar != null) {
                    p063f.c<Intent> cVar = sVar.f25171e;
                    if (cVar == null) {
                        kotlin.jvm.internal.i.m(MetricTracker.Object.LAUNCHER);
                        throw null;
                    }
                    cVar.a(intent);
                    rVar = p293xa.r.f47939a;
                }
                return rVar != null;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Parcel source, int i10) {
        super(source);
        this.f25039d = i10;
        switch (i10) {
            case 1:
                super(source);
                break;
            default:
                kotlin.jvm.internal.i.e(source, "source");
                this.f25040e = AccessTokenSource.f24729b;
                break;
        }
    }

    public A(LoginClient loginClient) {
        this.f25039d = 0;
        this.f25188c = loginClient;
        this.f25040e = AccessTokenSource.f24729b;
    }
}
