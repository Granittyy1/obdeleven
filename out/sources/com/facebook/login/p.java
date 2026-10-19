package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.internal.CallbackManagerImpl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: InstagramAppLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p extends A {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccessTokenSource f25165g;

    /* JADX INFO: compiled from: InstagramAppLoginMethodHandler.kt */
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.e(source, "source");
            return new p(source);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i10) {
            return new p[i10];
        }
    }

    public p(LoginClient loginClient) {
        super(loginClient);
        this.f25164f = "instagram_login";
        this.f25165g = AccessTokenSource.f24734g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.x
    public final String e() {
        return this.f25164f;
    }

    @Override // com.facebook.login.x
    public final int l(LoginClient.b request) {
        Iterator<String> it;
        boolean z10;
        ResolveInfo resolveInfoResolveActivity;
        kotlin.jvm.internal.i.e(request, "request");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                String next = it.next();
                w.a aVar = w.f25181b;
                if (w.a.b(next)) {
                    z10 = true;
                    break;
                }
            }
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.i.d(string, "e2e.toString()");
        p165n4.m mVar = p165n4.m.f44914a;
        Context contextE = d().e();
        if (contextE == null) {
            contextE = Z3.q.a();
        }
        Set<String> set = request.f25079c;
        Set<String> permissions = set;
        it = set.iterator();
        DefaultAudience defaultAudience = request.f25080d;
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        DefaultAudience defaultAudience2 = defaultAudience;
        String strC = c(request.f25082f);
        String str = request.f25086k;
        boolean z11 = request.f25087l;
        boolean z12 = request.f25089n;
        boolean z13 = request.f25090o;
        String applicationId = request.f25081e;
        kotlin.jvm.internal.i.e(applicationId, "applicationId");
        kotlin.jvm.internal.i.e(permissions, "permissions");
        String authType = request.f25085i;
        kotlin.jvm.internal.i.e(authType, "authType");
        n4.m.b bVar = new n4.m.b();
        LoginTargetApp loginTargetApp = LoginTargetApp.INSTAGRAM;
        p165n4.m.f44914a.getClass();
        Intent intentB = p165n4.m.b(bVar, applicationId, permissions, string, z10, defaultAudience2, strC, authType, false, str, z11, loginTargetApp, z12, z13, "");
        Intent intent = null;
        if (intentB != null && (resolveInfoResolveActivity = contextE.getPackageManager().resolveActivity(intentB, 0)) != null) {
            HashSet<String> hashSet = p165n4.g.f44886a;
            String str2 = resolveInfoResolveActivity.activityInfo.packageName;
            kotlin.jvm.internal.i.d(str2, "resolveInfo.activityInfo.packageName");
            if (!p165n4.g.a(contextE, str2)) {
                intentB = null;
            }
            intent = intentB;
        }
        a("e2e", string);
        CallbackManagerImpl.RequestCodeOffset.Login.a();
        return u(intent) ? 1 : 0;
    }

    @Override // com.facebook.login.A
    public final AccessTokenSource o() {
        return this.f25165g;
    }

    @Override // com.facebook.login.x, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        super.writeToParcel(dest, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Parcel source) {
        super(source, 0);
        kotlin.jvm.internal.i.e(source, "source");
        this.f25164f = "instagram_login";
        this.f25165g = AccessTokenSource.f24734g;
    }
}
