package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.CallbackManagerImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: KatanaProxyLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q extends A {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25166f;

    /* JADX INFO: compiled from: KatanaProxyLoginMethodHandler.kt */
    public static final class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.e(source, "source");
            return new q(source);
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i10) {
            return new q[i10];
        }
    }

    public q(LoginClient loginClient) {
        super(loginClient);
        this.f25166f = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.x
    public final String e() {
        return this.f25166f;
    }

    @Override // com.facebook.login.x
    public final int l(LoginClient.b request) {
        Iterator<String> it;
        boolean z10;
        kotlin.jvm.internal.i.e(request, "request");
        boolean z11 = Z3.q.f7864n && p165n4.d.a() != null && request.f25078b.a();
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
        d().e();
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
        boolean z12 = request.f25087l;
        boolean z13 = request.f25089n;
        boolean z14 = request.f25090o;
        CodeChallengeMethod codeChallengeMethod = request.f25094s;
        if (codeChallengeMethod != null) {
            codeChallengeMethod.name();
        }
        String applicationId = request.f25081e;
        kotlin.jvm.internal.i.e(applicationId, "applicationId");
        kotlin.jvm.internal.i.e(permissions, "permissions");
        String authType = request.f25085i;
        kotlin.jvm.internal.i.e(authType, "authType");
        ArrayList<n4.m.e> arrayList = p165n4.m.f44916c;
        ArrayList<Intent> arrayList2 = new ArrayList();
        for (n4.m.e eVar : arrayList) {
            LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;
            p165n4.m.f44914a.getClass();
            ArrayList arrayList3 = arrayList2;
            String str2 = authType;
            String str3 = applicationId;
            boolean z15 = z14;
            boolean z16 = z13;
            boolean z17 = z12;
            String str4 = str;
            Set<String> set2 = permissions;
            String str5 = string;
            Intent intentB = p165n4.m.b(eVar, applicationId, permissions, string, z10, defaultAudience2, strC, str2, z11, str4, z17, loginTargetApp, z16, z15, request.f25091p);
            if (intentB != null) {
                arrayList3.add(intentB);
            }
            arrayList2 = arrayList3;
            string = str5;
            authType = str2;
            applicationId = str3;
            z14 = z15;
            z13 = z16;
            z12 = z17;
            str = str4;
            permissions = set2;
        }
        a("e2e", string);
        int i10 = 0;
        for (Intent intent : arrayList2) {
            i10++;
            CallbackManagerImpl.RequestCodeOffset.Login.a();
            if (u(intent)) {
                return i10;
            }
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Parcel source) {
        super(source, 0);
        kotlin.jvm.internal.i.e(source, "source");
        this.f25166f = "katana_proxy_auth";
    }
}
