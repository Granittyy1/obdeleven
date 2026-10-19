package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC1347l;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import java.math.BigInteger;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.login.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CustomTabLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1770b extends A {
    public static final Parcelable.Creator<C1770b> CREATOR = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f25102k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f25105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f25106i;
    public final AccessTokenSource j;

    /* JADX INFO: renamed from: com.facebook.login.b$a */
    /* JADX INFO: compiled from: CustomTabLoginMethodHandler.kt */
    public static final class a implements Parcelable.Creator<C1770b> {
        @Override // android.os.Parcelable.Creator
        public final C1770b createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.e(source, "source");
            return new C1770b(source);
        }

        @Override // android.os.Parcelable.Creator
        public final C1770b[] newArray(int i10) {
            return new C1770b[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770b(Parcel source) {
        super(source, 1);
        kotlin.jvm.internal.i.e(source, "source");
        this.f25106i = "custom_tab";
        this.j = AccessTokenSource.f24732e;
        this.f25104g = source.readString();
        this.f25105h = p165n4.d.b(super.f());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.x
    public final String e() {
        return this.f25106i;
    }

    @Override // com.facebook.login.x
    public final String f() {
        return this.f25105h;
    }

    @Override // com.facebook.login.A, com.facebook.login.x
    public final boolean i(int i10, int i11, Intent intent) {
        LoginClient.b bVar;
        int i12;
        boolean zA = false;
        if ((intent != null && intent.getBooleanExtra(CustomTabMainActivity.j, false)) || i10 != 1 || (bVar = d().f25061h) == null) {
            return false;
        }
        if (i11 != -1) {
            t(bVar, null, new FacebookOperationCanceledException());
            return false;
        }
        String stringExtra = intent != null ? intent.getStringExtra(CustomTabMainActivity.f24749g) : null;
        if (stringExtra != null && (kotlin.text.m.I(stringExtra, "fbconnect://cct.", false) || kotlin.text.m.I(stringExtra, super.f(), false))) {
            Uri uri = Uri.parse(stringExtra);
            Bundle bundleC = p165n4.s.C(uri.getQuery());
            bundleC.putAll(p165n4.s.C(uri.getFragment()));
            try {
                String string = bundleC.getString("state");
                if (string != null) {
                    zA = kotlin.jvm.internal.i.a(new JSONObject(string).getString("7_challenge"), this.f25104g);
                }
            } catch (JSONException unused) {
            }
            if (zA) {
                String string2 = bundleC.getString("error");
                if (string2 == null) {
                    string2 = bundleC.getString("error_type");
                }
                String string3 = bundleC.getString("error_msg");
                if (string3 == null) {
                    string3 = bundleC.getString("error_message");
                }
                if (string3 == null) {
                    string3 = bundleC.getString("error_description");
                }
                String string4 = bundleC.getString("error_code");
                if (string4 == null) {
                    i12 = -1;
                } else {
                    try {
                        i12 = Integer.parseInt(string4);
                    } catch (NumberFormatException unused2) {
                        i12 = -1;
                    }
                }
                if (p165n4.s.y(string2) && p165n4.s.y(string3) && i12 == -1) {
                    if (bundleC.containsKey("access_token")) {
                        t(bVar, bundleC, null);
                    } else {
                        Z3.q.c().execute(new RunnableC1769a(this, bVar, bundleC, 0));
                    }
                } else if ((string2 == null || !(string2.equals("access_denied") || string2.equals("OAuthAccessDeniedException"))) && i12 != 4201) {
                    t(bVar, null, new FacebookServiceException(new FacebookRequestError(i12, string2, string3), string3));
                } else {
                    t(bVar, null, new FacebookOperationCanceledException());
                }
            } else {
                t(bVar, null, new FacebookException("Invalid state parameter"));
            }
        }
        return true;
    }

    @Override // com.facebook.login.x
    public final void k(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f25104g);
    }

    @Override // com.facebook.login.x
    public final int l(LoginClient.b request) throws Exception {
        String str = this.f25105h;
        kotlin.jvm.internal.i.e(request, "request");
        LoginClient loginClientD = d();
        if (str.length() == 0) {
            return 0;
        }
        Bundle bundleN = n(request);
        bundleN.putString("redirect_uri", str);
        boolean zA = request.a();
        String str2 = request.f25081e;
        if (zA) {
            bundleN.putString("app_id", str2);
        } else {
            bundleN.putString("client_id", str2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.i.d(string, "e2e.toString()");
        bundleN.putString("e2e", string);
        if (request.a()) {
            bundleN.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.f25079c.contains("openid")) {
                bundleN.putString("nonce", request.f25091p);
            }
            bundleN.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundleN.putString("code_challenge", request.f25093r);
        CodeChallengeMethod codeChallengeMethod = request.f25094s;
        bundleN.putString("code_challenge_method", codeChallengeMethod == null ? null : codeChallengeMethod.name());
        bundleN.putString("return_scopes", "true");
        bundleN.putString("auth_type", request.f25085i);
        bundleN.putString("login_behavior", request.f25078b.name());
        Z3.q qVar = Z3.q.f7852a;
        bundleN.putString("sdk", kotlin.jvm.internal.i.k("16.2.0", "android-"));
        bundleN.putString("sso", "chrome_custom_tab");
        bundleN.putString("cct_prefetching", Z3.q.f7863m ? "1" : "0");
        boolean z10 = request.f25089n;
        LoginTargetApp loginTargetApp = request.f25088m;
        if (z10) {
            bundleN.putString("fx_app", loginTargetApp.toString());
        }
        if (request.f25090o) {
            bundleN.putString("skip_dedupe", "true");
        }
        String str3 = request.f25086k;
        if (str3 != null) {
            bundleN.putString("messenger_page_id", str3);
            bundleN.putString("reset_messenger_state", request.f25087l ? "1" : "0");
        }
        if (f25102k) {
            bundleN.putString("cct_over_app_switch", "1");
        }
        if (Z3.q.f7863m) {
            if (request.a()) {
                q.c.a aVar = C1771c.f25107b;
                C1771c.a.a(p165n4.s.b(bundleN, p165n4.p.b(), "oauth/authorize"));
            } else {
                q.c.a aVar2 = C1771c.f25107b;
                C1771c.a.a(p165n4.s.b(bundleN, p165n4.p.a(), Z3.q.d() + "/dialog/oauth"));
            }
        }
        ActivityC1347l activityC1347lE = loginClientD.e();
        if (activityC1347lE == null) {
            return 0;
        }
        Intent intent = new Intent(activityC1347lE, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f24746d, "oauth");
        intent.putExtra(CustomTabMainActivity.f24747e, bundleN);
        String str4 = CustomTabMainActivity.f24748f;
        String strA = this.f25103f;
        if (strA == null) {
            strA = p165n4.d.a();
            this.f25103f = strA;
        }
        intent.putExtra(str4, strA);
        intent.putExtra(CustomTabMainActivity.f24750h, loginTargetApp.toString());
        s sVar = loginClientD.f25057d;
        if (sVar != null) {
            sVar.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.A
    public final AccessTokenSource o() {
        return this.j;
    }

    @Override // com.facebook.login.x, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f25104g);
    }

    public C1770b(LoginClient loginClient) {
        this.f25188c = loginClient;
        this.f25106i = "custom_tab";
        this.j = AccessTokenSource.f24732e;
        String string = new BigInteger(100, new Random()).toString(32);
        kotlin.jvm.internal.i.d(string, "BigInteger(length * 5, r).toString(32)");
        this.f25104g = string;
        f25102k = false;
        this.f25105h = p165n4.d.b(super.f());
    }
}
