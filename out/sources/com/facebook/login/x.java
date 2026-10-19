package com.facebook.login;

import Z3.C0835a;
import Z3.C0842h;
import Z3.I;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.HttpMethod;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LoginMethodHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class x implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f25187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LoginClient f25188c;

    /* JADX INFO: compiled from: LoginMethodHandler.kt */
    public static final class a {
        public static C0835a a(Bundle bundle, String applicationId) {
            String string;
            AccessTokenSource accessTokenSource = AccessTokenSource.f24730c;
            kotlin.jvm.internal.i.e(bundle, "bundle");
            kotlin.jvm.internal.i.e(applicationId, "applicationId");
            Date dateM = p165n4.s.m(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date dateM2 = p165n4.s.m(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
                return null;
            }
            return new C0835a(string2, applicationId, string, stringArrayList, null, null, accessTokenSource, dateM, new Date(), dateM2, bundle.getString("graph_domain"));
        }

        public static C0835a b(Collection collection, Bundle bundle, AccessTokenSource accessTokenSource, String applicationId) throws FacebookException {
            Collection collectionN;
            ArrayList arrayListN;
            ArrayList arrayListN2;
            kotlin.jvm.internal.i.e(bundle, "bundle");
            kotlin.jvm.internal.i.e(applicationId, "applicationId");
            Date dateM = p165n4.s.m(bundle, "expires_in", new Date());
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            Date dateM2 = p165n4.s.m(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 == null || string2.length() <= 0) {
                collectionN = collection;
            } else {
                Object[] array = kotlin.text.n.e0(string2, new String[]{","}, 0, 6).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                collectionN = kotlin.collections.l.n(Arrays.copyOf(strArr, strArr.length));
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayListN = null;
            } else {
                Object[] array2 = kotlin.text.n.e0(string3, new String[]{","}, 0, 6).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                arrayListN = kotlin.collections.l.n(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayListN2 = null;
            } else {
                Object[] array3 = kotlin.text.n.e0(string4, new String[]{","}, 0, 6).toArray(new String[0]);
                if (array3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr3 = (String[]) array3;
                arrayListN2 = kotlin.collections.l.n(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (p165n4.s.y(string)) {
                return null;
            }
            String string5 = bundle.getString("graph_domain");
            String string6 = bundle.getString("signed_request");
            if (string6 == null || string6.length() == 0) {
                throw new FacebookException("Authorization response does not contain the signed_request");
            }
            try {
                Object[] array4 = kotlin.text.n.e0(string6, new String[]{"."}, 0, 6).toArray(new String[0]);
                if (array4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr4 = (String[]) array4;
                if (strArr4.length == 2) {
                    byte[] data = Base64.decode(strArr4[1], 0);
                    kotlin.jvm.internal.i.d(data, "data");
                    String string7 = new JSONObject(new String(data, kotlin.text.a.f43120b)).getString("user_id");
                    kotlin.jvm.internal.i.d(string7, "jsonObject.getString(\"user_id\")");
                    return new C0835a(string, applicationId, string7, collectionN, arrayListN, arrayListN2, accessTokenSource, dateM, new Date(), dateM2, string5);
                }
                throw new FacebookException("Failed to retrieve user_id from signed_request");
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
        }

        public static C0842h c(Bundle bundle, String str) throws FacebookException {
            kotlin.jvm.internal.i.e(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                return null;
            }
            try {
                return new C0842h(string, str);
            } catch (Exception e10) {
                throw new FacebookException(e10.getMessage(), e10);
            }
        }
    }

    public x(Parcel source) {
        HashMap map;
        kotlin.jvm.internal.i.e(source, "source");
        int i10 = source.readInt();
        if (i10 < 0) {
            map = null;
        } else {
            map = new HashMap();
            if (i10 > 0) {
                int i11 = 0;
                do {
                    i11++;
                    map.put(source.readString(), source.readString());
                } while (i11 < i10);
            }
        }
        this.f25187b = map != null ? kotlin.collections.y.y(map) : null;
    }

    public final void a(String str, String str2) {
        if (this.f25187b == null) {
            this.f25187b = new HashMap();
        }
        HashMap map = this.f25187b;
        if (map == null) {
            return;
        }
    }

    public final String c(String authId) {
        kotlin.jvm.internal.i.e(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", e());
            k(jSONObject);
        } catch (JSONException e10) {
            kotlin.jvm.internal.i.k(e10.getMessage(), "Error creating client state json: ");
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.i.d(string, "param.toString()");
        return string;
    }

    public final LoginClient d() {
        LoginClient loginClient = this.f25188c;
        if (loginClient != null) {
            return loginClient;
        }
        kotlin.jvm.internal.i.m("loginClient");
        throw null;
    }

    public abstract String e();

    public String f() {
        return "fb" + Z3.q.b() + "://authorize/";
    }

    public final void h(String str) {
        LoginClient.b bVar = d().f25061h;
        String strB = bVar == null ? null : bVar.f25081e;
        if (strB == null) {
            strB = Z3.q.b();
        }
        p005a4.n nVar = new p005a4.n(d().e(), strB);
        Bundle bundleD = C4.v.d("fb_web_login_e2e", str);
        bundleD.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundleD.putString("app_id", strB);
        Z3.q qVar = Z3.q.f7852a;
        if (I.a()) {
            nVar.a("fb_dialogs_web_login_dialog_complete", null, bundleD, true, p093h4.e.b());
        }
    }

    public boolean i(int i10, int i11, Intent intent) {
        return false;
    }

    public final void j(LoginClient.b request, Bundle bundle) throws FacebookException {
        Z3.r rVarG;
        kotlin.jvm.internal.i.e(request, "request");
        String string = bundle.getString("code");
        if (p165n4.s.y(string)) {
            throw new FacebookException("No code param found from the request");
        }
        if (string == null) {
            rVarG = null;
        } else {
            String redirectUri = f();
            String str = request.f25092q;
            if (str == null) {
                str = "";
            }
            HttpMethod httpMethod = HttpMethod.f24771b;
            kotlin.jvm.internal.i.e(redirectUri, "redirectUri");
            Bundle bundle2 = new Bundle();
            bundle2.putString("code", string);
            bundle2.putString("client_id", Z3.q.b());
            bundle2.putString("redirect_uri", redirectUri);
            bundle2.putString("code_verifier", str);
            String str2 = Z3.r.j;
            rVarG = Z3.r.c.g(null, "oauth/access_token", null);
            rVarG.f7880h = httpMethod;
            rVarG.f7876d = bundle2;
        }
        if (rVarG == null) {
            throw new FacebookException("Failed to create code exchange request");
        }
        Z3.x xVarC = rVarG.c();
        FacebookRequestError facebookRequestError = xVarC.f7905c;
        if (facebookRequestError != null) {
            throw new FacebookServiceException(facebookRequestError, facebookRequestError.a());
        }
        try {
            JSONObject jSONObject = xVarC.f7904b;
            String string2 = jSONObject != null ? jSONObject.getString("access_token") : null;
            if (jSONObject == null || p165n4.s.y(string2)) {
                throw new FacebookException("No access token found from result");
            }
            bundle.putString("access_token", string2);
            if (jSONObject.has("id_token")) {
                bundle.putString("id_token", jSONObject.getString("id_token"));
            }
        } catch (JSONException e10) {
            throw new FacebookException(kotlin.jvm.internal.i.k(e10.getMessage(), "Fail to process code exchange response: "));
        }
    }

    public abstract int l(LoginClient.b bVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        HashMap map = this.f25187b;
        if (map == null) {
            dest.writeInt(-1);
            return;
        }
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            dest.writeString(str);
            dest.writeString(str2);
        }
    }

    public void b() {
    }

    public void k(JSONObject jSONObject) throws JSONException {
    }
}
