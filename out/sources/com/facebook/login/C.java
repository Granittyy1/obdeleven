package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC1347l;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: WebViewLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C extends A {
    public static final Parcelable.Creator<C> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p165n4.v f25041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f25043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AccessTokenSource f25044i;

    /* JADX INFO: compiled from: WebViewLoginMethodHandler.kt */
    public static final class a implements Parcelable.Creator<C> {
        @Override // android.os.Parcelable.Creator
        public final C createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.e(source, "source");
            return new C(source);
        }

        @Override // android.os.Parcelable.Creator
        public final C[] newArray(int i10) {
            return new C[i10];
        }
    }

    /* JADX INFO: compiled from: WebViewLoginMethodHandler.kt */
    public static final class b implements n4.v.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LoginClient.b f25046c;

        public b(LoginClient.b bVar) {
            this.f25046c = bVar;
        }

        @Override // n4.v.b
        public final void b(Bundle bundle, FacebookException facebookException) {
            C c10 = C.this;
            c10.getClass();
            LoginClient.b request = this.f25046c;
            kotlin.jvm.internal.i.e(request, "request");
            c10.t(request, bundle, facebookException);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Parcel source) {
        super(source, 1);
        kotlin.jvm.internal.i.e(source, "source");
        this.f25043h = "web_view";
        this.f25044i = AccessTokenSource.f24731d;
        this.f25042g = source.readString();
    }

    @Override // com.facebook.login.x
    public final void b() {
        p165n4.v vVar = this.f25041f;
        if (vVar != null) {
            if (vVar != null) {
                vVar.cancel();
            }
            this.f25041f = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.x
    public final String e() {
        return this.f25043h;
    }

    @Override // com.facebook.login.x
    public final int l(LoginClient.b request) {
        kotlin.jvm.internal.i.e(request, "request");
        Bundle bundleN = n(request);
        b bVar = new b(request);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.i.d(string, "e2e.toString()");
        this.f25042g = string;
        a("e2e", string);
        ActivityC1347l activityC1347lE = d().e();
        if (activityC1347lE == null) {
            return 0;
        }
        boolean zV = p165n4.s.v(activityC1347lE);
        String applicationId = request.f25081e;
        kotlin.jvm.internal.i.e(applicationId, "applicationId");
        p165n4.t.d(applicationId, "applicationId");
        String str = this.f25042g;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        String str2 = zV ? "fbconnect://chrome_os_success" : "fbconnect://success";
        String authType = request.f25085i;
        kotlin.jvm.internal.i.e(authType, "authType");
        LoginBehavior loginBehavior = request.f25078b;
        kotlin.jvm.internal.i.e(loginBehavior, "loginBehavior");
        LoginTargetApp targetApp = request.f25088m;
        kotlin.jvm.internal.i.e(targetApp, "targetApp");
        boolean z10 = request.f25089n;
        boolean z11 = request.f25090o;
        bundleN.putString("redirect_uri", str2);
        bundleN.putString("client_id", applicationId);
        bundleN.putString("e2e", str);
        bundleN.putString("response_type", targetApp == LoginTargetApp.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
        bundleN.putString("return_scopes", "true");
        bundleN.putString("auth_type", authType);
        bundleN.putString("login_behavior", loginBehavior.name());
        if (z10) {
            bundleN.putString("fx_app", targetApp.toString());
        }
        if (z11) {
            bundleN.putString("skip_dedupe", "true");
        }
        int i10 = p165n4.v.f44936n;
        p165n4.v.b(activityC1347lE);
        this.f25041f = new p165n4.v(activityC1347lE, "oauth", bundleN, targetApp, bVar);
        p165n4.e eVar = new p165n4.e();
        eVar.setRetainInstance(true);
        eVar.f44879r = this.f25041f;
        eVar.v(activityC1347lE.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.A
    public final AccessTokenSource o() {
        return this.f25044i;
    }

    @Override // com.facebook.login.x, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        super.writeToParcel(dest, i10);
        dest.writeString(this.f25042g);
    }

    public C(LoginClient loginClient) {
        this.f25188c = loginClient;
        this.f25043h = "web_view";
        this.f25044i = AccessTokenSource.f24731d;
    }
}
