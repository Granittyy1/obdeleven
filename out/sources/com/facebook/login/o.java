package com.facebook.login;

import Z3.C0835a;
import Z3.C0842h;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.FacebookException;
import java.util.ArrayList;

/* JADX INFO: compiled from: GetTokenLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o extends x {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f25162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25163e;

    /* JADX INFO: compiled from: GetTokenLoginMethodHandler.kt */
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.e(source, "source");
            return new o(source);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i10) {
            return new o[i10];
        }
    }

    public o(LoginClient loginClient) {
        this.f25188c = loginClient;
        this.f25163e = "get_token";
    }

    @Override // com.facebook.login.x
    public final void b() {
        m mVar = this.f25162d;
        if (mVar == null) {
            return;
        }
        mVar.f25154e = false;
        mVar.f25153d = null;
        this.f25162d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.x
    public final String e() {
        return this.f25163e;
    }

    @Override // com.facebook.login.x
    public final int l(LoginClient.b request) {
        boolean z10;
        kotlin.jvm.internal.i.e(request, "request");
        Context contextE = d().e();
        if (contextE == null) {
            contextE = Z3.q.a();
        }
        m mVar = new m(contextE, request.f25081e, request.f25091p);
        this.f25162d = mVar;
        synchronized (mVar) {
            if (!mVar.f25154e) {
                p165n4.m mVar2 = p165n4.m.f44914a;
                if (p165n4.m.e(mVar.j) != -1) {
                    Intent intentC = p165n4.m.c(mVar.f25151b);
                    if (intentC == null) {
                        z10 = false;
                    } else {
                        mVar.f25154e = true;
                        mVar.f25151b.bindService(intentC, mVar, 1);
                        z10 = true;
                    }
                }
            }
            z10 = false;
        }
        if (Boolean.valueOf(z10).equals(Boolean.FALSE)) {
            return 0;
        }
        s.a aVar = d().f25059f;
        if (aVar != null) {
            View view = s.this.f25172f;
            if (view == null) {
                kotlin.jvm.internal.i.m("progressBar");
                throw null;
            }
            view.setVisibility(0);
        }
        n nVar = new n(this, request);
        m mVar3 = this.f25162d;
        if (mVar3 != null) {
            mVar3.f25153d = nVar;
        }
        return 1;
    }

    public final void m(LoginClient.b request, Bundle result) {
        LoginClient.Result result2;
        C0842h c0842h;
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(result, "result");
        try {
            C0835a c0835aA = x.a.a(result, request.f25081e);
            String str = request.f25091p;
            String string = result.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                c0842h = null;
            } else {
                try {
                    c0842h = new C0842h(string, str);
                } catch (Exception e10) {
                    throw new FacebookException(e10.getMessage());
                }
            }
            result2 = new LoginClient.Result(request, LoginClient.Result.Code.SUCCESS, c0835aA, c0842h, null, null);
        } catch (FacebookException e11) {
            LoginClient.b bVar = d().f25061h;
            String message = e11.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            result2 = new LoginClient.Result(bVar, LoginClient.Result.Code.ERROR, null, null, TextUtils.join(": ", arrayList), null);
        }
        d().d(result2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Parcel source) {
        super(source);
        kotlin.jvm.internal.i.e(source, "source");
        this.f25163e = "get_token";
    }
}
